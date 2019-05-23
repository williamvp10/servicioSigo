package org.o7planning.restfulcrud.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.o7planning.restfulcrud.model.*;

public class ClubDAO {

    private static final Map<String, Club> empMap = new HashMap<String, Club>();

    static {
        initEmps();
    }

    private static void initEmps() {
        Club club = new Club();
        club.setNombre("Club Campestre Guaymaral");
        club.setAlmuerzo("Almuerzo en Club Campestre Guaymaral es a las 12 se reclama bale a la entrada");
        club.setReglas("reglas Club Campestre Guaymaral");
        club.setRemision("remision del Club Campestre Guaymaral");
        empMap.put(club.getNombre(), club);
    }

    public static Club getDatosClub(String id) {
        return empMap.get("Club Campestre Guaymaral");
    }

//    public static Club addDatosClub(Club club) {
//        empMap.put(club.getNombre(), club);
//        return club;
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

    public static List<Club> getAllDatosClub() {
        Collection<Club> c = empMap.values();
        List<Club> list = new ArrayList<Club>();
        list.addAll(c);
        return list;
    }

    List<Club> list;

}
