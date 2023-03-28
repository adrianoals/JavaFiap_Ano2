package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;

public class TesteBusca {

	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcities-orm");
		EntityManager em = fabrica.createEntityManager();
		
		
		Cliente cliente = em.find(Cliente.class, 1);
		System.out.println(cliente.getId() + " " + cliente.getNome());
		
		
		//Alterando o nome do cliente
		cliente.setNome("Henrique");
		//Usa esses méttodos se não aepnas no Java o nome seria alterado
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		
		em.close();
		fabrica.close();
		
		
		
	}

}
