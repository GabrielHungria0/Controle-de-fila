/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlefila;

/**
 *
 * @author gabri
 */
public class Deque {
     private No inicio;
    private No fim;
    private int tamanho;

    public Deque() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public boolean estaVazio() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

    public void adicionarInicio(Documento doc) {
        No novo = new No(doc);
        if (estaVazio()) {
            inicio = fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
        tamanho++;
    }

    public void adicionarFim(Documento doc) {
        No novo = new No(doc);
        if (estaVazio()) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
        tamanho++;
    }

    public Documento removerInicio() {
        if (estaVazio()) return null;

        Documento doc = inicio.documento;
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
        tamanho--;
        return doc;
    }

    public Documento removerFim() {
        if (estaVazio()) return null;

        Documento doc = fim.documento;
        if (inicio == fim) {
            inicio = fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
        tamanho--;
        return doc;
    }

    public void exibirFila() {
        if (estaVazio()) {
            System.out.println("Fila está vazia.");
            return;
        }
        No atual = inicio;
        while (atual != null) {
            System.out.println(atual.documento);
            atual = atual.proximo;
        }
    }

    public int totalPaginas() {
        int total = 0;
        No atual = inicio;
        while (atual != null) {
            total += atual.documento.getPaginas();
            atual = atual.proximo;
        }
        return total;
    }
}
