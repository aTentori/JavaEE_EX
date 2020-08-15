package dao;

import dto.Appointment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Appointments_dao {

    public List<Appointment> getAppointments(){

        List<Appointment> results = new ArrayList<>();

        results.add(new Appointment(1, "Meeting", new Date()));
        results.add(new Appointment(2,  "Lunch", new Date()));
        results.add(new Appointment(3, "Doctors", new Date()));

        return results;

    }


}
