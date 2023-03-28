package br.com.fiap.dao;

import javax.persistence.EntityManager;
import br.com.fiap.entity.Avaliacao;
import br.com.fiap.entity.AvaliacaoId;



public class AvaliacaoDAO extends GenericDAO<Avaliacao, AvaliacaoId>{

	public AvaliacaoDAO(EntityManager em) {
		super(em);
	}

}