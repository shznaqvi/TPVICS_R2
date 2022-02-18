package edu.aku.hassannaqvi.tpvics_r2.models;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static edu.aku.hassannaqvi.tpvics_r2.core.MainApp._EMPTY_;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import edu.aku.hassannaqvi.tpvics_r2.BR;
import edu.aku.hassannaqvi.tpvics_r2.contracts.TableContracts.FamilyMembersTable;
import edu.aku.hassannaqvi.tpvics_r2.core.MainApp;


public class FamilyMembers extends BaseObservable implements Observable {

    private final String TAG = "FamilyMembers";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();

    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String psuCode = _EMPTY_;
    private String hhid = _EMPTY_;
    private String sno = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;


    // SECTION VARIABLES
    private String sD = _EMPTY_;

    // FIELD VARIABLES
    private String d101 = _EMPTY_;
    private String d102 = _EMPTY_;
    private String d104 = _EMPTY_;
    private String d103 = _EMPTY_;
    private String d108d = _EMPTY_;
    private String d108m = _EMPTY_;
    private String d108y = _EMPTY_;
    private String d109y = _EMPTY_;
    private String d109m = _EMPTY_;
    private String d109d = _EMPTY_;
    private String d106 = _EMPTY_;
    private String d10601x = _EMPTY_;
    private String d107 = _EMPTY_;
    private String d10701x = _EMPTY_;
    private String d105 = _EMPTY_;
    private String d110 = _EMPTY_;
    private String d111 = _EMPTY_;
    private String d115 = _EMPTY_;
    private String d112 = _EMPTY_;
    private String d113 = _EMPTY_;
    private String d114 = _EMPTY_;


    private boolean expanded;
    private boolean mwra;
    private String ageInMonths;
    private String muid;
    private String motherPresent;
    private String indexed = _EMPTY_;
    private String memCate = _EMPTY_;

    public FamilyMembers() {


    }


