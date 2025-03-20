/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.projeto.persistencia;

/**
 *
 * @author inael
 * Entidade DEPOSITO no Banco de Dados
 */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Deposito {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome_deposito;
    private String telefone_deposito;
    private String rua_deposito;
    private String numero_deposito;
    private String bairro_deposito;
    private String cidade_deposito;
    private String uf_deposito;

    public Deposito() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_deposito() {
        return nome_deposito;
    }

    public void setNome_deposito(String nome_deposito) {
        this.nome_deposito = nome_deposito;
    }

    public String getTelefone_deposito() {
        return telefone_deposito;
    }

    public void setTelefone_deposito(String telefone_deposito) {
        this.telefone_deposito = telefone_deposito;
    }

    public String getRua_deposito() {
        return rua_deposito;
    }

    public void setRua_deposito(String rua_deposito) {
        this.rua_deposito = rua_deposito;
    }

    public String getNumero_deposito() {
        return numero_deposito;
    }

    public void setNumero_deposito(String numero_deposito) {
        this.numero_deposito = numero_deposito;
    }

    public String getBairro_deposito() {
        return bairro_deposito;
    }

    public void setBairro_deposito(String bairro_deposito) {
        this.bairro_deposito = bairro_deposito;
    }

    public String getCidade_deposito() {
        return cidade_deposito;
    }

    public void setCidade_deposito(String cidade_deposito) {
        this.cidade_deposito = cidade_deposito;
    }

    public String getUf_deposito() {
        return uf_deposito;
    }

    public void setUf_deposito(String uf_deposito) {
        this.uf_deposito = uf_deposito;
    }
}
