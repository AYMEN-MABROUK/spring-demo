package com.aymendragon.main.repositories;

import com.aymendragon.main.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}
