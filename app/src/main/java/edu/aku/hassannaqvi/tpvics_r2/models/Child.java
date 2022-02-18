package edu.aku.hassannaqvi.tpvics_r2.models;

import static edu.aku.hassannaqvi.tpvics_r2.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.tpvics_r2.core.MainApp._EMPTY_;
import static edu.aku.hassannaqvi.tpvics_r2.core.MainApp.selectedChild;
import static edu.aku.hassannaqvi.tpvics_r2.core.MainApp.selectedMWRA;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.tpvics_r2.BR;
import edu.aku.hassannaqvi.tpvics_r2.contracts.TableContracts;
import edu.aku.hassannaqvi.tpvics_r2.core.MainApp;

public class Child extends BaseObservable implements Observable {

    private final String TAG = "Form";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String fmuid = _EMPTY_;
    private String muid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String indexed = _EMPTY_;
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


    // Field Variables
    private String im01 = _EMPTY_;
    private String im02 = _EMPTY_;
    private String im03 = _EMPTY_;
    private String im0396x = _EMPTY_;
    private String im04d = _EMPTY_;
    private String im04m = _EMPTY_;
    private String im04y = _EMPTY_;
    private String im0501d = "0";
    private String im0501m = _EMPTY_;
    private String im0501y = _EMPTY_;
    private String im0502d = "0";
    private String im0502m = _EMPTY_;
    private String im0502y = _EMPTY_;
    private String im0503d = "0";
    private String im0503m = _EMPTY_;
    private String im0503y = _EMPTY_;
    private String im0504d = "0";
    private String im0504m = _EMPTY_;
    private String im0504y = _EMPTY_;
    private String im0505d = "0";
    private String im0505m = _EMPTY_;
    private String im0505y = _EMPTY_;
    private String im0506d = "0";
    private String im0506m = _EMPTY_;
    private String im0506y = _EMPTY_;
    private String im0507d = "0";
    private String im0507m = _EMPTY_;
    private String im0507y = _EMPTY_;
    private String im0508d = "0";
    private String im0508m = _EMPTY_;
    private String im0508y = _EMPTY_;
    private String im0509d = "0";
    private String im0509m = _EMPTY_;
    private String im0509y = _EMPTY_;
    private String im0510d = "0";
    private String im0510m = _EMPTY_;
    private String im0510y = _EMPTY_;
    private String im0511d = "0";
    private String im0511m = _EMPTY_;
    private String im0511y = _EMPTY_;
    private String im0512d = "0";
    private String im0512m = _EMPTY_;
    private String im0512y = _EMPTY_;
    private String im0513d = "0";
    private String im0513m = _EMPTY_;
    private String im0513y = _EMPTY_;
    private String im0514d = "0";
    private String im0514m = _EMPTY_;
    private String im0514y = _EMPTY_;
    private String im0515d = "0";
    private String im0515m = _EMPTY_;
    private String im0515y = _EMPTY_;
    private String im0516d = "0";
    private String im0516m = _EMPTY_;
    private String im0516y = _EMPTY_;
    private String im07 = _EMPTY_;
    private String im08 = _EMPTY_;
    private String im09 = _EMPTY_;
    private String im10 = _EMPTY_;
    private String im11 = _EMPTY_;
    private String im12 = _EMPTY_;
    private String im1201x = _EMPTY_;
    private String im14 = _EMPTY_;
    private String im15 = _EMPTY_;
    private String im1501x = _EMPTY_;
    private String im16 = _EMPTY_;
    private String im17 = _EMPTY_;
    private String im1701x = _EMPTY_;
    private String im18 = _EMPTY_;
    private String im19 = _EMPTY_;
    private String im1901x = _EMPTY_;
    private String im20 = _EMPTY_;
    private String im21 = _EMPTY_;
    private String im22 = _EMPTY_;
    private String im2201x = _EMPTY_;
    private String im23 = _EMPTY_;
    private String im2396x = _EMPTY_;
    private String im24 = _EMPTY_;
    private String im2496x = _EMPTY_;
    private String im25 = _EMPTY_;
    private String im2501x = _EMPTY_;
    private String im2502x = _EMPTY_;
    private String im26 = _EMPTY_;
    private String im2601 = _EMPTY_;
    private String im2602 = _EMPTY_;
    private String im2603 = _EMPTY_;
    private String im2604 = _EMPTY_;
    private String im2605 = _EMPTY_;
    private String im2606 = _EMPTY_;
    private String im2607 = _EMPTY_;
    private String im2608 = _EMPTY_;
    private String im2609 = _EMPTY_;
    private String im2610 = _EMPTY_;
    private String im2611 = _EMPTY_;
    private String im2612 = _EMPTY_;
    private String im2613 = _EMPTY_;
    private String im2614 = _EMPTY_;
    private String im2615 = _EMPTY_;
    private String im2616 = _EMPTY_;
    private String im2617 = _EMPTY_;
    private String im2698 = _EMPTY_;
    private String im2696 = _EMPTY_;
    private String im2696x = _EMPTY_;
    private String im27 = _EMPTY_;
    private String im28 = _EMPTY_;
    private String im29 = _EMPTY_;
    private String im2901x = _EMPTY_;
    private String im30 = _EMPTY_;
    private String im31 = _EMPTY_;
    private String im32 = _EMPTY_;
    private String im3201 = _EMPTY_;
    private String im3202 = _EMPTY_;
    private String im3203 = _EMPTY_;
    private String im3204 = _EMPTY_;
    private String im3205 = _EMPTY_;
    private String im3206 = _EMPTY_;
    private String im3207 = _EMPTY_;
    private String im3208 = _EMPTY_;
    private String im3209 = _EMPTY_;
    private String im3210 = _EMPTY_;
    private String im3211 = _EMPTY_;
    private String im3212 = _EMPTY_;
    private String im3213 = _EMPTY_;
    private String im3298 = _EMPTY_;
    private String im3296 = _EMPTY_;
    private String im3296x = _EMPTY_;

    public void Child() {


    }


    public void populateMeta() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setFmuid(MainApp.familyList.get(Integer.parseInt(selectedChild)).getUid()); //// not applicable in Form table
        setMuid(MainApp.familyList.get(Integer.parseInt(selectedMWRA)).getUid());  // not applicable in Form table
        setSno(selectedChild + 1);
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setpsuCode(MainApp.currentHousehold.getClusteCcode());
        setHhid(MainApp.currentHousehold.getHhno());

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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFmuid() {
        return fmuid;
    }

    public void setFmuid(String fmuid) {
        this.fmuid = fmuid;
    }

    public String getMuid() {
        return muid;
    }

