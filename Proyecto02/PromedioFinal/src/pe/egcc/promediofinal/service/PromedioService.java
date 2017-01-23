/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.promediofinal.service;

/**
 *
 * @author Usuario
 */
public class PromedioService {
    
    public double obtenerPromedio
        (int pc1, int pc2, int pc3, int pc4, int EF, int EP){
    double PromedioPc;
    double PromedioFinal;
    PromedioPc = (pc1 + pc2 + pc3 + pc4) / 4;
    PromedioFinal = (PromedioPc * 0.30) + (EF*0.40) + (EP*0.30);    
    return PromedioFinal;
  }
    
}
