package edu.tallerpoo.data;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import edu.tallerpoo.model.Paciente;
import edu.tallerpoo.data.LogicaTriage;
import edu.tallerpoo.model.Registro;
import edu.tallerpoo.model.tipoEstado;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Esta clase proporciona funcionalidades relacionadas con la gestión de registros de pacientes.
 * Permite la escritura y lectura de datos de registros de pacientes desde archivos CSV, así como
 * la creación y manipulación de objetos de tipo Registro.
 */
public class LogicaRegistro {
  Paciente paciente=new Paciente();  
    
    /**
     * Agrega los datos de un paciente al archivo CSV de personas.
     *
     * @param arrayDatos {@link Array}-Un arreglo de strings que contiene los datos del paciente a agregar.
     */
    public void agregarPacientes(String [] arrayDatos){
        File file = new File(Utilidades.rutaPersonas());
        try{
          FileWriter archivoSalida = new FileWriter(file, true);
           CSVWriter writer = new CSVWriter(archivoSalida);



           if (file.length()==0){
            String [] Encabezado={"Documento","Nombre","Apellido","Sexo","FechaNacimiento","Domicilio"
                    ,"TelFijo","Celular","EstadoCivil","Email"};
            writer.writeNext(Encabezado);
           }

            String []datos=arrayDatos;
            //escribimos el archivo csv
            writer.writeNext(datos);

            writer.close();
        }     
        catch(Exception e){
                System.out.print("No se pudo escribir el archivo registro paciente");

                }     
    }
 
 //Este metodo con diferencia al de arriba añade pacientes a pacientes.csv donde solo van  Documento,NombrePersonaContacto,DomicilioPersonaContacto,CelularPersonaContacto
    /**
     * Agrega los datos de un paciente al archivo CSV de datos de pacientes.
     *
     * @param arrayDatos {@link Array}-Un arreglo de strings que contiene los datos del paciente a agregar.
     */
    public void agregarPacientes2(String [] arrayDatos){
        File file = new File(Utilidades.datosPacientes());
        try{
          FileWriter archivoSalida = new FileWriter(file, true);
           CSVWriter writer = new CSVWriter(archivoSalida);



           if (file.length()==0){
            String [] Encabezado={"Documento","NombrePersonaContacto","DomicilioPersonaContacto","CelularPersonaContacto"};
             writer.writeNext(Encabezado);
           }

            String []datos=arrayDatos;
            //escribimos el archivo csv
            writer.writeNext(datos);

            writer.close();
        }     
        catch(Exception e){
                System.out.print("No se pudo escribir el archivo registro paciente2 ");

        }     
    }
    
    
 //Este metodo pone los datos necesario del registro Documento,IDRegistro,Fecha,Hora,Motivo,Estado
    /**
     * Agrega un nuevo registro de paciente al archivo CSV de registros de pacientes.
     */
    public void agregarRegistro(){
       File f=new File(Utilidades.datosRegistro());
       try{


       }
       catch(Exception e){
       System.out.println("Error al añadir registro en LogicaRegistro");
       }

    }
 
 
    /**
     * Lee el DNI del último paciente registrado en el archivo CSV de datos de pacientes.
     *
     * @return {@link Integer}-El DNI del último paciente registrado.
     */
    public int  leerPaciente() {
        File f = new File(Utilidades.datosPacientes());

        try {
            FileReader fileReader = new FileReader(f);
            CSVReader csvReader = new CSVReader(fileReader);
            csvReader.skip(1);
            String lineas[];
            while ((lineas = csvReader.readNext()) != null) {
                   paciente.setDocumento(Integer.parseInt(lineas[0]));
            }
        } catch (Exception e) {
            System.out.println("Error en leerPaciente en LogicaRegistro");
        }
        return paciente.getDocumento();

    }

    /**
     * Escribe un nuevo registro de paciente en el archivo CSV de registros de pacientes.
     *
     * @param Motivo {@link String}-El motivo del registro del paciente.
     * @param Fecha {@link String}-La fecha del registro.
     * @param Hora {@link String}-La hora del registro.
     */
    public void EscribirRegistro(String Motivo,String  Fecha,String Hora){
        File f = new File(Utilidades.datosRegistro());

        try{
          FileWriter archivoSalida = new FileWriter(f, true);
           CSVWriter writer = new CSVWriter(archivoSalida);
            if (f.length()==0){
            String [] Encabezado={"Documento","IDRegistro","Fecha","Hora","Motivo","Estado","Box"};
            writer.writeNext(Encabezado);
           }
           String dni=Integer.toString(leerPaciente());
           String id=Integer.toString(Utilidades.contarLineas());

           String []datos={dni,id,Fecha,Hora,Motivo, "NoAtendido", "0"};
           writer.writeNext(datos);
           writer.close();
        }
        catch(Exception e){
        System.out.print("Error al escribir registro en LogicaRegistro ");
        }
    }
    
