/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;



/**
 *
 * @author Diana Albornoz
 */
public class clsPersona {
    private String nombre;
    private String documento_id;
    private int anio_nacimiento;
    private boolean es_hombre;
    private String profesion;
    private String codigo;

    public clsPersona() {
    }

    public clsPersona(String nombre, String documento_id, int anio_nacimiento, boolean es_hombre, String profesion, String codigo) {
        this.nombre = nombre;
        this.documento_id = documento_id;
        this.anio_nacimiento = anio_nacimiento;
        this.es_hombre = es_hombre;
        this.profesion = profesion;
        this.codigo = codigo;
    }

     public void ConsultarInformacion(){
        System.out.println("Nombre: " + this.nombre + "\nDocumento de identidad: " + this.documento_id + "\nProfesión: " + this.profesion + "\nAño de nacimiento: " + this.anio_nacimiento);
    }
    
    
    
    public void ConsultarGenero(){
        if(es_hombre == false){
            System.out.println(this.codigo + " es de género femenino.");
        }else{
            System.out.println(this.codigo + " es de género masculino.");
    
        }
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the documento_id
     */
    public String getDocumento_id() {
        return documento_id;
    }

    /**
     * @param documento_id the documento_id to set
     */
    public void setDocumento_id(String documento_id) {
        this.documento_id = documento_id;
    }

    /**
     * @return the edad
     */
    public int getAnio_nacimiento() {
        return anio_nacimiento;
    }

    /**
     * @param edad the edad to set
     */
    public void setAnio_nacimiento(int anio_nacimiento) {
        this.anio_nacimiento = anio_nacimiento;
    }

    /**
     * @return the es_hombre
     */
    public boolean isEs_hombre() {
        return es_hombre;
    }

    /**
     * @param es_hombre the es_hombre to set
     */
    public void setEs_hombre(boolean es_hombre) {
        this.es_hombre = es_hombre;
    }

    /**
     * @return the profesion
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * @param profesion the profesion to set
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
