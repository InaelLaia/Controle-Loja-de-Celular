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

public class ProdutoDao {
    
    /* Função para Cadastrar um novo produto na entidade Produto dentro do Banco de Dados */
    public void cadastrar(Produto p){
          EntityManager em = JPAUtil.getEntityManager();
          try {
              em.getTransaction().begin();
              em.persist(p);
              em.getTransaction().commit();
          }catch(Exception e){
              em.getTransaction().rollback();
              throw e;
          }
          finally{
              JPAUtil.closeEntityManager();
          }
    }
    
    /* Função para Listar o nome de todos os Produtos dentro do Banco de Dados */
    public List<String> listar(){
      EntityManager em = JPAUtil.getEntityManager();
      List<String> produtos = null;
      try{
          String textoQuery = "SELECT p.nome_produto FROM Produto p ";
          
          Query consulta = em.createQuery(textoQuery, String.class);
          
          produtos = consulta.getResultList();
      }finally{
          JPAUtil.closeEntityManager();
      }
      return produtos;
    }
    
    /* Função para obter o id do produto */
    public int obterNome(String nome) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            String textoQuery = "SELECT p.id FROM Produto p WHERE p.nome_produto = :nome";
            
            Query consulta = em.createQuery(textoQuery);
            consulta.setParameter("nome", nome);
            
            Object resultado = consulta.getSingleResult();
            
            return (int) resultado;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
}
