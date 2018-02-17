
package com.example.project_demo.bookingclinicapp.Models;

import java.util.List;

public class Time_slot {

    private List<String> mon = null;
    private List<String> tue = null;
    private List<String> wed = null;
    private List<String> thu = null;
    private List<String> fri = null;
    private List<String> sat = null;
    private List<String> sun = null;
    private Integer hours_scale;
    private Integer book_per_slot;

    public List<String> getMon() {
        return mon;
    }

    public void setMon(List<String> mon) {
        this.mon = mon;
    }

    public List<String> getTue() {
        return tue;
    }

    public void setTue(List<String> tue) {
        this.tue = tue;
    }

    public List<String> getWed() {
        return wed;
    }

    public void setWed(List<String> wed) {
        this.wed = wed;
    }

    public List<String> getThu() {
        return thu;
    }

    public void setThu(List<String> thu) {
        this.thu = thu;
    }

    public List<String> getFri() {
        return fri;
    }

    public void setFri(List<String> fri) {
        this.fri = fri;
    }

    public List<String> getSat() {
        return sat;
    }

    public void setSat(List<String> sat) {
        this.sat = sat;
    }

    public List<String> getSun() {
        return sun;
    }

    public void setSun(List<String> sun) {
        this.sun = sun;
    }

    public Integer getHours_scale() {
        return hours_scale;
    }

    public void setHours_scale(Integer hours_scale) {
        this.hours_scale = hours_scale;
    }

    public Integer getBook_per_slot() {
        return book_per_slot;
    }

    public void setBook_per_slot(Integer book_per_slot) {
        this.book_per_slot = book_per_slot;
    }

}
