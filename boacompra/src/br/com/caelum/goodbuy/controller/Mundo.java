package br.com.caelum.goodbuy.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.goodbuy.modelo.Produto;
import br.com.caelum.vraptor.Resource;

@Resource
public class Mundo {
	
	public String boasVindas(){
		System.out.println("Ola");
		return "Ola Mundo!";
	}
	
	
	public List<String> paises(){
		List<String> paises = new ArrayList<String>();
		paises.add("Brasil");
		paises.add("Portugal");
		paises.add("Argentina");
		paises.add("Chile");
		paises.add("Italia");
		return paises;
	}
	
	public Double valor(){
		return 45.5;
	}
	
	public Produto produto(){
		Produto produto = new Produto();
		produto.setDescricao("Cadeira");
		produto.setNome("Cadeira 1");
		produto.setPreco(50.0);
		return produto;
	}
}
