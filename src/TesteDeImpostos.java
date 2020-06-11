
public class TesteDeImpostos {
	public static void main(String[] args) {
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto icpp = new ICPP();
		
		Orcamento orcamento = new Orcamento(500.0);

		CalculadorDeImposto calculador = new CalculadorDeImposto();
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, icms);
		calculador.realizaCalculo(orcamento, icpp);
	}
}
