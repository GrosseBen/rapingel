package de.grossesippe.rapingel.resources;


import ch.qos.logback.core.util.FileUtil;
import com.codahale.metrics.annotation.Timed;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import de.grossesippe.rapingel.core.AudioBell;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@Path("/DoorBell")
@Produces(MediaType.TEXT_HTML)
public class DoorBell {



    // ToDo: sollte aber Put sein? oder?
    @POST
    @Timed
    public void  ringing() {
        AudioBell bell = new AudioBell();
        try {
            bell.ring();
        }
        catch (Throwable e){
            e.printStackTrace();
        }
        System.out.println("Ding Dong");
    }

    @GET
    @Timed
    public String getText() throws IOException{
        ClassLoader classLoader = getClass().getClassLoader();
        String htmlPage;
        htmlPage = readFile(classLoader.getResource("PressToRing.html").getFile());
        return  htmlPage;
    }

    private String readFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            return sb.toString();
        } finally {
            br.close();
        }
    }
}