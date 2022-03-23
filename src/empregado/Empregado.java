package empregado;

public class Empregado {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
	
	public String toString() {
		double salarioLiquido = salarioBruto - imposto;
		return nome+", R$: "+String.format("%.2f", salarioLiquido);
	}
	
	public void aumento(double valor) {
		double porcento = salarioBruto * valor / 100;
		salarioBruto += porcento;
	}

}
