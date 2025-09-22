package edu.tallerpoo.data;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import edu.tallerpoo.model.Funcionario;
import edu.tallerpoo.model.Persona;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que contiene métodos para la autenticación de usuarios y funciones auxiliares.
 */
public class logicaLogin {
        
    /**
     * Realiza el inicio de sesión para un usuario con el nombre de usuario y contraseña proporcionados.
     *
     * @param user     {@link String}-El nombre de usuario del funcionario.
     * @param password {@link String}-La contraseña del funcionario.
     * @return {@link Funcionario}-Un objeto Funcionario si la autenticación es exitosa, de lo contrario, retorna `null`.
     * @throws IOException            Si ocurre un error de entrada/salida.
     * @throws CsvValidationException Si ocurre un error de validación del archivo CSV.
     */
    
    public static Funcionario log(String user, String password) throws IOException, CsvValidationException{
        FileReader file = new FileReader(Utilidades.rutaFuncionarios());
        CSVReader reader = new CSVReader(file);
        
        String[] rows;
        reader.skip(1);
        
        while((rows = reader.readNext()) != null){
            if(rows[1].equals(user) && rows[2].equals(password)){
                reader.close();
                Persona auxperson = personaAux(Integer.parseInt(rows[0]));
                Funcionario funcionario = setFuncionario(auxperson);
                
                funcionario.setUsuario(rows[1]);
                funcionario.setContrasena(rows[2]);
                funcionario.setRol(Utilidades.getRol(rows[3]));
                return funcionario;
            }
        }
        return null;
    }


    /**
     * Obtiene la información de una persona a partir de su DNI.
     *
     * @param dni {@link Integer}-El número de Documento Nacional de Identidad (DNI) de la persona.
     * @return {@link Persona}-Un objeto Persona si se encuentra la persona, de lo contrario, retorna `null`.
     * @throws FileNotFoundException    Si no se encuentra el archivo CSV.
     * @throws CsvValidationException   Si ocurre un error de validación del archivo CSV.
     * @throws IOException             Si ocurre un error de entrada/salida.
     */
    private static Persona personaAux(int dni) throws FileNotFoundException, CsvValidationException, IOException{
        int findDni = 0;
        FileReader file = new FileReader(Utilidades.rutaPersonas());
        CSVReader reader = new CSVReader(file);
        
        String[] rows;
        reader.skip(1);
        
        while((rows = reader.readNext()) != null){
            findDni = Integer.parseInt(rows[0]);
            
            if(findDni == dni){
                Persona persona = new Persona();
                persona.setDocumento(dni);
                persona.setNombre(rows[1]);
                persona.setApellido(rows[2]);
                persona.setEmail(rows[3]);
                persona.setFechaNac(Utilidades.getDate(rows[4]));
                persona.setTelFijo(rows[5]);
                persona.setCelular(rows[6]);
                persona.setEstadoCivil(Utilidades.getEstadoCivil(rows[7]));
                persona.setDomicilio(rows[8]);
                persona.setSexo(Utilidades.getSexo(rows[9]));
                return persona;
            }
        }
        return null;   
    }
    
    /**
     * Crea un objeto Funcionario a partir de una persona.
     *
     * @param persona {@link Persona}-La persona a partir de la cual se crea el funcionario.
     * @return {@link Funcionario}-Un objeto Funcionario creado a partir de la persona.
     */
    private static Funcionario setFuncionario(Persona persona){
        Funcionario f = new Funcionario();
        f.setDocumento(persona.getDocumento());
        f.setNombre(persona.getNombre());
        f.setApellido(persona.getApellido());
        f.setEmail(persona.getEmail());
        f.setFechaNac(persona.getFechaNac());
        f.setTelFijo(persona.getTelFijo());
        f.setCelular(persona.getCelular());
        f.setEstadoCivil(persona.getEstadoCivil());
        f.setDomicilio(persona.getDomicilio());
        f.setSexo(persona.getSexo());
        return f;
    }
}
