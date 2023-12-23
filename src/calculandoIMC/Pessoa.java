package calculandoIMC;
 //Rafael Henrique da Silva Regis, F34ICB5
public class Pessoa {
	private double peso;
	public double altura = 1.75;
	public double imc;
	public String status;
	public double altr;
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
		if(peso > 500) {
			System.out.println("Valor inválido!");
			System.exit(1);
		}
		else if(peso <1 ) {
			System.out.println("Valor inválido!");
			System.exit(1);
		}
	}
	
	public double calcularIMC() {
		imc = peso/(altura*altura);
		return imc;
	}
	
	public String statusSaude() {
		if(imc < 18.5) {
			System.out.println("Abaixo do peso!");
			System.exit(1);
		}
		else if(imc < 25) {
			System.out.println("Normal!");
			System.exit(1);
		}
		else if(imc < 30) {
			System.out.println("Sobrepeso!");
			System.exit(1);
		}
		else {
			System.out.println("Obesidade!");
			System.exit(1);
		}
		return status;
	}
	
	public double alterarPeso(double peso2, double _altr) {
		this.altr = _altr;
		this.peso = peso2;
		peso = (_altr + peso2);
		if(peso < 0) {
			System.out.println("Alteração Inválida");
			System.exit(1);
		}
		else if(peso > 500) {
			System.out.println("Alteração Inválida");
			System.exit(1);
		}
		return peso;
	}
	
}
