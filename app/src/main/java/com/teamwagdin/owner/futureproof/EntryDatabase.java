package com.teamwagdin.owner.futureproof;

import java.util.List;

import java.util.ArrayList;

/**
 * Created by Owner on 29/01/2015.
 */
public class EntryDatabase {
    public static EntryDatabase _entryDatabase;
    public static EntryDatabase createInstance() {
        if (_entryDatabase == null) { _entryDatabase = new EntryDatabase(); }
        //
        return _entryDatabase;
    }

    private ArrayList<Entry> allEntries;
    private EntryDatabase() {
        allEntries = new ArrayList<Entry>();
    }


    public void add(Entry thisEntry) {
        allEntries.add(thisEntry);
    }


    public List getAllEntries() {
        return allEntries;
    }
}
