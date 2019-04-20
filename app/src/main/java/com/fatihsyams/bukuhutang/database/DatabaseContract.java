package com.fatihsyams.bukuhutang.database;

import android.provider.BaseColumns;

public class DatabaseContract {
    static final class NotesColums implements BaseColumns{
        static final String TABLE_NAME = "note";

        // judul

        static final String TITLE = "title";

        //konten
        static final String DESCRIPTION = "description";

        //date

        static final String DATE = "date";
    }
}
