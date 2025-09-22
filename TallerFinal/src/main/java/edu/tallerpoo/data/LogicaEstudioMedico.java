package edu.tallerpoo.data;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import edu.tallerpoo.model.ResultadoEstudio;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * La clase LogicaEstudioMedico se encarga de gestionar la lectura y escritura de
 * información relacionada con los estudios médicos en un archivo CSV. También
 * proporciona métodos para obtener el ID de historia clínica y para leer la
 * información de los estudios médicos desde el archivo CSV.
 */
public class LogicaEstudioMedico {
        
    /**
     * Obtiene el ID de la historia clínica asociada a un estudio médico.
     *
     * @param arraydatos {@link Array}-Arreglo de datos del estudio médico, que incluye la
     *                   información del ID de historia clínica.
     * @return {@link String}-El ID de historia clínica asociado al estudio médico.
     */
    public String getIDHistoria(String [] arraydatos){
        String [] estudio=arraydatos;
        System.out.println(estudio);
        return null;
        
    }
    
    /**
     * Escribe información de un estudio médico en el archivo estudios.csv.
     *
     * @param arraydatos {@link Array}-Arreglo de datos del estudio médico que se escribirá en el
     *                   archivo CSV.
     */
    public void escribirCSVEstudioMedico (String [] arraydatos){
    
        File file = new File(Utilidades.rutaEstudio());
        try{
          FileWriter archivoSalida = new FileWriter(file, true);
           CSVWriter writer = new CSVWriter(archivoSalida);
           if (file.length()==0){
            String [] Encabezado={"IDESTUDIO", "ID HISTORIA CLINICA", "FECHA", "HORA", "TIPO", "INFORME"};
             writer.writeNext(Encabezado);
           }

            String []datos=arraydatos;
            //escribimos el archivo csv
            writer.writeNext(datos);

            writer.close();
        }     
        catch(IOException e){
                System.out.print("No se pudo escribir el el CSV correspondiente a los estudios");
        }     
    }
    
    /**
     * Lee la información de los estudios médicos desde el archivo estudios.csv.
     *
     * @return {@link ArrayList}-Una lista de objetos ResultadoEstudio que contienen los datos de los
     *         estudios médicos.
     * @throws CsvValidationException Si ocurre un error relacionado con la validación del archivo CSV.
     */
    
    
     public ArrayList<ResultadoEstudio> leerCSVEstudioMedico() throws CsvValidationException {
        ArrayList<ResultadoEstudio> estudios = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(Utilidades.rutaEstudio()))) {
            String[] linea;
            reader.skip(1); // Saltar la primera línea (encabezados)

            while ((linea = reader.readNext()) != null) {
                ResultadoEstudio estudio = new ResultadoEstudio();
                estudio.setId(Integer.parseInt(linea[0]));
                estudio.setFecha(Utilidades.getDate(linea[1]));
                estudio.setHora(Utilidades.obtenerHora(linea[2]));
                estudio.setTipoDeEstudio(linea[3]);
                estudio.setInforme(linea[4]);
                //estudio.setHistoriaClinica();

                estudios.add(estudio);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo CSV: " + e.getMessage());
        }

        return estudios;
    }  


}
