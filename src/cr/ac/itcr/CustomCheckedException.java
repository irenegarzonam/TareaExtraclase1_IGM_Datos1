//ejemplo de un custom checked exception

package cr.ac.itcr;

//Bibliotecas
import java.util.Scanner;

class MiExcepcion2 extends Exception
{
    MiExcepcion2()
    {
        System.err.println("ERROR");
    }
}

public class CustomCheckedException
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


    Entradas: interger (estatura)
    Restricciones: estatura debe serun interger, si estatura es
                   menor a 150 da mensaje de MiExcepcion2
    Salidas: texto
    ###########################################################
     */
    public static void main(String args[])
    {
        //crea objet)o scanner para obtener ventana de comandos
        Scanner entrada = new Scanner(System.in);

        int estatura;

        System.out.println("Linea de espera: Montaña Rusa");

        System.out.print("Digita tu estatura en numeros (centimetros): ");// indicador
        estatura = entrada.nextInt(); // lee el numero de estatura

        try
        {
            if (estatura < 150) //si la persona es menor a esa estatura, dara un mensaje de error.
                throw new MiExcepcion2();
        }//fin de try
        catch(MiExcepcion2 ex)
        {
            System.err.print(ex);
            System.out.print("Para poder ingresar a la atraccion tu estatura debe de estar entre los 150 cm");
        }//fin de catch
        finally
        {
            System.out.println("\nPARQUE DE DIVERSIONES\n...está lleno de emociones");
        }//fin de finally
    }//fin de  main
}//fin de CustomCheckedException

