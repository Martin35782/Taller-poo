package edu.tallerpoo.data;

import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Clase que contiene métodos para verificar información en archivos CSV.
 */
public class Verificaciones {
  
    /**
     * Verifica si un número de DNI está presente en el archivo CSV de personas.
     *
     * @param dni {@link Integer}El número de Documento Nacional de Identidad (DNI) a verificar.
     * @return {@link Boolean}-`true` si el DNI se encuentra en el archivo de personas, de lo contrario, `false`.
     */
    public boolean verificardni(int  dni) {
        String ruta=Utilidades.datosPacientes();

        try{
            CSVReader lector=new CSVReader(new FileReader(ruta));

            String lineas[];
            lector.skip(1);
            while ((lineas = lector.readNext()) != null) {
                if(Integer.parseInt(lineas[0])==dni){
                   return true;
                }
            }
        }     
        catch(Exception e){
                   System.out.print("no se pudo verificar el dni a ");
        }
       return false;
    }

}