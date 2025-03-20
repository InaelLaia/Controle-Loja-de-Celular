/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.projeto.persistencia;

/**
 *
 * @author inael
 * Entidade FORNECEDOR no Banco de Dados
 */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fornecedor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome_fornecedor;
    private String telefone_fornecedor;
    private String rua_fornecedor;
    private String numero_fornecedor;
    private String bairro_fornecedor;
    private String cidade_fornecedor;
    private String uf_fornecedor;

    public Fornecedor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_fornecedor() {
        return nome_fornecedor;
    }

    public void setNome_fornecedor(String nome_fornecedor) {
        this.nome_fornecedor = nome_fornecedor;
    }

    public String getTelefone_fornecedor() {
        return telefone_fornecedor;
    }

    public void setTelefone_fornecedor(String telefone_fornecedor) {
        this.telefone_fornecedor = telefone_fornecedor;
    }

    public String getRua_fornecedor() {
        return rua_fornecedor;
    }

    public void setRua_fornecedor(String rua_fornecedor) {
        this.rua_fornecedor = rua_fornecedor;
    }

    public String getNumero_fornecedor() {
        return numero_fornecedor;
    }

    public void setNumero_fornecedor(String numero_fornecedor) {
        this.numero_fornecedor = numero_fornecedor;
    }

    public String getBairro_fornecedor() {
        return bairro_fornecedor;
    }

    public void setBairro_fornecedor(String bairro_fornecedor) {
        this.bairro_fornecedor = bairro_fornecedor;
    }

    public String getCidade_fornecedor() {
        return cidade_fornecedor;
    }

    public void setCidade_fornecedor(String cidade_fornecedor) {
        this.cidade_fornecedor = cidade_fornecedor;
    }

    public String getUf_fornecedor() {
        return uf_fornecedor;
    }

    public void setUf_fornecedor(String uf_fornecedor) {
        this.uf_fornecedor = uf_fornecedor;
    }   
}
