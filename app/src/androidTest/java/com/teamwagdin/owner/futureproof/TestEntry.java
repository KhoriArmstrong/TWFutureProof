package com.teamwagdin.owner.futureproof;

import android.test.AndroidTestCase;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by Owner on 28/01/2015.
 */
public class TestEntry extends AndroidTestCase {
    public void testCreateEntry() {
        Entry e = new Entry();
        //
        assertNotNull(e);
    }
}
