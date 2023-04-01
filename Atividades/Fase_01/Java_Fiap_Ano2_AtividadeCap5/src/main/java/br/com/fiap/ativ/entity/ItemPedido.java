package br.com.fiap.ativ.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_item_pedido")
public class ItemPedido {
    @Id
   	@SequenceGenerator(name="item_pedido", sequenceName ="sq_tb_item_pedido", allocationSize = 1)
   	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_pedido")
    @Column(name = "id_item_pedido")
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;
    
    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produto produto;
    
    @Column(name = "qnt_item")
    private int quantidade;
    
    @Column(name = "vl_total")
    private double valorTotal;   
    
    
    // construtores
    
    public ItemPedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItemPedido(Long id, Pedido pedido, Produto produto, int quantidade, double valorTotal) {
		super();
		this.id = id;
		this.pedido = pedido;
		this.produto = produto;
		this.quantidade = quantidade;
		this.valorTotal = valorTotal;
	}

	// getters e setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
    
    
}