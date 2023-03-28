package br.com.fiap.dao;

import javax.persistence.EntityManager;
import br.com.fiap.entity.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario, Integer> {

	public UsuarioDAO(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
