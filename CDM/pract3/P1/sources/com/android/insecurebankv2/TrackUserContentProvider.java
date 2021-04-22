package com.android.insecurebankv2;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import java.util.HashMap;

public class TrackUserContentProvider extends ContentProvider {
    static final Uri CONTENT_URI = Uri.parse(URL);
    static final String CREATE_DB_TABLE = " CREATE TABLE names (id INTEGER PRIMARY KEY AUTOINCREMENT,  name TEXT NOT NULL);";
    static final String DATABASE_NAME = "mydb";
    static final int DATABASE_VERSION = 1;
    static final String PROVIDER_NAME = "com.android.insecurebankv2.TrackUserContentProvider";
    static final String TABLE_NAME = "names";
    static final String URL = "content://com.android.insecurebankv2.TrackUserContentProvider/trackerusers";
    static final String name = "name";
    static final int uriCode = 1;
    static final UriMatcher uriMatcher = new UriMatcher(-1);
    private static HashMap<String, String> values;
    private SQLiteDatabase db;

    static {
        uriMatcher.addURI(PROVIDER_NAME, "trackerusers", 1);
        uriMatcher.addURI(PROVIDER_NAME, "trackerusers/*", 1);
    }

    public int delete(Uri uri, String selection, String[] selectionArgs) {
        switch (uriMatcher.match(uri)) {
            case 1:
                int count = this.db.delete(TABLE_NAME, selection, selectionArgs);
                getContext().getContentResolver().notifyChange(uri, null);
                return count;
            default:
                throw new IllegalArgumentException("Unknown URI " + uri);
        }
    }

    public String getType(Uri uri) {
        switch (uriMatcher.match(uri)) {
            case 1:
                return "vnd.android.cursor.dir/u";
            default:
                throw new IllegalArgumentException("Unsupported URI: " + uri);
        }
    }

    public Uri insert(Uri uri, ContentValues values2) {
        long rowID = this.db.insert(TABLE_NAME, "", values2);
        if (rowID > 0) {
            Uri _uri = ContentUris.withAppendedId(CONTENT_URI, rowID);
            getContext().getContentResolver().notifyChange(_uri, null);
            return _uri;
        }
        throw new SQLException("Failed to add a record into " + uri);
    }

    public boolean onCreate() {
        this.db = new DatabaseHelper(getContext()).getWritableDatabase();
        if (this.db != null) {
            return true;
        }
        return false;
    }

    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
        qb.setTables(TABLE_NAME);
        switch (uriMatcher.match(uri)) {
            case 1:
                qb.setProjectionMap(values);
                if (sortOrder == null || sortOrder == "") {
                    sortOrder = name;
                }
                Cursor c = qb.query(this.db, projection, selection, selectionArgs, null, null, sortOrder);
                c.setNotificationUri(getContext().getContentResolver(), uri);
                return c;
            default:
                throw new IllegalArgumentException("Unknown URI " + uri);
        }
    }

    public int update(Uri uri, ContentValues values2, String selection, String[] selectionArgs) {
        switch (uriMatcher.match(uri)) {
            case 1:
                int count = this.db.update(TABLE_NAME, values2, selection, selectionArgs);
                getContext().getContentResolver().notifyChange(uri, null);
                return count;
            default:
                throw new IllegalArgumentException("Unknown URI " + uri);
        }
    }

    private static class DatabaseHelper extends SQLiteOpenHelper {
        DatabaseHelper(Context context) {
            super(context, TrackUserContentProvider.DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
        }

        public void onCreate(SQLiteDatabase db) {
            db.execSQL(TrackUserContentProvider.CREATE_DB_TABLE);
        }

        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS names");
            onCreate(db);
        }
    }
}
