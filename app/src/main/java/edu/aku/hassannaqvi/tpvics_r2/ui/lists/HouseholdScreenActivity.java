package edu.aku.hassannaqvi.tpvics_r2.ui.lists;

import static edu.aku.hassannaqvi.tpvics_r2.core.MainApp.selectedChild;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import org.json.JSONException;

import java.util.ArrayList;

import edu.aku.hassannaqvi.tpvics_r2.R;
import edu.aku.hassannaqvi.tpvics_r2.adapters.ChildAdapter;
import edu.aku.hassannaqvi.tpvics_r2.core.MainApp;
import edu.aku.hassannaqvi.tpvics_r2.database.DatabaseHelper;
import edu.aku.hassannaqvi.tpvics_r2.databinding.ActivityHouseholdScreenBinding;
import edu.aku.hassannaqvi.tpvics_r2.models.Child;
import edu.aku.hassannaqvi.tpvics_r2.ui.EndingActivity;
import edu.aku.hassannaqvi.tpvics_r2.ui.sections.SectionCHActivity;
import edu.aku.hassannaqvi.tpvics_r2.ui.sections.SectionSS_1Activity;


public class HouseholdScreenActivity extends AppCompatActivity {


    private static final String TAG = "ChildListActivit";
    private final boolean selectionCheck = false;
    ActivityHouseholdScreenBinding bi;
    DatabaseHelper db;
    private ChildAdapter childsAdapter;
    ActivityResultLauncher<Intent> MemberInfoLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {

                    if (result.getResultCode() == Activity.RESULT_OK && !MainApp.superuser) {

                        Intent data = result.getData();
                        if (data != null) {
                            if (data.getStringExtra("requestCode").equals("1")) {
                                Toast.makeText(HouseholdScreenActivity.this, "Child information entered.", Toast.LENGTH_SHORT).show();
                                bi.addHousehold.setEnabled(false);

                            } else if (data.getStringExtra("requestCode").equals("2")) {

                                MainApp.childList.add(MainApp.child);

                                MainApp.childCount++;
                                childsAdapter.notifyItemInserted(MainApp.childList.size() - 1);
                                Toast.makeText(HouseholdScreenActivity.this, "Child added.", Toast.LENGTH_SHORT).show();

                            } else if (data.getStringExtra("requestCode").equals("3")) {

                                MainApp.childList.set(selectedChild, MainApp.child);
                                childsAdapter.notifyItemChanged(selectedChild);
                                Toast.makeText(HouseholdScreenActivity.this, "Child updated.", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }

                    if (result.getResultCode() == Activity.RESULT_CANCELED) {
                        Toast.makeText(HouseholdScreenActivity.this, "No data has been updated.", Toast.LENGTH_SHORT).show();
                    }

                }
            });


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_household_screen);
        if (MainApp.superuser)
            bi.btnContinue.setText("Review Next");
        db = MainApp.appInfo.dbHelper;
        MainApp.childList = new ArrayList<>();


        Log.d(TAG, "onCreate(childList): " + MainApp.childList.size());
        try {
            MainApp.childList = db.getChildrenBYUID();

        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(Child): " + e.getMessage(), Toast.LENGTH_LONG).show();
        }

        bi.btnContinue.setEnabled(MainApp.childList.size() > 0);
        bi.btnContinue.setBackground(MainApp.childList.size() > 0 ? getResources().getDrawable(R.drawable.button_shape_green) : getResources().getDrawable(R.drawable.button_shape_gray));

        MainApp.childCount = Math.round(MainApp.childList.size());

        childsAdapter = new ChildAdapter(this, MainApp.childList, MemberInfoLauncher);
       /* GridLayoutManager layoutManager =
                new GridLayoutManager(this, 3, GridLayoutManager.HORIZONTAL, false);*/
        bi.rvChild.setAdapter(childsAdapter);
        // bi.rvChild.setLayoutManager(layoutManager);


        bi.addChild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainApp.superuser) {
                    Toast.makeText(HouseholdScreenActivity.this, "Supervisors cannot add new members.", Toast.LENGTH_LONG).show();

                } else {
                    //     Toast.makeText(MwraActivity.this, "Opening Mwra Form", Toast.LENGTH_LONG).show();
                    MainApp.child = new Child();
                    addChild();
                }
            }
        });

        bi.addHousehold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MainApp.superuser) {
                    Toast.makeText(HouseholdScreenActivity.this, "Supervisors cannot add new members.", Toast.LENGTH_LONG).show();

                } else {
                    addHouseholdInfo();
                    //Toast.makeText(HouseholdScreenActivity.this, "This form has been locked. You cannot add new family member to locked forms", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Activity Resumed!", Toast.LENGTH_SHORT).show();

    }


    public void btnContinue(View view) {


        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true));

    }


    private void addChild() {
        MainApp.child = new Child();
        //TODO: UNCOMMENT two line to launch the child info activity (CH)
        Intent intent = new Intent(this, SectionCHActivity.class);

        intent.putExtra("requestCode", "2");

        MemberInfoLauncher.launch(intent);
    }

    private void addHouseholdInfo() {
        //TODO: UNCOMMENT two line to launch the child info activity (CH)
        Intent intent = new Intent(this, SectionSS_1Activity.class);
        MemberInfoLauncher.launch(intent);
    }

    public void btnEnd(View view) {

        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));

    }

   /* @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RESULT_OK)

            // A213 is line number
            childsAdapter.notifyItemInserted(Integer.parseInt(MainApp.child.getEc13()) - 1);

    }*/


}