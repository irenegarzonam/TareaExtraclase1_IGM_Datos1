package cr.ac.itcr;

//Bibliotecas
import java.util.Scanner;

public class UncheckedException
{
    public static void main(String args[])
    {
        //crea objeto scanner para obtener ventana de comandos
        Scanner entrada = new Scanner( System.in );

        int numero1;
        int numero2;
        int cociente;

        System.out.print( "Escriba el primer numero entero: " ) ;
        numero1 = entrada.nextInt();

        System.out.print( "Escriba el segundo numero entero: " );
        numero2 = entrada. nextInt();

        try
        {
            cociente = numero1/numero2;
        }catch (ArithmeticException ex)
        {
            System.err.println(ex);
            System.err.println("Es imposible dividir entre 0");
        }finally
        {
            if (numero2 != 0)
                System.out.printf("Division entre %d y %d, es %d", numero1, numero2, numero1/numero2);
            if (numero2 == 0)
                System.out.printf("Division entre %d y %d", numero1, numero2);
        }
    }
}
