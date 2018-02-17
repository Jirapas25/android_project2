
package com.example.project_demo.bookingclinicapp.Models;

import java.util.List;

public class ClinicDataModel {

    private String clinic_id;
    private String clinic_name;
    private String clinic_email;
    private String clinic_phone;
    private String clinic_address;
    private String clinic_image;
    private List<Staff> staff = null;
    private List<String> work_hour = null;
    private Location location;
    private Time_slot time_slot;
    private List<Closed_time> closed_time = null;

    public String getClinic_id() {
        return clinic_id;
    }

    public void setClinic_id(String clinic_id) {
        this.clinic_id = clinic_id;
    }

    public String getClinic_name() {
        return clinic_name;
    }

    public void setClinic_name(String clinic_name) {
        this.clinic_name = clinic_name;
    }

    public String getClinic_email() {
        return clinic_email;
    }

    public void setClinic_email(String clinic_email) {
        this.clinic_email = clinic_email;
    }

    public String getClinic_phone() {
        return clinic_phone;
    }

    public void setClinic_phone(String clinic_phone) {
        this.clinic_phone = clinic_phone;
    }

    public String getClinic_address() {
        return clinic_address;
    }

    public void setClinic_address(String clinic_address) {
        this.clinic_address = clinic_address;
    }

    public String getClinic_image() {
        return clinic_image;
    }

    public void setClinic_image(String clinic_image) {
        this.clinic_image = clinic_image;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    public List<String> getWork_hour() {
        return work_hour;
    }

    public void setWork_hour(List<String> work_hour) {
        this.work_hour = work_hour;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Time_slot getTime_slot() {
        return time_slot;
    }

    public void setTime_slot(Time_slot time_slot) {
        this.time_slot = time_slot;
    }

    public List<Closed_time> getClosed_time() {
        return closed_time;
    }

    public void setClosed_time(List<Closed_time> closed_time) {
        this.closed_time = closed_time;
    }

}
