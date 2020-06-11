
public class IKCV extends TemplateDeImpostoCondicional{
	
	
	public IKCV(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() > 500 && temItemMaior100Reais(orcamento);
	}

	private boolean temItemMaior100Reais(Orcamento orcamento) {
		for(Item item : orcamento.getItens()) {
			if(item.getValor()> 100 ) return true;
		}
		return false;
	}


}
