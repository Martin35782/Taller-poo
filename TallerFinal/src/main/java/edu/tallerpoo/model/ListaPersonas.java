
package edu.tallerpoo.model;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * La clase ListaPersonas proporciona métodos para escribir y leer datos de personas desde y hacia archivos CSV.
 */
public class ListaPersonas {
    
    /**
     * Escribe datos de registro de pacientes en un archivo CSV.
     *
     * @param archivoruta {@link String}-La ruta del archivo CSV.
     * @param arraydatos {@link String}-Un array de datos que representan un paciente.
     */
    public void escribirCsvRegistroPaciente(String archivoruta, String[] arraydatos) {
        File file = new File(archivoruta);
        try {
            FileWriter archivoSalida = new FileWriter(file, true);
            CSVWriter writer = new CSVWriter(archivoSalida);

            if (file.length() == 0) {
                String[] Encabezado = {"nombre", "apellido", "tipoSexo", "motivoConsulta", "FechaString", "domicilio", "Documento", "TelFijo", "Celular", "EstadoCivil",
                        "email", "NombrePersonaContacto", "DomicilioPersonaContacto", "CelularPersonaContacto"};
                writer.writeNext(Encabezado);
            }

            String[] datos = arraydatos;
            // Escribimos el archivo CSV
            writer.writeNext(datos);

            writer.close();
        } catch (Exception e) {
            System.out.print("No se pudo escribir el archivo registro paciente");
        }
    }
   
 
   /**
     * Lee datos de registro de pacientes desde un archivo CSV.
     *
     * @param archivoRuta {@link String}-La ruta del archivo CSV.
     * @return {@link ArrayList}Una lista de objetos Persona que representan a los pacientes leídos.
     */
    public ArrayList<Persona> leerArchivoCsvRegistroPaciente(String archivoRuta) {
        ArrayList<Persona> personas = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(archivoRuta);
            CSVReader csvReader = new CSVReader(fileReader);

            String[] lineaSiguiente;
            csvReader.readNext();

            while ((lineaSiguiente = csvReader.readNext()) != null) {
                Persona persona = new Persona();

                try {
                    persona.setNombre(lineaSiguiente[0]);
                    persona.setApellido(lineaSiguiente[1]);

                    switch (lineaSiguiente[2].toLowerCase()) {
                        case "masculino":
                            persona.setSexo(tipoSexo.Masculino);
                            break;
                        case "femenino":
                            persona.setSexo(tipoSexo.Femenino);
                            break;
                        case "x":
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

                    switch (lineaSiguiente[9].toLowerCase()) {
                        case "casado":
                            persona.setEstadoCivil(tipoEstCivil.Casado);
                            break;
                        case "divorciado":
                            persona.setEstadoCivil(tipoEstCivil.Divorciado);
                            break;
                        case "soltero":
                            persona.setEstadoCivil(tipoEstCivil.Soltero);
                            break;
                        case "viudo":
                            persona.setEstadoCivil(tipoEstCivil.Viudo);
                            break;
                    }

                    persona.setEmail(lineaSiguiente[10]);
                    personas.add(persona);

                } catch (Exception e) {
                    System.out.print("No se pudo leer la línea siguiente");
                }
            }
        } catch (Exception e) {
            System.out.println("No se pudo leer el registro del paciente: " + e.getMessage());
            e.printStackTrace();
        }

        return personas;
    }
}
  