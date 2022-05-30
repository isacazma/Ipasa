package setup;



import org.glassfish.jersey.server.ResourceConfig;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("Ipas/gymalmere")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("IpasBackendTwee.Ipas.webservices");
    }
}

