package entities;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		// TODO Auto-generated method stub
		System.out.println("\n--- Extrato Conta Poupan�a ---\n");
		super.imprimirInfosComuns();
	}

 
}
