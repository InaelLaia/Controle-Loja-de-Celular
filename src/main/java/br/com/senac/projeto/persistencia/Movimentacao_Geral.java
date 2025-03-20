/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.projeto.persistencia;

/**
 *
 * @author inael
 * Entidade criada através de uma View no Banco de Dados
 */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movimentacao_Geral {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Nome_Produto;
    private String Nome_Deposito;
    private Double Preco_Produto;
    private int QTD_Movimentacao;
    private String Tipo_Movimentacao;

    public Movimentacao_Geral() {
    }

    public int getId() {
        return id;
    }

    public String getNome_Produto() {
        return Nome_Produto;
    }

    public String getNome_Deposito() {
        return Nome_Deposito;
    }

    public Double getPreco_Produto() {
        return Preco_Produto;
    }

    public int getQTD_Movimentacao() {
        return QTD_Movimentacao;
    }

    public String getTipo_Movimentacao() {
        return Tipo_Movimentacao;
    }
}
