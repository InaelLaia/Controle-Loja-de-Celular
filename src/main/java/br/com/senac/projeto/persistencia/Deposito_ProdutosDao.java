/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.projeto.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author inael
 * Chamada da View DEPOSITO_PRODUTOS no Banco de Dados
 */
public class Deposito_ProdutosDao {
    
    /* Chama a View e Lista os nomes dos produtos relacionados ao deposito selecionado */
    public List<String> listar(String deposito){
      EntityManager em = JPAUtil.getEntityManager();
      List<String> produtos = null;
      try{
          String textoQuery = "SELECT p.Nome_Produto FROM Deposito_Produtos p WHERE p.Nome_Deposito = :deposito";
          
          Query consulta = em.createQuery(textoQuery, String.class);
          consulta.setParameter("deposito", deposito);
          produtos = consulta.getResultList();
      }finally{
          JPAUtil.closeEntityManager();
      }
      return produtos;
    }
    
     /* Chama a View e Lista o nome, ponto de reposicao e quantidade atual dos produtos relacionados ao deposito selecionado */
    public List<Object[]> listarDadosProdutos(String deposito){
      EntityManager em = JPAUtil.getEntityManager();
      List<Object[]> produtos = null;
      try{
          String textoQuery = "SELECT p.Nome_Produto, p.Ponto_Reposicao, p.qtd_Atual FROM Deposito_Produtos p WHERE p.Nome_Deposito = :deposito";
          
          Query consulta = em.createQuery(textoQuery);
          consulta.setParameter("deposito", deposito);
          produtos = consulta.getResultList();
      }finally{
          JPAUtil.closeEntityManager();
      }
      return produtos;
    }
}
