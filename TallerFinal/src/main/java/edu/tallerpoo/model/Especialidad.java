
package edu.tallerpoo.model;
/**
 * La clase Especialidad representa una especialidad médica o área de experiencia.
 */
public class Especialidad {
    private String especialidad;

    /**
     * Crea una instancia de Especialidad con el nombre de la especialidad.
     *
     * @param especialidad {@link String}-El nombre de la especialidad médica.
     */
    public Especialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Crea una instancia de Especialidad sin asignar un nombre de especialidad.
     * (Constructor por defecto)
     */
    public Especialidad() {
    }

    /**
     * Obtiene el nombre de la especialidad médica.
     *
     * @return {@link String}-El nombre de la especialidad.
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Establece el nombre de la especialidad médica.
     *
     * @param especialidad {@link String}-El nombre de la especialidad a asignar.
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Devuelve una representación en cadena de la especialidad.
     *
     * @return {@link Strign}-Una cadena que representa la especialidad.
     */
    @Override
    public String toString() {
        return "Especialidad{" +
                "especialidad='" + especialidad + '\'' +
                '}';
    }
}