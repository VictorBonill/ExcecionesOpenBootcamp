import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Archivo {
    private String nombreArchivo;

    public Archivo(){}

    public void abrirArchivo(String nombreArchivo){
        try{
            BufferedReader archivoALeer = new BufferedReader(new InputStreamReader(new FileInputStream(nombreArchivo)));
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
