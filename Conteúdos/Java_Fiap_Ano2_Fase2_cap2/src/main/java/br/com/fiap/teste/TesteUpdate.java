package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;

public class TesteUpdate {
	
public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("fase02_cap2");
		EntityManager em = fabrica.createEntityManager();
		
		
		Cliente cliente = new Cliente(1, "Thiago2", null);
		System.out.println(cliente.getId() + " " + cliente.getNome());
		
		
		//Quando se tem um código que já existe no banco use esse método pois atualiza no banco
		em.merge(cliente);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		
		em.close();
		fabrica.close();	
		
	}
	
	

}
