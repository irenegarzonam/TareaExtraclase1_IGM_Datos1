//Ejemplo Unchecked Exception
package cr.ac.itcr;

//Bibliotecas
import java.util.Scanner;

public class UncheckedException
{
    /*
    ###########################################################
    Instituto Tecnologico de Costa Rica

    Area Academica Ingenieria en Computadores


    Curso: Algoritmos y estructuras de Datos 1

    Lenguaje: Java 15.0.2

    Profesor: Jose Isaac Ramirez Herrera

    Autora: Irene Garzona Moya 2020426009

    Version: 1.0

    Fecha de ultima modificacion: 24/03/2021


    Entradas:intergers(numero1 y numero2)
    Restricciones:numero1 y numero2 deben ser intergers.
                  numero2 debe ser != 0 para que te de el
                  cociente.
    Salidas: cociente de numero1 y numero2
             mensaje de Excepcion si numero2 es 0
    ###########################################################
     */
    public static void main(String args[])
    {
        //crea objeto scanner para obtener ventana de comandos
        Scanner entrada = new Scanner( System.in );

        int numero1; //primer numero introducido por el usuario
        int numero2; //segundo numero introducido por el usuario
        int cociente = 0; //cociente de la division del numero1 y numero2

        System.out.print( "Escriba el primer numero entero: " ) ; //indicador de entrada
        numero1 = entrada.nextInt(); //lee el primer numero entero

        System.out.print( "Escriba el segundo numero entero: " ); //inidcador de entrada
        numero2 = entrada. nextInt(); //lee el segundo numero entero

        //calcula el cociente
        try
        {
            cociente = numero1/numero2;
        } //fin del try
        catch (ArithmeticException ex) //Si hay un problema en la division, este es atrapado.
        {
            System.err.println(ex);
            System.err.println("Es imposible dividir entre 0"); //mensaje de error
        }//fin del catch
        finally
        {
            //si la division esta bien, te dara el cociente, sino solo te dara el numero1 y numero2.
            if (numero2 != 0)
                cociente = numero1/numero2;
                System.out.printf("Division entre %d y %d, es %d", numero1, numero2, cociente);
            if (numero2 == 0)
                System.out.printf("Division entre %d y %d", numero1, numero2);
        }//fin del finally
    }//fin de main
}//fin de UncheckedException
