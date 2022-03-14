
public class Main {
    public static void main(String[] args) {
        // Ejercicio 1
        Division division = new Division();
        division.setDividendo(5);
        division.setDivisor(0);
        division.getResultado();

        // Ejercicio 2
        Array array = new Array();
        try{
            array.setArray(6);
            System.out.println("Tamaño del array: " + array.getArray().length);
            System.out.println(array.getArray()[9]);
        }catch (Exception e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            for (StackTraceElement temp : e.getStackTrace()) {
                System.out.println("    --> " + temp + " Linea: " + temp.getLineNumber());
            }
        }

        // Ejercicio 3
        Archivo archivo = new Archivo();
        archivo.abrirArchivo("C:\\Users\\history.txt");

    }
}
