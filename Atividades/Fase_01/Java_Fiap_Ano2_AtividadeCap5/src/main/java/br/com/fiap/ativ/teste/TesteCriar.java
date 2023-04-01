package br.com.fiap.ativ.teste;

import br.com.fiap.ativ.entity.Categoria;
import br.com.fiap.ativ.entity.Cliente;
import br.com.fiap.ativ.entity.Pedido;

public class TesteCriar {

	public static void main(String[] args) {


		Categoria cat = new Categoria(0, "Construcao", null);
		
		
		Cliente cliente = new Cliente(0, "Adriano", null);
		Cliente cliente2 = new Cliente(0, "Pedro", null);
		
		
		Pedido pedido = new Pedido(0, cliente2, null);
		
		
		
		
	}

}
