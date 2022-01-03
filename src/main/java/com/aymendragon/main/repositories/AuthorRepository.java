package com.aymendragon.main.repositories;

import com.aymendragon.main.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {

}
