import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Orcamento {

	protected double valor;
	private List<Item> itens;
	protected EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		this.estadoAtual = new EmAprovacao();
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public double getValor() {
		return valor;
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}
	public void aprova() {
		estadoAtual.aprova(this);
	}
	public void reprova() {
		estadoAtual.reprova(this);
	}
	public void finaliza() {
		estadoAtual.finaliza(this);
	}

}
