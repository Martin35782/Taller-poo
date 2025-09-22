package edu.tallerpoo.data;

import edu.tallerpoo.model.Enfermera;
import edu.tallerpoo.model.Funcionario;
/**
 * La clase LogicaEnfermeria se encarga de crear objetos Enfermera a partir de objetos Funcionario.
 * 
 */
public class LogicaEnfermeria {
    
    /**
     * Crea un objeto Enfermera a partir de un objeto Funcionario.
     *
     * @param fun{@link Funcionario}-El objeto Funcionario del cual se creará la Enfermera.
     * @return {@link Enfermera}-Un objeto Enfermera configurado con los atributos del Funcionario.
     */
    public Enfermera createEnfermera(Funcionario fun){
        Enfermera enfer = setEnfermera(fun);
        return enfer;
    }
        
    /**
     * Crea un objeto Enfermera a partir de un objeto Funcionario.
     *
     * @param fun{@link Funcionario}-El objeto Funcionario del cual se creará la Enfermera.
     * @return {@link Enfermera}-Un objeto Enfermera configurado con los atributos del Funcionario.
     */
    private Enfermera setEnfermera(Funcionario fun){
        Enfermera e = new Enfermera();
    
        e.setDocumento(fun.getDocumento());
        e.setNombre(fun.getNombre());
        e.setApellido(fun.getApellido());
        e.setEmail(fun.getEmail());
        e.setFechaNac(fun.getFechaNac());
        e.setTelFijo(fun.getTelFijo());
        e.setCelular(fun.getCelular());
        e.setEstadoCivil(fun.getEstadoCivil());
        e.setDomicilio(fun.getDomicilio());
        e.setSexo(fun.getSexo());
        e.setUsuario(fun.getUsuario());
        e.setContrasena(fun.getContrasena());
        e.setRol(fun.getRol());
        return e;
        
    }
}
