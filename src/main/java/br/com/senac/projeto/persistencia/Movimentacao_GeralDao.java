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
 * Chamada da View MOVIMENTACAO_GERAL no Banco de Dados
 */
public class Movimentacao_GeralDao {
    
    /* Chama a View e Lista todos os seus dados */
    public List<Movimentacao_Geral> listar(){
      EntityManager em = JPAUtil.getEntityManager();
      List<Movimentacao_Geral> movimentacoes = null;
      try{
          String textoQuery = "SELECT m FROM Movimentacao_Geral m ";
          
          Query consulta = em.createQuery(textoQuery, Movimentacao_Geral.class);
          
          movimentacoes = consulta.getResultList();
      }finally{
          JPAUtil.closeEntityManager();
      }
      return movimentacoes;
    }
}