    public void setMuid(String muid) {
        this.muid = muid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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

    public String getpsuCode() {
        return psuCode;
    }

    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getIndexed() {
        return indexed;
    }

    public void setIndexed(String indexed) {
        this.indexed = indexed;
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

    public void setpsuCode(String psuCode) {
        this.psuCode = psuCode;
    }


    @Bindable
    public String getIm01() {
        return im01;
    }

    public void setIm01(String im01) {
        this.im01 = im01;
        setIm02(im01.equals("1") ? this.im02 : "");

        setIm04d(im01.equals("1") ? this.im04d : "");
        setIm04m(im01.equals("1") ? this.im04m : "");
        setIm04y(im01.equals("1") ? this.im04y : "");

        setIm0501d(im01.equals("1") ? this.im0501d : "0");
        setIm0501m(im01.equals("1") ? this.im0501m : "");
        setIm0501y(im01.equals("1") ? this.im0501y : "");

        setIm0502d(im01.equals("1") ? this.im0502d : "0");
        setIm0502m(im01.equals("1") ? this.im0502m : "");
        setIm0502y(im01.equals("1") ? this.im0502y : "");

        setIm0503d(im01.equals("1") ? this.im0503d : "0");
        setIm0503m(im01.equals("1") ? this.im0503m : "");
        setIm0503y(im01.equals("1") ? this.im0503y : "");

        setIm0504d(im01.equals("1") ? this.im0504d : "0");
        setIm0504m(im01.equals("1") ? this.im0504m : "");
        setIm0504y(im01.equals("1") ? this.im0504y : "");

        setIm0505d(im01.equals("1") ? this.im0505d : "0");
        setIm0505m(im01.equals("1") ? this.im0505m : "");
        setIm0505y(im01.equals("1") ? this.im0505y : "");

        setIm0506d(im01.equals("1") ? this.im0506d : "0");
        setIm0506m(im01.equals("1") ? this.im0506m : "");
        setIm0506y(im01.equals("1") ? this.im0506y : "");

        setIm0507d(im01.equals("1") ? this.im0507d : "0");
        setIm0507m(im01.equals("1") ? this.im0507m : "");
        setIm0507y(im01.equals("1") ? this.im0507y : "");

        setIm0508d(im01.equals("1") ? this.im0508d : "0");
        setIm0508m(im01.equals("1") ? this.im0508m : "");
        setIm0508y(im01.equals("1") ? this.im0508y : "");

        setIm0509d(im01.equals("1") ? this.im0509d : "0");
        setIm0509m(im01.equals("1") ? this.im0509m : "");
        setIm0509y(im01.equals("1") ? this.im0509y : "");

        setIm0510d(im01.equals("1") ? this.im0510d : "0");
        setIm0510m(im01.equals("1") ? this.im0510m : "");
        setIm0510y(im01.equals("1") ? this.im0510y : "");

        setIm0511d(im01.equals("1") ? this.im0511d : "0");
        setIm0511m(im01.equals("1") ? this.im0511m : "");
        setIm0511y(im01.equals("1") ? this.im0511y : "");

        setIm0512d(im01.equals("1") ? this.im0512d : "0");
        setIm0512m(im01.equals("1") ? this.im0512m : "");
        setIm0512y(im01.equals("1") ? this.im0512y : "");

        setIm0513d(im01.equals("1") ? this.im0513d : "0");
        setIm0513m(im01.equals("1") ? this.im0513m : "");
        setIm0513y(im01.equals("1") ? this.im0513y : "");

        setIm0514d(im01.equals("1") ? this.im0514d : "0");
        setIm0514m(im01.equals("1") ? this.im0514m : "");
        setIm0514y(im01.equals("1") ? this.im0514y : "");

        setIm0515d(im01.equals("1") ? this.im0515d : "0");
        setIm0515m(im01.equals("1") ? this.im0515m : "");
        setIm0515y(im01.equals("1") ? this.im0515y : "");

        setIm0516d(im01.equals("1") ? this.im0516d : "0");
        setIm0516m(im01.equals("1") ? this.im0516m : "");
        setIm0516y(im01.equals("1") ? this.im0516y : "");

        setIm07(im01.equals("1") ? this.im07 : "");

        notifyPropertyChanged(BR.im01);
    }

    @Bindable
    public String getIm02() {
        return im02;
    }

    public void setIm02(String im02) {
        this.im02 = im02;

        setIm04d(im02.equals("1") ? this.im04d : "");
        setIm04m(im02.equals("1") ? this.im04m : "");
        setIm04y(im02.equals("1") ? this.im04y : "");

        setIm0501d(im02.equals("1") ? this.im0501d : "0");
        setIm0501m(im02.equals("1") ? this.im0501m : "");
        setIm0501y(im02.equals("1") ? this.im0501y : "");

        setIm0502d(im02.equals("1") ? this.im0502d : "0");
        setIm0502m(im02.equals("1") ? this.im0502m : "");
        setIm0502y(im02.equals("1") ? this.im0502y : "");

        setIm0503d(im02.equals("1") ? this.im0503d : "0");
        setIm0503m(im02.equals("1") ? this.im0503m : "");
        setIm0503y(im02.equals("1") ? this.im0503y : "");

        setIm0504d(im02.equals("1") ? this.im0504d : "0");
        setIm0504m(im02.equals("1") ? this.im0504m : "");
        setIm0504y(im02.equals("1") ? this.im0504y : "");

        setIm0505d(im02.equals("1") ? this.im0505d : "0");
        setIm0505m(im02.equals("1") ? this.im0505m : "");
        setIm0505y(im02.equals("1") ? this.im0505y : "");

        setIm0506d(im02.equals("1") ? this.im0506d : "0");
        setIm0506m(im02.equals("1") ? this.im0506m : "");
        setIm0506y(im02.equals("1") ? this.im0506y : "");

        setIm0507d(im02.equals("1") ? this.im0507d : "0");
        setIm0507m(im02.equals("1") ? this.im0507m : "");
        setIm0507y(im02.equals("1") ? this.im0507y : "");

        setIm0508d(im02.equals("1") ? this.im0508d : "0");
        setIm0508m(im02.equals("1") ? this.im0508m : "");
        setIm0508y(im02.equals("1") ? this.im0508y : "");

        setIm0509d(im02.equals("1") ? this.im0509d : "0");
        setIm0509m(im02.equals("1") ? this.im0509m : "");
        setIm0509y(im02.equals("1") ? this.im0509y : "");

        setIm0510d(im02.equals("1") ? this.im0510d : "0");
        setIm0510m(im02.equals("1") ? this.im0510m : "");
        setIm0510y(im02.equals("1") ? this.im0510y : "");

        setIm0511d(im02.equals("1") ? this.im0511d : "0");
        setIm0511m(im02.equals("1") ? this.im0511m : "");
        setIm0511y(im02.equals("1") ? this.im0511y : "");

        setIm0512d(im02.equals("1") ? this.im0512d : "0");
        setIm0512m(im02.equals("1") ? this.im0512m : "");
        setIm0512y(im02.equals("1") ? this.im0512y : "");

        setIm0513d(im02.equals("1") ? this.im0513d : "0");
        setIm0513m(im02.equals("1") ? this.im0513m : "");
        setIm0513y(im02.equals("1") ? this.im0513y : "");

        setIm0514d(im02.equals("1") ? this.im0514d : "0");
        setIm0514m(im02.equals("1") ? this.im0514m : "");
        setIm0514y(im02.equals("1") ? this.im0514y : "");

        setIm0515d(im02.equals("1") ? this.im0515d : "0");
        setIm0515m(im02.equals("1") ? this.im0515m : "");
        setIm0515y(im02.equals("1") ? this.im0515y : "");

        setIm0516d(im02.equals("1") ? this.im0516d : "0");
        setIm0516m(im02.equals("1") ? this.im0516m : "");
        setIm0516y(im02.equals("1") ? this.im0516y : "");

        setIm07(im02.equals("1") ? this.im07 : "");

        setIm09(im02.equals("2") ? this.im09 : "");
        setIm10(im02.equals("2") ? this.im10 : "");
        setIm11(im02.equals("2") ? this.im11 : "");
        setIm12(im02.equals("2") ? this.im12 : "");
        setIm14(im02.equals("2") ? this.im14 : "");
        setIm15(im02.equals("2") ? this.im15 : "");
        setIm16(im02.equals("2") ? this.im16 : "");
        setIm17(im02.equals("2") ? this.im17 : "");
        setIm18(im02.equals("2") ? this.im18 : "");
        setIm19(im02.equals("2") ? this.im19 : "");
        setIm20(im02.equals("2") ? this.im20 : "");
        setIm21(im02.equals("2") ? this.im21 : "");
        setIm22(im02.equals("2") ? this.im22 : "");
        setIm23(im02.equals("2") ? this.im23 : "");

        setIm2601(im02.equals("2") ? this.im2601 : "");
        setIm2602(im02.equals("2") ? this.im2602 : "");
        setIm2603(im02.equals("2") ? this.im2603 : "");
        setIm2604(im02.equals("2") ? this.im2604 : "");
        setIm2605(im02.equals("2") ? this.im2605 : "");
        setIm2606(im02.equals("2") ? this.im2606 : "");
        setIm2607(im02.equals("2") ? this.im2607 : "");
        setIm2608(im02.equals("2") ? this.im2608 : "");
        setIm2609(im02.equals("2") ? this.im2609 : "");
        setIm2610(im02.equals("2") ? this.im2610 : "");
        setIm2611(im02.equals("2") ? this.im2611 : "");
        setIm2612(im02.equals("2") ? this.im2612 : "");
        setIm2613(im02.equals("2") ? this.im2613 : "");
        setIm2614(im02.equals("2") ? this.im2614 : "");
        setIm2615(im02.equals("2") ? this.im2615 : "");
        setIm2616(im02.equals("2") ? this.im2616 : "");
        setIm2617(im02.equals("2") ? this.im2617 : "");
        setIm2696(im02.equals("2") ? this.im2696 : "");
        setIm2698(im02.equals("2") ? this.im2698 : "");
        notifyPropertyChanged(BR.im02);
    }

    @Bindable
    public String getIm03() {
        return im03;
    }

    public void setIm03(String im03) {
        this.im03 = im03;
        setIm0396x(im03.equals("96") ? this.im0396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.im03);
    }

    @Bindable
    public String getIm0396x() {
        return im0396x;
    }

    public void setIm0396x(String im0396x) {
        this.im0396x = im0396x;
        notifyPropertyChanged(BR.im0396x);
    }

    @Bindable
    public String getIm04d() {
        return im04d;
    }

    public void setIm04d(String im04d) {
        this.im04d = im04d;
        notifyPropertyChanged(BR.im04d);
    }

    @Bindable
    public String getIm04m() {
        return im04m;
    }

    public void setIm04m(String im04m) {
        this.im04m = im04m;
        notifyPropertyChanged(BR.im04m);
    }

    @Bindable
    public String getIm04y() {
        return im04y;
    }

    public void setIm04y(String im04y) {
        this.im04y = im04y;
        notifyPropertyChanged(BR.im04y);
    }

    @Bindable
    public String getIm0501d() {
        return im0501d;
    }

    public void setIm0501d(String im0501d) {
        this.im0501d = im0501d;
        boolean b = im0501d.length() > 0 && Integer.parseInt(im0501d) > 31;
        setIm0501m(b ? "" : this.im0501m);
        setIm0501y(b ? "" : this.im0501y);
        notifyPropertyChanged(BR.im0501d);
    }

    @Bindable
    public String getIm0501m() {
        return im0501m;
    }

    public void setIm0501m(String im0501m) {
        this.im0501m = im0501m;
        notifyPropertyChanged(BR.im0501m);
    }

    @Bindable
    public String getIm0501y() {
        return im0501y;
    }

    public void setIm0501y(String im0501y) {
        this.im0501y = im0501y;
        notifyPropertyChanged(BR.im0501y);
    }

    @Bindable
    public String getIm0502d() {
        return im0502d;
    }

    public void setIm0502d(String im0502d) {
        this.im0502d = im0502d;
        boolean b = im0502d.length() > 0 && Integer.parseInt(im0502d) > 31;
        setIm0502m(b ? "" : this.im0502m);
        setIm0502y(b ? "" : this.im0502y);
        notifyPropertyChanged(BR.im0502d);
    }

    @Bindable
    public String getIm0502m() {
        return im0502m;
    }

    public void setIm0502m(String im0502m) {
        this.im0502m = im0502m;
        notifyPropertyChanged(BR.im0502m);
    }

    @Bindable
    public String getIm0502y() {
        return im0502y;
    }

    public void setIm0502y(String im0502y) {
        this.im0502y = im0502y;
        notifyPropertyChanged(BR.im0502y);
    }

    @Bindable
    public String getIm0503d() {
        return im0503d;
    }

    public void setIm0503d(String im0503d) {
        this.im0503d = im0503d;
        boolean b = im0503d.length() > 0 && Integer.parseInt(im0503d) > 31;
        setIm0503m(b ? "" : this.im0503m);
        setIm0503y(b ? "" : this.im0503y);
        notifyPropertyChanged(BR.im0503d);
    }

    @Bindable
    public String getIm0503m() {
        return im0503m;
    }

    public void setIm0503m(String im0503m) {
        this.im0503m = im0503m;
        notifyPropertyChanged(BR.im0503m);
    }

    @Bindable
    public String getIm0503y() {
        return im0503y;
    }

    public void setIm0503y(String im0503y) {
        this.im0503y = im0503y;
        notifyPropertyChanged(BR.im0503y);
    }

    @Bindable
    public String getIm0504d() {
        return im0504d;
    }

    public void setIm0504d(String im0504d) {
        this.im0504d = im0504d;
        boolean b = im0504d.length() > 0 && Integer.parseInt(im0504d) > 31;
        setIm0504m(b ? "" : this.im0504m);
        setIm0504y(b ? "" : this.im0504y);
        notifyPropertyChanged(BR.im0504d);
    }

    @Bindable
    public String getIm0504m() {
        return im0504m;
    }

    public void setIm0504m(String im0504m) {
        this.im0504m = im0504m;
        notifyPropertyChanged(BR.im0504m);
    }

    @Bindable
    public String getIm0504y() {
        return im0504y;
    }

    public void setIm0504y(String im0504y) {
        this.im0504y = im0504y;
        notifyPropertyChanged(BR.im0504y);
    }

    @Bindable
    public String getIm0505d() {
        return im0505d;
    }

    public void setIm0505d(String im0505d) {
        this.im0505d = im0505d;
        boolean b = im0505d.length() > 0 && Integer.parseInt(im0505d) >= 31;
        setIm0505m(b ? "" : this.im0505m);
        setIm0505y(b ? "" : this.im0505y);
        notifyPropertyChanged(BR.im0505d);
    }

    @Bindable
    public String getIm0505m() {
        return im0505m;
    }

    public void setIm0505m(String im0505m) {
        this.im0505m = im0505m;
        notifyPropertyChanged(BR.im0505m);
    }

    @Bindable
    public String getIm0505y() {
        return im0505y;
    }

    public void setIm0505y(String im0505y) {
        this.im0505y = im0505y;
        notifyPropertyChanged(BR.im0505y);
    }

    @Bindable
    public String getIm0506d() {
        return im0506d;
    }

    public void setIm0506d(String im0506d) {
        this.im0506d = im0506d;
        boolean b = im0506d.length() > 0 && Integer.parseInt(im0506d) > 31;
        setIm0506m(b ? "" : this.im0506m);
        setIm0506y(b ? "" : this.im0506y);
        notifyPropertyChanged(BR.im0506d);
    }

    @Bindable
    public String getIm0506m() {
        return im0506m;
    }

    public void setIm0506m(String im0506m) {
        this.im0506m = im0506m;
        notifyPropertyChanged(BR.im0506m);
    }

    @Bindable
    public String getIm0506y() {
        return im0506y;
    }

    public void setIm0506y(String im0506y) {
        this.im0506y = im0506y;
        notifyPropertyChanged(BR.im0506y);
    }

    @Bindable
    public String getIm0507d() {
        return im0507d;
    }

    public void setIm0507d(String im0507d) {
        this.im0507d = im0507d;
        boolean b = im0507d.length() > 0 && Integer.parseInt(im0507d) > 31;
        setIm0507m(b ? "" : this.im0507m);
        setIm0507y(b ? "" : this.im0507y);
        notifyPropertyChanged(BR.im0507d);
    }

    @Bindable
    public String getIm0507m() {
        return im0507m;
    }

    public void setIm0507m(String im0507m) {
        this.im0507m = im0507m;
        notifyPropertyChanged(BR.im0507m);
    }

    @Bindable
    public String getIm0507y() {
        return im0507y;
    }

    public void setIm0507y(String im0507y) {
        this.im0507y = im0507y;
        notifyPropertyChanged(BR.im0507y);
    }

    @Bindable
    public String getIm0508d() {
        return im0508d;
    }

    public void setIm0508d(String im0508d) {
        this.im0508d = im0508d;
        boolean b = im0508d.length() > 0 && Integer.parseInt(im0508d) > 31;
        setIm0508m(b ? "" : this.im0508m);
        setIm0508y(b ? "" : this.im0508y);
        notifyPropertyChanged(BR.im0508d);
    }

    @Bindable
    public String getIm0508m() {
        return im0508m;
    }

    public void setIm0508m(String im0508m) {
        this.im0508m = im0508m;
        notifyPropertyChanged(BR.im0508m);
    }

    @Bindable
    public String getIm0508y() {
        return im0508y;
    }

    public void setIm0508y(String im0508y) {
        this.im0508y = im0508y;
        notifyPropertyChanged(BR.im0508y);
    }

    @Bindable
    public String getIm0509d() {
        return im0509d;
    }

    public void setIm0509d(String im0509d) {
        this.im0509d = im0509d;
        boolean b = im0509d.length() > 0 && Integer.parseInt(im0509d) > 31;
        setIm0509m(b ? "" : this.im0509m);
        setIm0509y(b ? "" : this.im0509y);
        notifyPropertyChanged(BR.im0509d);
    }

    @Bindable
    public String getIm0509m() {
        return im0509m;
    }

    public void setIm0509m(String im0509m) {
        this.im0509m = im0509m;
        notifyPropertyChanged(BR.im0509m);
    }

    @Bindable
    public String getIm0509y() {
        return im0509y;
    }

    public void setIm0509y(String im0509y) {
        this.im0509y = im0509y;
        notifyPropertyChanged(BR.im0509y);
    }

    @Bindable
    public String getIm0510d() {
        return im0510d;
    }

    public void setIm0510d(String im0510d) {
        this.im0510d = im0510d;
        boolean b = im0510d.length() > 0 && Integer.parseInt(im0510d) > 31;
        setIm0510m(b ? "" : this.im0510m);
        setIm0510y(b ? "" : this.im0510y);
        notifyPropertyChanged(BR.im0510d);
    }

    @Bindable
    public String getIm0510m() {
        return im0510m;
    }

    public void setIm0510m(String im0510m) {
        this.im0510m = im0510m;
        notifyPropertyChanged(BR.im0510m);
    }

    @Bindable
    public String getIm0510y() {
        return im0510y;
    }

    public void setIm0510y(String im0510y) {
        this.im0510y = im0510y;
        notifyPropertyChanged(BR.im0510y);
    }

    @Bindable
    public String getIm0511d() {
        return im0511d;
    }

    public void setIm0511d(String im0511d) {
        this.im0511d = im0511d;
        boolean b = im0511d.length() > 0 && Integer.parseInt(im0511d) > 31;
        setIm0511m(b ? "" : this.im0511m);
        setIm0511y(b ? "" : this.im0511y);
        notifyPropertyChanged(BR.im0511d);
    }

    @Bindable
    public String getIm0511m() {
        return im0511m;
    }

    public void setIm0511m(String im0511m) {
        this.im0511m = im0511m;
        notifyPropertyChanged(BR.im0511m);
    }

    @Bindable
    public String getIm0511y() {
        return im0511y;
    }

    public void setIm0511y(String im0511y) {
        this.im0511y = im0511y;
        notifyPropertyChanged(BR.im0511y);
    }

    @Bindable
    public String getIm0512d() {
        return im0512d;
    }

    public void setIm0512d(String im0512d) {
        this.im0512d = im0512d;
        boolean b = im0512d.length() > 0 && Integer.parseInt(im0512d) > 31;
        setIm0512m(b ? "" : this.im0512m);
        setIm0512y(b ? "" : this.im0512y);
        notifyPropertyChanged(BR.im0512d);
    }

    @Bindable
    public String getIm0512m() {
        return im0512m;
    }

    public void setIm0512m(String im0512m) {
        this.im0512m = im0512m;
        notifyPropertyChanged(BR.im0512m);
    }

    @Bindable
    public String getIm0512y() {
        return im0512y;
    }

    public void setIm0512y(String im0512y) {
        this.im0512y = im0512y;
        notifyPropertyChanged(BR.im0512y);
    }

    @Bindable
    public String getIm0513d() {
        return im0513d;
    }

    public void setIm0513d(String im0513d) {
        this.im0513d = im0513d;
        boolean b = im0513d.length() > 0 && Integer.parseInt(im0513d) > 31;
        setIm0513m(b ? "" : this.im0513m);
        setIm0513y(b ? "" : this.im0513y);
        notifyPropertyChanged(BR.im0513d);
    }

    @Bindable
    public String getIm0513m() {
        return im0513m;
    }

    public void setIm0513m(String im0513m) {
        this.im0513m = im0513m;
        notifyPropertyChanged(BR.im0513m);
    }

    @Bindable
    public String getIm0513y() {
        return im0513y;
    }

    public void setIm0513y(String im0513y) {
        this.im0513y = im0513y;
        notifyPropertyChanged(BR.im0513y);
    }

    @Bindable
    public String getIm0514d() {
        return im0514d;
    }

    public void setIm0514d(String im0514d) {
        this.im0514d = im0514d;
        boolean b = im0514d.length() > 0 && Integer.parseInt(im0514d) > 31;
        setIm0514m(b ? "" : this.im0514m);
        setIm0514y(b ? "" : this.im0514y);
        notifyPropertyChanged(BR.im0514d);
    }

    @Bindable
    public String getIm0514m() {
        return im0514m;
    }

    public void setIm0514m(String im0514m) {
        this.im0514m = im0514m;
        notifyPropertyChanged(BR.im0514m);
    }

    @Bindable
    public String getIm0514y() {
        return im0514y;
    }

    public void setIm0514y(String im0514y) {
        this.im0514y = im0514y;
        notifyPropertyChanged(BR.im0514y);
    }

    @Bindable
    public String getIm0515d() {
        return im0515d;
    }

    public void setIm0515d(String im0515d) {
        this.im0515d = im0515d;
        boolean b = im0515d.length() > 0 && Integer.parseInt(im0515d) > 31;
        setIm0515m(b ? "" : this.im0515m);
        setIm0515y(b ? "" : this.im0515y);
        notifyPropertyChanged(BR.im0515d);
    }

    @Bindable
    public String getIm0515m() {
        return im0515m;
    }

    public void setIm0515m(String im0515m) {
        this.im0515m = im0515m;
        notifyPropertyChanged(BR.im0515m);
    }

    @Bindable
    public String getIm0515y() {
        return im0515y;
    }

    public void setIm0515y(String im0515y) {
        this.im0515y = im0515y;
        notifyPropertyChanged(BR.im0515y);
    }

    @Bindable
    public String getIm0516d() {
        return im0516d;
    }

    public void setIm0516d(String im0516d) {
        this.im0516d = im0516d;
        boolean b = im0516d.length() > 0 && Integer.parseInt(im0516d) > 31;
        setIm0516m(b ? "" : this.im0516m);
        setIm0516y(b ? "" : this.im0516y);
        notifyPropertyChanged(BR.im0516d);
    }

    @Bindable
    public String getIm0516m() {
        return im0516m;
    }

    public void setIm0516m(String im0516m) {
        this.im0516m = im0516m;
        notifyPropertyChanged(BR.im0516m);
    }

    @Bindable
    public String getIm0516y() {
        return im0516y;
    }

    public void setIm0516y(String im0516y) {
        this.im0516y = im0516y;
        notifyPropertyChanged(BR.im0516y);
    }

    @Bindable
    public String getIm07() {
        return im07;
    }

    public void setIm07(String im07) {
        this.im07 = im07;
        notifyPropertyChanged(BR.im07);
    }

    @Bindable
    public String getIm08() {
        return im08;
    }

    public void setIm08(String im08) {
        this.im08 = im08;
        setIm09(im08.equals("1") ? this.im09 : "");
        setIm10(im08.equals("1") ? this.im10 : "");
        setIm11(im08.equals("1") ? this.im11 : "");
        setIm12(im08.equals("1") ? this.im12 : "");
        setIm14(im08.equals("1") ? this.im14 : "");
        setIm15(im08.equals("1") ? this.im15 : "");
        setIm16(im08.equals("1") ? this.im16 : "");
        setIm17(im08.equals("1") ? this.im17 : "");
        setIm18(im08.equals("1") ? this.im18 : "");
        setIm19(im08.equals("1") ? this.im19 : "");
        setIm20(im08.equals("1") ? this.im20 : "");
        setIm21(im08.equals("1") ? this.im21 : "");
        setIm22(im08.equals("1") ? this.im22 : "");
        setIm23(im08.equals("1") ? this.im23 : "");

        setIm2601(im08.equals("1") ? "" : this.im2601);
        setIm2602(im08.equals("1") ? "" : this.im2602);
        setIm2603(im08.equals("1") ? "" : this.im2603);
        setIm2604(im08.equals("1") ? "" : this.im2604);
        setIm2605(im08.equals("1") ? "" : this.im2605);
        setIm2606(im08.equals("1") ? "" : this.im2606);
        setIm2607(im08.equals("1") ? "" : this.im2607);
        setIm2608(im08.equals("1") ? "" : this.im2608);
        setIm2609(im08.equals("1") ? "" : this.im2609);
        setIm2610(im08.equals("1") ? "" : this.im2610);
        setIm2611(im08.equals("1") ? "" : this.im2611);
        setIm2612(im08.equals("1") ? "" : this.im2612);
        setIm2613(im08.equals("1") ? "" : this.im2613);
        setIm2614(im08.equals("1") ? "" : this.im2614);
        setIm2615(im08.equals("1") ? "" : this.im2615);
        setIm2616(im08.equals("1") ? "" : this.im2616);
        setIm2617(im08.equals("1") ? "" : this.im2617);
        setIm2696(im08.equals("1") ? "" : this.im2696);
        setIm2698(im08.equals("1") ? "" : this.im2698);
        notifyPropertyChanged(BR.im08);
    }

    @Bindable
    public String getIm09() {
        return im09;
    }

    public void setIm09(String im09) {
        this.im09 = im09;
        notifyPropertyChanged(BR.im09);
    }

    @Bindable
    public String getIm10() {
        return im10;
    }

    public void setIm10(String im10) {
        this.im10 = im10;
        setIm11(im10.equals("2") ? "" : this.im11);
        setIm12(im10.equals("2") ? "" : this.im12);
        notifyPropertyChanged(BR.im10);
    }

    @Bindable
    public String getIm11() {
        return im11;
    }

    public void setIm11(String im11) {
        this.im11 = im11;
        notifyPropertyChanged(BR.im11);
    }

    @Bindable
    public String getIm12() {
        return im12;
    }

    public void setIm12(String im12) {
        this.im12 = im12;
        setIm1201x(im12.equals("1") ? this.im1201x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.im12);
    }

    @Bindable
    public String getIm1201x() {
        return im1201x;
    }

    public void setIm1201x(String im1201x) {
        this.im1201x = im1201x;
        notifyPropertyChanged(BR.im1201x);
    }

    @Bindable
    public String getIm14() {
        return im14;
    }

    public void setIm14(String im14) {
        this.im14 = im14;
        setIm15(im14.equals("1") ? this.im15 : "");
        notifyPropertyChanged(BR.im14);
    }

    @Bindable
    public String getIm15() {
        return im15;
    }

    public void setIm15(String im15) {
        this.im15 = im15;
        setIm1501x(im15.equals("1") ? this.im1501x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.im15);
    }

    @Bindable
    public String getIm1501x() {
        return im1501x;
    }

    public void setIm1501x(String im1501x) {
        this.im1501x = im1501x;
        notifyPropertyChanged(BR.im1501x);
    }

    @Bindable
    public String getIm16() {
        return im16;
    }

    public void setIm16(String im16) {
        this.im16 = im16;
        setIm17(im16.equals("1") ? this.im17 : "");
        notifyPropertyChanged(BR.im16);
    }

    @Bindable
    public String getIm17() {
        return im17;
    }

    public void setIm17(String im17) {
        this.im17 = im17;
        setIm1701x(im17.equals("1") ? this.im1701x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.im17);
    }

    @Bindable
    public String getIm1701x() {
        return im1701x;
    }

    public void setIm1701x(String im1701x) {
        this.im1701x = im1701x;
        notifyPropertyChanged(BR.im1701x);
    }

    @Bindable
    public String getIm18() {
        return im18;
    }

    public void setIm18(String im18) {
        this.im18 = im18;
        setIm19(im18.equals("1") ? this.im19 : "");
        notifyPropertyChanged(BR.im18);
    }

    @Bindable
    public String getIm19() {
        return im19;
    }

    public void setIm19(String im19) {
        this.im19 = im19;
        setIm1901x(im19.equals("1") ? this.im1901x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.im19);
    }

    @Bindable
    public String getIm1901x() {
        return im1901x;
    }

    public void setIm1901x(String im1901x) {
        this.im1901x = im1901x;
        notifyPropertyChanged(BR.im1901x);
    }

    @Bindable
    public String getIm20() {
        return im20;
    }

    public void setIm20(String im20) {
        this.im20 = im20;
        notifyPropertyChanged(BR.im20);
    }

    @Bindable
    public String getIm21() {
        return im21;
    }

    public void setIm21(String im21) {
        this.im21 = im21;
        setIm22(im21.equals("1") ? this.im22 : "");
        notifyPropertyChanged(BR.im21);
    }

    @Bindable
    public String getIm22() {
        return im22;
    }

    public void setIm22(String im22) {
        this.im22 = im22;
        setIm2201x(im22.equals("1") ? this.im2201x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.im22);
    }

    @Bindable
    public String getIm2201x() {
        return im2201x;
    }

    public void setIm2201x(String im2201x) {
        this.im2201x = im2201x;
        notifyPropertyChanged(BR.im2201x);
    }

    @Bindable
    public String getIm23() {
        return im23;
    }

    public void setIm23(String im23) {
        this.im23 = im23;
        setIm2396x(im23.equals("96") ? this.im2396x : ""); // for all skips, mention all skipped questions
        setIm24(im23.equals("3") ? "" : this.im24);
        notifyPropertyChanged(BR.im23);
    }

    @Bindable
    public String getIm2396x() {
        return im2396x;
    }

    public void setIm2396x(String im2396x) {
        this.im2396x = im2396x;
        notifyPropertyChanged(BR.im2396x);
    }

    @Bindable
    public String getIm24() {
        return im24;
    }

    public void setIm24(String im24) {
        this.im24 = im24;
        setIm2496x(im24.equals("96") ? this.im2496x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.im24);
    }

    @Bindable
    public String getIm2496x() {
        return im2496x;
    }

    public void setIm2496x(String im2496x) {
        this.im2496x = im2496x;
        notifyPropertyChanged(BR.im2496x);
    }

    @Bindable
    public String getIm25() {
        return im25;
    }

    public void setIm25(String im25) {
        this.im25 = im25;
        setIm2501x(im25.equals("1") ? this.im2501x : ""); // for all skips, mention all skipped questions
        setIm2502x(im25.equals("2") ? this.im2502x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.im25);
    }

    @Bindable
    public String getIm2501x() {
        return im2501x;
    }

    public void setIm2501x(String im2501x) {
        this.im2501x = im2501x;
        notifyPropertyChanged(BR.im2501x);
    }

    @Bindable
    public String getIm2502x() {
        return im2502x;
    }

    public void setIm2502x(String im2502x) {
        this.im2502x = im2502x;
        notifyPropertyChanged(BR.im2502x);
    }

    @Bindable
    public String getIm26() {
        return im26;
    }

    public void setIm26(String im26) {
        this.im26 = im26;
        notifyPropertyChanged(BR.im26);
    }

    @Bindable
    public String getIm2601() {
        return im2601;
    }

    public void setIm2601(String im2601) {
        if (this.im2601.equals(im2601)) return; // for all checkboxes
        this.im2601 = im2601;
        notifyPropertyChanged(BR.im2601);
    }

    @Bindable
    public String getIm2602() {
        return im2602;
    }

    public void setIm2602(String im2602) {
        if (this.im2602.equals(im2602)) return; // for all checkboxes
        this.im2602 = im2602;
        notifyPropertyChanged(BR.im2602);
    }

    @Bindable
    public String getIm2603() {
        return im2603;
    }

    public void setIm2603(String im2603) {
        if (this.im2603.equals(im2603)) return; // for all checkboxes
        this.im2603 = im2603;
        notifyPropertyChanged(BR.im2603);
    }

    @Bindable
    public String getIm2604() {
        return im2604;
    }

    public void setIm2604(String im2604) {
        if (this.im2604.equals(im2604)) return; // for all checkboxes
        this.im2604 = im2604;
        notifyPropertyChanged(BR.im2604);
    }

    @Bindable
    public String getIm2605() {
        return im2605;
    }

    public void setIm2605(String im2605) {
        if (this.im2605.equals(im2605)) return; // for all checkboxes
        this.im2605 = im2605;
        notifyPropertyChanged(BR.im2605);
    }

    @Bindable
    public String getIm2606() {
        return im2606;
    }

    public void setIm2606(String im2606) {
        if (this.im2606.equals(im2606)) return; // for all checkboxes
        this.im2606 = im2606;
        notifyPropertyChanged(BR.im2606);
    }

    @Bindable
    public String getIm2607() {
        return im2607;
    }

    public void setIm2607(String im2607) {
        if (this.im2607.equals(im2607)) return; // for all checkboxes
        this.im2607 = im2607;
        notifyPropertyChanged(BR.im2607);
    }

    @Bindable
    public String getIm2608() {
        return im2608;
    }

    public void setIm2608(String im2608) {
        if (this.im2608.equals(im2608)) return; // for all checkboxes
        this.im2608 = im2608;
        notifyPropertyChanged(BR.im2608);
    }

    @Bindable
    public String getIm2609() {
        return im2609;
    }

    public void setIm2609(String im2609) {
        if (this.im2609.equals(im2609)) return; // for all checkboxes
        this.im2609 = im2609;
        notifyPropertyChanged(BR.im2609);
    }

    @Bindable
    public String getIm2610() {
        return im2610;
    }

    public void setIm2610(String im2610) {
        if (this.im2610.equals(im2610)) return; // for all checkboxes
        this.im2610 = im2610;
        notifyPropertyChanged(BR.im2610);
    }

    @Bindable
    public String getIm2611() {
        return im2611;
    }

    public void setIm2611(String im2611) {
        if (this.im2611.equals(im2611)) return; // for all checkboxes
        this.im2611 = im2611;
        notifyPropertyChanged(BR.im2611);
    }

    @Bindable
    public String getIm2612() {
        return im2612;
    }

    public void setIm2612(String im2612) {
        if (this.im2612.equals(im2612)) return; // for all checkboxes
        this.im2612 = im2612;
        notifyPropertyChanged(BR.im2612);
    }

    @Bindable
    public String getIm2613() {
        return im2613;
    }

    public void setIm2613(String im2613) {
        if (this.im2613.equals(im2613)) return; // for all checkboxes
        this.im2613 = im2613;
        notifyPropertyChanged(BR.im2613);
    }

    @Bindable
    public String getIm2614() {
        return im2614;
    }

    public void setIm2614(String im2614) {
        if (this.im2614.equals(im2614)) return; // for all checkboxes
        this.im2614 = im2614;
        notifyPropertyChanged(BR.im2614);
    }

    @Bindable
    public String getIm2615() {
        return im2615;
    }

    public void setIm2615(String im2615) {
        if (this.im2615.equals(im2615)) return; // for all checkboxes
        this.im2615 = im2615;
        notifyPropertyChanged(BR.im2615);
    }

    @Bindable
    public String getIm2616() {
        return im2616;
    }

    public void setIm2616(String im2616) {
        if (this.im2616.equals(im2616)) return; // for all checkboxes
        this.im2616 = im2616;
        notifyPropertyChanged(BR.im2616);
    }

    @Bindable
    public String getIm2617() {
        return im2617;
    }

    public void setIm2617(String im2617) {
        if (this.im2617.equals(im2617)) return; // for all checkboxes
        this.im2617 = im2617;
        notifyPropertyChanged(BR.im2617);
    }

    @Bindable
    public String getIm2698() {
        return im2698;
    }

    public void setIm2698(String im2698) {
        if (this.im2698.equals(im2698)) return; // for all checkboxes
        this.im2698 = im2698;
        setIm2601(im2698.equals("98") ? "" : this.im2601);
        setIm2602(im2698.equals("98") ? "" : this.im2602);
        setIm2603(im2698.equals("98") ? "" : this.im2603);
        setIm2604(im2698.equals("98") ? "" : this.im2604);
        setIm2605(im2698.equals("98") ? "" : this.im2605);
        setIm2606(im2698.equals("98") ? "" : this.im2606);
        setIm2607(im2698.equals("98") ? "" : this.im2607);
        setIm2608(im2698.equals("98") ? "" : this.im2608);
        setIm2609(im2698.equals("98") ? "" : this.im2609);
        setIm2610(im2698.equals("98") ? "" : this.im2610);
        setIm2611(im2698.equals("98") ? "" : this.im2611);
        setIm2612(im2698.equals("98") ? "" : this.im2612);
        setIm2613(im2698.equals("98") ? "" : this.im2613);
        setIm2614(im2698.equals("98") ? "" : this.im2614);
        setIm2615(im2698.equals("98") ? "" : this.im2615);
        setIm2616(im2698.equals("98") ? "" : this.im2616);
        setIm2617(im2698.equals("98") ? "" : this.im2617);
        setIm2696(im2698.equals("98") ? "" : this.im2696);
        notifyPropertyChanged(BR.im2698);
    }

    @Bindable
    public String getIm2696() {
        return im2696;
    }

    public void setIm2696(String im2696) {
        if (this.im2696.equals(im2696)) return; // for all checkboxes
        this.im2696 = im2696;
        setIm2696x(im2696.equals("96") ? this.im2696x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.im2696);
    }

    @Bindable
    public String getIm2696x() {
        return im2696x;
    }

    public void setIm2696x(String im2696x) {
        this.im2696x = im2696x;
        notifyPropertyChanged(BR.im2696x);
    }

    @Bindable
    public String getIm27() {
        return im27;
    }

    public void setIm27(String im27) {
        this.im27 = im27;
        notifyPropertyChanged(BR.im27);
    }

    @Bindable
    public String getIm28() {
        return im28;
    }

    public void setIm28(String im28) {
        this.im28 = im28;
        setIm29(im28.equals("1") ? this.im29 : "");
        setIm30(im28.equals("1") ? this.im30 : "");
        setIm31(im28.equals("1") ? this.im31 : "");
        notifyPropertyChanged(BR.im28);
    }

    @Bindable
    public String getIm29() {
        return im29;
    }

    public void setIm29(String im29) {
        this.im29 = im29;
        setIm2901x(im29.equals("1") ? this.im2901x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.im29);
    }

    @Bindable
    public String getIm2901x() {
        return im2901x;
    }

    public void setIm2901x(String im2901x) {
        this.im2901x = im2901x;
        notifyPropertyChanged(BR.im2901x);
    }

    @Bindable
    public String getIm30() {
        return im30;
    }

    public void setIm30(String im30) {
        this.im30 = im30;
        setIm31(im30.equals("1") ? this.im31 : "");
        setIm3201(im30.equals("1") ? "" : this.im3201);
        setIm3202(im30.equals("1") ? "" : this.im3202);
        setIm3203(im30.equals("1") ? "" : this.im3203);
        setIm3204(im30.equals("1") ? "" : this.im3204);
        setIm3205(im30.equals("1") ? "" : this.im3205);
        setIm3206(im30.equals("1") ? "" : this.im3206);
        setIm3207(im30.equals("1") ? "" : this.im3207);
        setIm3208(im30.equals("1") ? "" : this.im3208);
        setIm3209(im30.equals("1") ? "" : this.im3209);
        setIm3210(im30.equals("1") ? "" : this.im3210);
        setIm3211(im30.equals("1") ? "" : this.im3211);
        setIm3212(im30.equals("1") ? "" : this.im3212);
        setIm3213(im30.equals("1") ? "" : this.im3213);
        setIm3296(im30.equals("1") ? "" : this.im3296);
        setIm3298(im30.equals("1") ? "" : this.im3298);
        notifyPropertyChanged(BR.im30);
    }

    @Bindable
    public String getIm31() {
        return im31;
    }

    public void setIm31(String im31) {
        this.im31 = im31;

        notifyPropertyChanged(BR.im31);
    }

    @Bindable
    public String getIm32() {
        return im32;
    }

    public void setIm32(String im32) {
        this.im32 = im32;
        notifyPropertyChanged(BR.im32);
    }

    @Bindable
    public String getIm3201() {
        return im3201;
    }

    public void setIm3201(String im3201) {
        if (this.im3201.equals(im3201)) return; // for all checkboxes
        this.im3201 = im3201;
        notifyPropertyChanged(BR.im3201);
    }

    @Bindable
    public String getIm3202() {
        return im3202;
    }

    public void setIm3202(String im3202) {
        if (this.im3202.equals(im3202)) return; // for all checkboxes
        this.im3202 = im3202;
        notifyPropertyChanged(BR.im3202);
    }

    @Bindable
    public String getIm3203() {
        return im3203;
    }

    public void setIm3203(String im3203) {
        if (this.im3203.equals(im3203)) return; // for all checkboxes
        this.im3203 = im3203;
        notifyPropertyChanged(BR.im3203);
    }

    @Bindable
    public String getIm3204() {
        return im3204;
    }

    public void setIm3204(String im3204) {
        if (this.im3204.equals(im3204)) return; // for all checkboxes
        this.im3204 = im3204;
        notifyPropertyChanged(BR.im3204);
    }

    @Bindable
    public String getIm3205() {
        return im3205;
    }

    public void setIm3205(String im3205) {
        if (this.im3205.equals(im3205)) return; // for all checkboxes
        this.im3205 = im3205;
        notifyPropertyChanged(BR.im3205);
    }

    @Bindable
    public String getIm3206() {
        return im3206;
    }

    public void setIm3206(String im3206) {
        if (this.im3206.equals(im3206)) return; // for all checkboxes
        this.im3206 = im3206;
        notifyPropertyChanged(BR.im3206);
    }

    @Bindable
    public String getIm3207() {
        return im3207;
    }

    public void setIm3207(String im3207) {
        if (this.im3207.equals(im3207)) return; // for all checkboxes
        this.im3207 = im3207;
        notifyPropertyChanged(BR.im3207);
    }

    @Bindable
    public String getIm3208() {
        return im3208;
    }

    public void setIm3208(String im3208) {
        if (this.im3208.equals(im3208)) return; // for all checkboxes
        this.im3208 = im3208;
        notifyPropertyChanged(BR.im3208);
    }

    @Bindable
    public String getIm3209() {
        return im3209;
    }

    public void setIm3209(String im3209) {
        if (this.im3209.equals(im3209)) return; // for all checkboxes
        this.im3209 = im3209;
        notifyPropertyChanged(BR.im3209);
    }

    @Bindable
    public String getIm3210() {
        return im3210;
    }

    public void setIm3210(String im3210) {
        if (this.im3210.equals(im3210)) return; // for all checkboxes
        this.im3210 = im3210;
        notifyPropertyChanged(BR.im3210);
    }

    @Bindable
    public String getIm3211() {
        return im3211;
    }

    public void setIm3211(String im3211) {
        if (this.im3211.equals(im3211)) return; // for all checkboxes
        this.im3211 = im3211;
        notifyPropertyChanged(BR.im3211);
    }

    @Bindable
    public String getIm3212() {
        return im3212;
    }

    public void setIm3212(String im3212) {
        if (this.im3212.equals(im3212)) return; // for all checkboxes
        this.im3212 = im3212;
        notifyPropertyChanged(BR.im3212);
    }

    @Bindable
    public String getIm3213() {
        return im3213;
    }

    public void setIm3213(String im3213) {
        if (this.im3213.equals(im3213)) return; // for all checkboxes
        this.im3213 = im3213;
        notifyPropertyChanged(BR.im3213);
    }

    @Bindable
    public String getIm3298() {
        return im3298;
    }

    public void setIm3298(String im3298) {
        if (this.im3298.equals(im3298)) return; // for all checkboxes
        this.im3298 = im3298;
        setIm3201(im3298.equals("98") ? "" : this.im3201);
        setIm3202(im3298.equals("98") ? "" : this.im3202);
        setIm3203(im3298.equals("98") ? "" : this.im3203);
        setIm3204(im3298.equals("98") ? "" : this.im3204);
        setIm3205(im3298.equals("98") ? "" : this.im3205);
        setIm3206(im3298.equals("98") ? "" : this.im3206);
        setIm3207(im3298.equals("98") ? "" : this.im3207);
        setIm3208(im3298.equals("98") ? "" : this.im3208);
        setIm3209(im3298.equals("98") ? "" : this.im3209);
        setIm3210(im3298.equals("98") ? "" : this.im3210);
        setIm3211(im3298.equals("98") ? "" : this.im3211);
        setIm3212(im3298.equals("98") ? "" : this.im3212);
        setIm3213(im3298.equals("98") ? "" : this.im3213);
        setIm3296(im3298.equals("98") ? "" : this.im3296);
        notifyPropertyChanged(BR.im3298);
    }

    @Bindable
    public String getIm3296() {
        return im3296;
    }

    public void setIm3296(String im3296) {
        if (this.im3296.equals(im3296)) return; // for all checkboxes
        this.im3296 = im3296;
        setIm3296x(im3296.equals("96") ? this.im3296x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.im3296);
    }

    @Bindable
    public String getIm3296x() {
        return im3296x;
    }

    public void setIm3296x(String im3296x) {
        this.im3296x = im3296x;
        notifyPropertyChanged(BR.im3296x);
    }

    public Child Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_UUID));
        this.fmuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_FMUID));
        this.muid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_MUID));
        this.indexed = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_INDEXED));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_HHID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_PROJECT_NAME));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SYNC_DATE));

        sIMHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SIM)));

        return this;
    }

    public void sIMHydrate(String string) throws JSONException {
        Log.d(TAG, "sIMHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.im01 = json.getString("im01");
            this.im02 = json.getString("im02");
            this.im03 = json.getString("im03");
            this.im0396x = json.getString("im0396x");
            this.im04d = json.getString("im04d");
            this.im04m = json.getString("im04m");
            this.im04y = json.getString("im04y");
            this.im0501d = json.getString("im0501d");
            this.im0501m = json.getString("im0501m");
            this.im0501y = json.getString("im0501y");
            this.im0502d = json.getString("im0502d");
            this.im0502m = json.getString("im0502m");
            this.im0502y = json.getString("im0502y");
            this.im0503d = json.getString("im0503d");
            this.im0503m = json.getString("im0503m");
            this.im0503y = json.getString("im0503y");
            this.im0504d = json.getString("im0504d");
            this.im0504m = json.getString("im0504m");
            this.im0504y = json.getString("im0504y");
            this.im0505d = json.getString("im0505d");
            this.im0505m = json.getString("im0505m");
            this.im0505y = json.getString("im0505y");
            this.im0506d = json.getString("im0506d");
            this.im0506m = json.getString("im0506m");
            this.im0506y = json.getString("im0506y");
            this.im0507d = json.getString("im0507d");
            this.im0507m = json.getString("im0507m");
            this.im0507y = json.getString("im0507y");
            this.im0508d = json.getString("im0508d");
            this.im0508m = json.getString("im0508m");
            this.im0508y = json.getString("im0508y");
            this.im0509d = json.getString("im0509d");
            this.im0509m = json.getString("im0509m");
            this.im0509y = json.getString("im0509y");
            this.im0510d = json.getString("im0510d");
            this.im0510m = json.getString("im0510m");
            this.im0510y = json.getString("im0510y");
            this.im0511d = json.getString("im0511d");
            this.im0511m = json.getString("im0511m");
            this.im0511y = json.getString("im0511y");
            this.im0512d = json.getString("im0512d");
            this.im0512m = json.getString("im0512m");
            this.im0512y = json.getString("im0512y");
            this.im0513d = json.getString("im0513d");
            this.im0513m = json.getString("im0513m");
            this.im0513y = json.getString("im0513y");
            this.im0514d = json.getString("im0514d");
            this.im0514m = json.getString("im0514m");
            this.im0514y = json.getString("im0514y");
            this.im0515d = json.getString("im0515d");
            this.im0515m = json.getString("im0515m");
            this.im0515y = json.getString("im0515y");
            this.im0516d = json.getString("im0516d");
            this.im0516m = json.getString("im0516m");
            this.im0516y = json.getString("im0516y");
            this.im07 = json.getString("im07");
            this.im08 = json.getString("im08");
            this.im09 = json.getString("im09");
            this.im10 = json.getString("im10");
            this.im11 = json.getString("im11");
            this.im12 = json.getString("im12");
            this.im1201x = json.getString("im1201x");
            this.im14 = json.getString("im14");
            this.im15 = json.getString("im15");
            this.im1501x = json.getString("im1501x");
            this.im16 = json.getString("im16");
            this.im17 = json.getString("im17");
            this.im1701x = json.getString("im1701x");
            this.im18 = json.getString("im18");
            this.im19 = json.getString("im19");
            this.im1901x = json.getString("im1901x");
            this.im20 = json.getString("im20");
            this.im21 = json.getString("im21");
            this.im22 = json.getString("im22");
            this.im2201x = json.getString("im2201x");
            this.im23 = json.getString("im23");
            this.im2396x = json.getString("im2396x");
            this.im24 = json.getString("im24");
            this.im2496x = json.getString("im2496x");
            this.im25 = json.getString("im25");
            this.im2501x = json.getString("im2501x");
            this.im2502x = json.getString("im2502x");
            this.im2601 = json.getString("im2601");
            this.im2602 = json.getString("im2602");
            this.im2603 = json.getString("im2603");
            this.im2604 = json.getString("im2604");
            this.im2605 = json.getString("im2605");
            this.im2606 = json.getString("im2606");
            this.im2607 = json.getString("im2607");
            this.im2608 = json.getString("im2608");
            this.im2609 = json.getString("im2609");
            this.im2610 = json.getString("im2610");
            this.im2611 = json.getString("im2611");
            this.im2612 = json.getString("im2612");
            this.im2613 = json.getString("im2613");
            this.im2614 = json.getString("im2614");
            this.im2615 = json.getString("im2615");
            this.im2616 = json.getString("im2616");
            this.im2617 = json.getString("im2617");
            this.im2698 = json.getString("im2698");
            this.im2696 = json.getString("im2696");
            this.im2696x = json.getString("im2696x");
            this.im27 = json.getString("im27");
            this.im28 = json.getString("im28");
            this.im29 = json.getString("im29");
            this.im2901x = json.getString("im2901x");
            this.im30 = json.getString("im30");
            this.im31 = json.getString("im31");
            this.im3201 = json.getString("im3201");
            this.im3202 = json.getString("im3202");
            this.im3203 = json.getString("im3203");
            this.im3204 = json.getString("im3204");
            this.im3205 = json.getString("im3205");
            this.im3206 = json.getString("im3206");
            this.im3207 = json.getString("im3207");
            this.im3208 = json.getString("im3208");
            this.im3209 = json.getString("im3209");
            this.im3210 = json.getString("im3210");
            this.im3211 = json.getString("im3211");
            this.im3212 = json.getString("im3212");
            this.im3213 = json.getString("im3213");
            this.im3298 = json.getString("im3298");
            this.im3296 = json.getString("im3296");
            this.im3296x = json.getString("im3296x");
        }
    }

    public String sIMtoString() throws JSONException {
        Log.d(TAG, "sIMtoString: ");
        JSONObject json = new JSONObject();
        json.put("im01", im01)
                .put("im02", im02)
                .put("im03", im03)
                .put("im0396x", im0396x)
                .put("im04d", im04d)
                .put("im04m", im04m)
                .put("im04y", im04y)
                .put("im0501d", im0501d)
                .put("im0501m", im0501m)
                .put("im0501y", im0501y)
                .put("im0502d", im0502d)
                .put("im0502m", im0502m)
                .put("im0502y", im0502y)
                .put("im0503d", im0503d)
                .put("im0503m", im0503m)
                .put("im0503y", im0503y)
                .put("im0504d", im0504d)
                .put("im0504m", im0504m)
                .put("im0504y", im0504y)
                .put("im0505d", im0505d)
                .put("im0505m", im0505m)
                .put("im0505y", im0505y)
                .put("im0506d", im0506d)
                .put("im0506m", im0506m)
                .put("im0506y", im0506y)
                .put("im0507d", im0507d)
                .put("im0507m", im0507m)
                .put("im0507y", im0507y)
                .put("im0508d", im0508d)
                .put("im0508m", im0508m)
                .put("im0508y", im0508y)
                .put("im0509d", im0509d)
                .put("im0509m", im0509m)
                .put("im0509y", im0509y)
                .put("im0510d", im0510d)
                .put("im0510m", im0510m)
                .put("im0510y", im0510y)
                .put("im0511d", im0511d)
                .put("im0511m", im0511m)
                .put("im0511y", im0511y)
                .put("im0512d", im0512d)
                .put("im0512m", im0512m)
                .put("im0512y", im0512y)
                .put("im0513d", im0513d)
                .put("im0513m", im0513m)
                .put("im0513y", im0513y)
                .put("im0514d", im0514d)
                .put("im0514m", im0514m)
                .put("im0514y", im0514y)
                .put("im0515d", im0515d)
                .put("im0515m", im0515m)
                .put("im0515y", im0515y)
                .put("im0516d", im0516d)
                .put("im0516m", im0516m)
                .put("im0516y", im0516y)
                .put("im07", im07)
                .put("im08", im08)
                .put("im09", im09)
                .put("im10", im10)
                .put("im11", im11)
                .put("im12", im12)
                .put("im1201x", im1201x)
                .put("im14", im14)
                .put("im15", im15)
                .put("im1501x", im1501x)
                .put("im16", im16)
                .put("im17", im17)
                .put("im1701x", im1701x)
                .put("im18", im18)
                .put("im19", im19)
                .put("im1901x", im1901x)
                .put("im20", im20)
                .put("im21", im21)
                .put("im22", im22)
                .put("im2201x", im2201x)
                .put("im23", im23)
                .put("im2396x", im2396x)
                .put("im24", im24)
                .put("im2496x", im2496x)
                .put("im25", im25)
                .put("im2501x", im2501x)
                .put("im2502x", im2502x)
                .put("im2601", im2601)
                .put("im2602", im2602)
                .put("im2603", im2603)
                .put("im2604", im2604)
                .put("im2605", im2605)
                .put("im2606", im2606)
                .put("im2607", im2607)
                .put("im2608", im2608)
                .put("im2609", im2609)
                .put("im2610", im2610)
                .put("im2611", im2611)
                .put("im2612", im2612)
                .put("im2613", im2613)
                .put("im2614", im2614)
                .put("im2615", im2615)
                .put("im2616", im2616)
                .put("im2617", im2617)
                .put("im2698", im2698)
                .put("im2696", im2696)
                .put("im2696x", im2696x)
                .put("im27", im27)
                .put("im28", im28)
                .put("im29", im29)
                .put("im2901x", im2901x)
                .put("im30", im30)
                .put("im31", im31)
                .put("im3201", im3201)
                .put("im3202", im3202)
                .put("im3203", im3203)
                .put("im3204", im3204)
                .put("im3205", im3205)
                .put("im3206", im3206)
                .put("im3207", im3207)
                .put("im3208", im3208)
                .put("im3209", im3209)
                .put("im3210", im3210)
                .put("im3211", im3211)
                .put("im3212", im3212)
                .put("im3213", im3213)
                .put("im3298", im3298)
                .put("im3296", im3296)
                .put("im3296x", im3296x);
        return json.toString();
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.ChildTable.COLUMN_ID, this.id);
        json.put(TableContracts.ChildTable.COLUMN_UID, this.uid);
        json.put(TableContracts.ChildTable.COLUMN_PSU_CODE, this.psuCode);
        json.put(TableContracts.ChildTable.COLUMN_HHID, this.hhid);
        json.put(TableContracts.ChildTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(TableContracts.ChildTable.COLUMN_UUID, this.uuid);
        json.put(TableContracts.ChildTable.COLUMN_FMUID, this.fmuid);
        json.put(TableContracts.ChildTable.COLUMN_MUID, this.muid);
        json.put(TableContracts.ChildTable.COLUMN_INDEXED, this.indexed);
        json.put(TableContracts.ChildTable.COLUMN_SNO, this.sno);
        json.put(TableContracts.ChildTable.COLUMN_USERNAME, this.userName);
        json.put(TableContracts.ChildTable.COLUMN_SYSDATE, this.sysDate);
        json.put(TableContracts.ChildTable.COLUMN_DEVICEID, this.deviceId);
        json.put(TableContracts.ChildTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(TableContracts.ChildTable.COLUMN_ISTATUS, this.iStatus);
        json.put(TableContracts.ChildTable.COLUMN_SYNCED, this.synced);
        json.put(TableContracts.ChildTable.COLUMN_SYNC_DATE, this.syncDate);
        json.put(TableContracts.ChildTable.COLUMN_APPVERSION, this.appver);
        json.put(TableContracts.ChildTable.COLUMN_SIM, new JSONObject(sIMtoString()));

        return json;
    }

}
