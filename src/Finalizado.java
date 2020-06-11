
public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos finalizados não recebem descontos extra!");
		
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Não é permitido aprovar um orcamento finalizado!");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Não é permitido reprovar um orcamento finalizado!");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Não é permitido finalizar um orcamento finalizado!");
		
	}

}
