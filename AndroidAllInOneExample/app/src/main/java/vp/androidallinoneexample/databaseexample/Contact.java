package vp.androidallinoneexample.databaseexample;

/**
 * Created by Vyas on 6/9/2016.
 */
public class Contact {
    private int mContactID;
    private String mContactName;
    private int mContactMobile;

    public Contact() {
    }
    public Contact(int mContactID, String mContactName, int mContactMobile) {
        this.mContactID = mContactID;
        this.mContactName = mContactName;
        this.mContactMobile = mContactMobile;
    }

    public int getmContactID() {
        return mContactID;
    }

    public void setmContactID(int mContactID) {
        this.mContactID = mContactID;
    }

    public String getmContactName() {
        return mContactName;
    }

    public void setmContactName(String mContactName) {
        this.mContactName = mContactName;
    }

    public int getmContactMobile() {
        return mContactMobile;
    }

    public void setmContactMobile(int mContactMobile) {
        this.mContactMobile = mContactMobile;
    }
}
