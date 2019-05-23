package com.mkyong.rest;
 
import java.util.List;
 
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
import org.o7planning.restfulcrud.dao.HoroscopoDAO;
import org.o7planning.restfulcrud.model.Horoscopo;
 
@Path("/horoscopo")
public class HoroscopoService {
 
    // URI:
    // /contextPath/servletPath/employees
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<Horoscopo> getSensores_JSON() {
        List<Horoscopo> listahoroscopo = HoroscopoDAO.getAllDatosHoroscopo();
        return listahoroscopo;
    }
 
    // URI:
    // /contextPath/servletPath/employees/{empNo}
    @GET
    @Path("/{signo}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Horoscopo getSensor(@PathParam("signo") String signo) {
        return HoroscopoDAO.getDatosHoroscopo(signo);
    }
 
    // URI:
    // /contextPath/servletPath/employees
    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Horoscopo addDatoSensor(Horoscopo sensor) {
        return HoroscopoDAO.addDatosHoroscopo(sensor);
    }
 
    // URI:
    // /contextPath/servletPath/employees
    @PUT
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Horoscopo updateDatoSensor(Horoscopo emp) {
        return HoroscopoDAO.updateDatosHoroscopo(emp);
    }
 
//    @DELETE
//    @Path("/{id}")
//    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
//    public void deleteDatoSensor(@PathParam("id") String id) {
//        SensorDAO.deleteDatoSensor(id);
//    }
// 
}