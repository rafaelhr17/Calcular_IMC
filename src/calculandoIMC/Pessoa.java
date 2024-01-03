package calculandoIMC;

public class Pessoa {
	private double peso;
	private double altura;
	public double imc;
	public String status;
	public double altr;
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
		if(peso > 500 || peso < 1) { // Se o peso for maior que 500 *ou* menor que 1kg, printará na tela a mensagem "Valor inválido!"
			System.out.println("Valor inválido!");
			System.exit(1); // Comando para que o programa pare 
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
		if (altura > 3.0 || altura < 0.1) { // Se a altura for maior que 3 *ou* menor que 0,1 metros, printará na tela a mensagem "Valor inválido!"
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
	
	public double alterarPeso(double _altr) {
		this.altr = _altr;
		peso = (_altr + peso);
		if(peso <= (-peso) || peso > 500) { // Nessa 1ª condição, caso o peso seja menor ou igual ao peso que anteriormente 
			System.out.println("Alteração Inválida"); // foi declarado pelo usuário, será invalidado
			System.exit(1);
		}
		return peso;
	}
	
}
