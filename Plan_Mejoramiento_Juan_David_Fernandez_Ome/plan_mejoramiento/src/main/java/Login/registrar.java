package Login;
import java.util.Scanner;
public class registrar extends Usuario
{
    String nombre, apellido, corr, contra;
    String correo[]=new String[1];
    String contraseña[]=new String[1];
    Scanner leer = new Scanner(System.in);
    
    @Override
    public void registrarJugador() 
    {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("BIENVENIDO AL JUEGO ALL-STAR LEAGUE");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("POR FAVOR REGISTRARSE");
        System.out.println("Ingrese su correo:");
        corr=leer.next();
        correo[0]=corr;
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Ingrese su contraseña:");
        contra=leer.next();
        contraseña[0]=contra;
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("GRACIAS POR REGISTRARSE");
        
    }
    @Override
    public void validarInformacion() 
    {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("INICIAR SESION PARA PODER INGRESAR AL PROGRAMA");
        System.out.println("INGRESE SU CORREO:");
        corr=leer.next();
        for(int i=0;i<correo.length;i++)
        {
            if(corr.equals(correo[i])) 
            {
                System.out.println("Correo correcto puede seguir a contraseña.");
            }
            else
            {
                System.out.println("Correo incorrecto no puede seguir a contraseña.");
                System.exit(i);
            }
        }
        System.out.println("INGRESE SU CONTRASEÑA:");
        contra=leer.next();
        for(int i=0;i<contraseña.length;i++)
        {
            if(contra.equals(contraseña[i])) 
            {
                System.out.println("Contraseña correcto puede ingresar.");
            }
            else
            {
                System.out.println("Contraseña incorrecta no puede ingresar.");
                System.exit(i);
            }
        }   
    }
}
