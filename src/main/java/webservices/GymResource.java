package webservices;
import javax.json.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.StringReader;
import java.util.List;
@Path("/lessen")
public class GymResource {

@GET
@Produces(MediaType.APPLICATION_JSON)
    public  String getGeboekeZonnebanken(){ return "moet nog af";}



}
