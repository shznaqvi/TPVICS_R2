package edu.aku.hassannaqvi.tpvics_r2.models;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static edu.aku.hassannaqvi.tpvics_r2.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.tpvics_r2.core.MainApp._EMPTY_;
import static edu.aku.hassannaqvi.tpvics_r2.core.MainApp.form;

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
import edu.aku.hassannaqvi.tpvics_r2.contracts.TableContracts;
import edu.aku.hassannaqvi.tpvics_r2.core.MainApp;

public class Child extends BaseObservable implements Observable {

    private final String TAG = "Form";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String ebCode = _EMPTY_;
    private String hhid = _EMPTY_;
    private String sno = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;

    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;


    // Field Variables
    // CH
    private String ec13 = _EMPTY_;
    private String ec14 = _EMPTY_;
    private String ec15 = _EMPTY_;
    private String ec16 = _EMPTY_;
    private String ec17 = _EMPTY_;
    private String cb03dd = _EMPTY_;
    private String cb03mm = _EMPTY_;
    private String cb03yy = _EMPTY_;
    private String cb03dk = _EMPTY_;
    private String cb04mm = _EMPTY_;
    private String cb04yy = _EMPTY_;

    // CB
    private String ec01 = _EMPTY_;
    private String ec02 = _EMPTY_;
    private String ec03 = _EMPTY_;
    private String ec04 = _EMPTY_;
    private String ec04a = _EMPTY_;
    private String ec05 = _EMPTY_;
    private String ec06 = _EMPTY_;
    private String ec07 = _EMPTY_;
    private String ec09 = _EMPTY_;
    private String ec11 = _EMPTY_;
    private String ec12 = _EMPTY_;
    private String ec13cline = _EMPTY_;
    private String ec14cname = _EMPTY_;
    private String ec18 = _EMPTY_;
    private String ec19 = _EMPTY_;
    private String ec21 = _EMPTY_;
    private String ec22 = _EMPTY_;
    private String ec2206x = _EMPTY_;
    private String ec2296x = _EMPTY_;
    private String cb01a = _EMPTY_;
    private String cb01b = _EMPTY_;
    private String cb02a = _EMPTY_;
    private String cb02b = _EMPTY_;

    // IM
    private String im01 = _EMPTY_;
    private String im02 = _EMPTY_;
    private String im02a = _EMPTY_;
    private String im02a96x = _EMPTY_;
    private String im03 = _EMPTY_;
    private String im0396x = _EMPTY_;
    private String im04dd = _EMPTY_;
    private String im04mm = _EMPTY_;
    private String im04yy = _EMPTY_;
    private String im0497 = _EMPTY_;
    private String im0501dd = _EMPTY_;
    private String im0501mm = _EMPTY_;
    private String im0501yy = _EMPTY_;
    private String im0502dd = _EMPTY_;
    private String im0502mm = _EMPTY_;
    private String im0502yy = _EMPTY_;
    private String im0503dd = _EMPTY_;
    private String im0503mm = _EMPTY_;
    private String im0503yy = _EMPTY_;
    private String im0504dd = _EMPTY_;
    private String im0504mm = _EMPTY_;
    private String im0504yy = _EMPTY_;
    private String im0505dd = _EMPTY_;
    private String im0505mm = _EMPTY_;
    private String im0505yy = _EMPTY_;
    private String im0506dd = _EMPTY_;
    private String im0506mm = _EMPTY_;
    private String im0506yy = _EMPTY_;
    private String im0507dd = _EMPTY_;
    private String im0507mm = _EMPTY_;
    private String im0507yy = _EMPTY_;
    private String im0508dd = _EMPTY_;
    private String im0508mm = _EMPTY_;
    private String im0508yy = _EMPTY_;
    private String im0509dd = _EMPTY_;
    private String im0509mm = _EMPTY_;
    private String im0509yy = _EMPTY_;
    private String im0510dd = _EMPTY_;
    private String im0510mm = _EMPTY_;
    private String im0510yy = _EMPTY_;
    private String im0510add = _EMPTY_;
    private String im0510amm = _EMPTY_;
    private String im0510ayy = _EMPTY_;
    private String im0511dd = _EMPTY_;
    private String im0511mm = _EMPTY_;
    private String im0511yy = _EMPTY_;
    private String im0512dd = _EMPTY_;
    private String im0512mm = _EMPTY_;
    private String im0512yy = _EMPTY_;
    private String im0513dd = _EMPTY_;
    private String im0513mm = _EMPTY_;
    private String im0513yy = _EMPTY_;
    private String im0514dd = _EMPTY_;
    private String im0514mm = _EMPTY_;
    private String im0514yy = _EMPTY_;
    private String im0515dd = _EMPTY_;
    private String im0515mm = _EMPTY_;
    private String im0515yy = _EMPTY_;
    private String im0516dd = _EMPTY_;
    private String im0516mm = _EMPTY_;
    private String im0516yy = _EMPTY_;
    private String im0517dd = _EMPTY_;
    private String im0517mm = _EMPTY_;
    private String im0517yy = _EMPTY_;
    private String im07 = _EMPTY_;
    private String im08 = _EMPTY_;
    private String im09 = _EMPTY_;
    private String im10 = _EMPTY_;
    private String im11 = _EMPTY_;
    private String im12 = _EMPTY_;
    private String im12a = _EMPTY_;
    private String im12a98 = _EMPTY_;
    private String im14 = _EMPTY_;
    private String im15 = _EMPTY_;
    private String im16 = _EMPTY_;
    private String im17 = _EMPTY_;
    private String im18 = _EMPTY_;
    private String im19 = _EMPTY_;
    private String im20 = _EMPTY_;
    private String im21 = _EMPTY_;
    private String im22 = _EMPTY_;
    private String im22a = _EMPTY_;
    private String im23 = _EMPTY_;
    private String im236x = _EMPTY_;
    private String im23a = _EMPTY_;
    private String im24 = _EMPTY_;
    private String im2417x = _EMPTY_;
    private String im24a = _EMPTY_;
    private String im24b = _EMPTY_;
    private String im24b98 = _EMPTY_;
    private String im24c = _EMPTY_;
    private String im24d = _EMPTY_;
    private String im25 = _EMPTY_;
    private String im26 = _EMPTY_;
    private long ageInMonths;


    public void Child() {


    }


    public void populateMeta() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setEbCode(MainApp.selectedHousehold.getEbCode());
        setHhid(MainApp.selectedHousehold.getHhid());

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


    @Bindable
    public String getEbCode() {
        return ebCode;
    }

    public void setEbCode(String ebCode) {
        this.ebCode = ebCode;
        notifyPropertyChanged(BR.ebCode);
    }

    @Bindable
    public String getEc01() {
        return ec01;
    }

    public void setEc01(String ec01) {
        this.ec01 = ec01;
        notifyPropertyChanged(BR.ec01);
    }

    @Bindable
    public String getEc02() {
        return ec02;
    }

    public void setEc02(String ec02) {
        this.ec02 = ec02;
        notifyPropertyChanged(BR.ec02);
    }

    @Bindable
    public String getEc03() {
        return ec03;
    }

    public void setEc03(String ec03) {
        this.ec03 = ec03;
        notifyPropertyChanged(BR.ec03);
    }

    @Bindable
    public String getEc04() {
        return ec04;
    }

    public void setEc04(String ec04) {
        this.ec04 = ec04;
        notifyPropertyChanged(BR.ec04);
    }

    @Bindable
    public String getEc04a() {
        return ec04a;
    }

