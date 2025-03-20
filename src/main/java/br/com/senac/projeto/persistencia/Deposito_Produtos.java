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
public class Deposito_Produtos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Nome_Deposito;
    private String Nome_Produto;
    private int Ponto_Reposicao;
    private int qtd_Atual;

    public Deposito_Produtos() {
    }

    public int getId() {
        return id;
    }

    public String getNome_Deposito() {
        return Nome_Deposito;
    }

    public String getNome_Produto() {
        return Nome_Produto;
    }

    public int getPonto_Reposicao() {
        return Ponto_Reposicao;
    }

    public int getQtd_Atual() {
        return qtd_Atual;
    }   
}
