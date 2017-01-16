package br.com.ufc.SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.ufc.SpringBoot.model.Contato;
import br.com.ufc.SpringBoot.repository.ContatoRepository;

@Controller
@RequestMapping("/agenda")
public class HomeController {
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	//Envio um contato vazio para ser preenchido no form do JSP  de nome cadastro
	@RequestMapping(value = "/contato", method = RequestMethod.GET )
	public String cadastro(Model model){
		model.addAttribute("contato",new Contato());	
		return "cadastro";
	}
	
	@RequestMapping(value="/contato", method = RequestMethod.POST)
	public String cadastrarContato(@ModelAttribute("contato") Contato contato, Model model){
		contatoRepository.save(contato);
		model.addAttribute("mensagem", "Contato: " + contato.getNome() + " salvo com sucesso");
		return "sucesso";
		
	}
}