    public void setEc04a(String ec04a) {
        this.ec04a = ec04a;
        notifyPropertyChanged(BR.ec04a);
    }

    @Bindable
    public String getEc05() {
        return ec05;
    }

    public void setEc05(String ec05) {
        this.ec05 = ec05;
        notifyPropertyChanged(BR.ec05);
    }

    @Bindable
    public String getEc06() {
        return ec06;
    }

    public void setEc06(String ec06) {
        this.ec06 = ec06;
        notifyPropertyChanged(BR.ec06);
    }

    @Bindable
    public String getEc07() {
        return ec07;
    }

    public void setEc07(String ec07) {
        this.ec07 = ec07;
        notifyPropertyChanged(BR.ec07);
    }

    @Bindable
    public String getEc09() {
        return ec09;
    }

    public void setEc09(String ec09) {
        this.ec09 = ec09;
        notifyPropertyChanged(BR.ec09);
    }

    @Bindable
    public String getEc11() {
        return ec11;
    }

    public void setEc11(String ec11) {
        this.ec11 = ec11;
        notifyPropertyChanged(BR.ec11);
    }

    @Bindable
    public String getEc12() {
        return ec12;
    }

    public void setEc12(String ec12) {
        this.ec12 = ec12;
        notifyPropertyChanged(BR.ec12);
    }

    @Bindable
    public String getEc13cline() {
        return ec13cline;
    }

    public void setEc13cline(String ec13cline) {
        this.ec13cline = ec13cline;
        notifyPropertyChanged(BR.ec13cline);
    }

    @Bindable
    public String getEc14cname() {
        return ec14cname;
    }

    public void setEc14cname(String ec14cname) {
        this.ec14cname = ec14cname;
        notifyPropertyChanged(BR.ec14cname);
    }

    @Bindable
    public String getEc18() {
        return ec18;
    }

    public void setEc18(String ec18) {
        this.ec18 = ec18;
        setEc19(ec18.equals("4") || ec18.equals("96") ? "" : this.ec19);
        setEc21(ec18.equals("4") || ec18.equals("96") ? "" : this.ec19);

        notifyPropertyChanged(BR.ec18);
    }

    @Bindable
    public String getEc19() {
        return ec19;
    }

    public void setEc19(String ec19) {
        this.ec19 = ec19;
        notifyPropertyChanged(BR.ec19);
    }

    @Bindable
    public String getEc21() {
        return ec21;
    }

    public void setEc21(String ec21) {
        this.ec21 = ec21;
        setCb01a(ec21.equals("1") ? this.cb01a : "");
        setCb01b(ec21.equals("1") ? this.cb01b : "");
        setCb02a(ec21.equals("1") ? this.cb02a : "");
        setCb02b(ec21.equals("1") ? this.cb02b : "");
        setEc22(ec21.equals("2") ? this.ec22 : "");

        notifyPropertyChanged(BR.ec21);
    }

    @Bindable
    public String getEc22() {
        return ec22;
    }

    public void setEc22(String ec22) {
        this.ec22 = ec22;
        setEc2206x(ec22.equals("6") ? this.ec2206x : ""); // for all skips, mention all skipped questions
        setEc2296x(ec22.equals("96") ? this.ec2296x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.ec22);
    }

    @Bindable
    public String getEc2206x() {
        return ec2206x;
    }

    public void setEc2206x(String ec2206x) {
        this.ec2206x = ec2206x;
        notifyPropertyChanged(BR.ec2206x);
    }

    @Bindable
    public String getEc2296x() {
        return ec2296x;
    }

    public void setEc2296x(String ec2296x) {
        this.ec2296x = ec2296x;
        notifyPropertyChanged(BR.ec2296x);
    }

    @Bindable
    public String getCb01a() {
        return cb01a;
    }

    public void setCb01a(String cb01a) {
        this.cb01a = cb01a;
        notifyPropertyChanged(BR.cb01a);
    }

    @Bindable
    public String getCb01b() {
        return cb01b;
    }

    public void setCb01b(String cb01b) {
        this.cb01b = cb01b;
        notifyPropertyChanged(BR.cb01b);
    }

    @Bindable
    public String getCb02a() {
        return cb02a;
    }

    public void setCb02a(String cb02a) {
        this.cb02a = cb02a;
        notifyPropertyChanged(BR.cb02a);
    }

    @Bindable
    public String getCb02b() {
        return cb02b;
    }

    public void setCb02b(String cb02b) {
        this.cb02b = cb02b;
        notifyPropertyChanged(BR.cb02b);
    }

    @Bindable
    public String getEc13() {
        return ec13;
    }

    public void setEc13(String ec13) {
        this.ec13 = ec13;
        this.sno = ec13;
        this.ec13cline = ec13;
        notifyPropertyChanged(BR.ec13);
    }

    @Bindable
    public String getEc14() {
        return ec14;
    }

    public void setEc14(String ec14) {
        this.ec14 = ec14;
        this.ec14cname = ec14;
        notifyPropertyChanged(BR.ec14);
    }

    @Bindable
    public String getEc15() {
        return ec15;
    }

    public void setEc15(String ec15) {
        this.ec15 = ec15;
        notifyPropertyChanged(BR.ec15);
    }

    @Bindable
    public String getEc16() {
        return ec16;
    }

    public void setEc16(String ec16) {
        this.ec16 = ec16;
        notifyPropertyChanged(BR.ec16);
    }

    @Bindable
    public String getEc17() {
        return ec17;
    }

    public void setEc17(String ec17) {
        this.ec17 = ec17;
        notifyPropertyChanged(BR.ec17);
    }

    @Bindable
    public String getCb03dd() {
        return cb03dd;
    }

    public void setCb03dd(String cb03dd) {
        this.cb03dd = cb03dd;
        CaluculateAge();
        notifyPropertyChanged(BR.cb03dd);
    }

    @Bindable
    public String getCb03mm() {
        return cb03mm;
    }

    public void setCb03mm(String cb03mm) {
        this.cb03mm = cb03mm;
        CaluculateAge();
        notifyPropertyChanged(BR.cb03mm);
    }

    @Bindable
    public String getCb03yy() {
        return cb03yy;
    }

    public void setCb03yy(String cb03yy) {
        this.cb03yy = cb03yy;
        CaluculateAge();
        notifyPropertyChanged(BR.cb03yy);
    }

    @Bindable
    public String getCb03dk() {
        return cb03dk;
    }

    public void setCb03dk(String cb03dk) {
        this.cb03dk = cb03dk;
        setCb03dd(cb03dk.equals("98") ? "" : this.cb03dd);
        setCb03mm(cb03dk.equals("98") ? "" : this.cb03mm);
        setCb03yy(cb03dk.equals("98") ? "" : this.cb03yy);
        notifyPropertyChanged(BR.cb03dk);
    }

    @Bindable
    public String getCb04mm() {
        return cb04mm;
    }

    public void setCb04mm(String cb04mm) {
        this.cb04mm = cb04mm;
        notifyPropertyChanged(BR.cb04mm);
    }

    @Bindable
    public String getCb04yy() {
        return cb04yy;
    }

    public void setCb04yy(String cb04yy) {
        this.cb04yy = cb04yy;
        notifyPropertyChanged(BR.cb04yy);
    }

    @Bindable
    public String getIm01() {
        return im01;
    }

    public void setIm01(String im01) {
        this.im01 = im01;
        setIm02(im01.equals("1") ? this.im02 : "");
        setIm02a(im01.equals("1") ? this.im02a : "");
        setIm03(im01.equals("2") ? this.im03 : "");
        notifyPropertyChanged(BR.im01);
    }

