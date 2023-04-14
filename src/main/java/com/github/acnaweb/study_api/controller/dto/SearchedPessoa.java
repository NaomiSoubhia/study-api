package com.github.acnaweb.study_api.controller.dto;

import com.github.acnaweb.study_api.model.Pessoa;

public class SearchedPessoa {
	private Long id;
	private String nome;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static SearchedPessoa toDto(Pessoa pessoa) {
		SearchedPessoa dto = new SearchedPessoa();
		dto.setId(pessoa.getId());
		dto.setNome(pessoa.getNome());		
		return dto;
	}


}
