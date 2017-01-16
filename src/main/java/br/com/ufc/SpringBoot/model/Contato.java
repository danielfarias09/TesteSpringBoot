package br.com.ufc.SpringBoot.model;



import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Contato {
	
	public Contato(){
		
	}
	
	
	public Contato(String nome, String telefone, String email) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String telefone;
	
	private String email;

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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
