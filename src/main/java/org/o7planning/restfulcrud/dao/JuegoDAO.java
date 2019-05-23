package org.o7planning.restfulcrud.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.o7planning.restfulcrud.model.*;

public class JuegoDAO {

    private static final Map<String, Juego> empMap = new HashMap<String, Juego>();

    static {
        initEmps();
    }

    private static void initEmps() {
        Juego a = new Juego();
        a.setNombre("Atrapadas");
        a.setDescripcion("se escoge una persona que inicie atrapando, una vez inicie el juego este intentara atrapar o tocar"
                + "a la siguiente persona que atrapara, una vez lo atrape este dejara de atrapar y debera empezar a huir.");
        a.setUrl("https://2.bp.blogspot.com/-s3DwhBtEOqI/U_dp70laRhI/AAAAAAAAAI8/EQh_ifD_294/s200/images%2B(5).jpg");
        empMap.put(a.getNombre(), a);
        a = new Juego();
        a.setNombre("Ponchados");
        a.setDescripcion("se escoge una persona que inicie ponchando, una vez inicie el juego este intentara tocar o golpear con una pelota"
                + "a los demas jugadores, el juego acaba cuando todos los jugadores esten ponchados.");
        a.setUrl("http://2.bp.blogspot.com/-3UoYhde59DY/UbAbvqtzgyI/AAAAAAAAAB4/aBOTv8fMnUA/s400/descarga+(6).jpg");
        empMap.put(a.getNombre(), a);
        a.setNombre("Cuerda");
        a.setDescripcion("la cuerda será girada por Dos Personas, una a cada extremo, mientras que las otras personas serán las encargadas de saltar,");
        a.setUrl("https://www.educapeques.com/wp-content/uploads/2016/12/la-comba-300x200.jpg");
        empMap.put(a.getNombre(), a);
    }

    public static Juego getDatosJuego(String id) {
        return empMap.get(id);
    }

//    public static Juego addDatosJuego(Juego Juego) {
//        empMap.put(Juego.getNombre(), Juego);
//        return Juego;
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
    public static List<Juego> getAllDatosJuego() {
        Collection<Juego> c = empMap.values();
        List<Juego> list = new ArrayList<Juego>();
        list.addAll(c);
        return list;
    }

    List<Juego> list;

}
