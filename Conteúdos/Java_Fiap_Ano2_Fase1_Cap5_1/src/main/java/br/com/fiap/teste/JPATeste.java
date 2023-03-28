package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.com.fiap.entity.Cliente;

public class JPATeste {

	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcities-orm");
		EntityManager em = fabrica.createEntityManager();
		
		
		Cliente cliente = new Cliente();
		cliente.setNome("Pedro");
		
		try {		
			em.persist(cliente);
			em.getTransaction().begin();
			em.getTransaction().commit();

		} catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}

	
		em.close();
		fabrica.close();
		

	}

}
