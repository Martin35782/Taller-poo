package edu.tallerpoo.data;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;
import edu.tallerpoo.model.Paciente;
import edu.tallerpoo.model.Triage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Color;

/**
 * La clase `LogicaTriage` proporciona métodos para realizar cálculos y operaciones relacionadas con el triaje médico, que es un sistema de priorización de atención médica en situaciones de emergencia. Permite calcular el nivel de gravedad de un paciente y determinar su color de triaje.
 * Además, esta clase permite escribir datos de triaje en un archivo CSV, calcular el tiempo máximo de atención en función del nivel de gravedad y más.
 */
public class LogicaTriage {
    
    
    /**
     * Calcula el puntaje de triaje basado en varios factores.
     *
     * @param conciencia         {@link Integer}-Nivel de conciencia del paciente.
     * @param dolorAbdominal     {@link Integer}-Nivel de dolor abdominal.
     * @param dolorPecho         {@link Integer}-Nivel de dolor en el pecho.
     * @param edad               {@link Integer}-Edad del paciente.
     * @param estadoMental       {@link Integer}-Estado mental del paciente.
     * @param fiebre             {@link Integer}-Presencia de fiebre.
     * @param lesionesGraves     {@link Integer}-Presencia de lesiones graves.
     * @param lesionesLeves      {@link Integer}-Presencia de lesiones leves.
     * @param pulso              {@link Integer}-Pulso del paciente.
     * @param respiracion        {@link Integer}-Frecuencia respiratoria del paciente.
     * @param sangrado           {@link Integer}-Presencia de sangrado.
     * @param signosShock        {@link Integer}-Signos de shock.
     * @param vomitos            {@link Integer}-Presencia de vómitos.
     * @return                   {@link Integer}-El puntaje de triaje calculado.
     */
    public int sumaTriage(int conciencia, int dolorAbdominal, int dolorPecho, int edad, int estadoMental,
            int fiebre, int lesionesGraves, int lesionesLeves, int pulso, int respiracion, int sangrado,int signosShock, int vomitos) {   
        int valor1 = 0;
        int valor2 = 0;  
        int valor4 = 0;
        switch (conciencia) {
            case 0:
                valor1 = 0;
                break;
            case 1:
                valor1 = 3;
                break;
        }
        switch (signosShock) {
            case 0:
                valor2 = 0;
                break;
            case 1:
                valor2 = 3;
                break;
        }
        switch (lesionesGraves) {
            case 0:
                valor4 = 0;
                break;
            case 1:
                valor4 = 2;
                break;
        }       
        int suma=0; 
        suma=valor1+valor2+valor4+ dolorAbdominal + dolorPecho + edad + estadoMental + fiebre + lesionesLeves + pulso + respiracion + sangrado  + vomitos;
       
        return suma;
    }
    
    
    /**
     * Determina el color de triaje en función del puntaje de triaje.
     *
     * @param suma {@link Integer}-El puntaje de triaje.
     * @return  {@link String}-El color de triaje correspondiente.
     */
    public String Color(int suma){
    if (suma >= 15) {
            return "Rojo";
        } else if (suma >= 10 && suma <= 14) {
            return "Naranja";
        } else if (suma >= 5 && suma <= 9) {
            return "Amarillo";
        } else if (suma >= 0 && suma <= 4) {
            return "Verde";
        } else {
            return "Azul";
        }    
    }
  
