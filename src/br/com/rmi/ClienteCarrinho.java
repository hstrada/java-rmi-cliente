package br.com.rmi;


import java.rmi.Naming;

public class ClienteCarrinho {
	public static void main(String[] args) throws Exception {
		
		// Carrinho carrinho = (Carrinho) Naming.lookup("rmi://10.20.74.41:1099/farmacia/carrinho");
		Carrinho carrinho = (Carrinho) Naming.lookup("rmi://localhost:1099/farmacia/carrinho");
		
		Item item1 = new Item();
		item1.setNome("Pasta de Dente");
		item1.setPreco(5.0);
		
		Item item2 = new Item();
		item2.setNome("Condicionador");
		item2.setPreco(13.0);
		
		Item item3 = new Item();
		item3.setNome("Shampoo");
		item3.setPreco(12.0);
		
		carrinho.cadastrarItem(item1);
		carrinho.cadastrarItem(item2);
		carrinho.cadastrarItem(item3);
		
		System.out.println(carrinho.obterQuantidadeItens());
	}
}
