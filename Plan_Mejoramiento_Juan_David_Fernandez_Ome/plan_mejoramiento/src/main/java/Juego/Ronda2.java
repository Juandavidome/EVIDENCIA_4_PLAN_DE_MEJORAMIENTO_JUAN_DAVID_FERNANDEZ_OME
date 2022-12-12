package Juego;
import java.util.Scanner;
public class Ronda2 extends juego
{
    public int Menu1=1, respuesta1; 
    private int puntaje1=0;
    public Ronda2()
    {

    }
    public int getPuntaje1() {
        return puntaje1;
    }

    public void setPuntaje1(int puntaje1) {
        this.puntaje1 = puntaje1;
    }
    Scanner leer=new Scanner(System.in);
    @Override
    public void preguntas() 
    {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("SEGUNDA RONDA!");
        System.out.println("--------------------------------------------------------------------");
        switch(Menu1)
        {
            case 1:
            System.out.println("Primera pregunta:");
            System.out.println("Tipo de dato que permite almacenar un entero en Java");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Por favor seleccione una respuesta: \n1.Int. \n2.Double \n3.Byte");
            respuesta1=leer.nextInt();
            System.out.println("--------------------------------------------------------------------");

            if(respuesta1==1)
            {
                setPuntaje1(puntaje1 +=25);
                System.out.println("LA RESPUESTA ES CORRECTA SUMA 25 PUNTOS");
                System.out.println("TIENE "+getPuntaje1()+" PUNTOS");  
                
                 
            }
            else
            {
                setPuntaje1(puntaje1 -=25);
                    System.out.println("USTED PIERDE 25 PUNTOS");
                    System.out.println("TIENE "+getPuntaje1()+" PUNTOS");  
            }                     
            System.out.println("--------------------------------------------------------------------");
            case 2:
                System.out.println("Segunda pregunta:");
                System.out.println("Para imprimir texto a través de la pantalla se hace uso de...");
                System.out.println("Por favor seleccione una respuesta: \n1.System.out.println() \n2.System.in.println() \n3.System.out()");
                respuesta1=leer.nextInt();
                System.out.println("--------------------------------------------------------------------");
            if(respuesta1==1)
            {
                setPuntaje1(puntaje1+=25);
                System.out.println("LA RESPUESTA ES CORRECTA SUMA 25 PUNTOS");
                System.out.println("TIENE "+getPuntaje1()+" PUNTOS");
            }
            else
            {
                setPuntaje1(puntaje1-=25);
                System.out.println("USTED PIERDE 25 PUNTOS");
                System.out.println("TIENE "+getPuntaje1()+" PUNTOS");
            }
            System.out.println("--------------------------------------------------------------------");
            case 3:
            {
                System.out.println("Tercera pregunta:");
                System.out.println("Si deseas guardar el nombre de Pablito, el tipo de dato que se debe utilizar es:");
                System.out.println("Por favor seleccione una respuesta: \n1.Char\n2.String \n3.Word");
                respuesta1=leer.nextInt();
                System.out.println("--------------------------------------------------------------------");
            if(respuesta1==2)
            {
                setPuntaje1(puntaje1+=25);
                System.out.println("LA RESPUESTA ES CORRECTA SUMA 25 PUNTOS");
                System.out.println("TIENE "+getPuntaje1()+" PUNTOS");
            }
            else
            {
                setPuntaje1(puntaje1-=25);
                System.out.println("USTED PIERDE 25 PUNTOS");
                System.out.println("TIENE "+getPuntaje1()+" PUNTOS");
            }
            }
            System.out.println("--------------------------------------------------------------------");
            case 4:
            {
                System.out.println("Cuarta pregunta:");
                System.out.println("Para guardar la altura de una persona (en metros), debes utilizar el tipo de dato:");
                System.out.println("Por favor seleccione una respuesta: \n1.Char. \n2.Double. \n3.Byte.");
                respuesta1=leer.nextInt();
                System.out.println("--------------------------------------------------------------------");
            if(respuesta1==2)
            {
                setPuntaje1(puntaje1+=25);
                System.out.println("LA RESPUESTA ES CORRECTA SUMA 25 PUNTOS");
                System.out.println("TIENE "+getPuntaje1()+" PUNTOS");
            }
            else
            {
                setPuntaje1(puntaje1-=25);
                System.out.println("USTED PIERDE 25 PUNTOS");
                System.out.println("TIENE "+getPuntaje1()+" PUNTOS");
            }   
            }
        }
        System.out.println("--------------------------------------------------------------------");
    }

    @Override
    public void celebracion() 
    {
        if(puntaje1>=70)
        {
            System.out.println("¡SU PUNTAJE FUE DE "+getPuntaje1()+" ¡USTED HA METIDO GOL EN EL FINAL DEL MUNDO FELICIDADES, TIENES 1 RONDAS MAS!");
            System.out.println("¡SIUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU! :DDDDDDDDDD");
        }
        else if(puntaje1<70)
        {
            System.out.println("¡SU PUNTAJE FUE DE "+getPuntaje1()+", NO HAS METIDO GOL TIENES 1 RONDAS MAS!");
            System.out.println("¡NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO! :(((((((((((((((");
        }
        
    }   
}
