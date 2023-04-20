/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Contacto {
    //Atributos del modelo 
    private String nombre;
    private String apellido;
    private String email;
    private String descripcion;
    
    //Constructor vacio
    public Contacto(){
    
           
    }
    
    //Constructor con parametro
    public Contacto(String name){
        this.nombre = name;
    
    }
      
    
    //metodo para asignarle valor
    public void setNombre(String name){
    this.nombre =name;
    
    }
    
    
    //getters y setters metodo para obtener valor por cada atributo
    public String getNombre(){
    
             return nombre;
    }
    
    
    
 }
   
