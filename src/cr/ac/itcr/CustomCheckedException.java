package cr.ac.itcr;

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
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);

        int estatura;

        System.out.println("Linea de espera: Montaña Rusa");

        System.out.print("Digita tu estatura en numeros (centimetros): ");
        estatura = entrada.nextInt();

        try
        {
            if (estatura < 150)
                throw new MiExcepcion2();
        }catch(MiExcepcion2 ex)
        {
            System.err.print(ex);
            System.out.print("Para poder ingresar a la atraccion tu estatura debe de estar entre los 150 cm");
        }finally {
            System.out.println("\nPARQUE DE DIVERSIONES\n...está lleno de emociones");
        }
    }
}

