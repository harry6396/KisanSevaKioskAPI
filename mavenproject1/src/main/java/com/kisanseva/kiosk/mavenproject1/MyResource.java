package com.kisanseva.kiosk.mavenproject1;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("myresource")
public class MyResource {

    @GET
    @Path("/post1/{param}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getIt(String param) {
        return "{'friends': ['Michael', 'Tom', 'Daniel', 'John', 'Nick']}";
        
    }
    
    @POST
    @Path("/post/{param}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveData(String param){
        String result = "Data post: "+param;
        return Response.status(201).entity(result).build(); 
    }
}
