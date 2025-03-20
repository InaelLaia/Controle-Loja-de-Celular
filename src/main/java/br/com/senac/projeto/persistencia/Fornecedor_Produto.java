/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.projeto.persistencia;

/**
 *
 * @author inael
 * Entidade relacionamento entre Fornecedor e Produto no Banco de Dados
 */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fornecedor_Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int id_Fornecedor;
    private int id_Produto;

    public Fornecedor_Produto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_Fornecedor() {
        return id_Fornecedor;
    }

    public void setId_Fornecedor(int id_Fornecedor) {
        this.id_Fornecedor = id_Fornecedor;
    }

    public int getId_Produto() {
        return id_Produto;
    }

    public void setId_Produto(int id_Produto) {
        this.id_Produto = id_Produto;
    } 
}
