/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empanadas;

import java.util.Scanner;

/**
 *
 * @author grimm
 */
public class Empanadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String provinciasemp ;
        int empSalteñasXdia ;
        int empTucumanasXdia;
        int empanadasTucumanas;
        int empanadasSalteñas;
        int numProvincia ;
        int cajaPromocion;
       
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserte codigo de provincia");
        numProvincia=sc.nextInt();
        switch(numProvincia){
              case 1:  provinciasemp = "Salta";
                        break;
              case 2:  provinciasemp = "Tucuman";
                        break;
              case 3:  provinciasemp = "Catamarca";
                        break;
              case 4:  provinciasemp = "Jujuy";
                        break;
              default: provinciasemp = "Error";
                        break;         
          }
        
        System.out.println("Numero de provincia = "+numProvincia+"/ Provincia = " +provinciasemp);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Ingrese cant de empanadas Salteñas por dia");
        empSalteñasXdia= sc.nextInt();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Ahora Ingrese cant de empanadas Tucumanas por dia");
        empTucumanasXdia=sc.nextInt();
        System.out.println("Tiene " + empSalteñasXdia+ " empanadas Salteñas");
        System.out.println("Tiene "+ empTucumanasXdia+" empanadas Tucumanas");
        
    
        if (provinciasemp == "Salta") {
            empanadasSalteñas=4;
            int totalCajas= empSalteñasXdia/empanadasSalteñas;
            System.out.println("Tiene un total de: "+ totalCajas + " cajas de promocion");
        }else if (provinciasemp == "Tucuman"){
            empanadasTucumanas=4;
            int totalCajas= empTucumanasXdia/ empanadasTucumanas;
            System.out.println("Tiene un total de: "+ totalCajas + " cajas de promocion");
        }else if(provinciasemp=="Catamarca"|| provinciasemp=="Jujuy" && empSalteñasXdia>empTucumanasXdia){
            int totalCajas= empTucumanasXdia/3;
            System.out.println("Tiene un total de: "+ totalCajas + " cajas de promocion");
        }else if(provinciasemp=="Catamarca"|| provinciasemp=="Jujuy" && empSalteñasXdia<empTucumanasXdia){
            int totalCajas= empSalteñasXdia/3;
            System.out.println("Tiene un total de: "+ totalCajas + " cajas de promocion");
        
        }
        
        
    } 
    
}