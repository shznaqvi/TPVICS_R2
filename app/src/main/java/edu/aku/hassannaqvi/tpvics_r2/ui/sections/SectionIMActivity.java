package edu.aku.hassannaqvi.tpvics_r2.ui.sections;

import static edu.aku.hassannaqvi.tpvics_r2.core.MainApp.child;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.edittextpicker.aliazaz.EditTextPicker;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.Calendar;

import edu.aku.hassannaqvi.tpvics_r2.R;
import edu.aku.hassannaqvi.tpvics_r2.contracts.TableContracts;
import edu.aku.hassannaqvi.tpvics_r2.core.MainApp;
import edu.aku.hassannaqvi.tpvics_r2.database.DatabaseHelper;
import edu.aku.hassannaqvi.tpvics_r2.databinding.ActivitySectionImBinding;

public class SectionIMActivity extends AppCompatActivity {


    private static final String TAG = "SectionIMActivity";
    ActivitySectionImBinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_im);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        bi.setForm(child);
        setupSkips();
        if (MainApp.superuser) bi.btnContinue.setText("Review Next");
    }

    private void setupSkips() {

        bi.im04yy.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (bi.im04yy.getText().toString().isEmpty()) return;
                bi.im04mm.setMaxvalue(Integer.parseInt(bi.im04yy.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR) ?
                        Calendar.getInstance().get(Calendar.MONTH) + 1 : 12f);
                bi.im04dd.setMaxvalue(Integer.parseInt(bi.im04yy.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR)
                        && Integer.parseInt(bi.im04mm.getText().toString()) == Calendar.getInstance().get(Calendar.MONTH) + 1 ?
                        Calendar.getInstance().get(Calendar.DAY_OF_MONTH) : 31f);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        bi.im04mm.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (bi.im04yy.getText().toString().isEmpty() || bi.im04mm.getText().toString().isEmpty())
                    return;
                bi.im04dd.setMaxvalue(Integer.parseInt(bi.im04yy.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR)
                        && Integer.parseInt(bi.im04mm.getText().toString()) == Calendar.getInstance().get(Calendar.MONTH) + 1 ?
                        Calendar.getInstance().get(Calendar.DAY_OF_MONTH) : 31f);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });


        setDefault(bi.im0501dd, bi.im0501mm, bi.im0501yy);
        setDefault(bi.im0502dd, bi.im0502mm, bi.im0502yy);
        setDefault(bi.im0503dd, bi.im0503mm, bi.im0503yy);
        setDefault(bi.im0504dd, bi.im0504mm, bi.im0504yy);
        setDefault(bi.im0505dd, bi.im0505mm, bi.im0505yy);
        setDefault(bi.im0506dd, bi.im0506mm, bi.im0506yy);
        setDefault(bi.im0507dd, bi.im0507mm, bi.im0507yy);
        setDefault(bi.im0508dd, bi.im0508mm, bi.im0508yy);
        setDefault(bi.im0509dd, bi.im0509mm, bi.im0509yy);
        setDefault(bi.im0510dd, bi.im0510mm, bi.im0510yy);
        setDefault(bi.im0510add, bi.im0510amm, bi.im0510ayy);
        setDefault(bi.im0511dd, bi.im0511mm, bi.im0511yy);
        setDefault(bi.im0512dd, bi.im0512mm, bi.im0512yy);
        setDefault(bi.im0513dd, bi.im0513mm, bi.im0513yy);
        setDefault(bi.im0514dd, bi.im0514mm, bi.im0514yy);
        setDefault(bi.im0515dd, bi.im0515mm, bi.im0515yy);
        setDefault(bi.im0516dd, bi.im0516mm, bi.im0516yy);
        setDefault(bi.im0517dd, bi.im0517mm, bi.im0517yy);
    }


    private void setDefault(EditTextPicker day, EditTextPicker mon, EditTextPicker year) {
        day.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (day.getText().toString().isEmpty()) return;
                mon.setEnabled(true);
                year.setEnabled(true);
                if (Integer.parseInt(day.getText().toString()) == 44) {
                    day.setRangedefaultvalue(44f);
                    mon.setEnabled(false);
                    year.setEnabled(false);
                }
                if (Integer.parseInt(day.getText().toString()) == 66) {
                    day.setRangedefaultvalue(66f);
                    mon.setEnabled(false);
                    year.setEnabled(false);
                }
                if (Integer.parseInt(day.getText().toString()) == 88) {
                    day.setRangedefaultvalue(88f);
                    mon.setEnabled(false);
                    year.setEnabled(false);
                }
                if (Integer.parseInt(day.getText().toString()) == 97) {
                    day.setRangedefaultvalue(97f);
                    mon.setEnabled(false);
                    year.setEnabled(false);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        year.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (year.getText().toString().isEmpty()) return;
                mon.setMaxvalue(Integer.parseInt(year.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR) ?
                        Calendar.getInstance().get(Calendar.MONTH) + 1 : 12f);
                day.setMaxvalue(Integer.parseInt(year.getText().toString()) == Calendar.getInstance().get(Calendar.YEAR)
                        && Integer.parseInt(mon.getText().toString()) == Calendar.getInstance().get(Calendar.MONTH) + 1 ?
                        Calendar.getInstance().get(Calendar.DAY_OF_MONTH) : 31f);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });


    }


    private boolean updateDB() {
        if (MainApp.superuser) return true;

        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesChildColumn(TableContracts.ChildTable.COLUMN_SIM, child.sIMtoString());
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
        //if (!insertNewRecord()) return;
        // saveDraft();
        if (updateDB()) {
            setResult(RESULT_OK);
            finish();
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }

    public void btnEnd(View view) {
        setResult(RESULT_CANCELED);
        finish();
        //startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();

    }


}