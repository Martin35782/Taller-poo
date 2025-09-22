package edu.tallerpoo.model;
import java.util.ArrayList;
/**
 * Esta clase representa una admisión en el sistema.
 * La clse admisión está compuesta por una lista de registros y una lista de administrativos.
 */
public class Admision {
    private ArrayList<Registro>registros;
    private ArrayList <Administrativo>administrativos;
    
    
    /**
     * Constructor que inicializa una admisión con listas de administrativos y registros.
     * 
     * @param administrativos {@link ArrayList}-Lista de administrativos asociados a la admisión.
     * @param registros {@link ArrayList}-Lista de registros asociados a la admisión.
     */
    public Admision(ArrayList<Administrativo> administrativos, ArrayList<Registro> registros) {
        this.administrativos = administrativos;
        this. registros = registros;
    }
    
    /**
     * Constructor por defecto de Admision.
     * Inicializa listas vacías de administrativos y registros.
     */
    public Admision(){
        this.registros = new ArrayList<Registro>();
        this.administrativos = new ArrayList<Administrativo>();
    }
    
    /**
     * Obtiene la lista de registros asociados a la admisión.
     * @return {@link ArrayList}-Lista de registros.
     */
    public ArrayList<Registro> getRegistros(){
        return this.registros;
    }
    
    /**
     * Agrega un registro a la lista de registros asociados a la admisión.
     * @param registro{@link Registro}-El registro a agregar.
     */
    public void agregarRegistro(Registro  registro){
        this.registros.add(registro);
    }
    
    /**
     * Obtiene la lista de administrativos asociados a la admisión.
     * @return {@link ArrayList}-Lista de administrativos.
     */
    public ArrayList<Administrativo> getAdministrativos(){
        return this.administrativos;
    }
    
    
    /**
     * Agrega un administrativo a la lista de administrativos asociados a la admisión.
     * @param administrativo{@link Administrativo}- El administrativo a agregar.
     */
    public void agregarAdministrativo(Administrativo administrativo){
        this.administrativos.add(administrativo);
    }
}
