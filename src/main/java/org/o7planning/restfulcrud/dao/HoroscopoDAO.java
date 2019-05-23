package org.o7planning.restfulcrud.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.o7planning.restfulcrud.model.Horoscopo;

public class HoroscopoDAO {

    private static final Map<String, Horoscopo> empMap = new HashMap<String, Horoscopo>();

    static {
        initEmps();
    }

    private static void initEmps() {
        Horoscopo horoscopo = new Horoscopo();
        horoscopo.setDate("hoy");
        horoscopo.setHoroscope("Siempre es importante invertir dinero en una propiedad, si tienes la posibilidad de hacerlo este mismo dia, hazlo sin pensarlo dos veces, es algo que se mantendrá en el tiempo y que puedes echar mano cuando tengas un problema económico."
                + "Si se trata de una persona a la que te estás aferrando, entonces debes ver en qué te está aportando esta persona en tu vida y qué es lo que esperas conseguir que siga a tu lado a pesar de las dificultades."
                + "Si tienes problemas en las finanzas, entonces es bueno que consideres vender algo de tu propiedad que no uses demasiado, recuerda que no es bueno aferrarse a las cosas materiales, esto va y viene, luego podrás recuperar lo que tengas que vender por este apuro económico."
                + "Alguien que es muy importante para ti está teniendo dificultades y necesita de tu asistencia, dale la atención que requiere.");
        horoscopo.setSunsing("Aries");
        horoscopo.setUrl("https://www.elhoroscopodehoy.es/img/horoscopos/aries.png");
        empMap.put(horoscopo.getSunsing(), horoscopo);
        horoscopo = new Horoscopo();
        horoscopo.setDate("hoy");
        horoscopo.setHoroscope("En la pareja se perfilan cosas buenas para ambos, pero deben comenzar a tomar las decisiones adecuadas sobre el futuro que están labrando, no siempre la persona que toma más decisiones es la que tiene la razón, a veces hay que ceder frente a las decisiones del otro."
                + "No es un buen momento para ponerte a pensar en eso que dejaste de hacer en el pasado, es un buen momento para estar en tranquilidad con las decisiones que has ido tomando en tu vida, no llevas un camino malo y tampoco tienes malas personas en tu mundo, por lo que debes sentirte muy feliz de lo que estás consiguiendo sin necesidad de mirar hacia atrás."
                + "Es bueno que comiences a ver la posibilidad de hacer un cambio importante en tu hogar, podría ser desde arreglar las cosas de otro modo a comprar cosas nuevas que necesitas para darle este nuevo aire a tu espacio.");
        horoscopo.setSunsing("Tauro");
        horoscopo.setUrl("https://www.elhoroscopodehoy.es/img/horoscopos/tauro.png");
        empMap.put(horoscopo.getSunsing(), horoscopo);
        horoscopo = new Horoscopo();
        horoscopo.setDate("hoy");
        horoscopo.setHoroscope("No dejes que se te vaya la posibilidad de amar, es importante que comiences a trazar líneas sobre lo que quieres en el futuro con una persona que ha llegado a tu vida hace poco tiempo, no esperes más tiempo para dar el salto y pedir algo más formal."
                + "Es el momento de comenzar a soñar de nuevo, es una capacidad que no puedes perder, por mucho que tengas estar con los pies en la tierra para lograr ciertas cosas que quieres, siempre debes tener la capacidad de imaginar y de desear cosas para el futuro, tienes un muy buen presente, por lo que no temas a echar a volar tu mente."
                + "No es un buen momento para amar a alguien, si ya tienes una pareja por supuesto quedas fuera de este consejo, tienes que mantener bien tu relación a pesar de las dificultades que se presenten en el camino."
                + "Un dinero que te deben está tardando en llegar, hoy no será el día que lo recibas, pero podrías volver a cobrar hoy lo adeudado.");
        horoscopo.setSunsing("Geminis");
        horoscopo.setUrl("https://www.elhoroscopodehoy.es/img/horoscopos/geminis.png");
        empMap.put(horoscopo.getSunsing(), horoscopo);
        horoscopo = new Horoscopo();
        horoscopo.setDate("hoy");
        horoscopo.setHoroscope("No pienses demasiado las cosas en el amor, a veces es bueno tirarse al vacío y comenzar esa relación que se está gestando entre tú y una persona que conoces hace muy poco, no siempre será bueno tener demasiado cuidado y sin riesgos el corazón."
                + "Debes comenzar a ver lo que quieres en verdad de la vida, es probable que no estés pensando con claridad, ya que muchas emociones que han pasado en tu vida te están haciendo pensar de forma errada."
                + "Tienes que poner todo te ti para hacer posible ese sueño que tanto anhelas desde tu infancia, cuando veas que todas las puertas se cierran, es cuando más debes intentar lograr lo que quieres, no abandones nunca esta capacidad de soñar que te caracteriza."
                + "No es probable que puedas tener eso que quieres tanto en este minuto, espera un poco.");
        horoscopo.setSunsing("Cancer");
        horoscopo.setUrl("https://www.elhoroscopodehoy.es/img/horoscopos/cancer.png");
        empMap.put(horoscopo.getSunsing(), horoscopo);
        horoscopo = new Horoscopo();
        horoscopo.setDate("hoy");
        horoscopo.setHoroscope("Será una buena ocasión para poner en práctica tu generosidad, lo necesitas con suma urgencia, puede que necesites descansar mucho por la noche."
                + "A nuestro alrededor pasan muchas cosas, siempre sucederá de esa forma y no puedes hacerte cargo de todo, sobre todo de los problemas de los demás, si alguien busca consejo, apóyale, pero no te desgastes tratando de solucionar algo que no te corresponde, no es bueno que siempre estés pensando las cosas que pasan a otros mucho más que lo que te sucede a ti."
                + "Leo necesita reconocer que está en un periodo de difícil avance, lo que le provoca algunos problemas, ya que como buen rey del zodiaco tiene que estar siempre triunfante, pero no cometas el error de confundir el éxito con el no caerte nunca, siempre sucederá, solo de las caídas fuertes aprendemos las lecciones más valiosas.");
        horoscopo.setSunsing("Leo");
        horoscopo.setUrl("https://www.elhoroscopodehoy.es/img/horoscopos/leo.png");
        empMap.put(horoscopo.getSunsing(), horoscopo);
        horoscopo = new Horoscopo();
        horoscopo.setDate("hoy");
        horoscopo.setHoroscope("La persona que quieres no está interesada en ti, ya lo sabes, te lo ha dicho en repetidas ocasiones, ha quedado claro, por lo que es importante que dejes de insistir, es momento de mirar hacia otro lado, no puedes estar en el mismo lugar para siempre."
                + "Si alguien te tiende una mano el día de hoy, no le desprecies, es probable que tenga las mejores intenciones y te haya visto un poco mal últimamente."
                + "Necesitas comenzar a conocer personas nuevas, solo así encontrarás el amor."
                + "Aprovecha este tiempo a solas para hacer todas las cosas antes mencionadas, no comiences a castigarte porque aún no encuentras el amor."
                + "Estás en una época muy buena para ideas nuevos proyectos y nuevas formas de generar dinero, te irá muy bien si comienzas a trabajar duro con respecto a esto, no debes dejarte caer si haces algo que no resulta de buenas a primera.");
        horoscopo.setSunsing("Virgo");
        horoscopo.setUrl("https://www.elhoroscopodehoy.es/img/horoscopos/virgo.png");
        empMap.put(horoscopo.getSunsing(), horoscopo);
        horoscopo = new Horoscopo();
        horoscopo.setDate("hoy");
        horoscopo.setHoroscope("Debes intentar cambiar un poco tu estilo de vestir, recuerda que siempre debemos usar diferente tenidas de ropa dependiendo de la ocasión."
                + "No permitas que una mala relación de pareja te afecte tu desempeño en otras áreas como el trabajo o la vida familiar, si se trata de una persona absorbente debes considerar el dejar el compromiso."
                + "Si estás buscando trabajo es probable que tengas la posibilidad de trabajar con alguien que conociste hace algún tiempo o que fue parte de tu educación."
                + "Tienes en tu mente una idea que podría ayudarte a salir de la situación en la que te encuentras y ella involucra a tu pareja o a alguien de tu familia, habla hoy sobre el plan que tienes y comienza a ejecutar."
                + "Una persona que necesita de tu ayuda te comenzará a buscar para que le enseñes algo que se ha tardado un tiempo en aprender.");
        horoscopo.setSunsing("Libra");
        horoscopo.setUrl("https://www.elhoroscopodehoy.es/img/horoscopos/libra.png");
        empMap.put(horoscopo.getSunsing(), horoscopo);
        horoscopo = new Horoscopo();
        horoscopo.setDate("hoy");
        horoscopo.setHoroscope("No veas la soledad siempre como algo negativo en tu vida, es probable que estés atravesando por un momento donde no necesites estar con una pareja necesariamente, es mejor que veas este periodo como un aprendizaje más donde debes estar más pendiente de las cosas importantes que tienes en tu vida y que no tienen que ver con amor necesariamente."
                + "Hay personas en tu vida que necesitan mucho de tu ayuda y estás dejando de darles una mano por darle prioridad solo a tus necesidades, no dejes que las personas que más amas se caigan por no lograr atajarles cuando pudiste."
                + "No dejes de abrazar a la persona que amas, no importa si han tenido alguna discusión o si en este momento las cosas no se encuentran bien entre ustedes, la distancia física solo logra mellar mucho más el amor, separados no se arregla nada.");
        horoscopo.setSunsing("Escorpio");
        horoscopo.setUrl("https://www.elhoroscopodehoy.es/img/horoscopos/escorpio.png");
        empMap.put(horoscopo.getSunsing(), horoscopo);
        horoscopo = new Horoscopo();
        horoscopo.setDate("hoy");
        horoscopo.setHoroscope("Es bueno que te sientas a gusto en tu trabajo, si tienes que solucionar algunas cosas en el ambiente laboral siempre tienes la capacidad de decir las cosas claramente."
                + "Si llega una persona de tu pasado más reciente el día de hoy, no te detengas a conversar ni tampoco a hacer buenas migas con esta persona, lo que sucedió entre ustedes aún no se ha solucionado de buena forma y es probable que este encuentro te traiga más tristezas que alegrías, mejor intenta darle un saludo y nada más, no caigas en una conversación larga que pueda darle una puerta de entrada nuevamente a tu vida."
                + "Necesitas comenzar a surgir tanto profesionalmente como económicamente y te has dado cuenta de esto, las finanzas no andan bien y estás necesitando cada vez más dinero, comienza el día de hoy un plan de ahorro o un plan de acción para conseguir más entradas monetarias.");
        horoscopo.setSunsing("Sagitario");
        horoscopo.setUrl("https://www.elhoroscopodehoy.es/img/horoscopos/sagitario.png");
        empMap.put(horoscopo.getSunsing(), horoscopo);
        horoscopo = new Horoscopo();
        horoscopo.setDate("hoy");
        horoscopo.setHoroscope("Un momento muy lindo se dará en tu hogar, si tienes hijos, ellos te demostrarán todo lo que han aprendido y los frutos de los que tú les has enseñado, si solo vives con tu pareja, entonces te tendrá una sorpresa muy agradable, agradece estos gestos haciendo lo mismo por las personas que quieres cada vez que tengas la oportunidad."
                + "Siempre es una buena idea conseguir una mascota, si tienes la posibilidad de buscar una el día de hoy y tienes las ganas de hacerlo intenta conseguir algo en un refugio de animales, no compres una mascota, siempre hay animales que necesitan amor y cariño que necesitan adopción."
                + "No estás mirando bien las inspiraciones positivas que tienes a tu alrededor, te estás centrando solamente en lo que tú sabes hacer y no estás mirando de verdad lo que pasa con los demás, podrías aprender mucho de lo que hacen los otros, no dejes de darte esa oportunidad el día de hoy.");
        horoscopo.setSunsing("Capricornio");
        horoscopo.setUrl("https://www.elhoroscopodehoy.es/img/horoscopos/capricornio.png");
        empMap.put(horoscopo.getSunsing(), horoscopo);
        horoscopo = new Horoscopo();
        horoscopo.setDate("hoy");
        horoscopo.setHoroscope("El mundo nos ofrece maravillas y tienes que comenzar a admirarlas, hace tiempo que no te detienes a mirar lo bueno que está a tu alrededor y tienes que estar más pendiente de ello, un paseo por la ciudad o una ida al campo podría ser una buena solución para esto."
                + "Una persona que es miembro de tu familia tendrá un problema, probablemente de salud, lo que hará que todos estén muy pendientes de cómo se desarrolla, será algo muy leve, no te preocupes."
                + "Es probable que estés perdiendo la capacidad de ver lo bello que nos entrega la vida día a día, es mejor que intentes descubrir lo maravilloso que tiene el mundo para entregarte."
                + "Comienza a cuidar mucho más de tu salud, estás dejando esto."
                + "No dejes que los problemas del día a día te hagan dejar de tener consciencia con lo que pasa en tu trabajo, en tu hogar y en tu relación.");
        horoscopo.setSunsing("Acuario");
        horoscopo.setUrl("https://www.elhoroscopodehoy.es/img/horoscopos/acuario.png");
        empMap.put(horoscopo.getSunsing(), horoscopo);
        horoscopo = new Horoscopo();
        horoscopo.setDate("hoy");
        horoscopo.setHoroscope("Siempre es bueno experimentar con cosas nuevas y también con aquello que ya conoces, pero que no le has dado todos los usos que posee."
                + "Necesitas comenzar a hacer esto mucho más, ya que estás dejando que la rutina te absorba, lo que siempre trae problemas en el futuro."
                + "En el trabajo tienes una excelente jornada esperando por ti, te darán una muy buena noticia sobre un trabajo que presentaste hace algún tiempo, podría no ser solo una buena evaluación, sino algo que te hará mucho más feliz."
                + "El amor necesita ser cuidado y también contemplado, debes mirar a tu pareja o a la persona que estás conociendo y comenzar a apreciar su belleza y todo lo bueno que hace por ti, así volverás a enamorarte cada día."
                + "El estrés y los problemas no pueden comenzar a mellar tu capacidad de ponerte en el lugar de otros o de tomar atención a lo que ves.");
        horoscopo.setSunsing("Piscis");
        horoscopo.setUrl("https://www.elhoroscopodehoy.es/img/horoscopos/piscis.png");
        empMap.put(horoscopo.getSunsing(), horoscopo);

    }

    public static Horoscopo getDatosHoroscopo(String id) {
        return empMap.get(id);
    }

    public static Horoscopo addDatosHoroscopo(Horoscopo horosocopo) {
        empMap.put(horosocopo.getSunsing(), horosocopo);
        return horosocopo;
    }

    public static Horoscopo updateDatosHoroscopo(Horoscopo horosocopo) {
        empMap.put(horosocopo.getSunsing(), horosocopo);
        return horosocopo;
    }

    public static void deleteDatosHoroscopo(String id) {
        empMap.remove(id);
    }

    public static List<Horoscopo> getAllDatosHoroscopo() {
        Collection<Horoscopo> c = empMap.values();
        List<Horoscopo> list = new ArrayList<Horoscopo>();
        list.addAll(c);
        return list;
    }

    List<Horoscopo> list;

}
