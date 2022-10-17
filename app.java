package teste;
import java.util.Scanner;
import teste.Conta.ContaCorrente;
import teste.Conta.ContaPoupanca;
public class app {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.setDeposita(200);
		System.out.println("Seu saldo e: "+conta.getSaldo());
		conta.setatualiza(10);
		System.out.println("Atualizado fica: "+conta.getSaldo());
		
        Conta c = new Conta();
		
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		
		c.setDeposita(200);
		cc.setDeposita(200);
		cp.setDeposita(200);
		
		
		c.setatualiza(0.1);
		cc.setatualiza(0.1);
		cp.setatualiza(0.1);
		c.setSaca(-1000);
		System.out.println("Saque da conta corrente-"+cc.setSaca(10000));
		System.out.println("saldo da conta "+c.getSaldo());
		System.out.println("Saldo da cc "+cc.getSaldo());
		System.out.println("Saldo da popa "+cp.getSaldo() );
		
	}
}
