package edu.tallerpoo.data;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import edu.tallerpoo.model.BoxAtencion;
import edu.tallerpoo.model.tipoAtencion;
import edu.tallerpoo.model.tipoEstCivil;
import edu.tallerpoo.model.tipoEstado;
import edu.tallerpoo.model.tipoRol;
import edu.tallerpoo.model.tipoSexo;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * La clase Utilidades proporciona métodos de utilidad para el manejo de datos y rutas en la aplicación.
 */
public class Utilidades {
        
    
    public static String getAtencionSTR(tipoAtencion atencion){
        switch(atencion){
            case Consultorio -> {
                return "Consultorio";
            }
            case Emergencia -> {
                return "Emergencia";
            }
            case Internacion -> {
                return "Internacion";
            }
        }
        return null;
    } 
    
    
    
    public static tipoAtencion getAtencion(String lugar){
        switch(lugar){
            case "Consultorio" -> {
                return tipoAtencion.Consultorio;
            }
            case "Emergencia" -> {
                return tipoAtencion.Emergencia;
            }
            case "Internacion" -> {
                return tipoAtencion.Internacion;
            }
        }
        return null;
    } 
    
    
    
    
    /**
     * Valida si una cadena es un número.
     *
     * @param num {@link String}-La cadena a validar.
     * @return {@link Boolean}-`true` si la cadena es un número, de lo contrario `false`.
     */
    public static boolean validarNum(String num){
        boolean res;
        if(num.isEmpty() || !num.matches("^[^A-Za-z+,.-]+$")) {
            res = false;
        }else{
            res = true;
        }
        return res;
    }
    
    /**
     * Obtiene el tipo de sexo a partir de una cadena.
     *
     * @param sexo {@link String}-La cadena que representa el sexo.
     * @return {@link tipoSexo}-El tipo de sexo correspondiente.
     */
    public static tipoSexo getSexo(String sexo){
        switch(sexo){
            case "Masculino" -> {
                return tipoSexo.Masculino;
            }
            case "Femenino" -> {
                return tipoSexo.Femenino;
            }
            case "X" -> {
                return tipoSexo.X;
            }
        }
        return null;
    }
    
    /**
     * Obtiene el tipo de rol a partir de una cadena.
     *
     * @param rol {@link String}-La cadena que representa el rol.
     * @return {@link tipoRol}-El tipo de rol correspondiente.
     */
    public static tipoRol getRol(String rol){
        switch(rol){
            case "AdminAsignador" -> {
                return tipoRol.AdminAsignador;
            }
            case "Administrador" -> {
                return tipoRol.Administrador;
            }
            case "Medico" -> {
                return tipoRol.Medico;
            }
            case "Administrativo" -> {
                return tipoRol.Administrativo;
            }
            case "Enfermeria" -> {
                return tipoRol.Enfermeria;
            }
        }
        return null;
    }
    
    /**
     * Obtiene el tipo de estado civil a partir de una cadena.
     *
     * @param estado {@link String}-La cadena que representa el estado civil.
     * @return {@link tipoEstCivil}-El tipo de estado civil correspondiente.
     */
    public static tipoEstCivil getEstadoCivil(String estado){
        switch(estado){
            case "Soltero" -> {
                return tipoEstCivil.Soltero;
            }
            case "Casado" -> {
                return tipoEstCivil.Casado;
            }
            case "Divorciado" -> {
                return tipoEstCivil.Divorciado;
            }
            case "Viudo" -> {
                return tipoEstCivil.Viudo;
            }
        }
        return null;
    }
    
    /**
     * Obtiene una cadena a partir de un estado de un paciente
     *
     * @param est {@link tipoEstado}-Estado del que se obtiene la cadena.
     * @return {@link String}-Cadena del estado correspondiente.
     */
    public static String convertEstado(tipoEstado est){
        tipoEstado aten = tipoEstado.Atendido;
        tipoEstado no = tipoEstado.NoAtendido;
        tipoEstado proce = tipoEstado.Procesado;
        
        if(est == aten){
            return "Atendido";
        }
        else if(est == no){
            return "NoAtendido";
        }
        else if(est == proce){
            return "Procesado";
        }
        else{
            return null;
        }
    }
    
    /**
     * Obtiene el tipo de estado a partir de una cadena.
     *
     * @param estado {@link String}-La cadena que representa el estado.
     * @return {@link tipoEstado}-El tipo de estado correspondiente.
     */
    public static tipoEstado getEstado(String estado){
        switch(estado){
            case "Atendido" -> {
                return tipoEstado.Atendido;
            }
            case "NoAtendido" -> {
                return tipoEstado.NoAtendido;
            }
            case "Procesado" -> {
                return tipoEstado.Procesado;
            }
        }
        return null;
    }
    
    /**
     * Convierte una fecha en formato `Date` a una cadena en formato "dd-MM-yyyy".
     *
     * @param fecha {@link Date}-La fecha a convertir.
     * @return {@link String}-La fecha en formato de cadena.
     */
    public static String convertDate(Date fecha){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date f = fecha;
        String fechar=sdf.format(f);
        return fechar;
    }
    
