package Juego;
import java.util.Scanner;
public class Ronda3 extends juego
{
    public int Menu2=1, respuesta2; 
    private int puntaje2=0;
    public Ronda3()
    {

    }
    public int getPuntaje2() {
        return puntaje2;
    }

    public void setPuntaje1(int puntaje2) {
        this.puntaje2 = puntaje2;
    }
    Scanner leer=new Scanner(System.in);
    @Override
    public void preguntas() 
    {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("TERCERA RONDA!");
        System.out.println("--------------------------------------------------------------------");
        switch(Menu2)
        {
            case 1:
            System.out.println("Primera pregunta:");
            System.out.println("¿Cómo creo un nuevo objeto en Java?");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Por favor seleccione una respuesta: \n1.new Object(); \n2.new Object; \n3.nuevo Object();");
            respuesta2=leer.nextInt();
            System.out.println("--------------------------------------------------------------------");

            if(respuesta2==1)
            {
                setPuntaje1(puntaje2 +=25);
                System.out.println("LA RESPUESTA ES CORRECTA SUMA 25 PUNTOS");
                System.out.println("TIENE "+getPuntaje2()+" PUNTOS");    
            }
            else
            {
                setPuntaje1(puntaje2 -=25);
                    System.out.println("USTED PIERDE 25 PUNTOS");
                    System.out.println("TIENE "+getPuntaje2()+" PUNTOS");  
            }                     
            System.out.println("--------------------------------------------------------------------");
            case 2:
                System.out.println("Segunda pregunta:");
                System.out.println("¿Cómo defino una nueva clase en Java?");
                System.out.println("Por favor seleccione una respuesta: \n1.public class Nombre{} \n2.public clas Nombre{} \n3.private Nombre{}");
                respuesta2=leer.nextInt();
                System.out.println("--------------------------------------------------------------------");
            if(respuesta2==1)
            {
                setPuntaje1(puntaje2+=25);
                System.out.println("LA RESPUESTA ES CORRECTA SUMA 25 PUNTOS");
                System.out.println("TIENE "+getPuntaje2()+" PUNTOS");
            }
            else
            {
                setPuntaje1(puntaje2-=25);
                System.out.println("USTED PIERDE 25 PUNTOS");
                System.out.println("TIENE "+getPuntaje2()+" PUNTOS");
            }
            System.out.println("--------------------------------------------------------------------");
            case 3:
            {
                System.out.println("Tercera pregunta:");
                System.out.println("¿Un ejemplo de Objeto en Programación seria?");
                System.out.println("Por favor seleccione una respuesta: \n1.Carro\n2.Todas las opciones son correctas\n3.Bicicleta");
                respuesta2=leer.nextInt();
                System.out.println("--------------------------------------------------------------------");
            if(respuesta2==2)
            {
                setPuntaje1(puntaje2+=25);
                System.out.println("LA RESPUESTA ES CORRECTA SUMA 25 PUNTOS");
                System.out.println("TIENE "+getPuntaje2()+" PUNTOS");
            }
            else
            {
                setPuntaje1(puntaje2-=25);
                System.out.println("USTED PIERDE 25 PUNTOS");
                System.out.println("TIENE "+getPuntaje2()+" PUNTOS");
            }
            }
            System.out.println("--------------------------------------------------------------------");
            case 4:
            {
                System.out.println("Cuarta pregunta:");
                System.out.println("¿public static void main(String[] args) en java corresponde a?");
                System.out.println("Por favor seleccione una respuesta: \n1.La clase. \n2.El método principal. \n3.La variable.");
                respuesta2=leer.nextInt();
                System.out.println("--------------------------------------------------------------------");
            if(respuesta2==2)
            {
                setPuntaje1(puntaje2+=25);
                System.out.println("LA RESPUESTA ES CORRECTA SUMA 25 PUNTOS");
                System.out.println("TIENE "+getPuntaje2()+" PUNTOS");
            }
            else
            {
                setPuntaje1(puntaje2-=25);
                System.out.println("USTED PIERDE 25 PUNTOS");
                System.out.println("TIENE "+getPuntaje2()+" PUNTOS");
            }   
            }
        }
        System.out.println("--------------------------------------------------------------------");
    }

    @Override
    public void celebracion() 
    {
        if(puntaje2>=70)
        {
            System.out.println("¡SU PUNTAJE FUE DE "+getPuntaje2()+" ¡USTED HA METIDO GOL EN EL FINAL DEL MUNDO FELICIDADES, HAS FINALIZADO LAS RONDAS!");
            System.out.println("¡SIUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU! :DDDDDDDDDD");
        }
        else if(puntaje2<70)
        {
            System.out.println("¡SU PUNTAJE FUE DE "+getPuntaje2()+", NO HAS METIDO GOL HAS FINALIZADO LAS RONDAS!");
            System.out.println("¡NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO! :(((((((((((((((");
        }
        
    }
}