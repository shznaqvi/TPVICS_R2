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
    private String im01 = _EMPTY_;
    private String im02 = _EMPTY_;
    private String im02a = _EMPTY_;
    private String im02a96x = _EMPTY_;
    private String im03 = _EMPTY_;
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
    private String im07 = _EMPTY_;
    private String im08 = _EMPTY_;
    private String im09 = _EMPTY_;
    private String im10 = _EMPTY_;
    private String im11 = _EMPTY_;
    private String im12 = _EMPTY_;
    private String im12a = _EMPTY_;
    private String im14 = _EMPTY_;
    private String im15 = _EMPTY_;
    private String im16 = _EMPTY_;
    private String im17 = _EMPTY_;
    private String im18 = _EMPTY_;
    private String im19 = _EMPTY_;
    private String im20 = _EMPTY_;
    private String im21 = _EMPTY_;
    private String im22 = _EMPTY_;
    private String im23 = _EMPTY_;
    private String im23_6x = _EMPTY_;
    private String im23a = _EMPTY_;
    private String im24 = _EMPTY_;
    private String im24_17x = _EMPTY_;
    private String im24a = _EMPTY_;
    private String im24b = _EMPTY_;
    private String im24c = _EMPTY_;
    private String im24d = _EMPTY_;
    private String im25 = _EMPTY_;



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
    public String getPsuCode() {
        return psuCode;
    }

    public void setPsuCode(String psuCode) {
        this.psuCode = psuCode;
        notifyPropertyChanged(BR.psuCode);
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
    public String getIm01() {
        return im01;
    }

    public void setIm01(String im01) {
        this.im01 = im01;
        setIm02(im01.equals("1") ? this.im02 : "");
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
        notifyPropertyChanged(BR.im02);
    }

    @Bindable
    public String getIm02a() {
        return im02a;
    }

    public void setIm02a(String im02a) {
        this.im02a = im02a;
        setIm02a96x(im02a.equals("96") ? this.im02a96x : ""); // for all skips, mention all skipped questions
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
        notifyPropertyChanged(BR.im03);
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
        this.im0497 = im0497;
        notifyPropertyChanged(BR.im0497);
    }

    @Bindable
    public String getIm0501dd() {
        return im0501dd;
    }

    public void setIm0501dd(String im0501dd) {
        this.im0501dd = im0501dd;
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
    public String getIm14() {
        return im14;
    }

    public void setIm14(String im14) {
        this.im14 = im14;
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
    public String getIm23() {
        return im23;
    }

    public void setIm23(String im23) {
        this.im23 = im23;
        notifyPropertyChanged(BR.im23);
    }

    @Bindable
    public String getIm23_6x() {
        return im23_6x;
    }

    public void setIm23_6x(String im23_6x) {
        this.im23_6x = im23_6x;
        notifyPropertyChanged(BR.im23_6x);
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
    public String getIm24_17x() {
        return im24_17x;
    }

    public void setIm24_17x(String im24_17x) {
        this.im24_17x = im24_17x;
        notifyPropertyChanged(BR.im24_17x);
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


            this.im01 = json.getString("im01");
            this.im02 = json.getString("im02");
            this.im02a = json.getString("im02a");
            this.im02a96x = json.getString("im02a96x");
            this.im03 = json.getString("im03");
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
            this.im07 = json.getString("im07");
            this.im08 = json.getString("im08");
            this.im09 = json.getString("im09");
            this.im10 = json.getString("im10");
            this.im11 = json.getString("im11");
            this.im12 = json.getString("im12");
            this.im12a = json.getString("im12a");
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
            this.im23_6x = json.getString("im23_6x");
            this.im23a = json.getString("im23a");
            this.im24 = json.getString("im24");
            this.im24_17x = json.getString("im24_17x");
            this.im24a = json.getString("im24a");
            this.im24b = json.getString("im24b");
            this.im24c = json.getString("im24c");
            this.im24d = json.getString("im24d");
            this.im25 = json.getString("im25");



        }
    }

    public String sIMtoString() throws JSONException {
        Log.d(TAG, "sIMtoString: ");
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
                .put("cb02b", cb02b)
                .put("im01", im01)
                .put("im02", im02)
                .put("im02a", im02a)
                .put("im02a96x", im02a96x)
                .put("im03", im03)
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
                .put("im07", im07)
                .put("im08", im08)
                .put("im09", im09)
                .put("im10", im10)
                .put("im11", im11)
                .put("im12", im12)
                .put("im12a", im12a)
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
                .put("im23_6x", im23_6x)
                .put("im23a", im23a)
                .put("im24", im24)
                .put("im24_17x", im24_17x)
                .put("im24a", im24a)
                .put("im24b", im24b)
                .put("im24c", im24c)
                .put("im24d", im24d)
                .put("im25", im25);


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
