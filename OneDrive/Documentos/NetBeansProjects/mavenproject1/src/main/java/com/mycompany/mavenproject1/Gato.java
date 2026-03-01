/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;


public class Gato implements Animal {
    private String nombre;
    private boolean ronronea;
    
    public Gato(String nombre) {
        this.nombre = nombre;
        this.ronronea=false;
    }
    
    @Override
    public String getNombre() {
        return nombre;
    }

    public void setRonronea(boolean ronronea) {
        this.ronronea = ronronea;
    }
    
    @Override
    public String hacerSonido() {
        return "Miau";
    }
    
    public boolean isRonroneando() {
        return this.ronronea;
    }
}
