package edu.tallerpoo.data;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import edu.tallerpoo.model.HistoriaClinica;
import edu.tallerpoo.model.Persona;
import edu.tallerpoo.model.ResultadoEstudio;
import edu.tallerpoo.model.tipoEstCivil;
import edu.tallerpoo.model.tipoSexo;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Esta clase gestiona la lectura y escritura de historias clínicas en un archivo CSV.
 * Permite crear, leer y actualizar información relacionada con las historias clínicas.
 */
public class LogicaHistoriaClinica {
        
    
    
    
    /**
     * Escribe un nuevo registro de historia clínica en el archivo CSV.
     *
     * @param arraydatos {@link Array}-Los datos de la historia clínica a escribir en el archivo CSV.
     */
    public void escribirCSVHisotriaClinica (String [] arraydatos){
    
        File file = new File(Utilidades.rutaHistoriaClinica());
        try{
          FileWriter archivoSalida = new FileWriter(file, true);
          CSVWriter writer = new CSVWriter(archivoSalida);



           if (file.length()==0){
            String [] Encabezado={"Documento","Fecha", "Hora", "Medico", "Diagnostico", "Lugar", "DiagnosticoClinico", "IdEstudio", "IdRegistro"};
             writer.writeNext(Encabezado);
           }

            String []datos=arraydatos;
            //escribimos el archivo csv
            writer.writeNext(datos);

            writer.close();
        }     
        catch(Exception e){
                System.out.print("No se pudo escribir el archivo registro paciente");
        }
    }
    
    /**
     * Lee y crea objetos de historia clínica a partir de un archivo CSV.
     *
     * @param hora {@link Date}-La hora a buscar en la historia clínica.
     * @param fecha {@link Date}-La fecha a buscar en la historia clínica.
     * @return {@link ArrayList}-Una lista de objetos HistoriaClinica creados a partir de los datos del archivo CSV.
     */
    public ArrayList<HistoriaClinica> leerCrearHistoriaClinica(Date hora,Date fecha){
        File f=new File(Utilidades.rutaHistoriaClinica());
        ArrayList<HistoriaClinica>hc2=new ArrayList();
        ArrayList <ResultadoEstudio>re2=new ArrayList();
        
        try {
            FileReader fileReader = new FileReader(f);
            CSVReader csvReader = new CSVReader(fileReader);
            csvReader.skip(1);
            String lineas[];
            //"IDESTUDIO","FECHA","HORA","TIPO","INFORME","DNI"
            while ((lineas = csvReader.readNext()) != null){
                HistoriaClinica hc=new HistoriaClinica();
                ResultadoEstudio re=new ResultadoEstudio();
                re.setFecha(fecha);
                re.setHora(hora);
                re.setInforme(lineas[1]);
                re.setTipoDeEstudio(lineas[3]);
                re2.add(re);
                hc.setResultadoestudio(re2);
                hc2.add(hc);

            }
    
            csvReader.close();
            return hc2;
        }
            catch(Exception e){
            System.err.println("Error al leerHistoriaClinica: " + e.getMessage());
            e.printStackTrace();
        }
      return null;
    }

    
      public ArrayList<HistoriaClinica> leerHistoriaClinica(){
        File f=new File(Utilidades.rutaHistoriaClinica());
        ArrayList<HistoriaClinica>hc2=new ArrayList();
        
        try {
        FileReader fileReader = new FileReader(f);
        CSVReader csvReader = new CSVReader(fileReader);
        csvReader.skip(1);
        String lineas[];
        while ((lineas = csvReader.readNext()) != null){
            HistoriaClinica hc=new HistoriaClinica();
            hc.getPaciente().setDocumento(Integer.parseInt(lineas[0]));
            hc.getPaciente().setNombre(lineas[1]);
            hc.getPaciente().setApellido(lineas[2]);
            hc.setId(Integer.parseInt(lineas[3]));
            hc.setFecha(Utilidades.getDate(lineas[4]));
            hc.setHora(Utilidades.obtenerHora(lineas[5]));
            hc.getMedico().setDocumento(Integer.parseInt(lineas[6]));
            hc.setDiagnostico(lineas[7]);
            hc.setLugarAtencion(Utilidades.getAtencion(lineas[8]));
            System.out.println(Utilidades.getAtencionSTR(hc.getLugarAtencion()));
            hc.setDiagnosticoClinico(lineas[9]);
          hc2.add(hc);
          
        }
    
        csvReader.close();
        return hc2;
    }
        catch(Exception e){
        System.err.println("Error al leerHistoriaClinica: " + e.getMessage());
        e.printStackTrace();
        }
      return null;
  }  
   
    
}

