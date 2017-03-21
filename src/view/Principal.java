package view;

import java.util.Scanner;

import objetos.ContaCorrente;
import objetos.TestaPassagemParametros;

public class Principal {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	boolean v=true;
	char opc, op;
	Scanner n = new Scanner(System.in);
	
	
	/*do{
		//System.out.print("Nome: ");
		//String nome=n.next();
		//float valor=300;
		/*System.out.println("1 - DEPOSITAR ");
		System.out.println("2 - VERIFICAR SALDO ");
		System.out.println("3 - SAIR ");
		
		op=n.next().charAt(0);
		
		switch(op){
		case '1':
			System.out.println("Nome: ");
			String nome=n.next();
			System.out.println("Saldo: ");
			float valor=n.nextFloat();
			ContaCorrente conta = new ContaCorrente(nome,valor);
			break;
		case '2':
			System.out.println("Nome: ");
			System.out.println("Saldo: ");
			break;
		case '3':
			v=false;
			break;
		default:
			System.out.println("Opcao invalida...\n");
		}
		
		
		/*System.out.print("QUER CONTINUAR?");
		System.out.println("SIM(s) ou NAO(n)");
		opc=n.next().charAt(0);
		if(opc=='n'||opc=='N'){

			v=false;
		}*/
		
	/*}while(v);*/
	//finalizacao de um objeto finalaze();
	
	int val=11;
	TestaPassagemParametros.trocaValorPrimitivo(val);	
	System.out.println("val = "+val);
	ContaCorrente minhaConta = new ContaCorrente("SuperHomem");
	System.out.println(minhaConta.getSaldo());
	TestaPassagemParametros.trocaValorObjeto(minhaConta);
	System.out.println(minhaConta.getSaldo());
	TestaPassagemParametros.trocaReferenciaObjeto(minhaConta);
	System.out.println(minhaConta.nome);
	
	
	
}
}
