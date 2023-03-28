package br.com.fiap.daotestes;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.dao.TipoEstabelecimentoDAO;
import br.com.fiap.entity.TipoEstabelecimento;

//import br.com.fiap.smartcities.dao.TipoEstabelecimentoDAO;
//import br.com.fiap.smartcities.domain.TipoEstabelecimento;

public class DAOTesteCadastrar {

	public static void main(String[] args) {
		EntityManager em = null;
		
		try {
			em = Persistence.createEntityManagerFactory("fase02_cap2").createEntityManager();
			TipoEstabelecimentoDAO dao = new TipoEstabelecimentoDAO(em);
			
			TipoEstabelecimento tipo = new TipoEstabelecimento();
			tipo.setNome("Bar e Restaurante");
			
			dao.cadastrar(tipo);
			dao.commit();
			dao.buscar(1);
			
			//Implementações que utilizam os métodos do DAO
			
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