    @Bindable
    public String getIm02() {
        return im02;
    }

    public void setIm02(String im02) {
        this.im02 = im02;
        setIm02a(im02.equals("1") ? this.im02a : "");
        setIm04dd(im02.equals("1") ? this.im04dd : "");
        setIm04mm(im02.equals("1") ? this.im04mm : "");
        setIm04yy(im02.equals("1") ? this.im04yy : "");

        setIm0501dd(im02.equals("1") ? this.im0501dd : "");
        setIm0501mm(im02.equals("1") ? this.im0501mm : "");
        setIm0501yy(im02.equals("1") ? this.im0501yy : "");

        setIm0502dd(im02.equals("1") ? this.im0502dd : "");
        setIm0502mm(im02.equals("1") ? this.im0502mm : "");
        setIm0502yy(im02.equals("1") ? this.im0502yy : "");

        setIm0503dd(im02.equals("1") ? this.im0503dd : "");
        setIm0503mm(im02.equals("1") ? this.im0503mm : "");
        setIm0503yy(im02.equals("1") ? this.im0503yy : "");

        setIm0504dd(im02.equals("1") ? this.im0504dd : "");
        setIm0504mm(im02.equals("1") ? this.im0504mm : "");
        setIm0504yy(im02.equals("1") ? this.im0504yy : "");

        setIm0505dd(im02.equals("1") ? this.im0505dd : "");
        setIm0505mm(im02.equals("1") ? this.im0505mm : "");
        setIm0505yy(im02.equals("1") ? this.im0505yy : "");

        setIm0506dd(im02.equals("1") ? this.im0506dd : "");
        setIm0506mm(im02.equals("1") ? this.im0506mm : "");
        setIm0506yy(im02.equals("1") ? this.im0506yy : "");

        setIm0507dd(im02.equals("1") ? this.im0507dd : "");
        setIm0507mm(im02.equals("1") ? this.im0507mm : "");
        setIm0507yy(im02.equals("1") ? this.im0507yy : "");

        setIm0508dd(im02.equals("1") ? this.im0508dd : "");
        setIm0508mm(im02.equals("1") ? this.im0508mm : "");
        setIm0508yy(im02.equals("1") ? this.im0508yy : "");

        setIm0509dd(im02.equals("1") ? this.im0509dd : "");
        setIm0509mm(im02.equals("1") ? this.im0509mm : "");
        setIm0509yy(im02.equals("1") ? this.im0509yy : "");

        setIm0510dd(im02.equals("1") ? this.im0510dd : "");
        setIm0510mm(im02.equals("1") ? this.im0510mm : "");
        setIm0510yy(im02.equals("1") ? this.im0510yy : "");

        setIm0510add(im02.equals("1") ? this.im0510add : "");
        setIm0510amm(im02.equals("1") ? this.im0510amm : "");
        setIm0510ayy(im02.equals("1") ? this.im0510ayy : "");

        setIm0511dd(im02.equals("1") ? this.im0511dd : "");
        setIm0511mm(im02.equals("1") ? this.im0511mm : "");
        setIm0511yy(im02.equals("1") ? this.im0511yy : "");

        setIm0512dd(im02.equals("1") ? this.im0512dd : "");
        setIm0512mm(im02.equals("1") ? this.im0512mm : "");
        setIm0512yy(im02.equals("1") ? this.im0512yy : "");

        setIm0513dd(im02.equals("1") ? this.im0513dd : "");
        setIm0513mm(im02.equals("1") ? this.im0513mm : "");
        setIm0513yy(im02.equals("1") ? this.im0513yy : "");

        setIm0514dd(im02.equals("1") ? this.im0514dd : "");
        setIm0514mm(im02.equals("1") ? this.im0514mm : "");
        setIm0514yy(im02.equals("1") ? this.im0514yy : "");


        setIm0515dd(im02.equals("1") ? this.im0515dd : "");
        setIm0515mm(im02.equals("1") ? this.im0515mm : "");
        setIm0515yy(im02.equals("1") ? this.im0515yy : "");

        setIm0516dd(im02.equals("1") ? this.im0516dd : "");
        setIm0516mm(im02.equals("1") ? this.im0516mm : "");
        setIm0516yy(im02.equals("1") ? this.im0516yy : "");

        setIm0517dd(im02.equals("1") ? this.im0517dd : "");
        setIm0517mm(im02.equals("1") ? this.im0517mm : "");
        setIm0517yy(im02.equals("1") ? this.im0517yy : "");



        setIm09(im02.equals("2") ? this.im09 : "");
        setIm10(im02.equals("2") ? this.im10 : "");
        setIm11(im02.equals("2") ? this.im11 : "");
        setIm12(im02.equals("2") ? this.im12 : "");
        setIm12a(im02.equals("2") ? this.im12a : "");
        setIm14(im02.equals("2") ? this.im14 : "");
        setIm15(im02.equals("2") ? this.im15 : "");
        setIm16(im02.equals("2") ? this.im16 : "");
        setIm17(im02.equals("2") ? this.im17 : "");
        setIm18(im02.equals("2") ? this.im18 : "");
        setIm19(im02.equals("2") ? this.im19 : "");
        setIm20(im02.equals("2") ? this.im20 : "");
        setIm21(im02.equals("2") ? this.im21 : "");
        setIm22(im02.equals("2") ? this.im22 : "");
        setIm22a(im02.equals("2") ? this.im22a : "");

        notifyPropertyChanged(BR.im02);
    }

    @Bindable
    public String getIm02a() {
        return im02a;
    }

    public void setIm02a(String im02a) {
        this.im02a = im02a;
        setIm02a96x(im02a.equals("96") ? this.im02a96x : "");
        final boolean b = im02a.equals("1") || im02a.equals("2") || im02a.equals("3") || im02a.equals("96");

        setIm03(b ? "" : this.im03);
        setIm04dd(b ? "" : this.im04dd);
        setIm04mm(b ? "" : this.im04mm);
        setIm04yy(b ? "" : this.im04yy);
        setIm07(b ? "" : this.im07);

        notifyPropertyChanged(BR.im02a);
    }

    @Bindable
    public String getIm02a96x() {
        return im02a96x;
    }

    public void setIm02a96x(String im02a96x) {
        this.im02a96x = im02a96x;
        notifyPropertyChanged(BR.im02a96x);
    }

    @Bindable
    public String getIm03() {
        return im03;
    }

