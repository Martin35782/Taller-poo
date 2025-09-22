package edu.tallerpoo.data;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import edu.tallerpoo.data.LogicaPaciente;
import edu.tallerpoo.model.Persona;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * La clase RegistroConsulta se encarga de añadir un nuevo motivo de consulta a un paciente en el archivo CSV de datos de pacientes.
 * Esto implica leer el archivo CSV, buscar al paciente por su DNI y agregar el nuevo motivo al registro existente.
 */
public class RegistroConsulta {
    
    /**
     * Añade un nuevo motivo de consulta a un paciente en el archivo CSV de datos de pacientes.
     *
     * @param Motivo {@link String}-El nuevo motivo de consulta que se va a agregar al paciente.
     * @param dni {@link Integer}-El número de documento del paciente al que se le agregará el motivo de consulta.
     */
    public void añadirNuevamotivoConsulta(String Motivo,int dni){
       LogicaPaciente p=new LogicaPaciente();
       ArrayList<String>motivos=new ArrayList();
       
       
    try {
        FileReader fileReader = new FileReader(Utilidades.rutaDatosPacientes());

        CSVReader csvReader = new CSVReader(fileReader);

        String[] lineaSiguiente;
        csvReader.readNext(); 
        

        while ((lineaSiguiente = csvReader.readNext()) != null){
                //Si encontramos el dni que pasamos por parametros en el csv le contatenamos el motivo nuevo al csv
                if(dni==Integer.parseInt(lineaSiguiente[6])){
                    File file = new File(Utilidades.rutaDatosPacientes());
                    try{
                        FileWriter archivoSalida = new FileWriter(file,true);
                        CSVWriter writer = new CSVWriter(archivoSalida);

                        System.out.println(Motivo +"/" +lineaSiguiente[3]);
                        //Escribir el csv Con los datos nuevos

                        String [] array={lineaSiguiente[3]+"/"+Motivo};                 
                        writer.writeNext(array);                    
                    }
                    catch(Exception e){
                        System.out.println("Error al escribir el nuevo motivo");
                    }                             
                }   
        }
    }
    catch(Exception e){
    System.out.println("Error al leer el archivo");
    
    }
    }
}
   

   
   
   

