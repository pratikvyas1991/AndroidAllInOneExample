package vp.androidallinoneexample.databaseexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import vp.androidallinoneexample.R;

/**
 * Created by Vyas on 6/9/2016.
 */
public class ContactInsertActivity extends Activity {
    EditText mContactID,mContactName,mContactMobile;
    Button mInsertButton;
    Contact contact;
    int contactID,contactMobile;
    ContactDatabaseHelper helper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.database_layout_insert);
        mContactID=(EditText)findViewById(R.id.contact_id);
        mContactName=(EditText)findViewById(R.id.contact_name);
        mContactMobile=(EditText)findViewById(R.id.contact_mobile);
        mInsertButton=(Button)findViewById(R.id.contact_insert);
        contact = new Contact();
        helper = new ContactDatabaseHelper(this);
//        contactID=Integer.parseInt(mContactID.getText().toString());
        contactID=12;
        Toast.makeText(getApplicationContext(),"Val : "+contactID,Toast.LENGTH_LONG).show();
//        contact.setmContactID(Integer.parseInt(mContactID.getText().toString()));
//        contact.setmContactName(String.valueOf(mContactName.getText()));
//        contact.setmContactMobile(Integer.parseInt(mContactMobile.getText().toString()));
//        helper.addContact(contact);
//        int count=helper.countContacts();
//        if(count>0){
//            Toast.makeText(getApplicationContext(),"Record insertd !!!",Toast.LENGTH_LONG).show();
//            Toast.makeText(getApplicationContext(),"Record Count = "+count,Toast.LENGTH_LONG).show();
//        }else{
//            Toast.makeText(getApplicationContext(),"Record Nnot insrted !!!",Toast.LENGTH_LONG).show();
//        }

    }
}