    /**
     * Crea un objeto Triage y establece sus atributos a partir de los valores proporcionados.
     *
     * @param conciencia      {@link String}-Nivel de conciencia del paciente.
     * @param dolorAbdominal  {@link String}-Nivel de dolor abdominal.
     * @param dolorPecho      {@link String}-Nivel de dolor en el pecho.
     * @param edad            {@link String}-Edad del paciente.
     * @param estadoMental    {@link String}-Estado mental del paciente.
     * @param fiebre          {@link String}-Presencia de fiebre.
     * @param lesionesGraves  {@link String}-Presencia de lesiones graves.
     * @param lesionesLeves   {@link String}-Presencia de lesiones leves.
     * @param pulso           {@link String}-Pulso del paciente.
     * @param respiracion     {@link String}-Frecuencia respiratoria del paciente.
     * @param sangrado        {@link String}-Presencia de sangrado.
     * @param signosShock     {@link String}-Signos de shock.
     * @param vomitos         {@link String}-Presencia de vómitos.
     * @return                {@link Triage}-Un objeto Triage configurado con los valores proporcionados.
     */
    public Triage setTriage(String conciencia, String dolorAbdominal, String dolorPecho, String edad, String estadoMental, String fiebre, String lesionesGraves, String lesionesLeves, String pulso, String respiracion, String sangrado, String signosShock, String vomitos) {

        Triage tr=new Triage();
        tr.setConciencia(conciencia);
        tr.setDolorAbdominal(dolorAbdominal);
        tr.setDolorPecho(dolorPecho);
        tr.setEstadoMental(estadoMental);
        tr.setEdad(edad);
        tr.setEstadoMental(estadoMental);
        tr.setFiebre(fiebre);
        tr.setLesionesGraves(lesionesGraves);
        tr.setLesionesLeves(lesionesLeves);
        tr.setPulso(pulso);
        tr.setRespiracion(respiracion);
        tr.setSangrado(sangrado);
        tr.setSignosShock(signosShock);
        tr.setVomitos(vomitos);

    return tr;
    }
  
    /**
     * Escribe un registro de triaje en un archivo CSV.
     *
     * @param id             {@link Integer}-Identificador del triaje.
     * @param IDRegistro     {@link Integer}-Identificador del registro relacionado.
     * @param NivelPropuesto {@link Integer}-Nivel de triaje propuesto.
     * @param color          {@link String}-Color de triaje.
     * @param TiempoMax      {@link String}-Tiempo máximo de atención.
     * @param puntaje        {@link Integer}-Puntaje de triaje.
     * @param fecha          {@link Date}-Fecha del triaje.
     * @param triage         {@link Triage}-Objeto Triage relacionado.
     */
    public void escribirArchivoCsvTriage(int id,int IDRegistro,int NivelPropuesto,String color,String TiempoMax,int puntaje,Date fecha,Triage triage){
    File file = new File(Utilidades.datosTriage());
    try{
      FileWriter archivoSalida = new FileWriter(file, true);
       CSVWriter writer = new CSVWriter(archivoSalida);
   
       if (file.length()==0){
        String[] Encabezado = {"ID", "idRegistro", "NIVELPROPUESTO", "Color", "tiempomax", "Puntaje", "fecha", "pulso", "lesionesleves", "sangrado", "signos shock", "dolor adbominal", "vomitos", "fiebre", "dolor pecho", "lesiones graves", "conciencia", "estado mental","Nivel Cambio","Motivo Cambio"};
         writer.writeNext(Encabezado);
       }
         
            String[] datos = { Integer.toString(id), Integer.toString(IDRegistro), Integer.toString(NivelPropuesto),color, TiempoMax, Integer.toString(puntaje), Utilidades.convertDate(fecha), triage.toString(),"","" };
        //escribimos el archivo csv
        writer.writeNext(datos);
        
        writer.close();
    }     
    catch(Exception e){
            System.out.print("No se pudo escribir el archivo triage en logicaTriage"+e.getMessage());
            
            }     
    }
       
    /**
     * Calcula el tiempo máximo de atención en función del puntaje de triaje.
     *
     * @param suma {@link Integer}-El puntaje de triaje.
     * @return {@link String}-El tiempo máximo de atención estimado.
     */
    public String tiempomax(int suma){
        
        String tiempo=Color(suma);
          switch (tiempo){
              case "Rojo" -> {
                  return "AtencionInmediata";
            }
              case "Naranja" -> {
                  return "10-15 Minutos";
            }
                        
             case"Amarillo" -> {
                 return "60 minutos";
            }
             case"Verde" -> {
                 return "2 horas";
            }
                 
              case"Azul" -> {
                  return "4 horas ";
            }
                         
        
               
          
          }
          return null;
    }
    
    /**
     * Calcula el nivel de triaje propuesto en función del puntaje de triaje.
     *
     * @param suma {@link Integer}-El puntaje de triaje.
     * @return {@link Integer}-El nivel de triaje propuesto.
     */
    public int NivelPropuesto(int suma){
       String nivel=Color(suma);
          switch (nivel){
              case "Rojo":
                      return 1;      
              case "Naranja":
                  return 2;
                        
             case"Amarillo ":
                      return 3;
             case"Verde":
                 return 4;
                 
              case"Azul":
                  return 5 ;
          }
   return 0;
   }
    
