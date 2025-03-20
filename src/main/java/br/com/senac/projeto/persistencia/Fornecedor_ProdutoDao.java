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
public class Fornecedor_ProdutoDao {
    
    /* Função para cadastrar um relacionamento entre Fornecedor e Produto */
    public void cadastrar(Fornecedor_Produto f){
          EntityManager em = JPAUtil.getEntityManager();
          try {
              em.getTransaction().begin();
              em.persist(f);
              em.getTransaction().commit();
          }catch(Exception e){
              em.getTransaction().rollback();
              throw e;
          }
          finally{
              JPAUtil.closeEntityManager();
          }
    }
    
    /* Função para excluir o relacionamento entre Fornecedor e Produto */
    public void excluir(int id_Fornecedor, int id_Produto){
      EntityManager em = JPAUtil.getEntityManager();
      try{
          String textoQuery = "SELECT p FROM Fornecedor_Produto p WHERE p.id_Fornecedor = :id_Fornecedor AND p.id_Produto = :id_Produto";
          Query consulta = em.createQuery(textoQuery);
          consulta.setParameter("id_Fornecedor", id_Fornecedor);
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
