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
 */
public class Fornecedor_ProdutosDao {
    
    /* Chama a View e Lista o nome, marca e preço dos produtos relacionados ao fornecedor selecionado */
    public List<Object[]> listarDadosProdutos(String fornecedor){
      EntityManager em = JPAUtil.getEntityManager();
      List<Object[]> produtos = null;
      try{
          String textoQuery = "SELECT p.Nome_Produto, p.Marca_Produto, p.Preco_Produto FROM Fornecedor_Produtos p WHERE p.Nome_Fornecedor = :fornecedor";
          
          Query consulta = em.createQuery(textoQuery);
          consulta.setParameter("fornecedor", fornecedor);
          produtos = consulta.getResultList();
      }finally{
          JPAUtil.closeEntityManager();
      }
      return produtos;
    }
}
