package com.teamwagdin.owner.futureproof;

import android.test.AndroidTestCase;

import com.teamwagdin.owner.futureproof.EntryDatabase;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by Owner on 29/01/2015.
 */
public class TestEntryDatabase extends AndroidTestCase {
    public void testCreateEntryDatabase() {
        EntryDatabase ed = EntryDatabase.createInstance();
        //
        assertNotNull(ed);
    }

    public void testEntryDatabaseIsSingleton() {
        EntryDatabase ed1 = EntryDatabase.createInstance();
        EntryDatabase ed2 = EntryDatabase.createInstance();
        //
        assertEquals(ed1, ed2);
    }

    public void testAddNewEntry() {
        EntryDatabase ed = EntryDatabase.createInstance();
        Entry e = new Entry();
        //
        ed.add(e);
        //
        assertTrue(ed.getAllEntries().size() != 0);
    }
}
