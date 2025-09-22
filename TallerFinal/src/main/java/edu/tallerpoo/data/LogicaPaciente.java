package edu.tallerpoo.data;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import edu.tallerpoo.model.Persona;
import edu.tallerpoo.model.tipoEstCivil;
import edu.tallerpoo.model.tipoSexo;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import edu.tallerpoo.data.Utilidades.*;
import edu.tallerpoo.model.Paciente;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Esta clase proporciona funcionalidades relacionadas con la gestión de pacientes y sus registros.
 * Permite la escritura y lectura de datos de pacientes desde archivos CSV, así como la obtención
 * de información específica de un paciente a partir de su documento de identidad (DNI).
 */
public class LogicaPaciente {
    
    /**
     * Escribe los datos de un paciente en un archivo CSV de registros de pacientes.
     *
     * @param Persona {@link Array}-Un arreglo de strings que contiene los datos del paciente a escribir.
     */
    public void escribirCsvRegistroPaciente(String [] Persona){

    File file = new File(Utilidades.datosPacientes());
    try{
      FileWriter archivoSalida = new FileWriter(file, true);
      CSVWriter writer = new CSVWriter(archivoSalida);
       
    
       
       if (file.length()==0){
        String [] Encabezado={"DNI","NombrePersonaContacto","DomicilioPersonaContacto","CelularPersonaContacto"};
         writer.writeNext(Encabezado);
       }
         
        String []datos=Persona;
        //escribimos el archivo csv
        writer.writeNext(datos);
        
        writer.close();
    }     
    catch(Exception e){
            System.out.print("No se pudo escribir el archivo registro paciente");
            
            }     
    }
    

    // no toma ningun dato del csv. datospaciente (creo que es por las comillas - coffe)
    /**
     * Lee y crea una lista de objetos Persona a partir de un archivo CSV de datos de pacientes.
     *
     * @return {@link ArrayList}-Una lista de objetos Persona con los datos de los pacientes.
     */
    public ArrayList<Persona> leerArchivoPersona() {
    ArrayList<Persona> personas = new ArrayList<>();
    try {
        FileReader fileReader = new FileReader(Utilidades.rutaPersonas());
        CSVReader csvReader = new CSVReader(fileReader);

        String[] lineaSiguiente;
        csvReader.readNext();  

        while ((lineaSiguiente = csvReader.readNext()) != null) {
            Persona persona = new Persona();

            try {
                persona.setNombre(lineaSiguiente[0]);
                persona.setApellido(lineaSiguiente[1]);

                switch (lineaSiguiente[2].toLowerCase()) {
                    case "Masculino":
                        persona.setSexo(tipoSexo.Masculino);
                        break;
                    case "Femenino":
                        persona.setSexo(tipoSexo.Femenino);
                        break;
                    case "X":
                        persona.setSexo(tipoSexo.X);
                        break;
                }

                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
                Date fechaNacimiento = formatoFecha.parse(lineaSiguiente[4]);
                persona.setFechaNac(fechaNacimiento);

                persona.setDomicilio(lineaSiguiente[5]);
                persona.setDocumento(Integer.parseInt(lineaSiguiente[6]));
                persona.setTelFijo(lineaSiguiente[7]);
                persona.setCelular(lineaSiguiente[8]);

                switch (lineaSiguiente[9]) {
                    case "Casado":
                        persona.setEstadoCivil(tipoEstCivil.Casado);
                        break;
                    case "Divorciado":
                        persona.setEstadoCivil(tipoEstCivil.Divorciado);
                        break;
                    case "Soltero":
                        persona.setEstadoCivil(tipoEstCivil.Soltero);
                        break;
                    case "Viudo":
                        persona.setEstadoCivil(tipoEstCivil.Viudo);
                        break;
                }

                persona.setEmail(lineaSiguiente[10]);
                personas.add(persona);

            } catch (Exception e) {
                System.out.print("no se pudo leer la linea siguiente en logica Paciente ");
            }
        }
        } catch (Exception e) {
            System.out.println("No se pudo leer el registro del paciente: " + e.getMessage());
            e.printStackTrace();
        }

        return personas;
    }

    /**
     * Lee los datos de un paciente a partir de su documento de identidad (DNI).
     *
     * @param dni {@link Integer}-El número de documento del paciente del cual se desean obtener los datos.
     * @return {@link Paciente}-Un objeto Paciente con la información del paciente.
     * @throws FileNotFoundException Si no se encuentra el archivo de datos de pacientes.
     * @throws IOException Si ocurre un error de lectura del archivo de datos de pacientes.
     * @throws CsvValidationException Si ocurre un error de validación del archivo CSV.
     */
    public static Paciente leerPersona(int dni) throws FileNotFoundException, IOException, CsvValidationException {
        FileReader fileReader = new FileReader(Utilidades.rutaPersonas());
        CSVReader csvReader = new CSVReader(fileReader);
        
        String[] lineaSiguiente;
        csvReader.readNext();  

        while ((lineaSiguiente = csvReader.readNext()) != null) {
            
            if (dni==Integer.parseInt(lineaSiguiente[0])){
                Paciente persona = new Paciente();
                persona.setNombre(lineaSiguiente[1]);
                persona.setApellido(lineaSiguiente[2]);
                persona.setEmail(lineaSiguiente[3]);
                persona.setFechaNac(Utilidades.getDate(lineaSiguiente[4]));
                persona.setTelFijo(lineaSiguiente[5]);
                persona.setCelular(lineaSiguiente[6]);
                persona.setEstadoCivil(Utilidades.getEstadoCivil(lineaSiguiente[7]));
                persona.setDomicilio(lineaSiguiente[8]);
                persona.setSexo(Utilidades.getSexo(lineaSiguiente[9]));
                csvReader.close();
                return persona;
            }
            
        }
        return null;
    }
}

