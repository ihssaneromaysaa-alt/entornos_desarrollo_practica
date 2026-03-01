/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;


public class Perro  implements Animal {
    private String nombre;
    private boolean enfadado;
    //atributo no usado
    private String talla;
    
    public Perro(String nombre) {
        this.nombre = nombre;
        this.enfadado=false;
    }
    
    @Override
    public String getNombre() {
        return nombre;
    }

    public boolean isEnfadado() {
        return enfadado;
    }

    public void setEnfadado(boolean enfadado) {
        this.enfadado = enfadado;
    }
    
    @Override
    public String hacerSonido() {
        return "Guau guau";
    }
    
    public boolean isLadrando() {
        return this.enfadado;
    }
    
    //ya no se usa este método
    public String getTalla() {
        return this.talla;
    }
    
    //ya no se usa este método
    public void setTalla(String nuevaTalla) {
        this.talla=nuevaTalla;
    }
}
