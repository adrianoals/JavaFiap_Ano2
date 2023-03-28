package br.com.fiap.ativ.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido {
	
    @Id
    @Column(name = "id_pedido")
   	@SequenceGenerator(name="pedido", sequenceName ="sq_tb_pedido", allocationSize = 1)
   	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido")
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "cd_cliente")
    private Cliente cliente;
    
    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itens;
    
    
    
    
    
    public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pedido(long id, Cliente cliente, List<ItemPedido> itens) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.itens = itens;
	}

	// getters e setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente2(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
    
    
    
    
}
