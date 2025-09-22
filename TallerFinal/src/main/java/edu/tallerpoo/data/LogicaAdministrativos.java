package edu.tallerpoo.data;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import edu.tallerpoo.model.Administrativo;
import edu.tallerpoo.model.Funcionario;
import edu.tallerpoo.model.Gestor;
import edu.tallerpoo.model.Sector;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * Esta clase proporciona la lógica para administrar administrativos y gestores en archivos CSV.
 */
public class LogicaAdministrativos {
    
     /**
     * Convierte un objeto Funcionario en un objeto Administrativo, ademas de generarle una ID.
     *
     * @param fun {@link Funcionario}-El Funcionario del que se creará un Administrativo.
     * @return {@link Administrativo}-Un nuevo Administrativo con los datos del Funcionario.
     * @throws FileNotFoundException si no se encuentra el archivo.
     * @throws IOException si ocurre un error de lectura.
     * @throws CsvValidationException si ocurre un error de validación de CSV.
     */
    public static Administrativo setAdministrativo(Funcionario fun) throws FileNotFoundException, IOException, CsvValidationException{
        Administrativo administrativo = parseAdministrativo(fun);
        
        FileReader file = new FileReader(Utilidades.rutaAdministrativos());
        CSVReader reader = new CSVReader(file);
        
        String[] rows;
        reader.skip(1);
        while((rows = reader.readNext()) != null){
            int dni = Integer.parseInt(rows[0]);
            if(dni == administrativo.getDocumento()){
                reader.close();
                Sector sector = createSector(Integer.parseInt(rows[1]));
                administrativo.setSector(sector);
                return administrativo;
            }
        }
        return null;
    }
    /**
     * Convierte un objeto Administrativo en un objeto Gestor.
     *
     * @param adm {@link Administrativo}-El Administrativo del que se creará un Gestor.
     * @return {@link Gestor}-Un nuevo Gestor con los datos del Administrativo.
     */
    public static Gestor setGestor(Administrativo adm){
        Gestor ges = parseGestor(adm);
        return ges;
    }
    
    
    /**
     * Crea un sector especifico 
     * 
     * @param id_sector {@link Integer}-ID del sector a crear 
     * @return {@link Sector}-Sector que fue creado
     * @throws FileNotFoundException
     * @throws IOException
     * @throws CsvValidationException 
     */
    private static Sector createSector(int id_sector) throws FileNotFoundException, IOException, CsvValidationException{
        Sector sector = new Sector();
        FileReader file = new FileReader(Utilidades.rutaSectores());
        CSVReader reader = new CSVReader(file);
        
        String[] rows;
        reader.skip(1);
        
        while((rows = reader.readNext()) != null){
            int id = Integer.parseInt(rows[0]);
            if(id_sector == id){
                sector.setId(id);
                sector.setSector(rows[1]);
                return sector;
            }
        }
        return null;
    }
    
    /**
     * Recive un objeto funcionario y a partir de el crea y retorna un objeto Administrativo con todos sus datos.
     * 
     * @param fun{@link Funcionario}-Funcionario del cual se copiaran los datos.
     * @return {@link Administrativo}-Objeto administrativo creado.
     */
    private static Administrativo parseAdministrativo(Funcionario fun){
        Administrativo asd = new Administrativo();
        
        asd.setDocumento(fun.getDocumento());
        asd.setNombre(fun.getNombre());
        asd.setApellido(fun.getApellido());
        asd.setEmail(fun.getEmail());
        asd.setFechaNac(fun.getFechaNac());
        asd.setTelFijo(fun.getTelFijo());
        asd.setCelular(fun.getCelular());
        asd.setEstadoCivil(fun.getEstadoCivil());
        asd.setDomicilio(fun.getDomicilio());
        asd.setSexo(fun.getSexo());
        asd.setUsuario(fun.getUsuario());
        asd.setContrasena(fun.getContrasena());
        asd.setRol(fun.getRol());
        
        return asd;
    }
    
    
    /**
     * Recive un objeto Administrativo y a partir de el crea y retorna un Gestor con todos los datos cargados 
     * 
     * @param adm{@link Administrativo}-Administrativo del cual se copiaran los datos
     * @return {@link Gestor}-Objeto gestor creado.
     */
    private static Gestor parseGestor(Administrativo adm){
        Gestor g = new Gestor();
        g.setDocumento(adm.getDocumento());
        g.setNombre(adm.getNombre());
        g.setApellido(adm.getApellido());
        g.setEmail(adm.getEmail());
        g.setFechaNac(adm.getFechaNac());
        g.setTelFijo(adm.getTelFijo());
        g.setCelular(adm.getCelular());
        g.setEstadoCivil(adm.getEstadoCivil());
        g.setDomicilio(adm.getDomicilio());
        g.setSexo(adm.getSexo());
        g.setUsuario(adm.getUsuario());
        g.setContrasena(adm.getContrasena());
        g.setRol(adm.getRol());
        
        return g;
    }
}
