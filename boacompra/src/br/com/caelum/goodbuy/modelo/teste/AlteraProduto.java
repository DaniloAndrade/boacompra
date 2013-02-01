package br.com.caelum.goodbuy.modelo.teste;

import br.com.caelum.goodbuy.dao.ProdutoDAO;
import br.com.caelum.goodbuy.infra.CriadorDeSessao;
import br.com.caelum.goodbuy.modelo.Produto;

public class AlteraProduto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ProdutoDAO produtoDAO = new ProdutoDAO(CriadorDeSessao.getSession());
		Produto produto = produtoDAO.buscaPor(1L);
		produto.setDescricao("Prateleira para cozinha");
		produto.setPreco(150.3);
		produtoDAO.altera(produto);
	}

}
