
public class EmAprovacao implements EstadoDeUmOrcamento{
	public boolean descontoAplicado;
	
	public EmAprovacao() {
		this.descontoAplicado = false;
	}
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(this.descontoAplicado) throw new RuntimeException("Desconto já aplicado anteriormente");
		orcamento.valor -= orcamento.valor * 0.05;
		this.descontoAplicado=true;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Não é permitido reprovar orcamentos em aprovacao!");
		
	}
}
