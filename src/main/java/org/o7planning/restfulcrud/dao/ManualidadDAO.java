package org.o7planning.restfulcrud.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.o7planning.restfulcrud.model.*;

public class ManualidadDAO {

    private static final Map<String, Manualidad> empMap = new HashMap<String, Manualidad>();

    static {
        initEmps();
    }

    private static void initEmps() {
        Manualidad a = new Manualidad();
        a.setNombre("Portarretrato");
        a.setDescripcion("portarretratos en foami");
        a.setUrl("https://www.puntodesign.com.uy/content/images/thumbs/0022893_portaretratos-natrual-13x18-simple_600.jpeg");
        empMap.put(a.getNombre(), a);
        a = new Manualidad();
        a.setNombre("Cofre");
        a.setDescripcion("Manualidades de cofre");
        a.setUrl("https://cdn3.videodecoracion.com/wp-content/uploads/2014/04/cofre-hecho-con-palos-de-helado.jpg");
        empMap.put(a.getNombre(), a);
        a.setNombre("plastilina");
        a.setDescripcion("manualidades en plantilina, ejemplos base");
        a.setUrl("https://static.guiainfantil.com/pictures/galerias/6928-animales-de-la-selva-de-plastilina-manualidades-infantiles.jpg");
        empMap.put(a.getNombre(), a);
    }

    public static Manualidad getDatosManualidad(String id) {
        return empMap.get(id);
    }

//    public static Manualidad addDatosManualidad(Manualidad Manualidad) {
//        empMap.put(Manualidad.getNombre(), Manualidad);
//        return Manualidad;
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
    public static List<Manualidad> getAllDatosManualidad() {
        Collection<Manualidad> c = empMap.values();
        List<Manualidad> list = new ArrayList<Manualidad>();
        list.addAll(c);
        return list;
    }

    List<Manualidad> list;

}
