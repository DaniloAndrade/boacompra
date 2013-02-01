package br.com.caelum.goodbuy.modelo.teste;

import br.com.caelum.goodbuy.dao.ProdutoDAO;
import br.com.caelum.goodbuy.infra.CriadorDeSessao;
import br.com.caelum.goodbuy.modelo.Produto;

public class AdicionaProduto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Produto produto = criarProduto();
		ProdutoDAO produtoDAO = new ProdutoDAO(CriadorDeSessao.getSession());
		produtoDAO.salva(produto);
	}

	private static Produto criarProduto() {
		Produto produto = new Produto();
		produto.setNome("Proteleira");
		produto.setDescricao("Prateleira para sala");
		produto.setPreco(152.5);
		return produto;
	}

}
