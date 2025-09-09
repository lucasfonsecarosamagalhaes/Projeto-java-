import java.util.*;
public class Main {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {	
		Aluno aluno = new Aluno();
    	byte opcao = -1;
    	 
    	do {
			do {
    			System.out.println("\n ***************  CADASTRO DE ALUNOS  ***************** ");
    			System.out.println(" [1] INCLUIR ALUNOS ");
    			System.out.println(" [2] ALTERAR ALUNOS ");
    			System.out.println(" [3] CONSULTAR ALUNOS ");
    			System.out.println(" [4] EXCLUIR ALUNOS ");
    			System.out.println(" [0] SAIR");
    			System.out.print("\nDigite a opcao desejada: ");
    			opcao = leia.nextByte();
    			if (opcao < 0 || opcao > 4) {
    				System.out.println("opcao Invalida, digite novamente.\n");
    			}
    		}while (opcao < 0 || opcao > 4);
			
			switch (opcao) {
				case 0:
					System.out.println("\n ************  PROGRAMA ENCERRADO  ************** \n");
					break;
				case 1: 
					aluno.incluir(); 
					break;
				case 2:
					aluno.alterar();
					break;
				case 3: 
					aluno.consultar();
					break;
				case 4: 
					aluno.excluir();
					break;
			}
    	} while ( opcao != 0 );
    	//leia.close();
	}

}
