package com.example.cucho.barando;

import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cucho on 26-May-17.
 */

public class Bar {
    protected Integer id;
    protected String name;
    protected BarLocation location;
    protected String description;
    protected List<Promo> promos[];
    protected List <String> paymentMethods[];
    protected TimeRange happyHour;
    protected TimeRange openTime;

    public BarLocation getLocation() {
        return location;
    }

    protected Integer imgId;

    public Bar() {
    }

    protected List <String> commodities[];


    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TimeRange getHappyHour() {
        return happyHour;
    }

    public void setHappyHour(TimeRange happyHour) {
        this.happyHour = happyHour;
    }

    public TimeRange getOpenTime() {
        return openTime;
    }

    public void setOpenTime(TimeRange openTime) {
        this.openTime = openTime;
    }

    public Bar(Integer id) {
        this.id = id;
    }

    public void setLocation(BarLocation location) { this.location = location; }
}
