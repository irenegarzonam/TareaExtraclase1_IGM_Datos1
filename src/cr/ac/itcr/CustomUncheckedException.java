package cr.ac.itcr;

import java.util.Scanner;

public class CustomUncheckedException
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


    Entradas:
    Restricciones:
    Salidas:
    ###########################################################
     */
    public static void main(String args[])
    {
        Scanner entrada = new Scanner( System.in );

        int edad;

        System.out.println("Vamos a ver si puedes votar");
        System.out.print("Digita el numero entero detu edad");
        edad = entrada.nextInt();
        try
        {
            if (edad < 18)
                throw new MiExcepcion();
            System.out.println("Si puedes votar en las Votaciones 2021");
        }catch(MiExcepcion ex)
        {
            System.err.println(ex);
            System.out.println("Debes de ser mayor de edad para poder votar");
        }
    }
}

class MiExcepcion extends RuntimeException
{
    MiExcepcion()
    {
        System.err.println("ERROR");
    }
}