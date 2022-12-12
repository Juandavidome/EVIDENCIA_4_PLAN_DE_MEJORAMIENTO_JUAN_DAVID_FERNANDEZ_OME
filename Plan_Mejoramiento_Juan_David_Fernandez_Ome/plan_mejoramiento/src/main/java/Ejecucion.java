import Juego.*;
import Login.*;
public class Ejecucion 
{
    public static void main(String[] args) 
    {
        registrar registrar = new registrar();
        Ronda1 ronda1 = new Ronda1();
        Ronda2 ronda2 = new Ronda2();
        Ronda3 ronda3 =new Ronda3();

        registrar.registrarJugador();
        registrar.validarInformacion();

        System.out.println("--------------------------------------------------------------------");
        System.out.println("BIENVENIDO AL JUEGO ALL-STAR LEAGUE");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("El juego consiste en que eres un jugador que esta en una tanda de penales y esta en la final del mundo, \npara poder tener una mayor fuerza y eficiencia a la hora de tirar el balon, \ndebe sumar una cantidad de puntos dependiendo de las respuestas de las preguntas, \npara poder anotar el gol con la mayor eficiencia debera tener entre 70 y 100 puntos, \nsi obtienes menos de ese porcentaje el tiro sera tapado por el arquero. \nLa tanda sera de 3 rondas con 4 preguntas por cada ronda, \nobtendras 25 puntos por cada pregunta. \nSi ganas 3 Rondas ganas el mundial, si no pierdes el mundial y no te llevaras la copa.");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("¡ANIMOS Y QUE EL MEJOR GANE!");
        System.out.println("--------------------------------------------------------------------");
        
        ronda1.preguntas();
        ronda1.celebracion();

        ronda2.preguntas();
        ronda2.celebracion();

        ronda3.preguntas();
        ronda3.celebracion();
        
        System.out.println("--------------------------------------------------------------------");
        if(ronda1.getPuntaje()>=70&&ronda2.getPuntaje1()>=70&&ronda3.getPuntaje2()>=70)
        {
            System.out.println("¡FELICIDADES HAS GANADO EL MUNDIAL POR PENALTIS! !VE A CELEBRARLO JUNTO A MAMA!");
        }
        else if(ronda1.getPuntaje()<70&&ronda2.getPuntaje1()<70&&ronda3.getPuntaje2()<70)
        {
            System.out.println("¡EN ESTE MUNDIAL NO FUE! ESPEREMOS QUE SEA LA PROXIMA");
        }
    }
    
}
