/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class TestContacto {
    public static void main(String[]args){
    //contacto es la clase o modelo maniqui y cont es el objeto  ropa
        //Contacto con = new Contacto("Victor");pasa valores por constructor
        Contacto con = new Contacto();
        //No se utiliza Constructor
        con.setNombre("Victor");
        System.out.println("Nom: " +con.getNombre());
    }
}
