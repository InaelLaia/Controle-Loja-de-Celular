/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.projeto.persistencia;

/**
 *
 * @author inael
 * Entidade MOVIMENTACAO no Banco de Dados
 */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movimentacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int id_Produto;
    private int id_Deposito;
    private int qtd_Movimentacao;
    private int tipo_Movimentacao;

    public Movimentacao() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Produto() {
        return id_Produto;
    }

    public void setId_Produto(int id_Produto) {
        this.id_Produto = id_Produto;
    }

    public int getId_Deposito() {
        return id_Deposito;
    }

    public void setId_Deposito(int id_Deposito) {
        this.id_Deposito = id_Deposito;
    }

    public int getQtd_Movimentacao() {
        return qtd_Movimentacao;
    }

    public void setQtd_Movimentacao(int qtd_Movimentacao) {
        this.qtd_Movimentacao = qtd_Movimentacao;
    }

    public int getTipo_Movimentacao() {
        return tipo_Movimentacao;
    }

    public void setTipo_Movimentacao(int tipo_Movimentacao) {
        this.tipo_Movimentacao = tipo_Movimentacao;
    }
}
