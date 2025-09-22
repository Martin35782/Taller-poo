package edu.tallerpoo.model;
import java.util.Date;

public class Administrativo extends Funcionario{
    private Sector sector;
    private  Admision admision;
    public Administrativo(String nombre, String apellido, Date fechaNac, String domicilio, int documento, String telFijo, String celular, tipoEstCivil estadoCivil, String email, String usuario, String contrasena, tipoRol rol, Sector sector) {
        super(nombre, apellido, fechaNac, domicilio, documento, telFijo, celular, estadoCivil, email, usuario, contrasena, rol);
        this.sector = sector;
    }

    public Administrativo() {
        //Constructor por defecto
    }

    public void setSector(Sector sector){
        this.sector = sector;
    }

    public Sector getSector(){
        return this.sector;
    }

    public void setAdmision(Admision admision){
        this.admision = admision;
    }

    public Admision getAdmision(){
        return this.admision;
    }

    /*@Override
    public String toString() {
        return "Administrativo{" +
                "sector=" + sector +
                '}';
    }

     */
}
