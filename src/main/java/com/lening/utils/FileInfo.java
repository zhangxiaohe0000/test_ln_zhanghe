package com.lening.utils;

public class FileInfo {

    private boolean flag;
    private String msg;
    private String imgAddress;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getImgAddress() {
        return imgAddress;
    }

    public void setImgAddress(String imgAddress) {
        this.imgAddress = imgAddress;
    }

    public FileInfo() {
    }

    public FileInfo(boolean flag, String msg, String imgAddress) {
        this.flag = flag;
        this.msg = msg;
        this.imgAddress = imgAddress;
    }
}
