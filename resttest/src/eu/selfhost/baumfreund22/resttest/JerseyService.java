package eu.selfhost.baumfreund22.resttest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

//http://localhost:8080/JerseyDemos/rest/message

@Path("/message")
public class JerseyService
{
    @GET
    public String getMsg()
    {
         return "Hello World !! - Jersey 2";
    }
}