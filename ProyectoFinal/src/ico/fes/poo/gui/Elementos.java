/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ico.fes.poo.gui;

/**
 *
 * @author dianakaren
 */
public class Elementos {
    private String nombre;
    private String especie;
    private float peso;
    private float tamanio;
    private String color;
    private int numeroDePatas;

    public Elementos() {
    }

    public Elementos(String nombre, String especie, float peso, float tamanio, String color, int numeroDePatas) {
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.tamanio = tamanio;
        this.color = color;
        this.numeroDePatas = numeroDePatas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

}