    public void setIm03(String im03) {
        this.im03 = im03;
        setIm0396x(im03.equals("96") ? this.im0396x : "");
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
    public String getIm04dd() {
        return im04dd;
    }

    public void setIm04dd(String im04dd) {
        this.im04dd = im04dd;
        notifyPropertyChanged(BR.im04dd);
    }

    @Bindable
    public String getIm04mm() {
        return im04mm;
    }

    public void setIm04mm(String im04mm) {
        this.im04mm = im04mm;
        notifyPropertyChanged(BR.im04mm);
    }

    @Bindable
    public String getIm04yy() {
        return im04yy;
    }

    public void setIm04yy(String im04yy) {
        this.im04yy = im04yy;
        notifyPropertyChanged(BR.im04yy);
    }

    @Bindable
    public String getIm0497() {
        return im0497;
    }

    public void setIm0497(String im0497) {
        if (this.im0497.equals(im0497)) return;
        this.im0497 = im0497;
        setIm04dd(im0497.equals("97") ? "" : this.im04dd);
        setIm04mm(im0497.equals("97") ? "" : this.im04mm);
        setIm04yy(im0497.equals("97") ? "" : this.im04yy);
        notifyPropertyChanged(BR.im0497);
    }

    @Bindable
    public String getIm0501dd() {
        return im0501dd;
    }

    public void setIm0501dd(String im0501dd) {
        this.im0501dd = im0501dd;
        boolean b = im0501dd.length() > 0 && Integer.parseInt(im0501dd) > 31;
        setIm0501mm(b ? "" : this.im0501mm);
        setIm0501yy(b ? "" : this.im0501yy);
        notifyPropertyChanged(BR.im0501dd);
    }

    @Bindable
    public String getIm0501mm() {
        return im0501mm;
    }

    public void setIm0501mm(String im0501mm) {
        this.im0501mm = im0501mm;
        notifyPropertyChanged(BR.im0501mm);
    }

    @Bindable
    public String getIm0501yy() {
        return im0501yy;
    }

    public void setIm0501yy(String im0501yy) {
        this.im0501yy = im0501yy;
        notifyPropertyChanged(BR.im0501yy);
    }

    @Bindable
    public String getIm0502dd() {
        return im0502dd;
    }

    public void setIm0502dd(String im0502dd) {
        this.im0502dd = im0502dd;
        boolean b = im0502dd.length() > 0 && Integer.parseInt(im0502dd) > 31;
        setIm0502mm(b ? "" : this.im0502mm);
        setIm0502yy(b ? "" : this.im0502yy);
        notifyPropertyChanged(BR.im0502dd);
    }

    @Bindable
    public String getIm0502mm() {
        return im0502mm;
    }

    public void setIm0502mm(String im0502mm) {
        this.im0502mm = im0502mm;
        notifyPropertyChanged(BR.im0502mm);
    }

    @Bindable
    public String getIm0502yy() {
        return im0502yy;
    }

    public void setIm0502yy(String im0502yy) {
        this.im0502yy = im0502yy;
        notifyPropertyChanged(BR.im0502yy);
    }

    @Bindable
    public String getIm0503dd() {
        return im0503dd;
    }

    public void setIm0503dd(String im0503dd) {
        this.im0503dd = im0503dd;
        boolean b = im0503dd.length() > 0 && Integer.parseInt(im0503dd) > 31;
        setIm0503mm(b ? "" : this.im0503mm);
        setIm0503yy(b ? "" : this.im0503yy);
        notifyPropertyChanged(BR.im0503dd);
    }

    @Bindable
    public String getIm0503mm() {
        return im0503mm;
    }

    public void setIm0503mm(String im0503mm) {
        this.im0503mm = im0503mm;
        notifyPropertyChanged(BR.im0503mm);
    }

    @Bindable
    public String getIm0503yy() {
        return im0503yy;
    }

    public void setIm0503yy(String im0503yy) {
        this.im0503yy = im0503yy;
        notifyPropertyChanged(BR.im0503yy);
    }

    @Bindable
    public String getIm0504dd() {
        return im0504dd;
    }

    public void setIm0504dd(String im0504dd) {
        this.im0504dd = im0504dd;
        boolean b = im0504dd.length() > 0 && Integer.parseInt(im0504dd) > 31;
        setIm0504mm(b ? "" : this.im0504mm);
        setIm0504yy(b ? "" : this.im0504yy);
        notifyPropertyChanged(BR.im0504dd);
    }

    @Bindable
    public String getIm0504mm() {
        return im0504mm;
    }

    public void setIm0504mm(String im0504mm) {
        this.im0504mm = im0504mm;
        notifyPropertyChanged(BR.im0504mm);
    }

    @Bindable
    public String getIm0504yy() {
        return im0504yy;
    }

    public void setIm0504yy(String im0504yy) {
        this.im0504yy = im0504yy;
        notifyPropertyChanged(BR.im0504yy);
    }

    @Bindable
    public String getIm0505dd() {
        return im0505dd;
    }

    public void setIm0505dd(String im0505dd) {
        this.im0505dd = im0505dd;
        boolean b = im0505dd.length() > 0 && Integer.parseInt(im0505dd) > 31;
        setIm0505mm(b ? "" : this.im0505mm);
        setIm0505yy(b ? "" : this.im0505yy);
        notifyPropertyChanged(BR.im0505dd);
    }

    @Bindable
    public String getIm0505mm() {
        return im0505mm;
    }

    public void setIm0505mm(String im0505mm) {
        this.im0505mm = im0505mm;
        notifyPropertyChanged(BR.im0505mm);
    }

    @Bindable
    public String getIm0505yy() {
        return im0505yy;
    }

    public void setIm0505yy(String im0505yy) {
        this.im0505yy = im0505yy;
        notifyPropertyChanged(BR.im0505yy);
    }

    @Bindable
    public String getIm0506dd() {
        return im0506dd;
    }

    public void setIm0506dd(String im0506dd) {
        this.im0506dd = im0506dd;
        boolean b = im0506dd.length() > 0 && Integer.parseInt(im0506dd) > 31;
        setIm0506mm(b ? "" : this.im0506mm);
        setIm0506yy(b ? "" : this.im0506yy);
        notifyPropertyChanged(BR.im0506dd);
    }

    @Bindable
    public String getIm0506mm() {
        return im0506mm;
    }

    public void setIm0506mm(String im0506mm) {
        this.im0506mm = im0506mm;
        notifyPropertyChanged(BR.im0506mm);
    }

    @Bindable
    public String getIm0506yy() {
        return im0506yy;
    }

    public void setIm0506yy(String im0506yy) {
        this.im0506yy = im0506yy;
        notifyPropertyChanged(BR.im0506yy);
    }

    @Bindable
    public String getIm0507dd() {
        return im0507dd;
    }

    public void setIm0507dd(String im0507dd) {
        this.im0507dd = im0507dd;
        boolean b = im0507dd.length() > 0 && Integer.parseInt(im0507dd) > 31;
        setIm0507mm(b ? "" : this.im0507mm);
        setIm0507yy(b ? "" : this.im0507yy);
        notifyPropertyChanged(BR.im0507dd);
    }

    @Bindable
    public String getIm0507mm() {
        return im0507mm;
    }

    public void setIm0507mm(String im0507mm) {
        this.im0507mm = im0507mm;
        notifyPropertyChanged(BR.im0507mm);
    }

    @Bindable
    public String getIm0507yy() {
        return im0507yy;
    }

    public void setIm0507yy(String im0507yy) {
        this.im0507yy = im0507yy;
        notifyPropertyChanged(BR.im0507yy);
    }

    @Bindable
    public String getIm0508dd() {
        return im0508dd;
    }

    public void setIm0508dd(String im0508dd) {
        this.im0508dd = im0508dd;
        boolean b = im0508dd.length() > 0 && Integer.parseInt(im0508dd) > 31;
        setIm0508mm(b ? "" : this.im0508mm);
        setIm0508yy(b ? "" : this.im0508yy);
        notifyPropertyChanged(BR.im0508dd);
    }

    @Bindable
    public String getIm0508mm() {
        return im0508mm;
    }

    public void setIm0508mm(String im0508mm) {
        this.im0508mm = im0508mm;
        notifyPropertyChanged(BR.im0508mm);
    }

    @Bindable
    public String getIm0508yy() {
        return im0508yy;
    }

    public void setIm0508yy(String im0508yy) {
        this.im0508yy = im0508yy;
        notifyPropertyChanged(BR.im0508yy);
    }

    @Bindable
    public String getIm0509dd() {
        return im0509dd;
    }

    public void setIm0509dd(String im0509dd) {
        this.im0509dd = im0509dd;
        boolean b = im0509dd.length() > 0 && Integer.parseInt(im0509dd) > 31;
        setIm0509mm(b ? "" : this.im0509mm);
        setIm0509yy(b ? "" : this.im0509yy);
        notifyPropertyChanged(BR.im0509dd);
    }

    @Bindable
    public String getIm0509mm() {
        return im0509mm;
    }

    public void setIm0509mm(String im0509mm) {
        this.im0509mm = im0509mm;
        notifyPropertyChanged(BR.im0509mm);
    }

    @Bindable
    public String getIm0509yy() {
        return im0509yy;
    }

    public void setIm0509yy(String im0509yy) {
        this.im0509yy = im0509yy;
        notifyPropertyChanged(BR.im0509yy);
    }

    @Bindable
    public String getIm0510dd() {
        return im0510dd;
    }

    public void setIm0510dd(String im0510dd) {
        this.im0510dd = im0510dd;
        boolean b = im0510dd.length() > 0 && Integer.parseInt(im0510dd) > 31;
        setIm0510mm(b ? "" : this.im0510mm);
        setIm0510yy(b ? "" : this.im0510yy);
        notifyPropertyChanged(BR.im0510dd);
    }

    @Bindable
    public String getIm0510mm() {
        return im0510mm;
    }

    public void setIm0510mm(String im0510mm) {
        this.im0510mm = im0510mm;
        notifyPropertyChanged(BR.im0510mm);
    }

    @Bindable
    public String getIm0510yy() {
        return im0510yy;
    }

    public void setIm0510yy(String im0510yy) {
        this.im0510yy = im0510yy;
        notifyPropertyChanged(BR.im0510yy);
    }

    @Bindable
    public String getIm0510add() {
        return im0510add;
    }

    public void setIm0510add(String im0510add) {
        this.im0510add = im0510add;
        boolean b = im0510add.length() > 0 && Integer.parseInt(im0510add) > 31;
        setIm0510amm(b ? "" : this.im0510amm);
        setIm0510ayy(b ? "" : this.im0510ayy);
        notifyPropertyChanged(BR.im0510add);
    }

    @Bindable
    public String getIm0510amm() {
        return im0510amm;
    }

    public void setIm0510amm(String im0510amm) {
        this.im0510amm = im0510amm;
        notifyPropertyChanged(BR.im0510amm);
    }

    @Bindable
    public String getIm0510ayy() {
        return im0510ayy;
    }

    public void setIm0510ayy(String im0510ayy) {
        this.im0510ayy = im0510ayy;
        notifyPropertyChanged(BR.im0510ayy);
    }

    @Bindable
    public String getIm0511dd() {
        return im0511dd;
    }

    public void setIm0511dd(String im0511dd) {
        this.im0511dd = im0511dd;
        boolean b = im0511dd.length() > 0 && Integer.parseInt(im0511dd) > 31;
        setIm0511mm(b ? "" : this.im0511mm);
        setIm0511yy(b ? "" : this.im0511yy);
        notifyPropertyChanged(BR.im0511dd);
    }

    @Bindable
    public String getIm0511mm() {
        return im0511mm;
    }

    public void setIm0511mm(String im0511mm) {
        this.im0511mm = im0511mm;
        notifyPropertyChanged(BR.im0511mm);
    }

    @Bindable
    public String getIm0511yy() {
        return im0511yy;
    }

    public void setIm0511yy(String im0511yy) {
        this.im0511yy = im0511yy;
        notifyPropertyChanged(BR.im0511yy);
    }

    @Bindable
    public String getIm0512dd() {
        return im0512dd;
    }

    public void setIm0512dd(String im0512dd) {
        this.im0512dd = im0512dd;
        boolean b = im0512dd.length() > 0 && Integer.parseInt(im0512dd) > 31;
        setIm0512mm(b ? "" : this.im0512mm);
        setIm0512yy(b ? "" : this.im0512yy);
        notifyPropertyChanged(BR.im0512dd);
    }

    @Bindable
    public String getIm0512mm() {
        return im0512mm;
    }

    public void setIm0512mm(String im0512mm) {
        this.im0512mm = im0512mm;
        notifyPropertyChanged(BR.im0512mm);
    }

    @Bindable
    public String getIm0512yy() {
        return im0512yy;
    }

    public void setIm0512yy(String im0512yy) {
        this.im0512yy = im0512yy;
        notifyPropertyChanged(BR.im0512yy);
    }

    @Bindable
    public String getIm0513dd() {
        return im0513dd;
    }

    public void setIm0513dd(String im0513dd) {
        this.im0513dd = im0513dd;
        boolean b = im0513dd.length() > 0 && Integer.parseInt(im0513dd) > 31;
        setIm0513mm(b ? "" : this.im0513mm);
        setIm0513yy(b ? "" : this.im0513yy);
        notifyPropertyChanged(BR.im0513dd);
    }

    @Bindable
    public String getIm0513mm() {
        return im0513mm;
    }

    public void setIm0513mm(String im0513mm) {
        this.im0513mm = im0513mm;
        notifyPropertyChanged(BR.im0513mm);
    }

    @Bindable
    public String getIm0513yy() {
        return im0513yy;
    }

    public void setIm0513yy(String im0513yy) {
        this.im0513yy = im0513yy;
        notifyPropertyChanged(BR.im0513yy);
    }

    @Bindable
    public String getIm0514dd() {
        return im0514dd;
    }

    public void setIm0514dd(String im0514dd) {
        this.im0514dd = im0514dd;
        boolean b = im0514dd.length() > 0 && Integer.parseInt(im0514dd) > 31;
        setIm0514mm(b ? "" : this.im0514mm);
        setIm0514yy(b ? "" : this.im0514yy);
        notifyPropertyChanged(BR.im0514dd);
    }

    @Bindable
    public String getIm0514mm() {
        return im0514mm;
    }

    public void setIm0514mm(String im0514mm) {
        this.im0514mm = im0514mm;
        notifyPropertyChanged(BR.im0514mm);
    }

    @Bindable
    public String getIm0514yy() {
        return im0514yy;
    }

    public void setIm0514yy(String im0514yy) {
        this.im0514yy = im0514yy;
        notifyPropertyChanged(BR.im0514yy);
    }

    @Bindable
    public String getIm0515dd() {
        return im0515dd;
    }

    public void setIm0515dd(String im0515dd) {
        this.im0515dd = im0515dd;
        boolean b = im0515dd.length() > 0 && Integer.parseInt(im0515dd) > 31;
        setIm0515mm(b ? "" : this.im0515mm);
        setIm0515yy(b ? "" : this.im0515yy);
        notifyPropertyChanged(BR.im0515dd);
    }

    @Bindable
    public String getIm0515mm() {
        return im0515mm;
    }

    public void setIm0515mm(String im0515mm) {
        this.im0515mm = im0515mm;
        notifyPropertyChanged(BR.im0515mm);
    }

    @Bindable
    public String getIm0515yy() {
        return im0515yy;
    }

    public void setIm0515yy(String im0515yy) {
        this.im0515yy = im0515yy;
        notifyPropertyChanged(BR.im0515yy);
    }

    @Bindable
    public String getIm0516dd() {
        return im0516dd;
    }

    public void setIm0516dd(String im0516dd) {
        this.im0516dd = im0516dd;
        boolean b = im0516dd.length() > 0 && Integer.parseInt(im0516dd) > 31;
        setIm0516mm(b ? "" : this.im0516mm);
        setIm0516yy(b ? "" : this.im0516yy);
        notifyPropertyChanged(BR.im0516dd);
    }

    @Bindable
    public String getIm0516mm() {
        return im0516mm;
    }

    public void setIm0516mm(String im0516mm) {
        this.im0516mm = im0516mm;
        notifyPropertyChanged(BR.im0516mm);
    }

    @Bindable
    public String getIm0516yy() {
        return im0516yy;
    }

    public void setIm0516yy(String im0516yy) {
        this.im0516yy = im0516yy;
        notifyPropertyChanged(BR.im0516yy);
    }

    @Bindable
    public String getIm0517dd() {
        return im0517dd;
    }

    public void setIm0517dd(String im0517dd) {
        this.im0517dd = im0517dd;
        boolean b = im0517dd.length() > 0 && Integer.parseInt(im0517dd) > 31;
        setIm0517mm(b ? "" : this.im0517mm);
        setIm0517yy(b ? "" : this.im0517yy);
        notifyPropertyChanged(BR.im0517dd);
    }

    @Bindable
    public String getIm0517mm() {
        return im0517mm;
    }

    public void setIm0517mm(String im0517mm) {
        this.im0517mm = im0517mm;
        notifyPropertyChanged(BR.im0517mm);
    }

    @Bindable
    public String getIm0517yy() {
        return im0517yy;
    }

    public void setIm0517yy(String im0517yy) {
        this.im0517yy = im0517yy;
        notifyPropertyChanged(BR.im0517yy);
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
        setIm12a(im08.equals("1") ? this.im12a : "");
        setIm14(im08.equals("1") ? this.im14 : "");
        setIm15(im08.equals("1") ? this.im15 : "");
        setIm16(im08.equals("1") ? this.im16 : "");
        setIm17(im08.equals("1") ? this.im17 : "");
        setIm18(im08.equals("1") ? this.im18 : "");
        setIm19(im08.equals("1") ? this.im19 : "");
        setIm20(im08.equals("1") ? this.im20 : "");
        setIm21(im08.equals("1") ? this.im21 : "");
        setIm22(im08.equals("1") ? this.im22 : "");
        setIm22a(im08.equals("1") ? this.im22a : "");
        setIm23(im08.equals("1") ? this.im23 : "");
        setIm23a(im08.equals("1") ? this.im23a : "");

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
        notifyPropertyChanged(BR.im10);
    }

    @Bindable
    public String getIm11() {
        return im11;
    }

    public void setIm11(String im11) {
        this.im11 = im11;
        setIm12(im11.equals("1") ? this.im12 : "");
        notifyPropertyChanged(BR.im11);
    }

    @Bindable
    public String getIm12() {
        return im12;
    }

    public void setIm12(String im12) {
        this.im12 = im12;
        notifyPropertyChanged(BR.im12);
    }

    @Bindable
    public String getIm12a() {
        return im12a;
    }

    public void setIm12a(String im12a) {
        this.im12a = im12a;
        notifyPropertyChanged(BR.im12a);
    }

    @Bindable
    public String getIm12a98() {
        return im12a98;
    }

    public void setIm12a98(String im12a98) {
        if (this.im12a98.equals(im12a98)) return;
        this.im12a98 = im12a98;
        setIm12a(im12a98.equals("98") ? "" : this.im12a);
        notifyPropertyChanged(BR.im12a98);
    }

    @Bindable
    public String getIm14() {
        return im14;
    }

    public void setIm14(String im14) {
        this.im14 = im14;
        setIm15(im14.equals("1") ? this.im14 : "");
        notifyPropertyChanged(BR.im14);
    }

    @Bindable
    public String getIm15() {
        return im15;
    }

    public void setIm15(String im15) {
        this.im15 = im15;
        notifyPropertyChanged(BR.im15);
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
        notifyPropertyChanged(BR.im17);
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
        notifyPropertyChanged(BR.im19);
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
        notifyPropertyChanged(BR.im21);
    }

    @Bindable
    public String getIm22() {
        return im22;
    }

    public void setIm22(String im22) {
        this.im22 = im22;
        notifyPropertyChanged(BR.im22);
    }

    @Bindable
    public String getIm22a() {
        return im22a;
    }

    public void setIm22a(String im22a) {
        this.im22a = im22a;
        notifyPropertyChanged(BR.im22a);
    }

    @Bindable
    public String getIm23() {
        return im23;
    }

    public void setIm23(String im23) {
        this.im23 = im23;
        notifyPropertyChanged(BR.im23);
    }

    @Bindable
    public String getIm236x() {
        return im236x;
    }

    public void setIm236x(String im236x) {
        this.im236x = im236x;
        notifyPropertyChanged(BR.im236x);
    }

    @Bindable
    public String getIm23a() {
        return im23a;
    }

    public void setIm23a(String im23a) {
        this.im23a = im23a;
        notifyPropertyChanged(BR.im23a);
    }

    @Bindable
    public String getIm24() {
        return im24;
    }

    public void setIm24(String im24) {
        this.im24 = im24;
        notifyPropertyChanged(BR.im24);
    }

    @Bindable
    public String getIm2417x() {
        return im2417x;
    }

    public void setIm2417x(String im2417x) {
        this.im2417x = im2417x;
        notifyPropertyChanged(BR.im2417x);
    }

    @Bindable
    public String getIm24a() {
        return im24a;
    }

    public void setIm24a(String im24a) {
        this.im24a = im24a;
        notifyPropertyChanged(BR.im24a);
    }

    @Bindable
    public String getIm24b() {
        return im24b;
    }

    public void setIm24b(String im24b) {
        this.im24b = im24b;
        notifyPropertyChanged(BR.im24b);
    }

    @Bindable
    public String getIm24b98() {
        return im24b98;
    }

    public void setIm24b98(String im24b98) {
        if (this.im24b98.equals(im24b98)) return;
        this.im24b98 = im24b98;
        setIm24b(im24b98.equals("98") ? "" : this.im24b);
        notifyPropertyChanged(BR.im24b98);
    }

    @Bindable
    public String getIm24c() {
        return im24c;
    }

    public void setIm24c(String im24c) {
        this.im24c = im24c;
        notifyPropertyChanged(BR.im24c);
    }

    @Bindable
    public String getIm24d() {
        return im24d;
    }

    public void setIm24d(String im24d) {
        this.im24d = im24d;
        notifyPropertyChanged(BR.im24d);
    }

    @Bindable
    public String getIm25() {
        return im25;
    }

    public void setIm25(String im25) {
        this.im25 = im25;
        notifyPropertyChanged(BR.im25);
    }

    @Bindable
    public String getIm26() {
        return im26;
    }

    public void setIm26(String im26) {
        this.im26 = im26;
        notifyPropertyChanged(BR.im26);
    }


    public Child Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_UUID));
