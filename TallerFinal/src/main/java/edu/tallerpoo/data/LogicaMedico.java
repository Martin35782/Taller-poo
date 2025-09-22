package edu.tallerpoo.data;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import edu.tallerpoo.model.Funcionario;
import edu.tallerpoo.model.Medico;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * Esta clase proporciona funcionalidad para gestionar médicos y su información.
 * Permite la obtención de datos de un médico a partir de un archivo CSV que contiene
 * la información de los médicos, como la matrícula médica.
 */
public class LogicaMedico {  
        
    /**
     * Obtiene un objeto Medico a partir de un objeto Funcionario.
     *
     * @param fun {@link Funcionario}-El objeto Funcionario del cual se extraerán los datos para crear el objeto Medico.
     * @return {@link Medico}-Un objeto Medico con la información del médico.
     * @throws FileNotFoundException Si no se encuentra el archivo de médicos.
     * @throws IOException Si ocurre un error de lectura del archivo de médicos.
     * @throws CsvValidationException Si ocurre un error de validación del archivo CSV.
     */
    public static Medico settingMedico(Funcionario fun) throws FileNotFoundException, IOException, CsvValidationException{
        FileReader file = new FileReader(Utilidades.rutaMedicos());
        CSVReader reader = new CSVReader(file);
        
        String[] rows;
        reader.skip(1);
        
        while((rows = reader.readNext()) != null){
            int dni = Integer.parseInt(rows[0]);
            if(fun.getDocumento() == dni){
                Medico medic = setData(fun);
                medic.setMatricula(Integer.parseInt(rows[1]));
                
                return medic;
            }
        }
        return null;
    }
    /**
     * Establece los datos de un objeto Medico a partir de un objeto Funcionario.
     *
     * @param fun {@link Funcionario}-El objeto Funcionario del cual se extraerán los datos.
     * @return {@link Medico}-Un objeto Medico con los datos establecidos.
     */
    private static Medico setData(Funcionario fun){
        Medico medic = new Medico();
        medic.setDocumento(fun.getDocumento());
        medic.setNombre(fun.getNombre());
        medic.setApellido(fun.getApellido());
        medic.setEmail(fun.getEmail());
        medic.setFechaNac(fun.getFechaNac());
        medic.setTelFijo(fun.getTelFijo());
        medic.setCelular(fun.getCelular());
        medic.setEstadoCivil(fun.getEstadoCivil());
        medic.setDomicilio(fun.getDomicilio());
        medic.setSexo(fun.getSexo());
        return medic;
    }
}
