
package edu.tallerpoo.model;
/**
 * La clase BoxAtencion representa un box de atención médica en un hospital.
 * Cada box puede estar asociado a un médico y puede tener un registro de atención médica.
 */
public class BoxAtencion {
    private Registro registro; 
    private int numeroBox;
    private Medico medico; 

    /**
     * Crea una instancia de BoxAtencion con un número de box y un médico asociado.
     *
     * @param numeroBox {@link Integer}- El número único que identifica este box.
     * @param medico{@link Medico}- El médico asignado a este box.
     */
    public BoxAtencion(int numeroBox, Medico medico) {
        this.numeroBox = numeroBox;
        this.medico = medico;
    }

    /**
     * Crea una instancia de BoxAtencion con un número de box. No se asigna un médico.
     *
     * @param numeroBox {@link Integer}- El número único que identifica este box.
     */
    public BoxAtencion(int numeroBox) {
        this.numeroBox = numeroBox;
    }
    
    /**
     * Constructor por defecto de BoxAtencion
     */
    public BoxAtencion(){
    }
    
    
    /**
     * Obtiene el número único que identifica este box.
     *
     * @return{@link Integer}- El número de box.
     */
    public int getNumeroBox() {
        return numeroBox;
    }
    /**
     * Establece el número único que identifica este box.
     *
     * @param numeroBox{@link Integer}- El número de box a asignar.
     */
    public void setNumeroBox(int numeroBox) {
        this.numeroBox = numeroBox;
    }

    /**
     * Establece el médico asignado a este box.
     *
     * @param medico {@link Medico} -El médico a asignar a este box.
     */
    public void setMedico(Medico medico){
        this.medico = medico;
    }

    /**
     * Obtiene el médico asignado a este box.
     *
     * @return {@link Medico}-El médico asignado a este box.
     */
    public Medico getMedico(){
        return this.medico;
    }
    
    /**
     * Establece el registro de atención médica asociado a este box.
     *
     * @param registro {@link Registro}-El registro de atención médica a asignar a este box.
     */
    public void setRegistro(Registro registro){
        this.registro = registro;
    }

    /**
     * Obtiene el registro de atención médica asociado a este box.
     *
     * @return{@link Registro}-El registro de atención médica asociado a este box.
     */
    public Registro getRegistro(){
        return this.registro;
    }
}

