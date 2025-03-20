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

public class DepositoDao {
    
    
    /* Função para Cadastrar um novo deposito na entidade Depositos dentro do Banco de Dados */
    public void cadastrar(Deposito d){
          EntityManager em = JPAUtil.getEntityManager();
          try {
              em.getTransaction().begin();
              em.persist(d);
              em.getTransaction().commit();
          }catch(Exception e){
              em.getTransaction().rollback();
              throw e;
          }
          finally{
              JPAUtil.closeEntityManager();
          }
    }
    
    /* Função para Listar o nome de todos os Depositos dentro do Banco de Dados */
    public List<String> listar(){
      EntityManager em = JPAUtil.getEntityManager();
      List<String> depositos = null;
      try{
          String textoQuery = "SELECT d.nome_deposito FROM Deposito d ";
          
          Query consulta = em.createQuery(textoQuery, String.class);
          
          depositos = consulta.getResultList();
      }finally{
          JPAUtil.closeEntityManager();
      }
      return depositos;
    }
    
    /* Função para obter o id do deposito */
    public int obterNome(String nome) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            String textoQuery = "SELECT d.id FROM Deposito d WHERE d.nome_deposito = :nome";
            
            Query consulta = em.createQuery(textoQuery);
            consulta.setParameter("nome", nome);
            
            Object resultado = consulta.getSingleResult();
            
            return (int) resultado;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
}