    /**
     * Convierte una hora en formato `Date` a una cadena en formato "HH:mm".
     *
     * @param hora {@link Date}-La hora a convertir.
     * @return {@link String}-La hora en formato de cadena.
     */
    public static String convertHora(Date hora){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date h = hora;
        String fechar=sdf.format(h);
        return fechar;
    }
    
    /**
     * Obtiene una fecha a partir de una cadena en formato "dd-MM-yyyy".
     *
     * @param fecha {@link Date}-La cadena que representa la fecha.
     * @return {@link String}-La fecha correspondiente en formato `Date`.
     */
    public static Date getDate(String fecha){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        try {
            Date fechaNac = sdf.parse(fecha);
            return fechaNac;
        } catch (ParseException ex) {
            Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
        
    /**
     * Obtiene la ruta del archivo CSV que almacena información de funcionarios.
     *
     * @return {@link String}-La ruta completa del archivo CSV de funcionarios.
     */
    public static String rutaFuncionarios(){
        File f = new File("ruta.txt"); // Creamos un objeto file
        int largo = f.getAbsolutePath().length();
        String RutaFinal=f.getAbsolutePath().substring(0,largo-8)+"/src/main/java/edu/tallerpoo/data/"+"funcionarios.csv";
        return RutaFinal;
    }
    
    /**
     * Obtiene la ruta del archivo CSV que almacena información de los informes.
     *
     * @return {@link String}-La ruta completa del archivo CSV de informes.
     */
    public static String rutaInformes(){
        File f = new File("ruta.txt"); // Creamos un objeto file
        int largo = f.getAbsolutePath().length();
        String RutaFinal=f.getAbsolutePath().substring(0,largo-8)+"/src/main/java/edu/tallerpoo/data/"+"informes.csv";
        return RutaFinal;
    }
    
    /**
     * Obtiene la ruta del archivo CSV que almacena información de médicos.
     *
     * @return {@link String}-La ruta completa del archivo CSV de médicos.
     */
    public static String rutaMedicos(){
        File f = new File("ruta.txt"); // Creamos un objeto file
        int largo = f.getAbsolutePath().length();
        String RutaFinal=f.getAbsolutePath().substring(0,largo-8)+"/src/main/java/edu/tallerpoo/data/"+"medicos.csv";
        return RutaFinal;
    }
    
    /**
     * Obtiene la ruta del archivo CSV que almacena información de personas.
     *  
     * @return {@link String}-La ruta completa del archivo CSV de personas.
     */
    public static String rutaPersonas(){
        File f = new File("ruta.txt"); // Creamos un objeto file
        int largo = f.getAbsolutePath().length();
        String RutaFinal=f.getAbsolutePath().substring(0,largo-8)+"/src/main/java/edu/tallerpoo/data/"+"personas.csv";
        return RutaFinal;
    }
    
    /**
     * Obtiene la ruta del archivo CSV que almacena información de historias clínicas.
     *
     * @return {@link String}-La ruta completa del archivo CSV de historias clínicas.
     */
    public static String rutaHistoriaClinica(){
        File f = new File("ruta.txt"); // Creamos un objeto file
        int largo = f.getAbsolutePath().length();
        String RutaFinal=f.getAbsolutePath().substring(0,largo-8)+"/src/main/java/edu/tallerpoo/data/"+"historiaclinica.csv";
    return RutaFinal;
    }
    
    /**
     * Obtiene la ruta del archivo CSV que almacena información de boxes.
     *
     * @return {@link String}-La ruta completa del archivo CSV de boxes.
     */
    public static String rutaBox(){
        File f = new File("ruta.txt"); // Creamos un objeto file
        int largo = f.getAbsolutePath().length();
        String RutaFinal=f.getAbsolutePath().substring(0,largo-8)+"/src/main/java/edu/tallerpoo/data/"+"box.csv";
    return RutaFinal;
    }    
    
    /**
     * Obtiene la ruta del archivo CSV que almacena información de estudios.
     *
     * @return {@link String}-La ruta completa del archivo CSV de estudios.
     */
    public static String rutaEstudio(){
        File f = new File("ruta.txt"); // Creamos un objeto file
        int largo = f.getAbsolutePath().length();
        String RutaFinal=f.getAbsolutePath().substring(0,largo-8)+"/src/main/java/edu/tallerpoo/data/"+"estudios.csv";
    return RutaFinal;
    }
    
    /**
     * Obtiene la ruta del archivo CSV que almacena información de los pacientes.
     *
     * @return {@link String}-La ruta completa del archivo CSV de administrativos.
     */
    public static String rutaDatosPacientes(){
        File f = new File("ruta.txt"); // Creamos un objeto file
        int largo = f.getAbsolutePath().length();
        String RutaFinal=f.getAbsolutePath().substring(0,largo-8)+"/src/main/java/edu/tallerpoo/data/"+"DatosPaciente.csv";
    return RutaFinal;
    }
        
    /**
     * Obtiene la ruta del archivo CSV que almacena información de administrativos.
     *
     * @return {@link String}-La ruta completa del archivo CSV de administrativos.
     */
    public static String rutaAdministrativos(){
        File f = new File("ruta.txt"); // Creamos un objeto file
        int largo = f.getAbsolutePath().length();
        String RutaFinal=f.getAbsolutePath().substring(0,largo-8)+"/src/main/java/edu/tallerpoo/data/"+"administrativos.csv";
    return RutaFinal;
    }
    /**
     * Obtiene la ruta del archivo CSV que almacena información de sectores.
     *
     * @return {@link String}-La ruta completa del archivo CSV de sectores.
     */
    public static String rutaSectores(){
        File f = new File("ruta.txt"); // Creamos un objeto file
        int largo = f.getAbsolutePath().length();
        String RutaFinal=f.getAbsolutePath().substring(0,largo-8)+"/src/main/java/edu/tallerpoo/data/"+"sectores.csv";
    return RutaFinal;
    }
    
    /**
     * Obtiene la ruta del archivo CSV que almacena información de datos de pacientes.
     *
     * @return {@link String}-La ruta completa del archivo CSV de datos de pacientes.
     */
      public static String datosPacientes(){
        File f = new File("ruta.txt"); // Creamos un objeto file
        int largo = f.getAbsolutePath().length();
        String RutaFinal=f.getAbsolutePath().substring(0,largo-8)+"/src/main/java/edu/tallerpoo/data/"+"pacientes.csv";
    return RutaFinal;
    }
      
      
    /**
     * Obtiene la ruta del archivo CSV que almacena información de registros.
     *
     * @return {@link String}-La ruta completa del archivo CSV de registros.
     */  
    public static String datosRegistro(){
        File f = new File("ruta.txt"); // Creamos un objeto file
        int largo = f.getAbsolutePath().length();
        String RutaFinal=f.getAbsolutePath().substring(0,largo-8)+"/src/main/java/edu/tallerpoo/data/"+"registros.csv";
    return RutaFinal;
    }
   
    
    /**
     * Obtiene el número de líneas en un archivo CSV.
     *
     * @return {@link Integer}-El número de líneas en el archivo CSV de registros más uno.
     */
    public  static int contarLineas(){
    File f=new File(Utilidades.datosRegistro());
    int contador=0;
    try{
        CSVReader lector=new CSVReader(new FileReader(f));
        String []linea;
        lector.skip(1);
        while ((linea = lector.readNext()) != null) {
            contador++;
        }
        lector.close();
    }
    catch(Exception e){
        System.out.print("Error al leer archivo registro en Utilidades contar lineas");
    
    }
    return contador+1;
    }
        
    /**
     * Convierte una cadena de fecha en formato "dd-MM-yyyy" a un objeto Date.
     *
     * @param fecha {@link String}-La cadena de fecha en formato "dd-MM-yyyy" a convertir.
     * @return {@link Date}-Un objeto Date que representa la fecha.
     */
    public static Date obtenerfecha(String fecha){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

            try {
                Date fechaNac = sdf.parse(fecha);
                return fechaNac;
            } catch (Exception e) {
               System.out.println("Error al parsear la fecha");
            }
            return null;
  }
      
    /**
     * Convierte una hora en formato `Date` a una cadena en formato "HH:mm".
     *
     * @param hora {@link String}-La hora a convertir.
     * @return {@link Date}-La hora en formato de cadena.
     */
    public static Date obtenerHora(String hora) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        try {
            Date fechaNac = sdf.parse(hora);
            return fechaNac;
        } catch (Exception e) {
            e.printStackTrace(); // Imprime la traza de la excepción para ayudar a depurar el problema
            return null; // O realiza otro manejo de la excepción según tus necesidades
        }
    }

    /**
     * Obtiene la ruta del archivo CSV que almacena información de triage.
     *
     * @return {@link String}-La ruta completa del archivo CSV de triage.
     */
     public static String datosTriage(){
        File f = new File("ruta.txt"); // Creamos un objeto file
        int largo = f.getAbsolutePath().length();
        String RutaFinal=f.getAbsolutePath().substring(0,largo-8)+"/src/main/java/edu/tallerpoo/data/"+"Triage.csv";
        return RutaFinal;
    }
    /**
     * Genera un nuevo ID basado en el número de líneas en el archivo CSV de triage.
     *
     * @return {@link Integer}-El nuevo ID generado para un registro de triage.
     */
    public  static int GeneradorId(){
        File f=new File(Utilidades.datosTriage());
        int contador=0;
        try{
            CSVReader lector=new CSVReader(new FileReader(f));
            String []linea;
            lector.skip(1);
            while ((linea = lector.readNext()) != null) {
                contador++;

            }
            lector.close();
        }
        catch(Exception e){
            System.out.println("Error al generador de id"+ e.getMessage());
        }
        return contador+1;
   }
  }

    
    
  

