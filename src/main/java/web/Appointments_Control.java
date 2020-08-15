package web;

import dto.Appointment;
import service.Appointments_Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/appointments")
    public class Appointments_Control {

        private Appointments_Service service = new Appointments_Service();

        @GET
        @Produces(MediaType.APPLICATION_JSON)
        public List<Appointment> test (){
            return service.getAppointments();
        }

}
