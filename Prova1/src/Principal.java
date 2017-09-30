import java.util.ArrayList;
public class Principal {

	//Alane Pereira de Oliveira
	// RA: 21437247
	
	public static void main(String[] args) {
		
		BDSimulado bd = new BDSimulado();
		
		//retorna todas as informa��es de um Cliente fornecendo o seu nome
		System.out.println(bd.getInfoCliente("Evandro da Silva"));
		System.out.println(bd.getInfoCliente("Maria do Socorro"));

		
		//retorna a lista de todas as Liga��es realizadas por um determinado Cliente
		
		System.out.println(bd.ligacoesPorCliente("Regina Maria"));
		
		//retorna o n�mero de liga��es realizadas por todos os Clientes de uma determinada UF
		
		System.out.println("Qtd Liga��es do clientes do DF: " + bd.ligacoesPorUF("DF"));
		
		//retorna uma lista com os c�digos de todas as Liga��es onde a UF de origem seja diferente da UF de destino.
		
		System.out.println("C�digos de todas as Liga��es onde a UF de origem seja diferente da UF de destino:" + bd.ligacoesUFDiferente());
		
		//3a
		
		System.out.println("Conta:" + bd.getContaDoCliente("Jo�o dos Montes"));
		
		
	}

}
