package edu.tallerpoo.model;
import java.util.ArrayList;

public class Admision {
    private ArrayList<Registro>registros;
    private ArrayList <Administrativo>administrativos;

    public Admision(ArrayList<Administrativo> administrativos, ArrayList<Registro> registros) {
        this.administrativos = administrativos;
        this. registros = registros;
    }

    public Admision(){
        this.registros = new ArrayList<Registro>();
        this.administrativos = new ArrayList<Administrativo>();
    }

    public ArrayList<Registro> getRegistros(){
        return this.registros;
    }
    public void agregarRegistro(Registro  registro){
        this.registros.add(registro);
    }

    public ArrayList<Administrativo> getAdministrativos(){
        return this.administrativos;
    }

    public void agregarAdministrativo(Administrativo administrativo){
        this.administrativos.add(administrativo);
    }
}