    public void populateMeta() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.form.getUserName());
        setDeviceId(MainApp.form.getDeviceId());
        setUuid(MainApp.form.getUid());
        setAppver(MainApp.form.getAppver());
        setpsuCode(MainApp.form.getPsuCode());
        setHhid(MainApp.form.getHhid());
        CaluculateAge();

    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getAgeInMonths() {
        return ageInMonths;
    }

    public void setAgeInMonth(String ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public String getMuid() {
        return muid;
    }

    public void setMuid(String muid) {
        this.muid = muid;
    }

    public String getMotherPresent() {
        return motherPresent;
    }

    public void setMotherPresent(String motherPresent) {
        this.motherPresent = motherPresent;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Bindable
    public String getpsuCode() {
        return psuCode;
    }

    public void setpsuCode(String psuCode) {
        this.psuCode = psuCode;
    }

    @Bindable
    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
    }

    @Bindable
    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceTag() {
        return deviceTag;
    }

    public void setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
    }

    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getiStatus96x() {
        return iStatus96x;
    }

    public void setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }


    public String getsD() {
        return sD;
    }

    public void setsD(String sD) {
        this.sD = sD;
    }


    @Bindable
    public String getD101() {
        return d101;
    }

    public void setD101(String d101) {
        this.d101 = d101;
        notifyPropertyChanged(BR.d101);
    }

    @Bindable
    public String getD102() {
        return d102;
    }

    public void setD102(String d102) {
        this.d102 = d102;
        notifyPropertyChanged(BR.d102);
    }

    @Bindable
    public String getD104() {
        return d104;
    }

    public void setD104(String d104) {
        this.d104 = d104;
        setD111("");
        notifyPropertyChanged(BR.d104);
    }

    @Bindable
    public String getD103() {
        return d103;
    }

    public void setD103(String d103) {
        this.d103 = d103;
        notifyPropertyChanged(BR.d103);
    }

    @Bindable
    public String getD108d() {
        return d108d;
    }

    public void setD108d(String d108d) {
        this.d108d = d108d;
        CaluculateAge();
        notifyPropertyChanged(BR.d108d);
    }

    @Bindable
    public String getD108m() {
        return d108m;
    }

    public void setD108m(String d108m) {
        this.d108m = d108m;
        if (d108m.equals("98")) {
            setD108d("98");
        }
        CaluculateAge();
        notifyPropertyChanged(BR.d108m);
    }

    @Bindable
    public String getD108y() {
        return d108y;
    }

    public void setD108y(String d108y) {
        this.d108y = d108y;
        if (d108y.equals("9998")) {
            setD108m("98");
            setD109d("");
            setD109m("");
            setD109y("");
        }
        // Calculate age
        CaluculateAge();
        notifyPropertyChanged(BR.d108y);
    }

    @Bindable
    public String getD109y() {
        return d109y;
    }

    public void setD109y(String d109y) {
        // setD105(!this.d109y.equals(d109y)? "": );
        this.d109y = d109y;
        setD105(d109y.length() > 0 && Integer.parseInt(d109y) < 14 ? "2" : this.d105);
        //   setD105(d109y.length() > 0 ? Integer.parseInt(d109y) > 14 ? "" : this.d105 : this.d105);
        //  CaluculateAge();

        notifyPropertyChanged(BR.d109y);
    }

    @Bindable
    public String getD109m() {
        return d109m;
    }

    public void setD109m(String d109m) {
        this.d109m = d109m;
        notifyPropertyChanged(BR.d109m);
    }

    @Bindable
    public String getD109d() {
        return d109d;
    }

    public void setD109d(String d109d) {
        this.d109d = d109d;
        notifyPropertyChanged(BR.d109d);
    }

    @Bindable
    public String getD106() {
        return d106;
    }

    public void setD106(String d106) {
        this.d106 = d106;
        notifyPropertyChanged(BR.d106);
    }

    @Bindable
    public String getD10601x() {
        return d10601x;
    }

    public void setD10601x(String d10601x) {
        this.d10601x = d10601x;
        notifyPropertyChanged(BR.d10601x);
    }

    @Bindable
    public String getD107() {
        return d107;
    }

    public void setD107(String d107) {
        this.d107 = d107;
        notifyPropertyChanged(BR.d107);
    }

    @Bindable
    public String getD10701x() {
        return d10701x;
    }

    public void setD10701x(String d10701x) {
        this.d10701x = d10701x;
        notifyPropertyChanged(BR.d10701x);
    }

    @Bindable
    public String getD105() {
        return d105;
    }

    public void setD105(String d105) {
        this.d105 = d105;
        notifyPropertyChanged(BR.d105);
    }

    @Bindable
    public String getD110() {
        return d110;
    }

    public void setD110(String d110) {
        this.d110 = d110;
        notifyPropertyChanged(BR.d110);
    }

    @Bindable
    public String getD111() {
        return d111;
    }

    public void setD111(String d111) {
        this.d111 = d111;
        notifyPropertyChanged(BR.d111);
    }

    @Bindable
    public String getD115() {
        return d115;
    }

    public void setD115(String d115) {
        this.d115 = d115;
        notifyPropertyChanged(BR.d115);
    }

    @Bindable
    public String getD112() {
        return d112;
    }

    public void setD112(String d112) {
        this.d112 = d112;
        notifyPropertyChanged(BR.d112);
    }

    @Bindable
    public String getD113() {
        return d113;
    }

    public void setD113(String d113) {
        this.d113 = d113;
        notifyPropertyChanged(BR.d113);
    }

    @Bindable
    public String getD114() {
        return d114;
    }

    public void setD114(String d114) {
        this.d114 = d114;
        notifyPropertyChanged(BR.d114);
    }

    @Bindable
    public boolean isMwra() {
        return mwra;
    }

    public void setMwra(boolean mwra) {
        this.mwra = mwra;

        notifyPropertyChanged(BR.mwra);
    }

    public String getMemCate() {
        return memCate;
    }

    public void setMemCate(String memCate) {
        this.memCate = memCate;
        // notifyPropertyChanged(BR.memCate);
    }

    @Bindable
    public String getIndexed() {
        return indexed;
    }

    public void setIndexed(String Indexed) {
        this.indexed = Indexed;
        notifyPropertyChanged(BR.indexed);
    }

    public FamilyMembers Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_UUID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_PROJECT_NAME));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_HHID));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_SNO));
        this.ageInMonths = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_AGE_MONTHS));
        this.muid = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_MUID));
        this.motherPresent = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_MOTHER_PRESENT));
        this.indexed = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_INDEXED));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_SYNC_DATE));

        sDHydrate(cursor.getString(cursor.getColumnIndexOrThrow(FamilyMembersTable.COLUMN_SD)));
        updateMemCategory();

        return this;
    }

    public void sDHydrate(String string) throws JSONException {
        Log.d(TAG, "sDHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.d101 = json.getString("d101");
            this.d102 = json.getString("d102");
            this.d104 = json.getString("d104");
            this.d103 = json.getString("d103");
            this.d108d = json.getString("d108d");
            this.d108m = json.getString("d108m");
            this.d108y = json.getString("d108y");
            this.d109y = json.getString("d109y");
            this.d109m = json.getString("d109m");
            this.d109d = json.getString("d109d");
            this.d106 = json.getString("d106");
            this.d10601x = json.getString("d10601x");
            this.d107 = json.getString("d107");
            this.d10701x = json.getString("d10701x");
            this.d105 = json.getString("d105");
            this.d110 = json.getString("d110");
            this.d111 = json.getString("d111");
            this.d115 = json.getString("d115");
            this.d112 = json.getString("d112");
            this.d113 = json.getString("d113");
            this.d114 = json.getString("d114");
        }
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(FamilyMembersTable.COLUMN_ID, this.id);
        json.put(FamilyMembersTable.COLUMN_UID, this.uid);
        json.put(FamilyMembersTable.COLUMN_UUID, this.uuid);
        json.put(FamilyMembersTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(FamilyMembersTable.COLUMN_PSU_CODE, this.psuCode);
        json.put(FamilyMembersTable.COLUMN_HHID, this.hhid);
        json.put(FamilyMembersTable.COLUMN_INDEXED, this.indexed);
        json.put(FamilyMembersTable.COLUMN_SNO, this.sno);
        json.put(FamilyMembersTable.COLUMN_AGE_MONTHS, this.ageInMonths);
        json.put(FamilyMembersTable.COLUMN_MUID, this.muid);
        json.put(FamilyMembersTable.COLUMN_MOTHER_PRESENT, this.motherPresent);
        json.put(FamilyMembersTable.COLUMN_USERNAME, this.userName);
        json.put(FamilyMembersTable.COLUMN_SYSDATE, this.sysDate);
        json.put(FamilyMembersTable.COLUMN_DEVICEID, this.deviceId);
        json.put(FamilyMembersTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(FamilyMembersTable.COLUMN_ISTATUS, this.iStatus);
        json.put(FamilyMembersTable.COLUMN_SYNCED, this.synced);
        json.put(FamilyMembersTable.COLUMN_SYNC_DATE, this.syncDate);
        json.put(FamilyMembersTable.COLUMN_APPVERSION, this.appver);

        json.put(FamilyMembersTable.COLUMN_SD, new JSONObject(sDtoString()));
        return json;
    }

    public String sDtoString() throws JSONException {
        Log.d(TAG, "sDtoString: ");
        JSONObject json = new JSONObject();
        json.put("d101", d101)
                .put("d102", d102)
                .put("d104", d104)
                .put("d103", d103)
                .put("d108d", d108d)
                .put("d108m", d108m)
                .put("d108y", d108y)
                .put("d109y", d109y)
                .put("d109m", d109m)
                .put("d109d", d109d)
                .put("d106", d106)
                .put("d10601x", d10601x)
                .put("d107", d107)
                .put("d10701x", d10701x)
                .put("d105", d105)
                .put("d110", d110)
                .put("d111", d111)
                .put("d115", d115)
                .put("d112", d112)
                .put("d113", d113)
                .put("d114", d114);
        return json.toString();
    }

    private void CaluculateAge() {
        Log.d(TAG, "CaluculateAge: " + this.d108y + "-" + this.d108m + "-" + this.d108d);

        if (!this.d108y.equals("") && !this.d108y.equals("9998") && !this.d108m.equals("") && !this.d108d.equals("")) {

            if ((Integer.parseInt(this.d108m) > 12 && !this.d108m.equals("98")) || (Integer.parseInt(this.d108d) > 31 && !this.d108d.equals("98")) || Integer.parseInt(this.d108y) < 1920) {
                setD109y("");
                setD109m("");
                this.ageInMonths = "0";
                return;
            }


            //TODO:
            // set current Date
/*            int curDay = 15;//!MainApp.form.getAs1q15d().equals("98") ? Integer.parseInt(MainApp.form.getAs1q15d()) : 15;
            int curMonth = 6;//!MainApp.form.getAs1q15m().equals("98") ? Integer.parseInt(MainApp.form.getAs1q15m()) : 6;
            int curYear = 2021;//Integer.parseInt(MainApp.form.getAs1q15y());*/

            Calendar cur = Calendar.getInstance();


            // set Date of birth
            int day = !this.d108d.equals("98") ? Integer.parseInt(this.d108d) : 15;
            int month = !this.d108m.equals("98") ? Integer.parseInt(this.d108m) : 6;
            int year = Integer.parseInt(this.d108y);
            Calendar cal = Calendar.getInstance();

            SimpleDateFormat df = new SimpleDateFormat("yyyy MM dd", Locale.ENGLISH);
//             String todayDate = df.format(Calendar.getInstance().getTime());


            try {
                cal.setTime(df.parse(year + " " + month + " " + day));
                long millis = System.currentTimeMillis() - cal.getTimeInMillis();
                cal.setTimeInMillis(millis);

             /*   int mYear = cal.get(Calendar.YEAR)-1970;
                int mMonth = cal.get(Calendar.MONTH);
                int mDay = cal.get(Calendar.DAY_OF_MONTH)-1;

                Log.d(TAG, "CaluculateAge: " + (mYear) + "-" + mMonth + "-" + mDay);
*/
                long inDays = MILLISECONDS.toDays(millis);
                long tYear = inDays / 365;
                long tMonth = (inDays - (tYear * 365)) / 30;
                long tDay = inDays - ((tYear * 365) + (tMonth * 30));

                Log.d(TAG, "CaluculateAge: Y-" + tYear + " M-" + tMonth + " D-" + tDay);
               /* setH231d(String.valueOf(tDay));
                setH231m(String.valueOf(tMonth));*/

                setD109y(String.valueOf(tYear));
                setD109m(String.valueOf(tMonth));
                setD109d(String.valueOf(tDay));
                setAgeInMonth(String.valueOf((int) inDays));
                if (tYear < 0)
                    setD109y("");
                //setAge(String.valueOf(((tYear) * 12) + tMonth));


        /*        String.format("%d min, %d sec",
                        ,
                        TimeUnit.MILLISECONDS.toSeconds(millis) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))
                );*/

            } catch (ParseException e) {
                Log.d(TAG, "CaluculateAge: " + e.getMessage());
                e.printStackTrace();

            }
        } else {
            if (!this.d109y.equals("") && !this.d109m.equals("") && !this.d109d.equals("")) {
                int yearToDays = 0;
                int monthsToDays = 0;
                int inDays = 0;


                if (Integer.parseInt(this.d109y) < 98 && Integer.parseInt(this.d109y) > 0)
                    yearToDays = (int) (Integer.parseInt(this.d109y) * 365.2425);

                if (Integer.parseInt(this.d109m) < 12 && Integer.parseInt(this.d109m) > 0)
                    monthsToDays = (int) (Integer.parseInt(this.d109m) * 30.43);
                if (Integer.parseInt(this.d109d) < 30)
                    inDays = Integer.parseInt(this.d109d);

                setAgeInMonth(String.valueOf(inDays + monthsToDays + yearToDays));

            }
        }
    }

    /**
     * Memeber Categories:
     * 1 = MWRA
     * 2 = Child
     * 3 = Adol Male // not used in this project
     * 4 = Adol Female
     */
    private void updateMemCategory() {
        if (d104.equals("") || d109y.equals("") || d105.equals("") || !d115.equals("1")) return;
        String memGender = getD104();
        String memMaritalStatus = getD105();
        int memAge = Integer.parseInt(getD109y());

        // MWRA
        if (memGender.equals("2")                // Female
                && memAge >= 15 && memAge <= 49   // 15 to 49 year old
                && !memMaritalStatus.equals("2")
                && !memMaritalStatus.isEmpty()
        ) {
            setMemCate("1");
        }

        // Child
        if (memAge < 5
                && !d107.equals("") && !d107.equals("97")
        ) {
            setMemCate("2");
        }

        // Adolescent Male
        if (memGender.equals("1")
                && memAge >= 15 && memAge <= 19   // 15 to 19 year old
                && (memMaritalStatus.equals("2") || memMaritalStatus.isEmpty() || memMaritalStatus.equals("97"))
        ) {
            setMemCate("3");
        }


        // Adolescent Female
        if (memGender.equals("2")
                && memAge >= 15 && memAge <= 19   // 15 to 19 year old
                && (memMaritalStatus.equals("2") || memMaritalStatus.isEmpty() || memMaritalStatus.equals("97"))
        ) {
            setMemCate("4");
        }
    }
}
