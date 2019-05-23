package org.o7planning.restfulcrud.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.o7planning.restfulcrud.model.*;

public class EventoDAO {

    private static final Map<String, Evento> empMap = new HashMap<String, Evento>();

    static {
        initEmps();
    }

    private static void initEmps() {
        Evento a = new Evento();
        a.setNombre("Torneo Futbolin");
        a.setFecha("Sabado 28 de Septiembre");
        a.setUrl("https://www.zizurardoi.com/wp-content/uploads/2018/05/futbolin-zizur-660x330.jpg");
        empMap.put(a.getNombre(), a);
        a = new Evento();
        a.setNombre("Busqueda del Tesoro");
        a.setFecha("Domingo 26 de Mayo");
        a.setUrl("http://www.elcuriosity.com/wp-content/uploads/2015/02/mapa-del-tesoro.jpg");
        empMap.put(a.getNombre(), a);
        a = new Evento();
        a.setNombre("Cuerda");
        a.setFecha("Sabado 31 Agosto");
        a.setUrl("https://i.ytimg.com/vi/bqhg0Jrw70g/hqdefault.jpg");
        empMap.put(a.getNombre(), a);
    }

    public static Evento getDatosEvento(String id) {
        return empMap.get(id);
    }

//    public static Evento addDatosEvento(Evento Evento) {
//        empMap.put(Evento.getNombre(), Evento);
//        return Evento;
//    }
//
//    public static Horoscopo updateDatosHoroscopo(Horoscopo horosocopo) {
//        empMap.put(horosocopo.getSunsing(), horosocopo);
//        return horosocopo;
//    }
//
//    public static void deleteDatosHoroscopo(String id) {
//        empMap.remove(id);
//    }
    public static List<Evento> getAllDatosEvento() {
        Collection<Evento> c = empMap.values();
        List<Evento> list = new ArrayList<Evento>();
        list.addAll(c);
        return list;
    }

    List<Evento> list;

}
