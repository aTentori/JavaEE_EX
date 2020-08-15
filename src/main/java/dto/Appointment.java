package dto;

import java.io.Serializable;
import java.util.Date;

public class Appointment implements Serializable {

    private int ID;
    private String appointName;
    private Date appointDate;

    public Appointment(int ID, String appointName, Date appointDate) {
        this.ID = ID;
        this.appointName = appointName;
        this.appointDate = appointDate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAppointName() {
        return appointName;
    }

    public void setAppointName(String appointName) {
        this.appointName = appointName;
    }

    public Date getAppointDate() {
        return appointDate;
    }

    public void setAppointDate(Date appointDate) {
        this.appointDate = appointDate;
    }
}
