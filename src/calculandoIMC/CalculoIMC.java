package calculandoIMC;
import java.util.Scanner;
//Rafael Henrique da Silva Regis, F34ICB5
public class CalculoIMC {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Olá, seja bem vindo ao cálculo de IMC!");
		System.out.println("Informe sua altura.");
		System.out.print("Altura: ");
		System.out.println(p.altura);
		System.out.println("Informe seu peso.");
		System.out.print("Peso: ");
		p.setPeso(leia.nextDouble());
		
		System.out.println("Informe sua alteração de peso.");
		System.out.print("Quanto você ganhou/perdeu?(em KG): ");
		p.alterarPeso(p.getPeso(), (leia.nextDouble()));
		System.out.println("Peso atual: " + p.getPeso());

		System.out.println("Agora vamos calcular seu IMC!");
		System.out.println("IMC: " + p.calcularIMC());

		System.out.println("Veja abaixo seu estado de saúde.");
		System.out.println(p.statusSaude());
		

	}

}
