package edu.aku.hassannaqvi.tpvics_r2.ui;

import static edu.aku.hassannaqvi.tpvics_r2.core.MainApp.selectedCluster;
import static edu.aku.hassannaqvi.tpvics_r2.core.MainApp.selectedHousehold;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.tpvics_r2.R;
import edu.aku.hassannaqvi.tpvics_r2.core.MainApp;
import edu.aku.hassannaqvi.tpvics_r2.database.DatabaseHelper;
import edu.aku.hassannaqvi.tpvics_r2.databinding.ActivityIdentificationBinding;
import edu.aku.hassannaqvi.tpvics_r2.models.Form;
import edu.aku.hassannaqvi.tpvics_r2.ui.sections.ConsentActivity;


public class IdentificationActivity extends AppCompatActivity {

    private static final String TAG = "IdentificationActivity";
    ActivityIdentificationBinding bi;
    private DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        //setTheme(MainApp.langRTL ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_identification);
        db = MainApp.appInfo.dbHelper;
        //   populateSpinner();

        bi.btnContinue.setText(R.string.open_hh_form);
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Form");
        MainApp.form = new Form();


    }




    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    public void checkHousehold(View view) {
        if (!formValidation()) return;
    }

    public void btnContinue(View view) {

        if (!formValidation()) return;
        hhExists();
        if (MainApp.form.getSynced().equals("1") && !MainApp.superuser) { // Do not allow synced form to be edited
            Toast.makeText(this, "This form has been locked.", Toast.LENGTH_SHORT).show();
        } else {
            finish();
            startActivity(new Intent(this, ConsentActivity.class));
        }

    }




    public void btnEnd(View view) {
        finish();
        // startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean hhExists() {


        MainApp.form = new Form();
        try {
            MainApp.form = db.getFormByhhid();
        } catch (JSONException e) {
            Log.d(TAG, getString(R.string.hh_exists_form) + e.getMessage());
            Toast.makeText(this, getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return MainApp.form != null;


    }

    public void checkEBNumber(View view) {
        if (!formValidation()) return;

        bi.hh06.setText(null);      //  Province
        bi.hh07.setText(null);      //  District
        bi.hh08.setText(null);      //  Tehsil
        bi.hh09.setText(null);      //  City/Village
        bi.hh16a.setText(null);

        bi.checkHh06.setChecked(false);
        bi.checkHh07.setChecked(false);
        bi.checkHh08.setChecked(false);
        bi.checkHh09.setChecked(false);

        bi.fldGrpIdentifier.setVisibility(View.GONE);
        bi.headhh.setVisibility(View.GONE);

        bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
        bi.btnContinue.setEnabled(false);

        selectedHousehold = null;

        selectedCluster = db.getClusterByEBNum(bi.hh05.getText().toString());

        if (selectedCluster != null) {
            String[] geoarea = selectedCluster.getGeoarea().split("\\|");
            bi.hh06.setText(geoarea[0]);    //  Province
            bi.hh07.setText(geoarea[1]);    //  District
            bi.hh08.setText(geoarea[2]);    //  Tehsil
            bi.hh09.setText(geoarea[3]);    //  City/Village
            bi.fldGrpIdentifier.setVisibility(View.VISIBLE);
        } else {
            Toast.makeText(this, "Enumeration Block not found", Toast.LENGTH_SHORT).show();


        }
    }

    public void checkHH(View view) {
        if (!formValidation()) return;

        bi.hh16a.setText(null);
        bi.headhh.setVisibility(View.GONE);

        bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
        bi.btnContinue.setEnabled(false);

        selectedHousehold = db.getRandomByhhid(bi.hh12.getText().toString());
        if (selectedHousehold != null) {
            bi.hh16a.setText(selectedHousehold.getHhhead());    // Name of Head
            bi.headhh.setVisibility(View.VISIBLE);

            bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.colorAccent));
            bi.btnContinue.setEnabled(true);
        } else {
            Toast.makeText(this, "Household not found", Toast.LENGTH_SHORT).show();
        }

    }


}
