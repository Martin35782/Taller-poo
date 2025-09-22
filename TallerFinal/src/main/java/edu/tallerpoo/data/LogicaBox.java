package edu.tallerpoo.data;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import edu.tallerpoo.gui.Boxes;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * La clase LogicaBox se encarga de gestionar la lectura y escritura de información
 * sobre los boxes en un archivo CSV, así como de actualizar su estado y asignar
 * un DNI a un box específico.
 */
public class LogicaBox {
    
    /**
     * Escribe una lista de datos en un archivo CSV que contiene información sobre los boxes.
     *
     * @param listaDatos {@link ArrayList}-La lista de datos que se escribirá en el archivo CSV.
     */
    public void escribirCSV(List<String[]> listaDatos){
    File file = new File(Utilidades.rutaBox());
    try{
        FileWriter archivoSalida = new FileWriter(file, false);
        CSVWriter writer = new CSVWriter(archivoSalida);
        if (file.length()==0){
            String [] Encabezado={"BOX","ESTADO","DNI","MEDICO"};
            writer.writeNext(Encabezado);
        }

        // Escribimos el archivo CSV
        writer.writeAll(listaDatos);

        writer.close();
    }
    catch(IOException e){
        System.out.print("No se pudo escribir el CSV");
    }
    }
  
    /**
     * Lee la información de los boxes desde un archivo CSV.
     *
     * @return {@link ArrayList}-Una lista de arreglos de cadenas que representan la información de los boxes.
     * @throws CsvValidationException Si ocurre un error relacionado con la validación del archivo CSV.
     */
    public static ArrayList<String[]> leerCSV() throws CsvValidationException{
    ArrayList<String[]> lineas = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(Utilidades.rutaBox());
            CSVReader reader = new CSVReader(fileReader);
            String[] nextLine;
            reader.skip(1);

            while ((nextLine = reader.readNext()) != null) {
                lineas.add(nextLine);
            }

            reader.close();
        } catch (IOException e) {
        System.out.println("Error al leer el archivo CSV: " + e.getMessage());
        }

    return lineas;
    
    }
    
    
    
    
    /**
     * Setea todo el estado del Box en desocupado.
     *
     * @param dni {@link Integer}-Número del box que se desocupara.
     * @throws CsvValidationException Si ocurre un error relacionado con la validación del archivo CSV.
     */
    public void finBox (int dni) throws CsvValidationException {
        ArrayList<String[]> lineas = leerCSV(); // string de boxes
        ArrayList<String[]> nuevasLineas = new ArrayList<>();
        
        
        
        for(String[] boxRow : lineas){
            if(dni == Integer.parseInt(boxRow[2])){
                String [] reg = {boxRow[0], "0", "0", "0"};
                nuevasLineas.add(reg);
            }
            else{
                String [] reg2 = {boxRow[0], boxRow[1], boxRow[2], boxRow[3]};
                nuevasLineas.add(reg2);
            }
        }
        escribirCSV(nuevasLineas);
}
  

    /**
     * Actualiza el estado de un box en el archivo CSV.
     *
     * @param boxAActualizar {@link Integer}-Número del box que se actualizará.
     * @param nuevoEstado    {@link Integer}-Nuevo estado del box.
     * @param dniMedic       {@link Integer}-ID del medico que atiende el box
     * @throws CsvValidationException Si ocurre un error relacionado con la validación del archivo CSV.
     */
    public void actualizarEstadoCSV(int boxAActualizar, int nuevoEstado, int dniMedic) throws CsvValidationException {
        ArrayList<String[]> lineas = leerCSV();
        ArrayList<String[]> nuevasLineas = new ArrayList<>();

        for (String[] linea : lineas) {
            int box = Integer.parseInt(linea[0]); // El número del box está en la posición 0 del arreglo
            int estado = Integer.parseInt(linea[1]); // El estado está en la posición 1 del arreglo

            if (box == boxAActualizar) {
                estado = nuevoEstado;
                String[] nuevaLinea = {String.valueOf(box), String.valueOf(estado), linea[2], Integer.toString(dniMedic)}; // Reconstruir la línea con el nuevo estado
                nuevasLineas.add(nuevaLinea);
            }
            else{
                String[] nuevaLinea = {String.valueOf(box), String.valueOf(estado), linea[2], linea[3]}; // Reconstruir la línea con el nuevo estado
                nuevasLineas.add(nuevaLinea);
            }
            


        }

        // Escribir las nuevas líneas en el archivo CSV
        escribirCSV(nuevasLineas);
    }
    
    /**
     * Asigna un DNI a un box en el archivo CSV.
     *
     * @param boxAActualizar {@link Integer}-Número del box al que se asignará el DNI.
     * @param nuevoDNI       {@link String}-Nuevo DNI a asignar al box.
     * @throws CsvValidationException Si ocurre un error relacionado con la validación del archivo CSV.
     */
    public void asignarDNI(int boxAActualizar, String nuevoDNI) throws CsvValidationException {
        ArrayList<String[]> lineas = leerCSV();
        ArrayList<String[]> nuevasLineas = new ArrayList<>();

        for (String[] linea : lineas) {
            int box = Integer.parseInt(linea[0]); // El número del box está en la posición 0 del arreglo
            String dni = linea[2]; // El DNI está en la posición 2 del arreglo

            if (box == boxAActualizar) {
                dni = nuevoDNI;
            }

            String[] nuevaLinea = {String.valueOf(box), linea[1], dni, linea[3]}; // Reconstruir la línea con el nuevo DNI
            nuevasLineas.add(nuevaLinea);
        }

            // Escribir las nuevas líneas en el archivo CSV
            escribirCSV(nuevasLineas);
        } 
    
    /**
     * Devuelve el Box correspondiente a un paciente a traves de su dni
     * 
     * @param dni {@link Integer}-DNI del paciente
     * @return {@link Integer}-ID del box correspodiente
     * @throws CsvValidationException 
     */
    public int encontrarBoxPorDNI(int dni) throws CsvValidationException {
    ArrayList<String[]> lineas = leerCSV();

    for (String[] linea : lineas) {
        int documentoAsociado = Integer.parseInt(linea[2]); // El DNI está en la posición 2 del arreglo

        if (documentoAsociado == dni) {
            return Integer.parseInt(linea[0]); // El número de box está en la posición 0 del arreglo
        }
    }

    return -1; // Si no se encuentra el DNI, retorna -1 o algún otro valor de error
}

    
    
    
    
}
