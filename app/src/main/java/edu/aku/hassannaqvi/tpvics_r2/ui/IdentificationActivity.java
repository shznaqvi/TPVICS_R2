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

import java.util.ArrayList;

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
    private ArrayList<String> districtNames;
    private ArrayList<String> districtCodes;
    private ArrayList<String> tehsilNames;
    private ArrayList<String> tehsilCodes;
    private ArrayList<String> ucNames;
    private ArrayList<String> ucCodes;
    private ArrayList<String> ebCode;
    private ArrayList<String> headHH;
    private Intent openIntent;

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

   /* private void populateSpinner() {

        bi.a105.setText(db.getDistrictNameByCode());
        // Populate Provinces
        List<Villages> tehsils = db.getTehsilsByDistrict(String.valueOf(MainApp.selectedDistrict));

        tehsilNames = new ArrayList<>();
        tehsilCodes = new ArrayList<>();

        tehsilNames.add("...");
        tehsilCodes.add("...");
        if (MainApp.user.getUserName().equals("test1234")) {
            tehsilNames.add("Test Tehsil 1");
            tehsilNames.add("Test Tehsil 2");
            tehsilNames.add("Test Tehsil 3");

            tehsilCodes.add("91");
            tehsilCodes.add("92");
            tehsilCodes.add("93");
        }

        for (Villages t : tehsils) {

            tehsilNames.add(t.getTehsilName());
            tehsilCodes.add(t.getTcode());

        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(IdentificationActivity.this,
                R.layout.custom_spinner, tehsilNames);

        bi.a106.setAdapter(adapter);

        bi.a106.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                bi.a107.setAdapter(null);
                bi.a101.setText(null);
                bi.a113.setText(null);

                if (position == 0) return;
                MainApp.selectedTehsil = tehsilCodes.get(position);
                // Populate UCs
                List<Villages> ucs = db.getUCsByTehsil(MainApp.selectedDistrict, MainApp.selectedTehsil);

                ucNames = new ArrayList<>();
                ucCodes = new ArrayList<>();

                ucNames.add("...");
                ucCodes.add("...");
                if (MainApp.user.getUserName().equals("test1234")) {
                    ucNames.add("Test UC 1");
                    ucNames.add("Test UC 2");
                    ucNames.add("Test UC 3");

                    ucCodes.add("9101");
                    ucCodes.add("9202");
                    ucCodes.add("9303");
                }
                ebCode = new ArrayList<>();

                for (Villages uc : ucs) {

                    ucNames.add(uc.getUcName());
                    ucCodes.add(uc.getUccode());
                    ebCode.add(uc.getPsucode());

                }

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(IdentificationActivity.this, R.layout.custom_spinner, ucNames);

                bi.a107.setAdapter(adapter);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        bi.a107.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                bi.a101.setText(null);
                bi.a113.setText(null);
                if (position == 0) return;

                MainApp.selectedUC = ucCodes.get(position);


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

    public void btnContinue(View view) {
        if (!formValidation()) return;
        MainApp.selectedHHID = bi.a101.getText().toString();

        if (!hhExists()) {
            saveDraftForm();
            finish();
            startActivity(new Intent(this, SectionA1Activity.class));
        } else if (MainApp.entryType != Integer.parseInt(MainApp.form.getEntryType())) {
            Toast.makeText(this, String.format("This form has been entered as %s", MainApp.form.getEntryType().equals("1") ? "interview." : "data-entry"), Toast.LENGTH_SHORT).show();

        } else if (MainApp.form.getSynced().equals("1") && !MainApp.superuser) { // Do not allow synced form to be edited
            Toast.makeText(this, "This form has been locked.", Toast.LENGTH_SHORT).show();
        } else {
            finish();
            startActivity(new Intent(this, SectionA1Activity.class));
        }

    }*/


