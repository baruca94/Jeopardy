
package jeopardy;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

public class InputFicheros {
    private String nombreFichero="Deporte";
    public static ArrayList<Pregunta>leerPreguntas(String nombreFichero) throws IOException{
        ArrayList<Pregunta> preguntaLectura = new ArrayList<>();
        Path path = Paths.get(nombreFichero + ".txt");
        BufferedReader br = null;
       try {
             br = Files.newBufferedReader(path, java.nio.charset.StandardCharsets.UTF_8);
            Pregunta preguntas;
            String linea;
            String[] datos;
            int i = 1;
             while ((linea = br.readLine()) != null) {
             datos = linea.split(";");
              String[] respuesta = {datos[1], datos[2], datos[3]};
              preguntas = new Pregunta (datos[0], respuesta, Integer.parseInt(datos[4]), Integer.parseInt(datos[5]));
             preguntaLectura.add(preguntas);
             }
            
              
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    
                    System.out.println("Error: " + ex.getMessage());
                }
            }
            Iterator it = preguntaLectura.iterator();
            while (it.hasNext()) System.out.println(it.next().toString());
             return preguntaLectura;       
       } 
        
    }
}
