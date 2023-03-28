package br.com.fiap.daotestes;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.dao.TipoEstabelecimentoDAO;

public class TesteDaoExcluir {

	public static void main(String[] args) {

		EntityManager em = null;

		try {

			em = Persistence.createEntityManagerFactory("fase02_cap2").createEntityManager();

			TipoEstabelecimentoDAO dao = new TipoEstabelecimentoDAO(em);
			dao.excluir(1);	 
			dao.commit(); 
			
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		} finally {
			if (em != null) {
				em.close();
			}
			System.exit(0);
		}

	}
	
	
	
}
