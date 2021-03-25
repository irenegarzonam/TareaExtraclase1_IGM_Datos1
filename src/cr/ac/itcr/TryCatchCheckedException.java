//Ejemplo Excepcion verificada con try catch

package cr.ac.itcr;

//Bibliotecas
import java.io.*;

public class TryCatchCheckedException
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
        //Creacion del documento
        try
        {
            File documento = new File("prueba.txt");
            FileWriter escritor = new FileWriter(documento);
            BufferedWriter buffer = new BufferedWriter(escritor);
            buffer.write("Hola!");
            buffer.newLine();
            buffer.write("Soy un ejemplo de una excepcion verificada");
            buffer.close();
            escritor.close();
        } catch (IOException ex) {
            System.out.println("Problema en la creacion del documento");
        }
        //Lectura del Documento
        try
        {
            FileReader lector = new FileReader(new File("prueba.txt")); //Ejemplo extra, si en vez de prueba.txt, pongo otro .txt, mi ctach me va a mandar un mensaje donde me dira donde esta el problema
            BufferedReader lectorbuffer = new BufferedReader(lector);
            String renglon = lectorbuffer.readLine();
            while (renglon!=null)
            {
                System.out.println(renglon);
                renglon = lectorbuffer.readLine();
            }
        } catch (IOException ex)
        {
            System.out.println("Problemas con la lectura del documento");
            System.out.println(ex.getMessage());
        }
    }
}
