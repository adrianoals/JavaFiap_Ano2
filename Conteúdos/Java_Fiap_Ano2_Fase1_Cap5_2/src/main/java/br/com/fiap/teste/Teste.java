package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.entity.PessoaJuridica;

public class Teste {
	
public static void main(String[] args) {
	
	EntityManager em = Persistence.createEntityManagerFactory("smartcities-orm").createEntityManager();
	
	PessoaJuridica pj = new PessoaJuridica();
	pj.setCnpj("01.306.866/0001-98");
	pj.setNome("Empresa X");
	
	em.persist(pj);
	em.getTransaction().begin();
	em.getTransaction().commit();
	
	
	em.close();
	
	}
}
