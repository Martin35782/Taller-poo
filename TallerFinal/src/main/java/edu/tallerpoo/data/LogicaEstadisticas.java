package edu.tallerpoo.data;


import edu.tallerpoo.model.Registro;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 * Clase que maneja todo lo que tiene que ver con la logica de las estadisticas
 * 
 */
public class LogicaEstadisticas {
    
    
    /**
     * Obtiene el modelo del jTable con los pacientes atendidos en un rango de fechas y edades dados 
     * 
     * @param f1    {@link Date}-Fecha mas antigua 
     * @param f2    {@link Date}-Fecha mas reciente
     * @param edad1 {@link Integer}-Edad mas baja
     * @param edad2 {@link Integer}-Edad mas alta
     * @return {@link DefaultTableModel}-Tabla ya cargada con los pacientes discriminados
     */
    public DefaultTableModel EstadisticaEdadYFecha(Date f1, Date f2, int edad1, int edad2){
        Date fechaActual = new Date();
        
        LogicaRegistro r = new LogicaRegistro();
        ArrayList<Registro> registro = new ArrayList();
        registro = r.leerRegistro();
    

        Map<String, Integer> Edades = new HashMap<>();

        for (Registro p : registro) {
            Date fechaVisita = p.getFecha();
            if (fechaVisita.after(f1) && fechaVisita.before(f2)){
                Date fechaNac = p.getPaciente().getFechaNac();
                long diferencia = fechaActual.getTime() - fechaNac.getTime();
                long edadFinal = diferencia / 31536000000L;
                if (edadFinal >= edad1 && edadFinal <= edad2 ){
                    String aux = Integer.toString(p.getPaciente().getDocumento());
                    String nombrePaciente = p.getPaciente().getNombre();
                    String key = aux +" "+ nombrePaciente;
                    
                    Edades.put(key,(int) edadFinal);
                }      
            }
        }
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Documento");
        model.addColumn("Nombre");
        model.addColumn("Edad");

        for (Map.Entry<String, Integer> entry : Edades.entrySet()) {
            String pacienteInfo = entry.getKey();
            int edad = entry.getValue();
    
            String[] pacienteInfoArray = pacienteInfo.split(" ");
            String documento = pacienteInfoArray[0];
            String nombre = pacienteInfoArray[1];
    
            model.addRow(new Object[] { documento, nombre, edad });
        }
       
       return model;
    }
    
    
        /**
     * Obtiene el modelo del jTable con los pacientes atendidos en un rango de fechas
     * 
     * @param f1    {@link Date}-Fecha mas antigua 
     * @param f2    {@link Date}-Fecha mas reciente
     * @return {@link DefaultTableModel}-Tabla ya cargada con los pacientes discriminados
     */
    public DefaultTableModel estadisticaFecha(Date f1, Date f2){
        LogicaRegistro r=new LogicaRegistro();
        ArrayList<Registro>registro=new ArrayList();
        registro=r.leerRegistro();
        
        ArrayList<String> pacientes = new ArrayList();

        Map<String, Integer> contadorPacientes = new HashMap<>();

        for (Registro p : registro) {
            Date fechaVisita = p.getFecha();
    
            if (fechaVisita.after(f1) && fechaVisita.before(f2)){
            
                String aux = Integer.toString(p.getPaciente().getDocumento());
                String nombrePaciente = p.getPaciente().getNombre();
                String key = aux +" "+ nombrePaciente;

                
            if (contadorPacientes.containsKey(key)) {
                    
                    int count = contadorPacientes.get(key);
                    contadorPacientes.put(key, count + 1);
            } else {
                   
                    contadorPacientes.put(key, 1);
            }
            }
        }
         DefaultTableModel model = new DefaultTableModel();
         model.addColumn("Documento");
         model.addColumn("Nombre");
         model.addColumn("Cantidad de Visitas");

        for (Map.Entry<String, Integer> entry : contadorPacientes.entrySet()) {
            String pacienteInfo = entry.getKey();
            int cantidadVisitas = entry.getValue();
    
            String[] pacienteInfoArray = pacienteInfo.split(" ");
            String documento = pacienteInfoArray[0];
            String nombre = pacienteInfoArray[1];
    
            model.addRow(new Object[] { documento, nombre, cantidadVisitas });
        }
        return model;
    }
    
 }
    
    

