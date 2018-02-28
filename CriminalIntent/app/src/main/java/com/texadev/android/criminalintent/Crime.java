package com.texadev.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Bill on 2/24/2018.
 */

public class Crime {
    private UUID mId;
    private String mTitle;

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    private Date mDate;
    private boolean mSolved;

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Crime() {
        // Generate a random UID
        mId = UUID.randomUUID();
        mDate = new Date();

    }
}
