package br.com.api.BlogSpringFramework.repository;

import br.com.api.BlogSpringFramework.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Integer> {
}