        /**
     * Escribe un nuevo registro de paciente en el archivo CSV de registros de pacientes, que ya fueron registrados alguna vez.
     *
     * @param Motivo {@link String}-El motivo del registro del paciente.
     * @param Fecha {@link String}-La fecha del registro.
     * @param Hora {@link String}-La hora del registro.
     */
    public void EscribirRegistroPacienteExistente(int dni, String Motivo,String  Fecha,String Hora){
        File f = new File(Utilidades.datosRegistro());

        try{
          FileWriter archivoSalida = new FileWriter(f, true);
           CSVWriter writer = new CSVWriter(archivoSalida);
            if (f.length()==0){
            String [] Encabezado={"Documento","IDRegistro","Fecha","Hora","Motivo","Estado","Box"};
            writer.writeNext(Encabezado);
           }
           
           String id=Integer.toString(Utilidades.contarLineas());

           String []datos={Integer.toString(dni),id,Fecha,Hora,Motivo, "NoAtendido", "0"};
           writer.writeNext(datos);
           writer.close();
        }
        catch(Exception e){
        System.out.print("Error al escribir registro en LogicaRegistro ");
        }
    }
    
    
    
    

    /**
     * Crea un objeto de tipo Paciente a partir del DNI y los datos obtenidos del archivo CSV de datos de pacientes.
     *
     * @param dni {@link Integer}-El número de documento del paciente.
     * @return {@link Paciente}-Un objeto de tipo Paciente con los datos del paciente o null si el DNI no se encuentra en el archivo.
     */
    private static Paciente setPaciente(int dni) {
        try {
            CSVReader lector = new CSVReader(new FileReader(Utilidades.datosPacientes()));
            String lineas[];
            lector.skip(1);
            while ((lineas = lector.readNext()) != null) {
                if (Integer.parseInt(lineas[0]) == dni) {
                    Paciente pa = LogicaPaciente.leerPersona(dni);
                    pa.setNombrePersonaContacto(lineas[1]);
                    pa.setDomicilioPersonaContacto(lineas[2]);
                    pa.setCelularPersonaContacto(lineas[3]);
                    return pa;
                }
            }
        } catch (Exception e) {
            System.out.print("No se pudo verificar el DNI");
        }
        return null;
    }




    /**
     * Lee todos los registros de pacientes desde el archivo CSV de registros.
     *
     * @return {@link ArrayList}-Una lista de objetos de tipo Registro con los registros de pacientes.
     */
    public static ArrayList leerRegistro(){
      File f = new File(Utilidades.datosRegistro());

      ArrayList <Registro> r=new ArrayList();

        try {
            FileReader fileReader = new FileReader(f);
            CSVReader csvReader = new CSVReader(fileReader);
            csvReader.skip(1);
            String lineas[];
            String fecha;
            String hora;
              while ((lineas = csvReader.readNext()) != null) {
                  Paciente paciente=new Paciente();
                  Registro registro=new Registro();
                  registro.setPaciente(setPaciente(Integer.parseInt(lineas[0])));
                  registro.getPaciente().setDocumento(Integer.parseInt(lineas[0]));
                  registro.setId(Integer.parseInt(lineas[1]));
                  registro.setFecha(Utilidades.obtenerfecha(fecha=lineas[2]));
                  registro.setHora(Utilidades.obtenerHora(hora=lineas[3]));
                  registro.setMotivo(lineas[4]);
                  registro.setEstado(Utilidades.getEstado(lineas[5]));
                  registro.getBoxAtencion().setNumeroBox(Integer.parseInt(lineas[6]));
                  r.add(registro);
            }
         csvReader.close();
        } 
        catch(Exception e){
        e.printStackTrace(); ;

        }
        return r;
    }
    
    /**
     * Crea un objeto de tipo Registro a partir de un arreglo de strings que contiene los datos del registro.
     *
     * @param data {@link Array}-Un arreglo de strings con los datos del registro.
     * @return {@link Registro}-Un objeto de tipo Registro con los datos del registro.
     */
    public static Registro setRegistro(String[] data){
        Registro p = new Registro();

        p.setId(Integer.parseInt(data[1]));
        p.setFecha(Utilidades.obtenerfecha(data[2]));
        p.setHora(Utilidades.obtenerHora(data[3]));
        p.setMotivo(data[4]);
        p.setEstado(Utilidades.getEstado(data[5]));
        p.setPaciente(setPaciente(Integer.parseInt(data[0])));
        return p;

    }
    
