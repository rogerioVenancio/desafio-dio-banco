package banco.digital;

public class Main {

	public static void main(String[] args) {

		Cliente rogerio = new Cliente();
		rogerio.setNome("Rogerio Venancio");
		Conta cc = new ContaCorrente(rogerio);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(rogerio);
		cc.transferir(100, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
