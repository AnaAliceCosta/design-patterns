
public abstract class TemplateDeImpostoCondicional extends Imposto {

	public TemplateDeImpostoCondicional() {}

	public TemplateDeImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}

	public double calcula(Orcamento orcamento) {
		if(deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) + outroImposto.calcula(orcamento);
		}else {
			return minimaTaxacao(orcamento) +outroImposto.calcula(orcamento);
		}
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
}
