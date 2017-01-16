package br.com.ufc.SpringBoot.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ufc.SpringBoot.model.Contato;

//todas as queries, updates, inserts e deletes que formos realizar no Banco de Dados 
//será realizado pelas classes repositories
public interface ContatoRepository extends JpaRepository<Contato,Long>{

}
