package com.teamwagdin.owner.futureproof;

import android.content.Context;
import android.content.Intent;
import android.test.AndroidTestCase;

/**
 * Created by yangjiachang on 15-02-11.
 */
public class TestEntryAlarm extends AndroidTestCase {
    public void testEntryAlarm() {
        Context c = this.getContext();
        //
        TimeChecker tc = new TimeChecker(new EntryDate(EntryDate.AUGUST,19,1990,0,0),
                new EntryDate(EntryDate.AUGUST,19,1990,0,1));
        MyNotification mn = new MyNotification(c, new Intent(c,TestEntryAlarm.class));
        //
        EntryAlarm ea = new EntryAlarm(tc,mn);
        //
        assertNotNull(ea);

    }
}
