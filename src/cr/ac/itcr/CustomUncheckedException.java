package cr.ac.itcr;

import java.util.Scanner;

public class CustomUncheckedException
{
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