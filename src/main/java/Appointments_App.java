import web.Appointments_Control;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class Appointments_App extends Application {

    private Set<Object> singletons = new HashSet<>();

    public Appointments_App(){
        singletons.add(new Appointments_Control());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
