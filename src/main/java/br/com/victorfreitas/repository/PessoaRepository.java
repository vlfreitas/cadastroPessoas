package br.com.victorfreitas.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import br.com.victorfreitas.model.Pessoa;


@Repository
public class PessoaRepository extends AbstractPessoaRepository {

	@SuppressWarnings("unchecked")
	public List<Pessoa> listAll() {
		Criteria criteria = getSession().createCriteria(Pessoa.class);
        return criteria.list();
	}

}
