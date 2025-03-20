/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.projeto.persistencia;

/**
 *
 * @author inael
 */
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class FornecedorDao {
    
    /* Função para Listar o nome de todos os Fornecedores dentro do Banco de Dados */
    public List<String> listar(){
        EntityManager em = JPAUtil.getEntityManager();
        List<String> fornecedores = null;
        try{
            String textoQuery = "SELECT f.nome_fornecedor FROM Fornecedor f ";
          
            Query consulta = em.createQuery(textoQuery, String.class);
          
            fornecedores = consulta.getResultList();
        }finally{
            JPAUtil.closeEntityManager();
        }
        return fornecedores;
    }
    
    /* Função para obter o id do fornecedor */
    public int obterNome(String nome) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            String textoQuery = "SELECT f.id FROM Fornecedor f WHERE f.nome_fornecedor = :nome";
            
            Query consulta = em.createQuery(textoQuery);
            consulta.setParameter("nome", nome);
            
            Object resultado = consulta.getSingleResult();
            
            return (int) resultado;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
}
