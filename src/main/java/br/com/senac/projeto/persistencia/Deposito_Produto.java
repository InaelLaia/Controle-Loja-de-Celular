/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.projeto.persistencia;

/**
 *
 * @author inael
 * Entidade relacionamento entre Deposito e Produto no Banco de Dados
 */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Deposito_Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int id_Deposito;
    private int id_Produto;
    private int Ponto_Reposicao;
    private int qtd_Atual;

    public Deposito_Produto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Deposito() {
        return id_Deposito;
    }

    public void setId_Deposito(int id_Deposito) {
        this.id_Deposito = id_Deposito;
    }

    public int getId_Produto() {
        return id_Produto;
    }

    public void setId_Produto(int id_Produto) {
        this.id_Produto = id_Produto;
    }

    public int getPonto_Reposicao() {
        return Ponto_Reposicao;
    }

    public void setPonto_Reposicao(int Ponto_Reposicao) {
        this.Ponto_Reposicao = Ponto_Reposicao;
    }

    public int getQtd_Atual() {
        return qtd_Atual;
    }

    public void setQtd_Atual(int qtd_Atual) {
        this.qtd_Atual = qtd_Atual;
    }  
}
