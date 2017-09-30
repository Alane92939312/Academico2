import java.util.ArrayList;
public class Principal {

	//Alane Pereira de Oliveira
	// RA: 21437247
	
	public static void main(String[] args) {
		
		BDSimulado bd = new BDSimulado();
		
		//retorna todas as informações de um Cliente fornecendo o seu nome
		System.out.println(bd.getInfoCliente("Evandro da Silva"));
		System.out.println(bd.getInfoCliente("Maria do Socorro"));

		
		//retorna a lista de todas as Ligações realizadas por um determinado Cliente
		
		System.out.println(bd.ligacoesPorCliente("Regina Maria"));
		
		//retorna o número de ligações realizadas por todos os Clientes de uma determinada UF
		
		System.out.println("Qtd Ligações do clientes do DF: " + bd.ligacoesPorUF("DF"));
		
		//retorna uma lista com os códigos de todas as Ligações onde a UF de origem seja diferente da UF de destino.
		
		System.out.println("Códigos de todas as Ligações onde a UF de origem seja diferente da UF de destino:" + bd.ligacoesUFDiferente());
		
		//3a
		
		System.out.println("Conta:" + bd.getContaDoCliente("João dos Montes"));
		
		
	}

}
