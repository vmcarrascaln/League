/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.Scanner;


/**
 *
 * @author Estudiante
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
       File entrada = new File ("jugador.txt");
       Scanner lectura = new Scanner (entrada);
        String salida = null;
       PrintStream escritura = new PrintStream(new FileOutputStream(salida, true));
       
       
    }
    
}
