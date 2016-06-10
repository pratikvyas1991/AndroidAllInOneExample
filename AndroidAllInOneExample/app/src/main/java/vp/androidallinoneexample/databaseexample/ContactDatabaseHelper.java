package vp.androidallinoneexample.databaseexample;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vyas on 6/9/2016.
 */
public class ContactDatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="contacts";
    public static final int DATABASE_VERSION=1;
    public static final String TABLE_NAME="mycontacts";
    public static final String CONTACT_ID="id";
    public static final String CONTACT_NAME="name";
    public static final String CONTACT_MOBILE="mobile";
    public ContactDatabaseHelper(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE="CREATE TABLE "+TABLE_NAME+"("
                +CONTACT_ID+"INTEGER PRIMARY KEY,"
                +CONTACT_NAME+"TEXT,"
                +CONTACT_MOBILE+"TEXT )";
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST "+TABLE_NAME);
        onCreate(db);
    }

    public void addContact(Contact contact){
        SQLiteDatabase database =this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(CONTACT_ID,contact.getmContactID());
        values.put(CONTACT_NAME,contact.getmContactName());
        values.put(CONTACT_MOBILE,contact.getmContactMobile());
        database.insert(TABLE_NAME,null,values);
        database.close();
    }
    public Contact getContact(int id){
        SQLiteDatabase database = this.getReadableDatabase();
        Cursor cursor=database.query(TABLE_NAME,new String[]{CONTACT_ID,CONTACT_NAME,CONTACT_MOBILE},
                                                             CONTACT_ID + "=?",
                                                             new String[]{String.valueOf(id)},
                                                             null,null,null,null);
        if(cursor!=null)
            cursor.moveToFirst();
        Contact contact = new Contact(Integer.parseInt(cursor.getString(0)),cursor.getString(1),Integer.parseInt(cursor.getString(2)));
        return contact;
    }
    public List<Contact> getAllContact(){
        List<Contact> contactList = new ArrayList<>();
        SQLiteDatabase database = this.getWritableDatabase();
        String selectQuery="SELECT * FROM "+TABLE_NAME;
        Cursor cursor = database.rawQuery(selectQuery,null);
        if(cursor.moveToFirst()){
            do {
                Contact contact = new Contact();
                contact.setmContactID(Integer.parseInt(cursor.getString(0)));
                contact.setmContactName(cursor.getString(1));
                contact.setmContactMobile(Integer.parseInt(cursor.getString(2)));
                contactList.add(contact);
            }while(cursor.moveToNext());
        }
        return contactList;
    }
    public int updateContact(Contact contact){
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(CONTACT_NAME,contact.getmContactName());
        values.put(CONTACT_MOBILE,contact.getmContactMobile());
        int rVal=database.update(TABLE_NAME,values,CONTACT_ID + "=?",new String[]{String.valueOf(contact.getmContactID())});
        return rVal;
    }

    public void deleteContact(Contact contact){
        SQLiteDatabase database= this.getWritableDatabase();
        database.delete(TABLE_NAME,CONTACT_ID + "=?",new String[]{String.valueOf(contact.getmContactID())});
        database.close();
    }
    public int countContacts(){
        SQLiteDatabase database=this.getWritableDatabase();
        String selectQuery="SELECT * FROM "+TABLE_NAME;
        Cursor cursor=database.rawQuery(selectQuery,null);
        cursor.close();
        return cursor.getCount();
    }
}
