package br.com.k19.poo.banco;

import java.util.Scanner;

public class ExecutaCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		CartaoDeCredito cartaoCred1 = new CartaoDeCredito(11111);
		CartaoDeCredito cartaoCred2 = new CartaoDeCredito(22222);
		
		Agencia agencia1 = new Agencia(9065);
		Agencia agencia2 = new Agencia(6509);

		Conta conta1 = new ContaCorrente(25252525, agencia1);
		ContaPoupanca conta2 = new ContaPoupanca(36363636, agencia2);
		ContaCorrente conta3 = new ContaCorrente();
		
		Scanner ler =  new Scanner(System.in);
		
		/********************************************************************************************/
		
		conta1.agencia = agencia1;  
		conta1.setSaldo(100);
		conta1.depositar(50);
		conta1.sacar(75);
		
		cartaoCred1.cliente = cliente1; 
		cartaoCred1.cliente.setNome("Brian Estigarribia");
		cartaoCred1.cliente.setCodigo(1);
		cartaoCred1.setDataDeValidade("01/01/2022");
		
		System.out.println("---Cliente 1 Dados---");
		System.out.println(cartaoCred1.cliente);
		System.out.println(cartaoCred1);
		System.out.println(conta1.agencia);
		System.out.println(conta1);
		System.out.println("Saldo didponóvel: "+conta1.consultarSaldoDisponivel());
		System.out.println("Transferir 100 Reais pra Conta 2");
		conta1.transferir(conta2, 100);
		System.out.println("Saldo didponóvel após transaferencia : "+conta1.consultarSaldoDisponivel());
		System.out.println("-------------------------------");
		
		/********************************************************************************************/
		
		conta2.agencia = agencia2; 
		conta2.setSaldo(200);
		conta2.setLimite(600);
		conta2.sacar(85);
		conta2.transferir(conta1, 50);
		
		cartaoCred2.cliente = cliente2; 
		cartaoCred2.cliente.setNome("Kévin Blank");
		cartaoCred2.cliente.setCodigo(2);
		cartaoCred2.setDataDeValidade("01/01/2023");
		
		System.out.println("---Cliente 2 Dados---");
		System.out.println(cartaoCred2.cliente);
		System.out.println(cartaoCred2);
		System.out.println(conta2.agencia);
		System.out.println(conta2);
		System.out.println("Saldo didponóvel: "+conta2.consultarSaldoDisponivel());
		System.out.println("Transferir 50 Reais pra Conta 1");
		conta2.transferir(conta1, 50);
		System.out.println("Saldo didponóvel após transaferencia : "+conta2.consultarSaldoDisponivel());
		System.out.println("-------------------------------");

		/********************************************************************************************/
		
			System.out.println("Digite numero da conta : ");
			conta3.setNumeroConta(ler.nextInt());
			System.out.println("Digite o saldo da conta : ");
			conta3.setSaldo(ler.nextDouble());
			System.out.println("Digite o limite da conta : ");
			conta3.setLimite(ler.nextDouble());
			
			
			int opcao;
			do{
				System.out.println("DIGITE A OPÇÃO DESEJADA");
				System.out.println("1 - Depositar");
				System.out.println("2 - Sacar");
				System.out.println("3 - Saldo");
				System.out.println("0 - Sair");
				opcao = ler.nextInt();
				
				switch(opcao){
				case 1: 
					System.out.println("Digite o valor do deposito: ");
					conta3.depositar(ler.nextDouble()); break;
				case 2:
					System.out.println("Digite o valor que deseja sacar: ");
					conta3.sacar(ler.nextDouble()); break;
				case 3: 
					System.out.println(conta3.consultarSaldoDisponivel());break;
				case 0: 
					System.out.println("Sistema encerrado!");break;
				default: System.out.println("Opção Invalida!");
				}
			}while(opcao != 0);
			
			ler.close();
	}
}
