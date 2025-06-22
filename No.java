/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlefila;

/**
 *
 * @author gabri
 */
public class No {
    Documento documento;
    No anterior;
    No proximo;

    public No(Documento documento) {
        this.documento = documento;
        this.anterior = null;
        this.proximo = null;
    }
}