    /**
     * Obtiene el registro que corresponde a un paciente a traves de su dni.
     * 
     * @param dni {@link Integer}-DNI del paciente
     * @return    {@link Registro}-Regisrto correspondiente al paciente
     * @throws FileNotFoundException
     * @throws IOException
     * @throws CsvValidationException 
     */
    public static Registro getUnRegistro(int dni) throws FileNotFoundException, IOException, CsvValidationException{
        FileReader file = new FileReader(Utilidades.datosRegistro());
        CSVReader reader = new CSVReader(file);
        reader.skip(1);
        
        String[] rows;
        
        while((rows = reader.readNext()) != null){
            int dniReg = Integer.parseInt(rows[0]);
            if(dniReg == dni){
                Registro r = new Registro();
                r.setId(Integer.parseInt(rows[1]));
                r.setFecha(Utilidades.getDate(rows[2]));
                r.setHora(Utilidades.obtenerHora(rows[3]));
                r.setMotivo(rows[4]);
                r.setEstado(Utilidades.getEstado(rows[5]));
                return r;
            
            }
        
        }
      return null;
    }

    /**
     * Cambia el estado de un paciente utilizando como referecia su dni
     * 
     * @param dni           {@link Integer}-DNI del paciente
     * @param nuevoEstado   {@link String}-Nuevo estado del paciente
     */
    public void cambiarEstadoPaciente(int dni, String nuevoEstado) {
        ArrayList<Registro> registros = leerRegistro();

        for (Registro registro : registros) {
            if (registro.getPaciente().getDocumento() == dni) {
                registro.setEstado(Utilidades.getEstado(nuevoEstado));
            }
        }
    }
    


     /**
      * Cuando se finaliza la atencion de un paciente, se deja libre el box en el que estaba y setea el estado del paciente en procesado.
      * 
      * @param dni  {@link Integer}-DNI del paciente 
      * @throws IOException
      * @throws CsvValidationException 
      */           
    public void FinAtencion (int dni) throws IOException, CsvValidationException {
        ArrayList<Registro> registros = leerRegistro();

        File f = new File(Utilidades.datosRegistro());
        LogicaBox box=new LogicaBox();
        FileWriter archivoSalida = new FileWriter(f);
        CSVWriter writer = new CSVWriter(archivoSalida);
        String[] encabezado = {"Documento","IDRegistro","Fecha","Hora","Motivo","Estado","Box"};
        writer.writeNext(encabezado);

        for (Registro v : registros) {
            if (v.getPaciente().getDocumento() == dni) {
                box.finBox(dni);
                String [] auxi = { Integer.toString(v.getPaciente().getDocumento()), Integer.toString(v.getId()), Utilidades.convertDate(v.getFecha()), Utilidades.convertHora(v.getHora()), v.getMotivo(), Utilidades.convertEstado(tipoEstado.Procesado), "0"};
                writer.writeNext(auxi);
                }
                else{
                String [] array = { Integer.toString(v.getPaciente().getDocumento()), Integer.toString(v.getId()), Utilidades.convertDate(v.getFecha()), Utilidades.convertHora(v.getHora()), v.getMotivo(), Utilidades.convertEstado(v.getEstado()),Integer.toString(v.getBoxAtencion().getNumeroBox())};
                writer.writeNext(array);
            }
        }
        writer.close();

    }


    /**
     * Actualiza un registro del archivo CSV registros
     * 
     * @param reg {@link Registro}-Registro que se actualiza
     */
    public static void actualizarRegistros(Registro reg) {
        ArrayList<Registro> registros=leerRegistro(); 
        File f = new File(Utilidades.datosRegistro());

        try {
            FileWriter archivoSalida = new FileWriter(f);
            CSVWriter writer = new CSVWriter(archivoSalida);
            String[] encabezado = {"Documento","IDRegistro","Fecha","Hora","Motivo","Estado","Box"};
            writer.writeNext(encabezado);


            for(Registro v : registros){
                if(v.getId() == reg.getId()){
                String [] auxi = { Integer.toString(v.getPaciente().getDocumento()), Integer.toString(v.getId()), Utilidades.convertDate(v.getFecha()), Utilidades.convertHora(v.getHora()), v.getMotivo(), Utilidades.convertEstado(tipoEstado.Atendido), Integer.toString(reg.getBoxAtencion().getNumeroBox())};
                writer.writeNext(auxi);
                }
                else{
                String [] array = { Integer.toString(v.getPaciente().getDocumento()), Integer.toString(v.getId()), Utilidades.convertDate(v.getFecha()), Utilidades.convertHora(v.getHora()), v.getMotivo(), Utilidades.convertEstado(v.getEstado()),Integer.toString(v.getBoxAtencion().getNumeroBox())};
                writer.writeNext(array);
                }
            }
            writer.close();
        } catch (Exception e) {
            System.out.print("Error al escribir registros en LogicaRegistro ");
        }
    }
}

