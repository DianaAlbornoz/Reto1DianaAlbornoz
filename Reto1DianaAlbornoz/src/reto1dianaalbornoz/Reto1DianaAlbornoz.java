/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1dianaalbornoz;

import Clases.clsPersona;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Diana Albornoz
 */
public class Reto1DianaAlbornoz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        clsPersona persona1 = new clsPersona();
        persona1.setNombre("Diana");
        persona1.setDocumento_id("1144");
        persona1.setAnio_nacimiento(1994);
        persona1.setEs_hombre(false);
        persona1.setProfesion("Diseñadora");
        persona1.setCodigo("001");
        
        clsPersona persona2 = new clsPersona("Juan", "1114", 1999, true, "Electricista", "002");
        
        
        
        System.out.println("\n================ Consulta de información ===================\n");
        
        System.out.println("    Código " + persona1.getCodigo());
        persona1.ConsultarInformacion();
        
        System.out.println("\n    Código " + persona2.getCodigo());
        persona2.ConsultarInformacion();
        System.out.println(" ");
        
        System.out.println("\n========================== Edad =============================\n");
        
        
        LocalDate hoy = LocalDate.now();
        int edadPersona1 = hoy.getYear() - persona1.getAnio_nacimiento();
        System.out.println(persona1.getNombre() + " tiene: " + edadPersona1 + " años");
        
        int edadPersona2 = hoy.getYear() - persona2.getAnio_nacimiento();
        System.out.println(persona2.getNombre() + " tiene: " + edadPersona2 + " años\n");
        
        
        
        if(edadPersona1 > edadPersona2){
            System.out.println(">>> " + persona1.getNombre() + " es mayor que " + persona2.getNombre());
        }else if(edadPersona2 > edadPersona1){
            System.out.println(">>> " + persona2.getNombre() + " es mayor que " + persona1.getNombre());
        }else{
            System.out.println(">>> " + persona1.getNombre() + " tiene la misma edad que " + persona2.getNombre());
        }
        
        System.out.println("\n========================= Género ============================\n");
        persona1.ConsultarGenero();
        persona2.ConsultarGenero();
        
    }
    
    
    
}
