package com.example.cucho.barando;

/**
 * Created by Cucho on 26-May-17.
 */

class TimeRange {
    Integer startHours;
    Integer startMinutes;
    Integer endHours;

    public Integer getStartHours() {
        return startHours;
    }

    public void setStartHours(Integer startHours) {
        this.startHours = startHours;
    }

    public Integer getStartMinutes() {
        return startMinutes;
    }

    public void setStartMinutes(Integer startMinutes) {
        this.startMinutes = startMinutes;
    }

    public Integer getEndHours() {
        return endHours;
    }

    public void setEndHours(Integer endHours) {
        this.endHours = endHours;
    }

    public Integer getEndMinutes() {
        return endMinutes;
    }

    public void setEndMinutes(Integer endMinutes) {
        this.endMinutes = endMinutes;
    }

    Integer endMinutes;

    public TimeRange(){}

    public String getStartTime(){
        return startHours+":"+startMinutes;
    }
    public String getEndTime(){
        return endHours+":"+endMinutes;
    }

    public TimeRange(Integer startHours, Integer startMinutes, Integer endHours, Integer endMinutes) {
        this.startHours = startHours;
        this.startMinutes = startMinutes;
        this.endHours = endHours;
        this.endMinutes = endMinutes;
    }
}
