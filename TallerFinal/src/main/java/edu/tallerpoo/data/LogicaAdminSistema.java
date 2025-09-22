package edu.tallerpoo.data;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;
import edu.tallerpoo.model.AdminSistema;
import edu.tallerpoo.model.Funcionario;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;



/**
 * Esta clase proporciona la lógica relacionada con la administración de funcionarios y personas en el sistema.
 */
public class LogicaAdminSistema {
    
    /**
     * Configura un objeto AdminSistema a partir de un objeto Funcionario.
     *
     * @param fun {@link Funcionario}-El Funcionario del que se creará un AdminSistema.
     * @return {@link AdminSistema}-Un nuevo objeto AdminSistema con los datos del Funcionario.
     */
    public AdminSistema settingAdmin(Funcionario fun){
        AdminSistema admin = setAdmin(fun);
        
        return admin;
    }
    
    /**
     * Configura un objeto AdminSistema a partir de un objeto Funcionario.
     *
     * @param fun {@link Funcionario}-El Funcionario del que se creará un AdminSistema.
     * @return {@link AdminSistema}-Un nuevo objeto AdminSistema con los datos del Funcionario.
     */
    private AdminSistema setAdmin(Funcionario fun){
        AdminSistema a = new AdminSistema();
        
        a.setDocumento(fun.getDocumento());
        a.setNombre(fun.getNombre());
        a.setApellido(fun.getApellido());
        a.setEmail(fun.getEmail());
        a.setFechaNac(fun.getFechaNac());
        a.setTelFijo(fun.getTelFijo());
        a.setCelular(fun.getCelular());
        a.setEstadoCivil(fun.getEstadoCivil());
        a.setDomicilio(fun.getDomicilio());
        a.setSexo(fun.getSexo());
        a.setUsuario(fun.getUsuario());
        a.setContrasena(fun.getContrasena());
        a.setRol(fun.getRol());
        return a;
    }
    
    /**
     * Elimina un funcionario por su DNI del archivo funcionarios.csv 
     *
     * @param dni {@link Integer}El DNI del funcionario a eliminar.
     */
    public void  eliminarFuncionarioPersona(int dni){
        File file1 = new File(Utilidades.rutaFuncionarios());
        ArrayList<String[]> registrosEliminar1 = new ArrayList<>();
        try{
        FileReader archivofuncionario=new FileReader(Utilidades.rutaFuncionarios());
        CSVReader lector=new CSVReader(archivofuncionario);
        ArrayList<String[]> registrosMantener1 = new ArrayList<>();
        String linea[];

        lector.skip(1);
        String [] encabezado1={"Documento","Usuario","Contrasena","Rol"};
        registrosMantener1.add(encabezado1 );

        while((linea=lector.readNext())!=null){
            int doc=Integer.parseInt(linea[0]);
            if(doc==dni){
                registrosEliminar1.add(linea); 

            }
            else{
                   registrosMantener1.add(linea);

               }  

        }
        lector.close();

           FileWriter escritorArchivo = new FileWriter(file1, false);
           CSVWriter escritorCSV = new CSVWriter(escritorArchivo);


           escritorCSV.writeAll(registrosMantener1);


           escritorCSV.close();
           eliminarPersona(dni);


        }
        catch(Exception e){
        System.out.println("Error al leer archivo Funcionario"+e.getMessage());

        }

    }
    
