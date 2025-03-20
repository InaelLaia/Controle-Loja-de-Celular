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
public class Fornecedor_Produtos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Nome_Fornecedor;
    private String Nome_Produto;
    private String Marca_Produto;
    private double Preco_Produto;

    public Fornecedor_Produtos() {
    }

    public int getId() {
        return id;
    }

    public String getNome_Fornecedor() {
        return Nome_Fornecedor;
    }

    public String getNome_Produto() {
        return Nome_Produto;
    }

    public String getMarca_Produto() {
        return Marca_Produto;
    }

    public double getPreco_Produto() {
        return Preco_Produto;
    }
}
