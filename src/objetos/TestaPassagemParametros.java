package objetos;

public class TestaPassagemParametros {

	public void TestaPassagemParametros(){
		
	}
	public static void trocaValorPrimitivo(int num){
		num = num+6;
	}
	
	public static void trocaValorObjeto(ContaCorrente minhaConta){
		minhaConta.saldo=300;
	}
	public static void trocaReferenciaObjeto(ContaCorrente minhaConta){
		minhaConta= new ContaCorrente("Mulher Maravilha",200);
	}
	
	
}
