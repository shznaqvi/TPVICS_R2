package edu.aku.hassannaqvi.tpvics_r2.core;

import static edu.aku.hassannaqvi.tpvics_r2.database.DatabaseHelper.DATABASE_NAME;
import static edu.aku.hassannaqvi.tpvics_r2.database.DatabaseHelper.DATABASE_PASSWORD;

import android.Manifest;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;

import androidx.core.app.ActivityCompat;

import com.scottyab.rootbeer.RootBeer;

import net.sqlcipher.database.SQLiteDatabase;

import org.json.JSONArray;

import java.io.File;
import java.util.List;

import edu.aku.hassannaqvi.tpvics_r2.R;
import edu.aku.hassannaqvi.tpvics_r2.models.Child;
import edu.aku.hassannaqvi.tpvics_r2.models.Clusters;
import edu.aku.hassannaqvi.tpvics_r2.models.Form;
import edu.aku.hassannaqvi.tpvics_r2.models.RandomHH;
import edu.aku.hassannaqvi.tpvics_r2.models.Users;


public class MainApp extends Application {

    public static final String PROJECT_NAME = "TPVICS_R2";
    public static final String DIST_ID = null;
    public static final String SYNC_LOGIN = "sync_login";
    public static final String _IP = "https://vcoe1.aku.edu";// .LIVE server
    // public static final String _IP = "https://cls-pae-fp51764";// .TEST server
    // public static final String _IP = "http://f49461:8080/prosystem";// .TEST server
    //public static final String _IP = "http://43.245.131.159:8080";// .TEST server
    public static final String _HOST_URL = MainApp._IP + "/tpvics_r2/api/";// .TEST server;
    public static final String _SERVER_URL = "syncgcm.php";
    public static final String _USER_URL = "resetpassword.php";
    public static final String _SERVER_GET_URL = "getDatagcm.php";
    public static final String _PHOTO_UPLOAD_URL = _HOST_URL + "uploads.php";
    public static final String _UPDATE_URL = MainApp._IP + "/tpvics_r2/app/survey";
    public static final String _APP_FOLDER = "../app/survey";
    public static final String _EMPTY_ = "";
    private static final String TAG = "MainApp";
    public static int TRATS = 8;
    public static String IBAHC = "";


    //COUNTRIES
    public static int URDU = 1;

    public static File sdDir;
    public static String[] downloadData;
    public static Form form;
    // public static Pregnancy pregnancy;
    public static Child child;


    //public static Samples samples;

    public static String DeviceURL = "devices.php";
    public static AppInfo appInfo;
    public static Users user;
    public static Boolean admin = false;
    public static List<JSONArray> uploadData;
    public static SharedPreferences.Editor editor;
    public static SharedPreferences sharedPref;
    public static String deviceid;
    public static int versionCode = edu.aku.hassannaqvi.tpvics_r2.BuildConfig.VERSION_CODE;
    public static String versionName = edu.aku.hassannaqvi.tpvics_r2.BuildConfig.VERSION_NAME;
    public static boolean permissionCheck = false;
    private static final long MINIMUM_DISTANCE_CHANGE_FOR_UPDATES = 1; // in Meters
    private static final long MINIMUM_TIME_BETWEEN_UPDATES = 1000; // in Milliseconds
    protected static LocationManager locationManager;
    public static int entryType = 0;

    public static List<Child> childList;
    public static List<Integer> mwraList;

    public static int childCount = 0;
    public static String selectedMWRA;
    public static int selectedChild;
    public static String selectedChildName = "";
    public static int memberCountComplete;
    public static boolean memberComplete;

    public static boolean hhheadSelected = false;
    public static boolean superuser;
    public static String selectedDistrict = "";
    public static String selectedTehsil = "";
    public static String selectedUC = "";

    public static RandomHH selectedHousehold;
    public static int selectedLanguage = 0;
    public static boolean langRTL = false;
    public static int ageOfIndexChild;

    public static Clusters selectedCluster;
    public static List<Integer> childCompleted;
    public static boolean householdChecked = false;
    public static long preAgeInMonths;

    public static NoMenuEditText noMenuEditText;



