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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

import edu.aku.hassannaqvi.tpvics_r2.R;
import edu.aku.hassannaqvi.tpvics_r2.contracts.TableContracts;
import edu.aku.hassannaqvi.tpvics_r2.core.MainApp;
import edu.aku.hassannaqvi.tpvics_r2.database.DatabaseHelper;
import edu.aku.hassannaqvi.tpvics_r2.databinding.ActivitySectionImBinding;

public class SectionIMActivity extends AppCompatActivity {


    private static final String TAG = "SectionIMActivity";
    ActivitySectionImBinding bi;
    private DatabaseHelper db;
    String[] deff = {"44", "66", "88", "97"};

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
                if (Arrays.asList(deff).contains(day.getText().toString())) {
                    day.setRangedefaultvalue(Float.parseFloat(day.getText().toString()));
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
        if (updateDB()) {
            setResult(RESULT_OK);
            finish();
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {
        setResult(RESULT_CANCELED);
        finish();
    }


    private boolean formValidation() {
        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) return false;

        if (child.getIm02().equals("1") && !child.getIm0497().equals("97")) {
            // Only set once
            // IM04 - DOB
            String dobDate = child.getIm04yy()
                    + "-" + child.getIm04mm()
                    + "-" + child.getIm04dd();

            //IM0501
            String im0501date = child.getIm0501yy()
                    + "-" + child.getIm0501mm()
                    + "-" + child.getIm0501dd();
            if (!validateDatesBCG(dobDate, im0501date)) {
                return Validator.emptyCustomTextBox(this, bi.im0501yy, "Vaccine Date Should be Greater Than DOB");
            }

            //IM0502
            String im0502date = child.getIm0502yy()
                    + "-" + child.getIm0502mm()
                    + "-" + child.getIm0502dd();
            if (!validateDatesBCG(dobDate, im0502date)) {
                return Validator.emptyCustomTextBox(this, bi.im0502yy, "Vaccine Date Should be Greater Than DOB");
            }


            //week6
            String week6 = child.getIm0501yy()
                    + "-" + child.getIm0501mm()
                    + "-" + child.getIm0501dd();

            // im0503
            String im0503date = child.getIm0503yy()
                    + "-" + child.getIm0503mm()
                    + "-" + child.getIm0503dd();
            if (!validateDates(week6, im0503date)) {
                return Validator.emptyCustomTextBox(this, bi.im0503yy, "Vaccine Date Should be Greater Than BCG");
            }

            // im0504
            String im0504date = child.getIm0504yy()
                    + "-" + child.getIm0504mm()
                    + "-" + child.getIm0504dd();
            if (!validateDates(week6, im0504date)) {
                return Validator.emptyCustomTextBox(this, bi.im0504yy, "Vaccine Date Should be Greater Than BCG");
            }

            // im0505
            String im0505date = child.getIm0505yy()
                    + "-" + child.getIm0505mm()
                    + "-" + child.getIm0505dd();
            if (!validateDates(week6, im0505date)) {
                return Validator.emptyCustomTextBox(this, bi.im0505yy, "Vaccine Date Should be Greater Than BCG");
            }

            // im0506
            String im0506date = child.getIm0506yy()
                    + "-" + child.getIm0506mm()
                    + "-" + child.getIm0506dd();
            if (!validateDates(week6, im0506date)) {
                return Validator.emptyCustomTextBox(this, bi.im0506yy, "Vaccine Date Should be Greater Than BCG");
            }


            //week10
            String week10 = child.getIm0506yy()
                    + "-" + child.getIm0506mm()
                    + "-" + child.getIm0506dd();

            // im0507
            String im0507date = child.getIm0507yy()
                    + "-" + child.getIm0507mm()
                    + "-" + child.getIm0507dd();
            if (!validateDates(week10, im0507date)) {
                return Validator.emptyCustomTextBox(this, bi.im0507yy, "Vaccine Date Should be Greater Than SIX Week Vaccine date");
            }

            // im0508
            String im0508date = child.getIm0508yy()
                    + "-" + child.getIm0508mm()
                    + "-" + child.getIm0508dd();
            if (!validateDates(week10, im0508date)) {
                return Validator.emptyCustomTextBox(this, bi.im0508yy, "Vaccine Date Should be Greater Than SIX Week Vaccine date");
            }

            // im0509
            String im0509date = child.getIm0509yy()
                    + "-" + child.getIm0509mm()
                    + "-" + child.getIm0509dd();
            if (!validateDates(week10, im0509date)) {
                return Validator.emptyCustomTextBox(this, bi.im0509yy, "Vaccine Date Should be Greater Than SIX Week Vaccine date");
            }

            // im0510
            String im0510date = child.getIm0510yy()
                    + "-" + child.getIm0510mm()
                    + "-" + child.getIm0510dd();
            if (!validateDates(week10, im0510date)) {
                return Validator.emptyCustomTextBox(this, bi.im0510yy, "Vaccine Date Should be Greater Than SIX Week Vaccine date");
            }

            // im0510a
            String im0510adate = child.getIm0510ayy()
                    + "-" + child.getIm0510amm()
                    + "-" + child.getIm0510add();
            if (!validateDates(week10, im0510adate)) {
                return Validator.emptyCustomTextBox(this, bi.im0510ayy, "Vaccine Date Should be Greater Than SIX Week Vaccine date");
            }


            //week14
            String week14 = child.getIm0510yy()
                    + "-" + child.getIm0510mm()
                    + "-" + child.getIm0510dd();

            // im0511
            String im0511date = child.getIm0511yy()
                    + "-" + child.getIm0511mm()
                    + "-" + child.getIm0511dd();
            if (!validateDates(week14, im0511date)) {
                return Validator.emptyCustomTextBox(this, bi.im0511yy, "Vaccine Date Should be Greater Than TEN Week Vaccine date");
            }

            // im0512
            String im0512date = child.getIm0512yy()
                    + "-" + child.getIm0512mm()
                    + "-" + child.getIm0512dd();
            if (!validateDates(week14, im0512date)) {
                return Validator.emptyCustomTextBox(this, bi.im0512yy, "Vaccine Date Should be Greater Than TEN Week Vaccine date");
            }

            // im0513
            String im0513date = child.getIm0513yy()
                    + "-" + child.getIm0513mm()
                    + "-" + child.getIm0513dd();
            if (!validateDates(week14, im0513date)) {
                return Validator.emptyCustomTextBox(this, bi.im0513yy, "Vaccine Date Should be Greater Than TEN Week Vaccine date");
            }

            // im0514
            String im0514date = child.getIm0514yy()
                    + "-" + child.getIm0514mm()
                    + "-" + child.getIm0514dd();
            if (!validateDates(week14, im0514date)) {
                return Validator.emptyCustomTextBox(this, bi.im0514yy, "Vaccine Date Should be Greater Than TEN Week Vaccine date");
            }


            //month9
            String month9 = child.getIm0514yy()
                    + "-" + child.getIm0514mm()
                    + "-" + child.getIm0514dd();

            // im0515
            String im0515date = child.getIm0515yy()
                    + "-" + child.getIm0515mm()
                    + "-" + child.getIm0515dd();
            if (!validateDates(month9, im0515date)) {
                return Validator.emptyCustomTextBox(this, bi.im0515yy, "Vaccine Date Should be Greater Than 14 Week Vaccine date");
            }

            // im0517
            String im0517date = child.getIm0517yy()
                    + "-" + child.getIm0517mm()
                    + "-" + child.getIm0517dd();
            if (!validateDates(month9, im0517date)) {
                return Validator.emptyCustomTextBox(this, bi.im0517yy, "Vaccine Date Should be Greater Than 14 Week Vaccine date");
            }


            //month15
            String month15 = child.getIm0515yy()
                    + "-" + child.getIm0515mm()
                    + "-" + child.getIm0515dd();

            // im0516
            String im0516date = child.getIm0516yy()
                    + "-" + child.getIm0516mm()
                    + "-" + child.getIm0516dd();
            if (!validateDates(month15, im0516date)) {
                return Validator.emptyCustomTextBox(this, bi.im0516yy, "Vaccine Date Should be Greater Than NINE MONTH Vaccine date");
            }
        }
        return true;
    }


    @Override
    public void onBackPressed() {
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }



    /*IMMUNIZATION DATES DIFFERENCE*/
    private boolean validateDatesBCG(String baseDate, String forwardDate) {
        if (baseDate.length() < 8 || forwardDate.length() < 8)
            return true;
        try {
            Calendar baseCal = Calendar.getInstance();
            Calendar forwardCal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            baseCal.setTime(sdf.parse(baseDate));// all done
            forwardCal.setTime(sdf.parse(forwardDate));// all done
            return forwardCal.getTimeInMillis() >= baseCal.getTimeInMillis();
        } catch (ParseException e) {
            e.printStackTrace();
            Toast.makeText(this, "ParseException(setDateRanges()): " + e.getMessage(), Toast.LENGTH_SHORT).show();
            return false;
        }

    }


    private boolean validateDates(String baseDate, String forwardDate) {
        if (baseDate.length() < 8 || forwardDate.length() < 8)
            return true;

        try {
            Calendar baseCal = Calendar.getInstance();
            Calendar forwardCal = Calendar.getInstance();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            baseCal.setTime(sdf.parse(baseDate));// all done
            forwardCal.setTime(sdf.parse(forwardDate));// all done

            return forwardCal.getTimeInMillis() > baseCal.getTimeInMillis();


        } catch (ParseException e) {
            e.printStackTrace();
            Toast.makeText(this, "ParseException(setDateRanges()): " + e.getMessage(), Toast.LENGTH_SHORT).show();
            return false;
        }
    }


}