   /**
     * Elimina un funcionario por su DNI del archivo personas.csv 
     *
     * @param dni El DNI de la persona a eliminar.
     */
    private void eliminarPersona(int dni){
         
        File file = new File(Utilidades.rutaPersonas());
        ArrayList<String[]> registrosEliminar = new ArrayList<>();
        
        try {
            FileReader fileReader = new FileReader(Utilidades.rutaPersonas());
            CSVReader csvReader = new CSVReader(fileReader);

            String[] lineaSiguiente;
            csvReader.readNext(); 
            ArrayList<String[]> registrosMantener = new ArrayList<>();
            String [] encabezado={"﻿DOCUMENTO","Nombre","Apellido","Email","FechaNac","TelFijo","Celular","EstCivil","Domicilio","Sexo"};
            registrosMantener.add(encabezado );
            while ((lineaSiguiente = csvReader.readNext()) != null) { 

                if(Integer.parseInt(lineaSiguiente[0])==dni){
                        registrosEliminar.add(lineaSiguiente); 

                  }
                else{
                    registrosMantener.add(lineaSiguiente);

                }  
            }
            csvReader.close();
            FileWriter escritorArchivo = new FileWriter(file, false);
            CSVWriter escritorCSV = new CSVWriter(escritorArchivo);


            escritorCSV.writeAll(registrosMantener);


            escritorCSV.close();

        
        
     }
     
     catch(Exception e){
         System.out.print("error al eliminar funcinario");
     }}
     
    /**
     * Lee un Funcionario a partir de su DNI.
     *
     * @param dni {@link Integer}-El DNI del Funcionario a leer.
     * @return {@link Funcionario}-Un objeto Funcionario con los datos correspondientes al DNI proporcionado.
     * @throws FileNotFoundException si no se encuentra el archivo.
     * @throws IOException si ocurre un error de lectura.
     * @throws CsvValidationException si ocurre un error de validación de CSV.
     */
     public static Funcionario leerFuncionario(int dni) throws FileNotFoundException, IOException, CsvValidationException {
        FileReader fileReader = new FileReader(Utilidades.rutaPersonas());
        CSVReader csvReader = new CSVReader(fileReader);
        
        String[] lineaSiguiente;
        csvReader.readNext();  

        while ((lineaSiguiente = csvReader.readNext()) != null) {
            
            if (dni==Integer.parseInt(lineaSiguiente[0])){
                Funcionario funcionario = new Funcionario();
                funcionario.setDocumento(dni);
                funcionario.setNombre(lineaSiguiente[1]);
                funcionario.setApellido(lineaSiguiente[2]);
                funcionario.setEmail(lineaSiguiente[3]);
                funcionario.setFechaNac(Utilidades.getDate(lineaSiguiente[4]));
                funcionario.setTelFijo(lineaSiguiente[5]);
                funcionario.setCelular(lineaSiguiente[6]);
                funcionario.setEstadoCivil(Utilidades.getEstadoCivil(lineaSiguiente[7]));
                funcionario.setDomicilio(lineaSiguiente[8]);
                funcionario.setSexo(Utilidades.getSexo(lineaSiguiente[9]));
                csvReader.close();
                
                FileReader fileReaderFunc = new FileReader(Utilidades.rutaFuncionarios());
                CSVReader csvReaderFunc = new CSVReader(fileReaderFunc);
        
                String[] lineaSiguienteFunc;
                csvReaderFunc.readNext();
                
                while ((lineaSiguienteFunc = csvReaderFunc.readNext()) != null) {
                    if(dni==Integer.parseInt(lineaSiguienteFunc[0])){
                        funcionario.setUsuario(lineaSiguienteFunc[1]);
                        funcionario.setContrasena(lineaSiguienteFunc[2]);
                        funcionario.setRol(Utilidades.getRol(lineaSiguienteFunc[3]));
                        return funcionario;
                    }
                }
            }
        }
        return null;
     }
     
