package br.com.fiap.dao;

import javax.persistence.EntityManager;
import br.com.fiap.entity.TipoEstabelecimento;


public class TipoEstabelecimentoDAO extends GenericDAO<TipoEstabelecimento, Integer> {

// Construtor que recebe um EntityManager e chama o construtor da classe pai com o mesmo EntityManager

	public TipoEstabelecimentoDAO(EntityManager em) {
		super(em);
	}

}