/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.tallerpoo.model;

import edu.tallerpoo.gui.RegistroPaciente;
import java.io.File;
import java.io.FileWriter;


/**
 *
 * @author grego
 */
public class ControladorLogico {
    public static int LogicaTriage(int Respiracion, int Pulso,int EstadoMental,int Conciencia,int Dolorpecho,int LesionesGraves,int Edad,int Fiebre,int Vomitos,int DolorAbdominal,int SignosShock,int Lesionesleves,int Sangrado) {
        int suma=(Respiracion+Pulso+EstadoMental+Conciencia+Dolorpecho+LesionesGraves+Edad+Fiebre+Vomitos+DolorAbdominal+SignosShock+Lesionesleves+Sangrado);
        return suma;
    }}




