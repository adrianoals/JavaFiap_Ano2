package br.com.fiap.daotestes;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

import br.com.fiap.dao.TipoEstabelecimentoDAO;
import br.com.fiap.entity.TipoEstabelecimento;

public class DAOTesteConsultar {
	
	public static void main(String[] args) {

		EntityManager em = null;

		try {

			em = Persistence.createEntityManagerFactory("fase02_cap2").createEntityManager();

			TipoEstabelecimentoDAO dao = new TipoEstabelecimentoDAO(em);
			TipoEstabelecimento entidade = dao.buscar(1);
			
			if (entidade == null) {
				System.out.println("Não existe tipo de estabelecimento para a chave 1");
			} else {
				System.out.println(" > " + entidade.getId() + " - " + entidade.getNome());
			}

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
