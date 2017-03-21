package objetos;

public class ContaCorrente {

static float dinheiroTotal;
	
	public float saldo;
	public String nome;
	public ContaCorrente(){
		
	}
	
	public ContaCorrente(String nomeDono){
		nome=nomeDono;
		saldo=0;
	}
	//
	public ContaCorrente(String nomeDono,float saldoD){
		nome=nomeDono;
		saldo=saldoD;
	}
	
	
	///Gets 
	public float getSaldo() {return saldo;}
	public String getNome() {return nome;}
	
	///Sets
	public void setSaldo(float saldo) {this.saldo = saldo;}
	public void setNome(String nome) {this.nome = nome;}



	public void depositaValor(float valor){
		saldo = saldo + valor; dinheiroTotal+=valor;
		
	}
	
	public void retiraValor(float valor){
		if(saldo>=valor){
			saldo =saldo-valor;
			dinheiroTotal-=valor;
		}
	}

}
