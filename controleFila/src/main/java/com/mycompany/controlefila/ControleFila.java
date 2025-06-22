/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controlefila;

/**
 *
 * @author gabri
 */
public class ControleFila {

    public static void main(String[] args) {
        ControleFilaImpressao impressora = new ControleFilaImpressao();

        impressora.adicionarDocumentoNormal();
        impressora.adicionarDocumentoUrgente();
        impressora.adicionarDocumentoNormal();
        impressora.adicionarDocumentoUrgente();

        System.out.println("\nFila atual:");
        impressora.visualizarFila();

        System.out.println("\nTotal documentos: " + impressora.totalDocumentos());
        System.out.println("Total páginas: " + impressora.totalPaginas());

        System.out.println("\nProcessando");
        impressora.processarProximo();
        impressora.processarUltimo();

        System.out.println("\nFila após processamento:");
        impressora.visualizarFila();
    }
}
