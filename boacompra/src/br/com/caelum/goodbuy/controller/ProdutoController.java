package br.com.caelum.goodbuy.controller;

import java.util.List;

import br.com.caelum.goodbuy.dao.ProdutoDAO;
import br.com.caelum.goodbuy.modelo.Produto;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.Validations;

@Resource
public class ProdutoController {
	private ProdutoDAO produtoDAO;
	private Result result;
	private Validator validator;
	
	public ProdutoController(ProdutoDAO produtoDAO, Result result, Validator validator ) {
		this.produtoDAO = produtoDAO;
		this.result = result;
		this.validator = validator;
	}
	
	@Path(value="/produto")
	@Get
	public List<Produto> lista(){
		return produtoDAO.listaTodos();
	}
	
	@Path(value="/produto/novo")
	@Get
	public void formulario(){
	}
	
	@Path(value="/produto")
	@Post
	public void adiciona(final Produto produto){
		validarProduto(produto);
		validator.onErrorUsePageOf(ProdutoController.class).formulario();
		produtoDAO.salva(produto);
		result.redirectTo(this).lista();
	}


	@Path("/produto/{id}")
	@Get
	public Produto editar(Long id){
		return produtoDAO.buscaPor(id);
	}
	
	@Path("/produto/{produto.id}")
	@Put
	public void alterar(final Produto produto){
		validarProduto(produto);
		validator.onErrorUsePageOf(ProdutoController.class).formulario();
		produtoDAO.altera(produto);
		result.redirectTo(this).lista();
	}
	
	@Path("/produto/{id}")
	@Delete
	public void remover(Long id){
		Produto produto = produtoDAO.buscaPor(id);
		produtoDAO.remove(produto);
		result.redirectTo(this).lista();
	}
	
	
	private void validarProduto(final Produto produto) {
		validator.checking(new Validations(){{
			that(produto.getNome()!=null&&produto.getNome().length()>=3, "produto.nome","nome.obrigatorio");
			that(produto.getDescricao()!=null && produto.getDescricao().length()<=40, "produto.descricao", "descricao.obrigatoria");
			that(produto.getPreco()!=null && produto.getPreco()>0.0, "produto.preco", "preco.positivo");
		}});
	}
}
