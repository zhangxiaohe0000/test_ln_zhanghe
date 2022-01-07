package com.lening.entity;

public class Inspect {
    private Integer oid;
    private String uid;
    private String ostatus;
    private Integer sid;
    private double oprice;
    private String oinspectstatus;
    private String otime;
    private Integer tid;
    private String sname;
    private String sage;
    private String sfitsex;
    private double sprice;
    private String timesection;
    private String uname;
    private Integer uage;
    private String usex;
    private String uphone;
    private String uidcard;
    private String ucreattime;
    private double minSprice;
    private double maxSprice;

    public double getMaxSprice() {
        return maxSprice;
    }

    public void setMaxSprice(double maxSprice) {
        this.maxSprice = maxSprice;
    }

    public double getMinSprice() {
        return minSprice;
    }

    public void setMinSprice(double minSprice) {
        this.minSprice = minSprice;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getOstatus() {
        return ostatus;
    }

    public void setOstatus(String ostatus) {
        this.ostatus = ostatus;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public double getOprice() {
        return oprice;
    }

    public void setOprice(double oprice) {
        this.oprice = oprice;
    }

    public String getOinspectstatus() {
        return oinspectstatus;
    }

    public void setOinspectstatus(String oinspectstatus) {
        this.oinspectstatus = oinspectstatus;
    }

    public String getOtime() {
        return otime;
    }

    public void setOtime(String otime) {
        this.otime = otime;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSage() {
        return sage;
    }

    public void setSage(String sage) {
        this.sage = sage;
    }

    public String getSfitsex() {
        return sfitsex;
    }

    public void setSfitsex(String sfitsex) {
        this.sfitsex = sfitsex;
    }

    public double getSprice() {
        return sprice;
    }

    public void setSprice(double sprice) {
        this.sprice = sprice;
    }

    public String getTimesection() {
        return timesection;
    }

    public void setTimesection(String timesection) {
        this.timesection = timesection;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getUage() {
        return uage;
    }

    public void setUage(Integer uage) {
        this.uage = uage;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getUidcard() {
        return uidcard;
    }

    public void setUidcard(String uidcard) {
        this.uidcard = uidcard;
    }

    public String getUcreattime() {
        return ucreattime;
    }

    public void setUcreattime(String ucreattime) {
        this.ucreattime = ucreattime;
    }

    @Override
    public String toString() {
        return "Inspect{" +
                "oid=" + oid +
                ", uid='" + uid + '\'' +
                ", ostatus='" + ostatus + '\'' +
                ", sid=" + sid +
                ", oprice=" + oprice +
                ", oinspectstatus='" + oinspectstatus + '\'' +
                ", otime='" + otime + '\'' +
                ", tid=" + tid +
                ", sname='" + sname + '\'' +
                ", sage='" + sage + '\'' +
                ", sfitsex='" + sfitsex + '\'' +
                ", sprice=" + sprice +
                ", timesection='" + timesection + '\'' +
                ", uname='" + uname + '\'' +
                ", uage=" + uage +
                ", usex='" + usex + '\'' +
                ", uphone='" + uphone + '\'' +
                ", uidcard='" + uidcard + '\'' +
                ", ucreattime='" + ucreattime + '\'' +
                ", minSprice=" + minSprice +
                ", maxSprice=" + maxSprice +
                '}';
    }
}