/*
        this.muid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_MUID));
*/
        this.ebCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_EB_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_HHID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_PROJECT_NAME));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_APPVERSION));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SYNC_DATE));

        sCHHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SCH)));
        sCBHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SCB)));
        sIMHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SIM)));
        CaluculateAge();

        return this;
    }


    public void sCHHydrate(String string) throws JSONException {
        Log.d(TAG, "sCHHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);

            this.ec13 = json.getString("ec13");
            this.ec14 = json.getString("ec14");
            this.ec15 = json.getString("ec15");
            this.ec16 = json.getString("ec16");
            this.ec17 = json.getString("ec17");
            this.cb03dd = json.getString("cb03dd");
            this.cb03mm = json.getString("cb03mm");
            this.cb03yy = json.getString("cb03yy");
            this.cb04mm = json.getString("cb04mm");
            this.cb04yy = json.getString("cb04yy");
        }

    }

    public void sCBHydrate(String string) throws JSONException {
        Log.d(TAG, "sIMHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);

            this.ec03 = json.getString("ec03");
            this.ec04 = json.getString("ec04");
            this.ec04a = json.getString("ec04a");
            this.ec05 = json.getString("ec05");
            this.ec06 = json.getString("ec06");
            this.ec07 = json.getString("ec07");
            this.ec09 = json.getString("ec09");
            this.ec11 = json.getString("ec11");
            this.ec12 = json.getString("ec12");
            this.ec13cline = json.getString("ec13cline");
            this.ec14cname = json.getString("ec14cname");
            this.ec18 = json.getString("ec18");
            this.ec19 = json.getString("ec19");
            this.ec21 = json.getString("ec21");
            this.ec22 = json.getString("ec22");
            this.ec2206x = json.getString("ec2206x");
            this.ec2296x = json.getString("ec2296x");
            this.cb01a = json.getString("cb01a");
            this.cb01b = json.getString("cb01b");
            this.cb02a = json.getString("cb02a");
            this.cb02b = json.getString("cb02b");
        }
    }

    public void sIMHydrate(String string) throws JSONException {
        Log.d(TAG, "sIMHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);

            this.im01 = json.getString("im01");
            this.im02 = json.getString("im02");
            this.im02a = json.getString("im02a");
            this.im02a96x = json.getString("im02a96x");
            this.im03 = json.getString("im03");
            this.im0396x = json.getString("im0396x");
            this.im04dd = json.getString("im04dd");
            this.im04mm = json.getString("im04mm");
            this.im04yy = json.getString("im04yy");
            this.im0497 = json.getString("im0497");
            this.im0501dd = json.getString("im0501dd");
            this.im0501mm = json.getString("im0501mm");
            this.im0501yy = json.getString("im0501yy");
            this.im0502dd = json.getString("im0502dd");
            this.im0502mm = json.getString("im0502mm");
            this.im0502yy = json.getString("im0502yy");
            this.im0503dd = json.getString("im0503dd");
            this.im0503mm = json.getString("im0503mm");
            this.im0503yy = json.getString("im0503yy");
            this.im0504dd = json.getString("im0504dd");
            this.im0504mm = json.getString("im0504mm");
            this.im0504yy = json.getString("im0504yy");
            this.im0505dd = json.getString("im0505dd");
            this.im0505mm = json.getString("im0505mm");
            this.im0505yy = json.getString("im0505yy");
            this.im0506dd = json.getString("im0506dd");
            this.im0506mm = json.getString("im0506mm");
            this.im0506yy = json.getString("im0506yy");
            this.im0507dd = json.getString("im0507dd");
            this.im0507mm = json.getString("im0507mm");
            this.im0507yy = json.getString("im0507yy");
            this.im0508dd = json.getString("im0508dd");
            this.im0508mm = json.getString("im0508mm");
            this.im0508yy = json.getString("im0508yy");
            this.im0509dd = json.getString("im0509dd");
            this.im0509mm = json.getString("im0509mm");
            this.im0509yy = json.getString("im0509yy");
            this.im0510dd = json.getString("im0510dd");
            this.im0510mm = json.getString("im0510mm");
            this.im0510yy = json.getString("im0510yy");
            this.im0510add = json.getString("im0510add");
            this.im0510amm = json.getString("im0510amm");
            this.im0510ayy = json.getString("im0510ayy");
            this.im0511dd = json.getString("im0511dd");
            this.im0511mm = json.getString("im0511mm");
            this.im0511yy = json.getString("im0511yy");
            this.im0512dd = json.getString("im0512dd");
            this.im0512mm = json.getString("im0512mm");
            this.im0512yy = json.getString("im0512yy");
            this.im0513dd = json.getString("im0513dd");
            this.im0513mm = json.getString("im0513mm");
            this.im0513yy = json.getString("im0513yy");
            this.im0514dd = json.getString("im0514dd");
            this.im0514mm = json.getString("im0514mm");
            this.im0514yy = json.getString("im0514yy");
            this.im0515dd = json.getString("im0515dd");
            this.im0515mm = json.getString("im0515mm");
            this.im0515yy = json.getString("im0515yy");
            this.im0516dd = json.getString("im0516dd");
            this.im0516mm = json.getString("im0516mm");
            this.im0516yy = json.getString("im0516yy");
            this.im0517yy = json.getString("im0517yy");
            this.im07 = json.getString("im07");
            this.im08 = json.getString("im08");
            this.im09 = json.getString("im09");
            this.im10 = json.getString("im10");
            this.im11 = json.getString("im11");
            this.im12 = json.getString("im12");
            this.im12a = json.getString("im12a");
            this.im12a98 = json.getString("im12a98");
            this.im14 = json.getString("im14");
            this.im15 = json.getString("im15");
            this.im16 = json.getString("im16");
            this.im17 = json.getString("im17");
            this.im18 = json.getString("im18");
            this.im19 = json.getString("im19");
            this.im20 = json.getString("im20");
            this.im21 = json.getString("im21");
            this.im22 = json.getString("im22");
            this.im23 = json.getString("im23");
            this.im236x = json.getString("im236x");
            this.im23a = json.getString("im23a");
            this.im24 = json.getString("im24");
            this.im2417x = json.getString("im2417x");
            this.im24a = json.getString("im24a");
            this.im24b = json.getString("im24b");
            this.im24b98 = json.getString("im24b98");
            this.im24c = json.getString("im24c");
            this.im24d = json.getString("im24d");
            this.im25 = json.getString("im25");
            this.im26 = json.getString("im26");
        }
    }

    public String sCHtoString() throws JSONException {
        Log.d(TAG, "sIMtoString: ");
        JSONObject json = new JSONObject();
        json.put("ec13", ec13)
                .put("ec14", ec14)
                .put("ec15", ec15)
                .put("ec16", ec16)
                .put("ec17", ec17)
                .put("cb03dd", cb03dd)
                .put("cb03mm", cb03mm)
                .put("cb03yy", cb03yy)
                .put("cb04mm", cb04mm)
                .put("cb04yy", cb04yy);

        return json.toString();


    }

    public String sIMtoString() throws JSONException {
        Log.d(TAG, "sIMtoString: ");
        JSONObject json = new JSONObject();
        json.put("im01", im01)
                .put("im02", im02)
                .put("im02a", im02a)
                .put("im02a96x", im02a96x)
                .put("im03", im03)
                .put("im0396x", im0396x)
                .put("im04dd", im04dd)
                .put("im04mm", im04mm)
                .put("im04yy", im04yy)
                .put("im0497", im0497)
                .put("im0501dd", im0501dd)
                .put("im0501mm", im0501mm)
                .put("im0501yy", im0501yy)
                .put("im0502dd", im0502dd)
                .put("im0502mm", im0502mm)
                .put("im0502yy", im0502yy)
                .put("im0503dd", im0503dd)
                .put("im0503mm", im0503mm)
                .put("im0503yy", im0503yy)
                .put("im0504dd", im0504dd)
                .put("im0504mm", im0504mm)
                .put("im0504yy", im0504yy)
                .put("im0505dd", im0505dd)
                .put("im0505mm", im0505mm)
                .put("im0505yy", im0505yy)
                .put("im0506dd", im0506dd)
                .put("im0506mm", im0506mm)
                .put("im0506yy", im0506yy)
                .put("im0507dd", im0507dd)
                .put("im0507mm", im0507mm)
                .put("im0507yy", im0507yy)
                .put("im0508dd", im0508dd)
                .put("im0508mm", im0508mm)
                .put("im0508yy", im0508yy)
                .put("im0509dd", im0509dd)
                .put("im0509mm", im0509mm)
                .put("im0509yy", im0509yy)
                .put("im0510dd", im0510dd)
                .put("im0510mm", im0510mm)
                .put("im0510yy", im0510yy)
                .put("im0510add", im0510add)
                .put("im0510amm", im0510amm)
                .put("im0510ayy", im0510ayy)
                .put("im0511dd", im0511dd)
                .put("im0511mm", im0511mm)
                .put("im0511yy", im0511yy)
                .put("im0512dd", im0512dd)
                .put("im0512mm", im0512mm)
                .put("im0512yy", im0512yy)
                .put("im0513dd", im0513dd)
                .put("im0513mm", im0513mm)
                .put("im0513yy", im0513yy)
                .put("im0514dd", im0514dd)
                .put("im0514mm", im0514mm)
                .put("im0514yy", im0514yy)
                .put("im0515dd", im0515dd)
                .put("im0515mm", im0515mm)
                .put("im0515yy", im0515yy)
                .put("im0516dd", im0516dd)
                .put("im0516mm", im0516mm)
                .put("im0516yy", im0516yy)
                .put("im0517yy", im0517yy)
                .put("im07", im07)
                .put("im08", im08)
                .put("im09", im09)
                .put("im10", im10)
                .put("im11", im11)
                .put("im12", im12)
                .put("im12a", im12a)
                .put("im12a98", im12a98)
                .put("im14", im14)
                .put("im15", im15)
                .put("im16", im16)
                .put("im17", im17)
                .put("im18", im18)
                .put("im19", im19)
                .put("im20", im20)
                .put("im21", im21)
                .put("im22", im22)
                .put("im23", im23)
                .put("im236x", im236x)
                .put("im23a", im23a)
                .put("im24", im24)
                .put("im2417x", im2417x)
                .put("im24a", im24a)
                .put("im24b", im24b)
                .put("im24b98", im24b98)
                .put("im24c", im24c)
                .put("im24d", im24d)
                .put("im25", im25)
                .put("im26", im26);

        return json.toString();
    }


    public String sCBtoString() throws JSONException {
        Log.d(TAG, "sCBtoString: ");
        JSONObject json = new JSONObject();
        json.put("ec03", ec03)
                .put("ec04", ec04)
                .put("ec04a", ec04a)
                .put("ec05", ec05)
                .put("ec06", ec06)
                .put("ec07", ec07)
                .put("ec09", ec09)
                .put("ec11", ec11)
                .put("ec12", ec12)
                .put("ec13cline", ec13cline)
                .put("ec14cname", ec14cname)
                .put("ec18", ec18)
                .put("ec19", ec19)
                .put("ec21", ec21)
                .put("ec22", ec22)
                .put("ec2206x", ec2206x)
                .put("ec2296x", ec2296x)
                .put("cb01a", cb01a)
                .put("cb01b", cb01b)
                .put("cb02a", cb02a)
                .put("cb02b", cb02b);


        return json.toString();
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.ChildTable.COLUMN_ID, this.id);
        json.put(TableContracts.ChildTable.COLUMN_UID, this.uid);
        json.put(TableContracts.ChildTable.COLUMN_EB_CODE, this.ebCode);
        json.put(TableContracts.ChildTable.COLUMN_HHID, this.hhid);
        json.put(TableContracts.ChildTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(TableContracts.ChildTable.COLUMN_UUID, this.uuid);
        json.put(TableContracts.ChildTable.COLUMN_SNO, this.sno);
        json.put(TableContracts.ChildTable.COLUMN_USERNAME, this.userName);
        json.put(TableContracts.ChildTable.COLUMN_SYSDATE, this.sysDate);
        json.put(TableContracts.ChildTable.COLUMN_DEVICEID, this.deviceId);
        json.put(TableContracts.ChildTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(TableContracts.ChildTable.COLUMN_SYNCED, this.synced);
        json.put(TableContracts.ChildTable.COLUMN_SYNC_DATE, this.syncDate);
        json.put(TableContracts.ChildTable.COLUMN_APPVERSION, this.appver);
        json.put(TableContracts.ChildTable.COLUMN_SCH, new JSONObject(sCHtoString()));
        json.put(TableContracts.ChildTable.COLUMN_SCB, new JSONObject(sCBtoString()));
        json.put(TableContracts.ChildTable.COLUMN_SIM, new JSONObject(sIMtoString()));

        return json;
    }


    private void CaluculateAge() {
        Log.d(TAG, "CaluculateAge: " + this.cb03yy + "-" + this.cb03mm + "-" + this.cb03dd);

        if (!this.cb03yy.equals("") && !this.cb03yy.equals("9998") && !this.cb03mm.equals("") && !this.cb03dd.equals("")) {

            if ((Integer.parseInt(this.cb03mm) > 12 && !this.cb03mm.equals("98"))
                    || (Integer.parseInt(this.cb03dd) > 31 && !this.cb03dd.equals("98"))
                    || Integer.parseInt(this.cb03yy) < 1920) {
                setCb04yy("");
                setCb04mm("");
                this.ageInMonths = 0;
                return;
            }
            try {
                SimpleDateFormat df = new SimpleDateFormat("yyyy MM dd", Locale.ENGLISH);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

                // set current Date
                Calendar cur = Calendar.getInstance();
                cur.setTime(sdf.parse(form.getHh01()));// all done


                // set Date of birth
                int day = !this.cb03dd.equals("98") ? Integer.parseInt(this.cb03dd) : 15;
                int month = !this.cb03mm.equals("98") ? Integer.parseInt(this.cb03mm) : 6;
                int year = Integer.parseInt(this.cb03yy);
                Calendar cal = Calendar.getInstance();
                cal.setTime(df.parse(year + " " + month + " " + day));


//             String todayDate = df.format(Calendar.getInstance().getTime());




/*                System.out.println(df.format("Current: " + cur.getTime()));
                System.out.println(df.format("DOB: " + cal.getTime()));*/


                //long millis = System.currentTimeMillis() - cal.getTimeInMillis();
                long millis = cur.getTimeInMillis() - cal.getTimeInMillis();
                cal.setTimeInMillis(millis);

             /*   int mYear = cal.get(Calendar.YEAR)-1970;
                int mMonth = cal.get(Calendar.MONTH);
                int mDay = cal.get(Calendar.DAY_OF_MONTH)-1;

                Log.d(TAG, "CaluculateAge: " + (mYear) + "-" + mMonth + "-" + mDay);
*/
                this.ageInMonths = MILLISECONDS.toDays(millis) / 30;
                long tYear = MILLISECONDS.toDays(millis) / 365;
                long tMonth = (MILLISECONDS.toDays(millis) - (tYear * 365)) / 30;
                long tDay = MILLISECONDS.toDays(millis) - ((tYear * 365) + (tMonth * 30));

                Log.d(TAG, "CaluculateAge: Y-" + tYear + " M-" + tMonth + " D-" + tDay);
               /* setH231d(String.valueOf(tDay));
                setH231m(String.valueOf(tMonth));*/

                setCb04yy(String.valueOf(tYear));
                setCb04mm(String.valueOf(tMonth));
                if (tYear < 0) {
                    setCb04yy("");
                }
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
        }
    }

    public long getAgeInMonths() {
        return ageInMonths;
    }

    public void setAgeInMonths(long ageInMonths) {
        this.ageInMonths = ageInMonths;
    }
}
