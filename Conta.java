package teste;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class Conta {

protected double saldo;
	
	
	
	
	
	public void setDeposita(double valor) {
		this.saldo += valor;
		
	}
	
	boolean setSaca(double valor) {
		if (valor > this.saldo) {
		
			System.out.println("Nao posso sacar fora do limite");
			return false;
		}else if(valor<this.saldo){
			System.out.println("Nao pode entrar com valor negativo");
			return false;
			
		}
		else if(valor < this.saldo && valor > this.saldo){
			System.out.println("Nao pode entrar com saldo maior que tem");
			return false;
			
		}
		else {
			this.saldo -= valor;
			
			return true;
		}
		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	void setatualiza(double taxa) {
		this.saldo = this.saldo *taxa;
	}
	
	
	
public static class ContaCorrente extends Conta{//classes filhas da conta
		 
		public void setatualiza(double taxa) {
			this.saldo = this.saldo *taxa*2;
		}
		
		
	public void  setDeposita(double valor) {
				this.saldo += valor-0.10;
			}
		}
	
	
	
public static class ContaPoupanca extends Conta{//classesfilhas da conta
	//podem acessar os getters e setters das conta e atributos
	
		public void setatualiza(double taxa) {
			this.saldo = this.saldo *taxa*3;
		}
			
	}
	
	
	
	

public static  void main(String[] args) {
	String s;
	//int i;
	Scanner scan = new Scanner(System.in);
	System.out.println("Qual seu nome");
	s = scan.next();
	System.out.println("Seu nome é "+s);
	
	
	Set<String> lista = new HashSet<>();
	lista.add("joao");
	lista.add("bruno");
	lista.add("gab");
	lista.add("luan");
	
	//Collections.sort(lista);
	
	Iterator<String> i = lista.iterator();
	
	while(i.hasNext()) {
		String palavra = i.next();
		System.out.println(palavra);
	}
	
	
	for (int y =0; y<lista.size(); y++) {// o .size() da o tamanho da lista logo ele vai percorre todo o tamanho da lista
		
		//System.out.println(lista.get(y)); //para printar cada item da lista
	} 
	System.out.println("tamanho da lista e "+lista.size());
	//System.out.println(Collections.max(lista));
		
		
	}
}
