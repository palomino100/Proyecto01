/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.promediofinal.prueba;

import pe.egcc.promediofinal.service.PromedioService;

/**
 *
 * @author Usuario
 */
public class Prueba01 {

    public static void main(String[] args) {
        //Datos
        int pc1 = 13;
        int pc2 = 15;
        int pc3 = 11; 
        int pc4 = 17;
        int EP = 15;
        int EF = 13;
        //Proceso
        PromedioService promedio;
    promedio = new PromedioService();
    double PromedioFinal = promedio.obtenerPromedio(pc1, pc2, pc3, pc4, EF, EP);
    // Reporte
    System.out.println("Practica1: " + pc1);
    System.out.println("Practica2: " + pc2);
    System.out.println("Practica3: " + pc3);
    System.out.println("Practica4: " + pc4);
    System.out.println("Examen Parcial: " + EP );
    System.out.println("Examen Final: " + EF );
    System.out.println("Promedio Final: " + PromedioFinal );
    }
    
}
