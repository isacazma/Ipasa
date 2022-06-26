package webservices;

import model.Product;
import model.ProductnameRequest;

import javax.ws.rs.Consumes;
import javax.ws.rs.PATCH;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.AbstractMap;

@Path("product")
public class ProductResource {
    @PATCH
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response changeproductname(ProductnameRequest requestData){
        for(Product product : Product.getAllProducts()){
            if(product.getName().equals(requestData.oldname) ){


                product.setProductName(requestData.newName);
                return Response.ok(product).build();
            }
        }
        return Response.status(500)
                .entity(new AbstractMap.SimpleEntry<>("error", "PRODUCT BESTAAT NIET"))
                .build();
    }
}
