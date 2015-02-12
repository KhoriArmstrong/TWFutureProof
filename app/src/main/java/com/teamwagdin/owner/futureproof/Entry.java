package com.teamwagdin.owner.futureproof;

import java.util.Date;

/**
 * Created by Owner on 29/01/2015.
 */
public class Entry {
    public String message;
    public Date createDate;
    public Date targetDate;

    public Entry() {
        message = "";
        createDate = new Date();
        targetDate = new Date();
    }
    /*
    public Entry(String thisMessage, new Date()) {
        Date Q = new Date(System.currentTimeMillis());
    }
    */
}
