package com.SpringBoot.WebServicesApi.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.WebServicesApi.models.Empresa;
import com.SpringBoot.WebServicesApi.models.Interface;

@RestController
@RequestMapping("/api/produtos")
public class Controller {
	@Autowired
	private Interface interface1;
	//valid em Produto produto javax.validation.Valid 
	//@PostMapping
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT}) 
  public @ResponseBody Empresa novaEmpresa( Empresa empresa) {
	  interface1.save(empresa);
	return empresa;
  }
	@GetMapping
	public Iterable<Empresa> obterProdutos() {
		return interface1.findAll();
	}
	@GetMapping(path = "/nome/{parteNome}")
	public Iterable<Empresa> obterProdutosPorNome(@PathVariable String parteNome) {
		return interface1.findBynomedaempresaContainingIgnoreCase(parteNome);
	//	return produtoRepository.searchByNameLike(parteNome);
	}
	@GetMapping(path = "/pagina/{numeroPagina}/{qtdPagina}")
	public Iterable<Empresa> obterProdutoPorPagina(@PathVariable int numeroPagina, @PathVariable int qtdPagina){
		if(qtdPagina>=5) qtdPagina = 5;
		PageRequest page = PageRequest.of(numeroPagina, qtdPagina);
		return interface1.findAll(page);
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Empresa> obterProduto( @PathVariable int id) {
		return interface1.findById(id);
	}
	//@Valid
//	@PutMapping
//	public Produto alterarProduto( Produto produto) {
//		produtoRepository.save(produto);
//		return produto;
//	}
	@DeleteMapping(path = "/{id}")
	public void excluirProduto(@PathVariable int id) {
		interface1.deleteById(id);
	}
}
