package edu.tallerpoo.model;

import java.util.ArrayList;

/**
 * La clase Sector representa una unidad organizativa en un entorno médico o de salud.
 * Cada sector tiene un identificador único, un nombre y una lista de administrativos asociados.
 */
public class Sector {
    private int id;
    private String sector;
    private ArrayList<Administrativo> adm;

    /**
     * Crea una instancia de la clase Sector con un nombre y un identificador único.
     *
     * @param sector {@link String}-El nombre del sector.
     * @param id     {@link Integer}-El identificador único del sector.
     */
    public Sector(String sector, int id) {
        this.id = id;
        this.sector = sector;
        this.adm = new ArrayList<Administrativo>();
    }

    /**
     * Crea una instancia de la clase Sector con valores predeterminados.
     * El identificador y el nombre se inicializan en 0 y null, respectivamente.
     */
    public Sector() {
        // constructor por defecto
    }

    /**
     * Obtiene el nombre del sector.
     *
     * @return {@link String}-El nombre del sector.
     */
    public String getSector() {
        return sector;
    }

    /**
     * Obtiene el identificador único del sector.
     *
     * @return {@link Integer}-El identificador único del sector.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único del sector.
     *
     * @param id {@link Integer}-El identificador único del sector.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Establece el nombre del sector.
     *
     * @param sector {@link String}-El nombre del sector.
     */
    public void setSector(String sector) {
        this.sector = sector;
    }

    /**
     * Agrega un administrativo a la lista de administrativos asociados al sector.
     *
     * @param admin {@link Administrativo}-El administrativo que se va a agregar.
     */
    public void agregarAdministrativo(Administrativo admin) {
        this.adm.add(admin);
    }

    /**
     * Obtiene la lista de administrativos asociados al sector.
     *
     * @return {@link ArrayList}-La lista de administrativos asociados al sector.
     */
    public ArrayList<Administrativo> getAdministrativos() {
        return this.adm;
    }

    /**
     * Devuelve una representación en cadena de la instancia de la clase Sector.
     *
     * @return {@link String}-Una cadena que representa el nombre del sector.
     */
    @Override
    public String toString() {
        return "Sector{" +
                "sector='" + sector + '\'' +
                '}';
    }
}