    public static void hideSystemUI(View decorView) {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    public static String getDeviceId(Context context) {
        String deviceId;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            deviceId = Settings.Secure.getString(
                    context.getContentResolver(),
                    Settings.Secure.ANDROID_ID);
        } else {
           /* final TelephonyManager mTelephony = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
            if (mTelephony.getDeviceId() != null) {
                deviceId = mTelephony.getDeviceId();
            } else {
                deviceId = Settings.Secure.getString(
                        context.getContentResolver(),
                        Settings.Secure.ANDROID_ID);
            }*/
        }
        return "deviceId";
    }

    public static String kishGrid(int Hh_Sno, int totalMwra) {

        // GENERATE RANDOM
        // int household  = 1 + (int)(Math.random() * ((10 - 1) + 1));
        // int eligibles = 1 + (int)(Math.random() * ((8 - 1) + 1));

        int household = Math.min(Hh_Sno, 9);
        int eligibles = Math.min(totalMwra, 8);

        int[][] grid = {
                // Eligible People ===>>
                //1- 2- 3- 4- 5- 6- 7- 8
                {1, 2, 1, 2, 5, 4, 3, 2},  // 0 - Household (10th)
                {1, 1, 1, 1, 1, 1, 1, 1},  // 1 - Household (1st)
                {1, 2, 2, 2, 2, 2, 2, 2},  //         ||
                {1, 1, 3, 3, 3, 3, 3, 3},  //         ||
                {1, 2, 1, 4, 4, 4, 4, 4},  //         ||
                {1, 1, 2, 1, 5, 5, 5, 5},  //        \\//
                {1, 2, 3, 2, 1, 6, 6, 6},  //         \/
                {1, 1, 1, 3, 2, 1, 7, 7},  //
                {1, 2, 2, 4, 3, 2, 1, 8},  // 8 - Household (8th)
                {1, 1, 3, 1, 4, 3, 2, 1},  // 9 - Household (9th)
        };


        // System.out.println(household+"-"+eligibles);
        // System.out.println(grid[household-1][eligibles-1]);

        /**
         *  0 household mean 0 index
         *  1 eligibles means eligibles-1 index
         *
         *  return Index of MWRAList (SNO-1)
         */
        return String.valueOf((grid[household][eligibles - 1]) - 1);
    }

    public static Boolean isNetworkAvailable(Context c) {
        ConnectivityManager connectivityManager = (ConnectivityManager) c.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            Network nw = connectivityManager.getActiveNetwork();
            if (nw == null) return false;
            NetworkCapabilities actNw = connectivityManager.getNetworkCapabilities(nw);
            return actNw != null && (actNw.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_BLUETOOTH));
        } else {
            NetworkInfo nwInfo = connectivityManager.getActiveNetworkInfo();
            return nwInfo != null && nwInfo.isConnected();
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();

        RootBeer rootBeer = new RootBeer(this);
        if (rootBeer.isRooted()) {
            android.os.Process.killProcess(android.os.Process.myPid());
            throw new RuntimeException("This is a crash");

            //System.exit(1);
        }
        //Initiate DateTime
        //Initializ App info
        appInfo = new AppInfo(this);
        sharedPref = getSharedPreferences(getString(R.string.app_name), MODE_PRIVATE);
        editor = sharedPref.edit();
        deviceid = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);

        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        locationManager.requestLocationUpdates(
                LocationManager.GPS_PROVIDER,
                MINIMUM_TIME_BETWEEN_UPDATES,
                MINIMUM_DISTANCE_CHANGE_FOR_UPDATES,
                new GPSLocationListener(this) // Implement this class from code

        );

        initSecure();

    }

    private void initSecure() {
        // Initialize SQLCipher library
        SQLiteDatabase.loadLibs(this);
        File databaseFile = getDatabasePath(DATABASE_NAME);
       /* databaseFile.mkdirs();
        databaseFile.delete();*/
        SQLiteDatabase database = SQLiteDatabase.openOrCreateDatabase(databaseFile, DATABASE_PASSWORD, null);
        // Prepare encryption KEY
        ApplicationInfo ai = null;
        try {
            ai = getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
            Bundle bundle = ai.metaData;
            TRATS = bundle.getInt("YEK_TRATS");
            //IBAHC = bundle.getString("YEK_REVRES").substring(TRATS, TRATS + 16);
            IBAHC = bundle.getString("YEK_REVRES");
            Log.d(TAG, "onCreate: YEK_REVRES = " + IBAHC);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

}
