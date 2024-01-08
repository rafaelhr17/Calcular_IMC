package calculandoIMC;
import java.util.Scanner;

public class CalculoIMC {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		Scanner leia = new Scanner(System.in);
		int opcao; // variável que recebe numéros inteiros que será utilizado para repetir a aplicação
			do { // comando que roda tudo que estiver entre chaves {}
		System.out.println("Olá, seja bem vindo ao cálculo de IMC!");
		System.out.println("Informe sua altura.");
		System.out.print("Altura: ");
		p.setAltura(leia.nextDouble()); // Nesta linha, o usuário deve digitar a altura, e caso o valor seja válido, ele aparecerá na tela 
		System.out.println("Informe seu peso.");
		System.out.print("Peso: ");
		p.setPeso(leia.nextDouble()); // Nesta linha, o usuário deve digitar o peso, e caso o valor seja válido, ele aparecerá na tela
		
		System.out.println("Informe sua alteração de peso.");
		System.out.print("Quanto você ganhou/perdeu?(em KG): ");
		p.alterarPeso(leia.nextDouble()); // Aqui, chama-se o método alterarPeso que lerá o peso que o usuário digitar caso tenha perdido/ganhado peso 
		System.out.println("Peso atual: " + p.getPeso()); // Mostrando na tela o peso atualizado

		System.out.println("Agora vamos calcular seu IMC!");
		System.out.println("IMC: " + p.calcularIMC());

		System.out.println("Veja abaixo seu estado de saúde.");
		p.statusSaude();

		System.out.println("Deseja calcular novamente seu IMC? [1] para Sim, [0] para Não.");
		opcao = leia.nextInt();
			} while(opcao != 0); // comando que recebe o número que o usuário digitou para repetir a aplição se for diferente de 0.
	}
}