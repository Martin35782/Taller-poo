package edu.tallerpoo.model;

import java.util.ArrayList;

public class Sector {
    private int id;
    private String sector;
    private ArrayList<Administrativo> adm;

    public Sector(String sector, int id){
        this.id = id;
        this.sector = sector;
        this.adm = new ArrayList<Administrativo>();
    }

    public Sector(){
        // constructor por defecto
    }

    public String getSector() {
        return sector;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public void agregarAdministrativo(Administrativo admin){
        this.adm.add(admin);
    }

    public ArrayList<Administrativo> getAdministrativos(){
        return this.adm;
    }

   /* @Override
    public String toString() {
        return "Sector{" +
                "sector='" + sector + '\'' +
                '}';
    }
    Es realmente necesario el metodo toString?
    */
}
