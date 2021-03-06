
public class Aprovado implements EstadoDeUmOrcamento {
	private boolean descontoAplicado;

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(this.descontoAplicado) throw new RuntimeException("Desconto já aplicado anteriormente");
		orcamento.valor -= orcamento.valor * 0.02;
		this.descontoAplicado = true;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Não é permitido aprovar um orcamento aprovado!");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Não é permitido reprovara um orcamento aprovado!");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
		
	}
}
