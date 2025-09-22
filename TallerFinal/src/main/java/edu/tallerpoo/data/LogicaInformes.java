package edu.tallerpoo.data;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * La clase LogicaInformes proporciona funcionalidad para leer y escribir informes en un archivo CSV. Permite leer informes existentes y agregar nuevos informes a dicho archivo.
 */
public class LogicaInformes {
    
    /**
     * Lee el contenido de un archivo CSV que almacena informes.
     *
     * @return {@link ArrayList}-Una lista de cadenas de caracteres que representan los informes leídos.
     * @throws CsvValidationException si se produce un error de validación al leer el archivo CSV.
     */

    public ArrayList<String[]> leerCSVInforme() throws CsvValidationException{
    ArrayList<String[]> lineas = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(Utilidades.rutaInformes());
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
     * Escribe un nuevo informe en un archivo CSV o agrega el informe a un paciente existente si ya tiene informes registrados.
     *
     * @param documento     {@link String}-El documento del paciente al que se agrega el informe.
     * @param nuevoInforme  {@link String}-El nuevo informe a agregar o registrar.
     */
    public void escribirCSVInforme(String documento, String nuevoInforme) {
        File file = new File(Utilidades.rutaInformes());
        try {
            boolean existe = file.exists();
            FileWriter archivoSalida = new FileWriter(file, true);
            CSVWriter writer = new CSVWriter(archivoSalida);

            if (!existe || file.length() == 0) {
                String[] Encabezado = {"Documento", "INFORMES"};
                writer.writeNext(Encabezado);
            }

            if (!agregarInformeSiExiste(documento, nuevoInforme, file)) {
                String[] nuevaFila = {documento, "\"" + nuevoInforme + "\""};
                writer.writeNext(nuevaFila);
            }

            writer.close();
        } catch (Exception e) {
            System.out.print("No se pudo escribir el archivo registro paciente2 ");
        }
    }

    /**
     * Agrega un informe al archivo CSV si ya existe un informe registrado para el paciente especificado.
     *
     * @param documento     {@link String}-El documento del paciente.
     * @param nuevoInforme  {@link String}-El informe a agregar al paciente existente.
     * @param file          {@link File}-El archivo CSV en el que se almacenan los informes.
     * @return              {@link Boolean}-`true` si se agregó el informe al paciente existente, `false` si se registró como un nuevo informe.
     * @throws IOException   si se produce un error de E/S al escribir en el archivo CSV.
     * @throws CsvException  si se produce un error al trabajar con el archivo CSV.
     */
    private boolean agregarInformeSiExiste(String documento, String nuevoInforme, File file) throws IOException, CsvException {
        CSVReader reader = new CSVReader(new FileReader(file));
        List<String[]> lineas = reader.readAll();
        reader.close();

        for (String[] linea : lineas) {
            if (linea.length > 0 && linea[0].equals(documento)) {
                FileWriter archivoSalida = new FileWriter(file);
                CSVWriter writer = new CSVWriter(archivoSalida);

                linea[1] += ", " + "\"" + nuevoInforme + "\"";
                writer.writeAll(lineas);
                writer.close();

                return true;
            }
        }
        return false;
    }
}

