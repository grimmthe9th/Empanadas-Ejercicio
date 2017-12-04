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

    /** La casa de empanadas necesita conocer la cant de cajas de promocion
     * que puede ofrecer en un dia determinado a la cantidad de empanadas
     * que puedan preparar ese dia.Las promociones son de 6 empanadas por caja y las
     * proporciones de acuerdo a la provincia donde se encuentre el local, de acuerdo
     * a los sig datos:
     * 
     *Provincia= Salta (empanadas Salteñas = 4 / empanadas Tucumanas = 2)
     * Provincia= Tucuman(empanadas Salteñas= 2/ empanadas Tucumanas = 4)
     * Provincia= Catamarca y Jujuy (empanadas Salteñas= 3/ empanadas Tucumanas = 3)
     * 
     * Codificar en Java Cuantas cajas de promocion puedo armar
     * 
     */
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String provinciasemp="" ;
        int empSalteñasXdia ;
        int empTucumanasXdia;
        int empanadasTucumanas;
        int empanadasSalteñas;
        int numProvincia ;
        int cajaPromocion;
        MetodosPromos MP = new MetodosPromos();
    
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
        System.out.println("Tiene : " +MP.promocional(provinciasemp, empSalteñasXdia, empTucumanasXdia)+" cajas de promocion");
        
    } 
    
}
