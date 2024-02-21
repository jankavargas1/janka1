/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author janka
 */
public class Mavenproject2 {

public class profesor { 
    private String nombreProfesor;
    private String materia;
    private String alumnosAsignados;
}
public class estudiante { 
    private String nombreEstudiante;
    private String direccionEstudiante;
    private String carreraEstudiante;
    private String semestre;
}

public class Notas {
        public float notaFinal=0;
        private float notaAutoevaluacion=0;
        private float notaDelParcial=0;
        private float notaDetrabajos=0;
    public float obtenerNotaParcial () {
    return notaDelParcial; }
    public float obtenerNotaAutoevaluacion () {
    return notaAutoevaluacion;}
    public float obtenerNotaDeTrabajos () {
    return notaDetrabajos; }  
    public void hallarNotaDelParcial (float nnotaDelParcial){
    notaDelParcial=nnotaDelParcial;} 
    public void hallarnotaAutoevaluacion (float nnotaAutoevaluacion){
    notaAutoevaluacion=nnotaAutoevaluacion;} 
    public void hallarnotaDetrabajos (float nnotaDetrabajos,float nnotaDetrabajos1,float nnotaDetrabajos2 ){
    notaDetrabajos=((nnotaDetrabajos+nnotaDetrabajos1+nnotaDetrabajos2)/3);}    
    public void hallarNotaFinal (){
    notaFinal= (float) ((notaAutoevaluacion*0.10)+(notaDelParcial*0.60)+(notaDetrabajos*0.30));}
}
    public class Notas {
    public static void Main(String[] args) {
            Notas calificacion = new Notas();
    }  }}

    

