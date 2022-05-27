package br.com.jamesson.repository;

import br.com.jamesson.model.Endereco;
import org.springframework.data.repository.CrudRepository;

public interface EnderecoReposirory extends CrudRepository<Endereco, String> {
}
