package br.com.api.BlogSpringFramework.repository;

import br.com.api.BlogSpringFramework.model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Integer> {

    //Criar e/ou atualizar uma postagem no banco de dados.

    //Ler todos as postagens do banco de dados.
    List<Post> findAll();

    //Ler uma postagem específica do banco de dados.

    //Deletar uma postagem do banco de dados.

}
