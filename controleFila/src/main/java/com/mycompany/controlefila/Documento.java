/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlefila;

/**
 *
 * @author gabri
 */
public class Documento {
    private int id;
    private String tipo;
    private int paginas;

    public Documento(int id, String tipo, int paginas) {
        this.id = id;
        this.tipo = tipo;
        this.paginas = paginas;
    }

    public int getId() {
        return id;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Tipo: " + tipo + " | Páginas: " + paginas;
    }
}
