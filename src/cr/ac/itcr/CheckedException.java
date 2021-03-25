//Ejemplo Excepcion Verificada con Throws
package cr.ac.itcr;

// Bibliotecas
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

// Las excepciones verificadas deben ser capturadas de forma obligatoria por nuestro programa
// En este caso lo haremos con throws
public class CheckedException
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


    Entradas: File path
    Restricciones: ---
    Salidas: ---
    ###########################################################
     */
    public void LeerDoc() throws FileNotFoundException
    {
        File documento = new File("C:\\prueba\\prueba.txt");//abrir texto
        FileReader lector = new FileReader(documento); //lee texto

    }

    // FileNotFoundException deriva de IOException
    public void LeerDocVersion2() throws IOException
    {
        LeerDoc();
    }

    public static void main(String args[])
    {
    }
}