package br.com.caelum.goodbuy.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.goodbuy.modelo.Produto;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.RequestScoped;
@Component
@RequestScoped
public class ProdutoDAO {

	private final Session session;
	
	
	
	public ProdutoDAO(Session session) {
		//session = CriadorDeSessao.getSession();
		this.session = session;
	}



	public  void salva(Produto produto) {
		//Transaction transaction = session.beginTransaction();
		session.save(produto);
		//transaction.commit();
	}


	
	public  void altera(Produto produto) {
		//Transaction transaction = session.beginTransaction();
		session.update(produto);
		//transaction.commit();
	}



	public  Produto buscaPor(Long id) {
		Produto produto = (Produto) session.load(Produto.class, id);
		return produto;
	}



	public  void remove(Produto produto) {
		//Transaction transaction = session.beginTransaction();
		session.delete(produto);
		//transaction.commit();
	}
	
	public List<Produto> listaTodos(){
		return session.createCriteria(Produto.class).list();
	}

}
