/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.projeto.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

/**
 *
 * @author inael
 */
public class Deposito_ProdutoDao {
    
    /* Função para cadastrar um relacionamento entre Deposito e Produto */
    public void cadastrar(Deposito_Produto d){
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
    
    /* Função para excluir o relacionamento entre Deposito e Produto */
    public void excluir(int id_Deposito, int id_Produto){
      EntityManager em = JPAUtil.getEntityManager();
      try{
          String textoQuery = "SELECT p FROM Deposito_Produto p WHERE p.id_Deposito = :id_Deposito AND p.id_Produto = :id_Produto";
          Query consulta = em.createQuery(textoQuery);
          consulta.setParameter("id_Deposito", id_Deposito);
          consulta.setParameter("id_Produto", id_Produto);
            
          Object resultado = consulta.getSingleResult();
          
          if(resultado != null){
              em.getTransaction().begin();
              em.remove(resultado);
              em.getTransaction().commit();
          }
      }catch(Exception e){
          em.getTransaction().rollback();
          throw e;
      }
      finally{
          JPAUtil.closeEntityManager();
      }
    }
}
