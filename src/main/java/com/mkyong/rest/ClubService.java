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

import org.o7planning.restfulcrud.dao.*;
import org.o7planning.restfulcrud.model.*;

@Path("/Club")
public class ClubService {

    // URI:
    // /contextPath/servletPath/employees
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Club> getClub_JSON() {
        List<Club> lista = ClubDAO.getAllDatosClub();
        return lista;
    }

    // URI:
    // /contextPath/servletPath/employees
    @GET
    @Path("/Juego")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Juego> getJuegos_JSON() {
        List<Juego> lista = JuegoDAO.getAllDatosJuego();
        return lista;
    }

    // URI:
    // /contextPath/servletPath/employees
    @GET
    @Path("/Evento")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Evento> getEventos_JSON() {
        List<Evento> lista = EventoDAO.getAllDatosEvento();
        return lista;
    }

    // URI:
    // /contextPath/servletPath/employees
    @GET
    @Path("/Manualidad")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Manualidad> getManualidades_JSON() {
        List<Manualidad> lista = ManualidadDAO.getAllDatosManualidad();
        return lista;
    }

    // URI:
    // /contextPath/servletPath/employees
    @GET
    @Path("/Servicio")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Servicio> getServicios_JSON() {
        List<Servicio> lista = ServicioDAO.getAllDatosServicio();
        return lista;
    }

    // URI:
    // /contextPath/servletPath/employees/{empNo}
    @GET
    @Path("/{signo}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Horoscopo getSensor(@PathParam("signo") String signo) {
        return HoroscopoDAO.getDatosHoroscopo(signo);
    }

    // URI:
    // /contextPath/servletPath/employees
    @POST
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Horoscopo addDatoSensor(Horoscopo sensor) {
        return HoroscopoDAO.addDatosHoroscopo(sensor);
    }

    // URI:
    // /contextPath/servletPath/employees
    @PUT
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
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
