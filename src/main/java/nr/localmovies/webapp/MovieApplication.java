package nr.localmovies.webapp;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/open")
public class MovieApplication extends Application {
    private HashSet<Object> singletons = new HashSet<Object>();

    public MovieApplication(){
        singletons.add(new UtilityEndpoints());
    }

    @Override
    public Set<Class<?>> getClasses(){
        return new HashSet<Class<?>>();
    }

    @Override
    public Set<Object> getSingletons(){
        return singletons;
    }
}
