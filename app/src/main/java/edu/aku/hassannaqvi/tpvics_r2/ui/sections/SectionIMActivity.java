package edu.aku.hassannaqvi.tpvics_r2.ui.sections;

import static edu.aku.hassannaqvi.tpvics_r2.core.MainApp.child;
import static edu.aku.hassannaqvi.tpvics_r2.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.tpvics_r2.R;
import edu.aku.hassannaqvi.tpvics_r2.contracts.TableContracts;
import edu.aku.hassannaqvi.tpvics_r2.core.MainApp;
import edu.aku.hassannaqvi.tpvics_r2.database.DatabaseHelper;
import edu.aku.hassannaqvi.tpvics_r2.databinding.ActivitySectionA1Binding;
import edu.aku.hassannaqvi.tpvics_r2.databinding.ActivitySectionImBinding;
import edu.aku.hassannaqvi.tpvics_r2.ui.EndingActivity;

public class SectionIMActivity extends AppCompatActivity {


    private static final String TAG = "SectionIMActivity";
    ActivitySectionImBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setTheme(sharedPref.getString("lang", "0").equals("2") ? R.style.AppThemeSindhi : sharedPref.getString("lang", "0").equals("1") ? R.style.AppThemeUrdu : R.style.AppThemeEnglish1);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_im);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        bi.setForm(child);
    }


    private boolean insertNewRecord() {
        if (!MainApp.form.getUid().equals("") || MainApp.superuser) return true;

        MainApp.form.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addForm(MainApp.form);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        MainApp.form.setId(String.valueOf(rowId));
        if (rowId > 0) {
            MainApp.form.setUid(MainApp.form.getDeviceId() + MainApp.form.getId());
            db.updatesFormColumn(TableContracts.FormsTable.COLUMN_UID, MainApp.form.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private boolean updateDB() {
        if (MainApp.superuser) return true;

        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
//        try {
//            updcount = db.updatesFormColumn(TableContracts.FormsTable.Co, moduleD.sD1toString());
//        } catch (JSONException e) {
//            e.printStackTrace();
//            Log.d(TAG, R.string.upd_db + e.getMessage());
//            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
//        }
        if (updcount > 0) return true;
        else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public void btnContinue(View view) {
        if (!formValidation()) return;
        //if (!insertNewRecord()) return;
        // saveDraft();
        if (updateDB()) {
            Intent i;
           i = new Intent(this, SectionHHActivity.class).putExtra("complete", true);
            startActivity(i);
            finish();
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }

    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
       setResult(RESULT_CANCELED); finish();
    }


}