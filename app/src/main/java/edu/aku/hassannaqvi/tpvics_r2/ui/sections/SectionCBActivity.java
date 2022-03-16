package edu.aku.hassannaqvi.tpvics_r2.ui.sections;

import static edu.aku.hassannaqvi.tpvics_r2.core.MainApp.child;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
import edu.aku.hassannaqvi.tpvics_r2.databinding.ActivitySectionCbBinding;
import edu.aku.hassannaqvi.tpvics_r2.ui.EndingActivity;

public class SectionCBActivity extends AppCompatActivity {


    private static final String TAG = "SectionCBActivity";
    ActivitySectionCbBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_cb);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;

        child.setEc13cline(child.getEc13());
        child.setEc14cname(child.getEc14());
        bi.setChild(child);
    }

    private boolean updateDB() {
        if (MainApp.superuser) return true;

        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesChildColumn(TableContracts.ChildTable.COLUMN_SCB, child.sCBtoString());
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, R.string.upd_db + e.getMessage());
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount > 0) return true;
        else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    public void btnContinue(View view) {
        if (!formValidation()) return;
        // saveDraft();
        if (updateDB()) {
            finish();
            if (child.getEc21().equals("1")) {
                startActivity(new Intent(this, SectionIM1Activity.class));
            } else {
                startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
            }
        } else
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
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