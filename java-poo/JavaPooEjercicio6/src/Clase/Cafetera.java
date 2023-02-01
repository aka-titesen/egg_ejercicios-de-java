/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

/**
 *
 * @author Facundo
 */
public class Cafetera {

    private int capacidadMaxima;
    private int capacidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public int getcapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setcapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getcapacidadActual() {
        return capacidadActual;
    }

    public void setcapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

}
