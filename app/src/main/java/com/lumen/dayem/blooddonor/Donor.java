package com.lumen.dayem.blooddonor;

import android.widget.Spinner;

/**
 * Created by dayem on 3/4/2018.
 */

public class Donor {
    private String name;
    private String number;
    private String blood;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public Donor(String name, String number, String blood) {

        this.name = name;
        this.number = number;
        this.blood = blood;
    }
}
