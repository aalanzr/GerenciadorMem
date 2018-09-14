import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opt;
		int tamMem,tamProc;
		
		System.out.println("Digite o tamanho da memória (Inteiro positivo maior que zero)");
		tamMem = scanner.nextInt();		
		
		do {
			System.out.println("Digite a opção desejada:");
			System.out.println();
			System.out.println("1 - Criar Processo");
			System.out.println("2 - Remover Processo");
			System.out.println("3 - Imprimir Memória");
			System.out.println("0 - Sair");
			opt = scanner.nextInt();
			switch (opt) {
			case 1:
//				System.out.println("Criou Processo");
				
					System.out.println("Digite o tamanho do processo:");
					tamProc = scanner.nextInt();
					if (tamProc > tamMem) {
						System.out.println("Erro! Tamanho do processo maior que a memória!");
					}
					System.out.println();
				break;
			case 2:
				System.out.println("Removeu Processo");
				System.out.println();
				break;
			case 3:
				System.out.println("Imprimiu Memória");
				System.out.println();
				break;
			case 0:
				System.out.println("Saindo...");
				System.out.println();
				System.exit(0);
				break;
			default:
				System.out.println("Opção invalida! ");
				System.out.println();
			}
		} while (opt != 0);
	}

}
