
public class Main {
    public static void main(String[] args) {
		Cliente Nathan = new Cliente();
		Nathan.getNome("Nathan");
		
		Conta cc = new ContaCorrente(Nathan);
		Conta poupanca = new ContaPoupança(Nathan);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}