package br.com.caelum.goodbuy.modelo.teste;

import br.com.caelum.goodbuy.dao.ProdutoDAO;
import br.com.caelum.goodbuy.infra.CriadorDeSessao;
import br.com.caelum.goodbuy.modelo.Produto;

public class RemoveProduto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ProdutoDAO produtoDao = new ProdutoDAO(CriadorDeSessao.getSession());
		Produto produto = produtoDao.buscaPor(2L);
		produtoDao.remove(produto);
	}

	

}
