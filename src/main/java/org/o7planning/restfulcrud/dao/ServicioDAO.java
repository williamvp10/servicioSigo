package org.o7planning.restfulcrud.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.o7planning.restfulcrud.model.*;

public class ServicioDAO {

    private static final Map<String, Servicio> empMap = new HashMap<String, Servicio>();

    static {
        initEmps();
    }

    private static void initEmps() {
        Servicio servicio = new Servicio();
        servicio.setNombre("Recreación con dos recreadores");
        servicio.setDescripcion("recreador para el evento");
        servicio.setUrl("https://www.idrd.gov.co/sites/default/files/documentosidrd/imagenes/pestiparque_quintaparedes-9.jpg");
        empMap.put(servicio.getNombre(), servicio);
        servicio = new Servicio();
        servicio.setNombre("Recreación multiple recreadores");
        servicio.setDescripcion("multiples recreadores para el evento");
        servicio.setUrl("https://www.idrd.gov.co/sites/default/files/documentosidrd/imagenes/pestiparque_quintaparedes-9.jpg");
        empMap.put(servicio.getNombre(), servicio);
    }

    public static Servicio getDatosServicio(String id) {
        return empMap.get(id);
    }

//    public static Servicio addDatosServicio(Servicio Servicio) {
//        empMap.put(Servicio.getNombre(), Servicio);
//        return Servicio;
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

    public static List<Servicio> getAllDatosServicio() {
        Collection<Servicio> c = empMap.values();
        List<Servicio> list = new ArrayList<Servicio>();
        list.addAll(c);
        return list;
    }

    List<Servicio> list;

}
