package api;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import java.util.Set;

@ApplicationPath("/api")
public class ApiApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        resources.add(ApiResource.class);
        resources.add(ApiExceptionHandler.class);
        // Add other resources later
        return resources;
    }
}
