package br.com.victorfreitas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.victorfreitas.model.Pessoa;
import br.com.victorfreitas.service.PessoaService;


@Controller
@RequestMapping("/pessoa")
public class PessoaController {

	public static final String VIEW = "product";
	
	@Autowired
	private PessoaService service;
	
	@RequestMapping(value = "" , method = RequestMethod.POST)
	public ModelAndView save(Pessoa pessoa){
		service.save(pessoa);
		
		return listAll();
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView listAll(){
		
		ModelAndView modView = new ModelAndView(VIEW);
		modView.addObject("pessoa", service.listAll());
		return modView;
		
		
	}
}
