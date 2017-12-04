/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empanadas;

/**
 *
 * @author grimm
 */
public class MetodosPromos {
    
    public int promocional(String provincia,int empSalteñas,int empTucumanas){
        int totalSalteñas=0;
        int totalTucumanas=0;
        if (provincia =="Salta") {
            totalSalteñas= empSalteñas/4;
            totalTucumanas=empTucumanas/2;
        }else if(provincia=="Tucuman"){
            totalSalteñas=empSalteñas/2;
            totalTucumanas=empTucumanas/4;
        }else if(provincia=="Jujuy"||provincia=="Catamarca"){
            totalSalteñas=empSalteñas/3;
            totalTucumanas=empTucumanas/3;
        }
        if(totalSalteñas>totalTucumanas){
            return totalTucumanas;
        }else{
            return totalSalteñas;
        }
        
        
        
    }
    
}