    public Color Color2(String level){
       String nivel=level;
          switch (nivel){
              case "1" -> {
                  return Color.RED;
            }
              case "2" -> {
                  return Color.ORANGE;
            }
                        
             case"3" -> {
                 return Color.YELLOW;
            }
             case"4" -> {
                 return Color.GREEN;
            }
                 
              case"5" -> {
                  return Color.BLUE;
            }
          }
   return null;
   }
         
   
   
    /**
     * Establece el DNI de un paciente en la enfermería para su atención.
     */
    public void SetDni(){
       
      boolean aux=false;
    try {
        FileReader fileReader = new FileReader(Utilidades.datosPacientes());
        CSVReader csvReader = new CSVReader(fileReader);

        String[] lineaSiguiente;
        csvReader.readNext();  
        //Documento,NombrePersonaContacto,DomicilioPersonaContacto,CelularPersonaContacto
        while ((lineaSiguiente = csvReader.readNext()) != null) {
        
           int dni=Integer.parseInt(lineaSiguiente[0]); 
           SetPacienteEnfermeria(dni);
        }
    }
    catch(Exception e){
        System.out.print("Error al leer el archivo datos pacientes " + e.getMessage());
    }
   }
  
   /**
    * Establece un paciente para ser atendido por una enfermera
    * 
    * @param dni 
    */
   public void SetPacienteEnfermeria(int dni){
   

        Verificaciones veri=new Verificaciones();
        if(veri.verificardni(dni)){
            System.out.print(dni);
        }

   }
   
     /**
     * Cambia el nivel de triaje y el motivo de cambio de un registro de triaje existente.
     *
     * @param idRegistro   {@link Integer}-Identificador del registro a cambiar.
     * @param motivo       {@link String}-El motivo del cambio de triaje.
     * @param nivelCambio  {@link String}-El nuevo nivel de triaje.
     */
    public void cambiarTriage(int idRegistro, String motivo, String nivelCambio) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            ArrayList<String[]> newData = new ArrayList<>();
            fileReader = new FileReader(Utilidades.datosTriage());
            CSVReader csvReader = new CSVReader(fileReader);
            String[] nextRecord;
            csvReader.readNext();
            String[] Encabezado = {"ID", "idRegistro", "NIVELPROPUESTO", "Color", "tiempomax", "Puntaje", "fecha", "pulso", "lesionesleves", "sangrado", "signos shock", 
                "dolor adbominal", "vomitos", "fiebre", "dolor pecho", "lesiones graves", "conciencia", "estado mental","Nivel Cambio","Motivo Cambio"};
            newData.add(Encabezado);
            while ((nextRecord = csvReader.readNext()) != null) {
                // Verifica si el ID del registro coincide
                if (idRegistro == Integer.parseInt(nextRecord[1])) {
                    // Actualiza los valores en memoria
                    nextRecord[7] = motivo;
                    nextRecord[8] = nivelCambio;
                }
                newData.add(nextRecord);
            }

            // Cierra el lector de CSV
            csvReader.close();

            // Abre el archivo CSV para escritura
            fileWriter = new FileWriter(Utilidades.datosTriage());
            CSVWriter csvWriter = new CSVWriter(fileWriter);

            // Escribe los datos actualizados al archivo
            csvWriter.writeAll(newData);

            // Cierra el escritor de CSV
            csvWriter.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LogicaTriage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | CsvValidationException ex) {
            Logger.getLogger(LogicaTriage.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(LogicaTriage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } 
    
    public String nivel(String idRegistro) {
        try (CSVReader reader = new CSVReader(new FileReader(Utilidades.datosTriage()))) {

            List<String[]> filas = reader.readAll();

            // Iterar sobre las filas y buscar el idRegistro
            for (String[] fila : filas) {
                if (fila[1].equals(idRegistro)) {
                    // El índice 2 representa el campo "NIVELPROPUESTO"
                    return fila[2];
                }
            }

        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }

        // Retornar null si no se encuentra el idRegistro
        return "Error no se encontro";
    }
}

    
    
    
    
    

