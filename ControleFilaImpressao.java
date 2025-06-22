/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlefila;

/**
 *
 * @author gabri
 */
import java.util.Random;
public class ControleFilaImpressao {
    private Deque fila;
    private Random random;
    private int[] idsGerados;

    public ControleFilaImpressao() {
        fila = new Deque();
        random = new Random();
        idsGerados = new int[1001];
    }

    private int gerarIdUnico() {
        int id;
        do {
            id = random.nextInt(1000) + 1;
        } while (idsGerados[id] == 1);
        idsGerados[id] = 1;
        return id;
    }

    private String gerarTipoAleatorio() {
        String[] tipos = {"PDF", "TXT", "JPG", "PNG", "DOCX", "XLSX"};
        return tipos[random.nextInt(tipos.length)];
    }

    private int gerarPaginas() {
        return random.nextInt(100) + 1;
    }

    public void adicionarDocumentoNormal() {
        Documento doc = new Documento(gerarIdUnico(), gerarTipoAleatorio(), gerarPaginas());
        fila.adicionarFim(doc);
        System.out.println("Documento adicionado no final: " + doc);
    }

    public void adicionarDocumentoUrgente() {
        Documento doc = new Documento(gerarIdUnico(), gerarTipoAleatorio(), gerarPaginas());
        fila.adicionarInicio(doc);
        System.out.println("Documento URGENTE adicionado no início: " + doc);
    }

    public void processarProximo() {
        Documento doc = fila.removerInicio();
        if (doc != null) {
            System.out.println("Processando documento (início): " + doc);
        } else {
            System.out.println("Fila vazia. Nada a processar.");
        }
    }

    public void processarUltimo() {
        Documento doc = fila.removerFim();
        if (doc != null) {
            System.out.println("Processando documento (final): " + doc);
        } else {
            System.out.println("Fila vazia. Nada a processar.");
        }
    }

    public void visualizarFila() {
        fila.exibirFila();
    }

    public boolean filaVazia() {
        return fila.estaVazio();
    }

    public int totalDocumentos() {
        return fila.tamanho();
    }

    public int totalPaginas() {
        return fila.totalPaginas();
    }
}
