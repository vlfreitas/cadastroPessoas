package br.com.victorfreitas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.victorfreitas.model.Pessoa;
import br.com.victorfreitas.repository.PessoaRepository;

@Service
@Transactional
public class PessoaService {

	
	@Autowired
	private PessoaRepository repository;
	
	public void save(Pessoa pessoa){
		repository.persist(pessoa);
	}
	
	public List<Pessoa> listAll(){
		return repository.listAll();
	}
	
}
