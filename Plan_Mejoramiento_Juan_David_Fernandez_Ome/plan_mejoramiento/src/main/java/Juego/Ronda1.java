package Juego;
import java.util.Scanner;
public class Ronda1 extends juego
{
    public int Menu=1, respuesta; 
    private int puntaje=0;
    
    public Ronda1()
    {

    }
    public Ronda1(int puntaje) {
        this.puntaje = puntaje;
    }
    public int getPuntaje() {
        return puntaje;
    }
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    Scanner leer=new Scanner(System.in);

    @Override
    public void preguntas() 
    {
        System.out.println("¡PRIMERA RONDA!");
        System.out.println("--------------------------------------------------------------------");
        switch(Menu)
        {
            case 1:
            System.out.println("Primera pregunta:");
            System.out.println("¿Cuales son los IDE De Java?");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Por favor seleccione una respuesta: \n1.Los IDE de JAVA son: Eclipse, NetBeans y Visual Studio Code. \n2.Los IDE de JAVA son: Codepen. \n3.Los IDE de JAVA son: Paiza Cloud.");
            respuesta=leer.nextInt();
            System.out.println("--------------------------------------------------------------------");

            if(respuesta==1)
            {
                setPuntaje(puntaje +=25);
                System.out.println("LA RESPUESTA ES CORRECTA SUMA 25 PUNTOS");
                System.out.println("TIENE "+getPuntaje()+" PUNTOS");  
                
                 
            }
            else
            {
                setPuntaje(puntaje -=25);
                    System.out.println("USTED PIERDE 25 PUNTOS");
                    System.out.println("TIENE "+getPuntaje()+" PUNTOS");  
            }                     
            System.out.println("--------------------------------------------------------------------");
            case 2:
                System.out.println("Segunda pregunta:");
                System.out.println("¿Que es una variable?");
                System.out.println("Por favor seleccione una respuesta: \n1.Son los atributos que definen el estado de una clase. \n2.Es el lugar donde se debe hacer la logica de negocios exacta. \n3.Una clase que contiene metodos que esta integrada por codigos.");
                respuesta=leer.nextInt();
                System.out.println("--------------------------------------------------------------------");
            if(respuesta==1)
            {
                setPuntaje(puntaje+=25);
                System.out.println("LA RESPUESTA ES CORRECTA SUMA 25 PUNTOS");
                System.out.println("TIENE "+getPuntaje()+" PUNTOS");
            }
            else
            {
                setPuntaje(puntaje-=25);
                System.out.println("USTED PIERDE 25 PUNTOS");
                System.out.println("TIENE "+getPuntaje()+" PUNTOS");
            }
            System.out.println("--------------------------------------------------------------------");
            case 3:
            {
                System.out.println("Tercera pregunta:");
                System.out.println("¿Que es un objeto?");
                System.out.println("Por favor seleccione una respuesta: \n1.La clase que se conoce como Super clase\n2.Es una instancia de una clase. \n3.La anulación del método.");
                respuesta=leer.nextInt();
                System.out.println("--------------------------------------------------------------------");
            if(respuesta==2)
            {
                setPuntaje(puntaje+=25);
                System.out.println("LA RESPUESTA ES CORRECTA SUMA 25 PUNTOS");
                System.out.println("TIENE "+getPuntaje()+" PUNTOS");
            }
            else
            {
                setPuntaje(puntaje-=25);
                System.out.println("USTED PIERDE 25 PUNTOS");
                System.out.println("TIENE "+getPuntaje()+" PUNTOS");
            }
            }
            System.out.println("--------------------------------------------------------------------");
            case 4:
            {
                System.out.println("Cuarta pregunta:");
                System.out.println("Para que sirve un String.");
                System.out.println("Por favor seleccione una respuesta: \n1.Para declarar una variable tipo entero \n2.Para declarar una variable tipo String \n3.Para hacer un ciclo.");
                respuesta=leer.nextInt();
                System.out.println("--------------------------------------------------------------------");
            if(respuesta==2)
            {
                setPuntaje(puntaje+=25);
                System.out.println("LA RESPUESTA ES CORRECTA SUMA 25 PUNTOS");
                System.out.println("TIENE "+getPuntaje()+" PUNTOS");
            }
            else
            {
                setPuntaje(puntaje-=25);
                System.out.println("USTED PIERDE 25 PUNTOS");
                System.out.println("TIENE "+getPuntaje()+" PUNTOS");
            }   
            }
        }
        System.out.println("--------------------------------------------------------------------");
    }
    @Override
    public void celebracion() 
    {
        if(puntaje>=70)
        {
            System.out.println("¡SU PUNTAJE FUE DE "+getPuntaje()+" ¡USTED HA METIDO GOL EN EL FINAL DEL MUNDO FELICIDADES, TIENES 2 RONDAS MAS!");
            System.out.println("¡SIUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU! :DDDDDDDDDD");
        }
        else if(puntaje<70)
        {
            System.out.println("¡SU PUNTAJE FUE DE "+getPuntaje()+", NO HAS METIDO GOL TIENES 2 RONDAS MAS!");
            System.out.println("¡NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO! :(((((((((((((((");
        }
    }
    
}
