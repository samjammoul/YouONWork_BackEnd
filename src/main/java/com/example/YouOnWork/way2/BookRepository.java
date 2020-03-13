package com.example.YouOnWork.way2;

import com.example.YouOnWork.Book;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;
import java.util.List;

//extends JpaRepository<Book, Long>
public interface BookRepository extends JpaRepository<Book, Long> {


}