/*    private void saveDraftForm() {
        MainApp.form = new Form();

        MainApp.form.setUserName(MainApp.user.getUserName());
        MainApp.form.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.form.setDeviceId(MainApp.deviceid);
        MainApp.form.setAppver(MainApp.versionName + "." + MainApp.versionCode);

        MainApp.form.setA104(String.valueOf(MainApp.selectedCountry));
        MainApp.form.setA105(MainApp.selectedProvince);
        MainApp.form.setA106(MainApp.selectedDistrict);
        MainApp.form.setA107(MainApp.selectedPSU);
        MainApp.form.setA109(MainApp.selectedPSU);
        MainApp.form.setA101(MainApp.selectedHHID);
        MainApp.form.setpSno(MainApp.selectedHHID);

    }*/

   /* private void saveDraftAnthro() {
        MainApp.anthro = new Anthro();

        MainApp.anthro.setUserName(MainApp.user.getUserName());
        MainApp.anthro.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.anthro.setDeviceId(MainApp.deviceid);
        MainApp.anthro.setAppver(MainApp.versionName + "." + MainApp.versionCode);

    }

    private void saveDraftSamples() {

        MainApp.samples = new Samples();
        MainApp.samples.setUserName(MainApp.user.getUserName());
        MainApp.samples.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.samples.setDeviceId(MainApp.deviceid);
        MainApp.samples.setAppver(MainApp.versionName + "." + MainApp.versionCode);
    }*/


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

    public void checkHousehold(View view) {
        if (!formValidation()) return;
/*
        RandomHH testRand = new RandomHH();
        testRand.setSno("1");
        testRand.setEbCode("9000001");
        testRand.setHeadhh("Test Head");
        testRand.setHhno("999");*/
        //RandomHH randHH = db.getHHbyCluster(bi.a101.getText().toString(), bi.a113.getText().toString());
      /*  if (!bi.a101.getText().toString().equals("9000001")) {
            randHH = db.getHHbyCluster(bi.a101.getText().toString(), bi.a113.getText().toString());
        } else {
            randHH = testRand;
        }*/
//        if (!randHH.getEbCode().equals("")) {
//         /*   bi.ahhead.setError(null);
//            bi.ahhead.setText(randHH.getHeadhh());*/
//            bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.colorAccent));
//            bi.btnContinue.setEnabled(true);
//
//            MainApp.selectedHousehold = randHH;
//
//        } else {
///*
//            bi.ahhead.setError("Not Found!");
//*/
//            bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
//            bi.btnContinue.setEnabled(false);
//        }
        /*ArrayList<String> households = new ArrayList<String>();
        for (RandomHH r : randHH) {
            households.add(r.getHhno());
            headHH = new ArrayList<String>();
            headHH.add(r.getHeadhh());
        }*/
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

    /*public void searchCluster(View view) {
        bi.btnContinue.setEnabled(false);
        Villages testClusters = new Villages();
        testClusters.setPsucode("909090909");
        testClusters.setDistrictName("Test District 9");
        testClusters.setTehsilName("Test Tehsil 9");
        Villages clusters = new Villages();
        if (!bi.a101.getText().toString().equals(testClusters.getPsucode())) {
            clusters = db.getPS(bi.a105.getText().toString());
        } else {
            clusters = testClusters;
        }

       *//* ebCode = new ArrayList<>();
        tehsilNames = new ArrayList<>();
        tehsilNames = new ArrayList<>();
        for (EnumBlocks eb : enumBlocks) {
            ebCode.add(eb.getEnumBlock());
            tehsilNames.add(eb.getDistrictName());
            tehsilNames.add(eb.getTehsilName()); //
        }*//*
        if (!clusters.getEnumBlock().equals("")) {
            bi.a107.setError(null);
            bi.a108.setError(null);
            bi.a107.setText(clusters.getDistrictName());
            bi.a108.setText(clusters.getTehsilName());
            bi.fldGrpHH.setVisibility(View.VISIBLE);

        } else {
            bi.a107.setError("Not Found!");
            bi.a108.setError("Not Found!");
            bi.a110.setText(null);
            bi.ahhead.setText(null);
            bi.fldGrpHH.setVisibility(View.GONE);
        }
    }
*/


    public void btnEnd(View view) {
        finish();
        // startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean hhExists() {


        MainApp.form = new Form();
        try {
            MainApp.form = db.getFormByHHNo();
        } catch (JSONException e) {
            Log.d(TAG, getString(R.string.hh_exists_form) + e.getMessage());
            Toast.makeText(this, getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return MainApp.form != null;


    }

    public void checkEBNumber(View view) {
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
        bi.hh16a.setText(null);
        bi.headhh.setVisibility(View.GONE);

        bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.gray));
        bi.btnContinue.setEnabled(false);

        selectedHousehold = db.getRandomByHhno(bi.hh12.getText().toString());
        if (selectedHousehold != null) {
            bi.hh16a.setText(selectedHousehold.getHhhead());    // Name of Head
            bi.headhh.setVisibility(View.VISIBLE);

            bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(this, R.color.colorAccent));
            bi.btnContinue.setEnabled(true);
        } else {
            Toast.makeText(this, "Household not found", Toast.LENGTH_SHORT).show();
        }

    }


//    public void searchCluster(View view) {
//        bi.btnContinue.setEnabled(true);
//
//        bi.a105.setText(null);
//        bi.a106.setText(null);
//        bi.a107.setText(null);
//        bi.a113.setText(null);
//        bi.fldGrpA113.setVisibility(View.GONE);
//
//        Clusters clusters = db.getCluster(bi.a101.getText().toString());
//
//        String geoarea = clusters.getGeoarea();
//        if (!clusters.getClusterNo().equals("")) {
//            bi.a105.setText(geoarea.split("\\|")[0]);
//            bi.a106.setText(geoarea.split("\\|")[1]);
//            bi.a107.setText(geoarea.split("\\|")[2]);
//
//            bi.fldGrpA113.setVisibility(View.VISIBLE);
//
//            MainApp.selectedTehsil = bi.a106.getText().toString();
//            MainApp.selectedUC = bi.a107.getText().toString();
//
//        }
//    }
}
