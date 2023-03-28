package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.ContratoAluguel;
import br.com.fiap.entity.Estabelecimento;
import br.com.fiap.entity.TipoEstabelecimento;

public class Cadastro {
	
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("fase02_cap2").createEntityManager();
		
	
		TipoEstabelecimento tipo = new TipoEstabelecimento(0, "Pet Shop", null);
		
		Cliente cliente = new Cliente(0, "Thiago", null);
		Cliente cliente2 = new Cliente(0, "Leandro", null);
		
		ContratoAluguel contrato = new ContratoAluguel(1, 2000, new GregorianCalendar(2015, Calendar.JANUARY, 10), null);
		 
		List<Cliente> lista = new ArrayList<>();
		lista.add(cliente);
		lista.add(cliente2);
				
				
		Estabelecimento est1 = new Estabelecimento(null, "Fiap Pet", lista, null, tipo);
		Estabelecimento est2 = new Estabelecimento(null, "Poyatos Store", lista, contrato, tipo);
		 
	
		contrato.setEstabelecimento(est2);
		
		em.persist(est1);
		em.persist(est2);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
	}

	
}