   /**
     * Agrega un funcionario al archivo personas.csv a partir de un arreglo de datos.
     *
     * @param arraydatos  {@link ArrayList}-Los datos de la persona a agregar.
     * @throws FileNotFoundException si no se encuentra el archivo.
     */
    public void agregarFuncionarioPersona(String[] arraydatos) throws FileNotFoundException{
         
         File file = new File(Utilidades.rutaPersonas());
         try{
         FileWriter archivoSalida = new FileWriter(file, true);
         CSVWriter writer = new CSVWriter(archivoSalida);
         if (file.length()==0){
            String [] Encabezado={"DOCUMENTO","Nombre","Apellido","Email","FechaNac","TelFijo","Celular","EstCivil","Domicilio","Sexo"};
            writer.writeNext(Encabezado);
        }
         
        String []datos=arraydatos;
        //escribimos el archivo csv
        writer.writeNext(datos);
        
        writer.close();
    }     
    catch(IOException e){
            System.out.print("No se pudo escribir el el CSV correspondiente las personas");
            
            }     
    }
         
   /**
     * Agrega un funcionario al archivo funcionarios.csv a partir de un arreglo de datos.
     *
     * @param arraydatos {@link ArrayList}-Los datos de la persona a agregar.
     * @throws FileNotFoundException si no se encuentra el archivo.
     */
    public void agregarFuncionario(String[] arraydatos) throws FileNotFoundException{
         
         File file = new File(Utilidades.rutaFuncionarios());
         try{
         FileWriter archivoSalida = new FileWriter(file, true);
         CSVWriter writer = new CSVWriter(archivoSalida);
         if (file.length()==0){
            String [] Encabezado={"﻿Documento","Usuario","Contrasena","Rol"};
            writer.writeNext(Encabezado);
        }
         
        String []datos=arraydatos;
        //escribimos el archivo csv
        writer.writeNext(datos);
        
        writer.close();
    }     
    catch(IOException e){
            System.out.print("No se pudo escribir el el CSV correspondiente los funcionarios");
            
            }     
    }
     
    /**
     * Verifica si un funcionario con el mismo DNI ya existe en el sistema.
     *
     * @param dni {@link Integer}-El DNI del funcionario a verificar.
     * @return {@link Boolean}-"true" si ya existe un funcionario con el mismo DNI, de lo contrario, "false".
     * @throws IOException si ocurre un error de lectura.
     * @throws CsvValidationException si ocurre un error de validación de CSV.
     */
     public boolean existeFuncionarioDni(int dni) throws IOException, CsvValidationException{ 
         
        // verifica que no exista otro funcionario con el mismo dni en el archivo funcionarios
        FileReader fileReaderFuncionario = new FileReader(Utilidades.rutaFuncionarios());
        CSVReader csvReaderFuncionario = new CSVReader(fileReaderFuncionario);
        
        String[] lineaSiguienteFuncionario;
        csvReaderFuncionario.readNext();  

        // verifica que no exista otro funcionario con el mismo dni en el archivo funcionarios
        while ((lineaSiguienteFuncionario = csvReaderFuncionario.readNext()) != null) {
            
            if (dni==Integer.parseInt(lineaSiguienteFuncionario[0])){
                csvReaderFuncionario.close();
                return true;
            }
        }   
     return false;
    }
    
    /**
     * Verifica si un funcionario con el mismo nombre de usuario ya existe en el sistema.
     *
     * @param usuario {@link String}-El nombre de usuario del funcionario a verificar.
     * @return {@link Boolean}-`true` si ya existe un funcionario con el mismo nombre de usuario, de lo contrario, `false`.
     * @throws FileNotFoundException si no se encuentra el archivo.
     * @throws IOException si ocurre un error de lectura.
     * @throws CsvValidationException si ocurre un error de validación de CSV.
     */
     public boolean existeFuncionarioUsuario(String usuario) throws FileNotFoundException, IOException, CsvValidationException{
         FileReader fileReader = new FileReader(Utilidades.rutaFuncionarios());
        CSVReader csvReader = new CSVReader(fileReader);
        
        String[] lineaSiguiente;
        csvReader.readNext();  

        // verifica que no exista otro funcionario con el mismo dni en el archivo funcionarios
        while ((lineaSiguiente = csvReader.readNext()) != null) {
            if (usuario.equals(lineaSiguiente[1])){
                csvReader.close();
                return true;
            }
        }
        return false;
    }
}

