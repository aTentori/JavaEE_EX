package service;

import dao.Appointments_dao;
import dto.Appointment;

import java.util.List;

public class Appointments_Service {

    private Appointments_dao dao = new Appointments_dao();



    public List<Appointment> getAppointments(){

        return dao.getAppointments();
    }


}
