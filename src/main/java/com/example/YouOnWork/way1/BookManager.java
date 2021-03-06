package com.example.YouOnWork.way1;
import com.example.YouOnWork.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class BookManager {

    protected SessionFactory sessionFactory;

    protected void setup() {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings from hibernate.cfg.xml
                .build();
        try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        } catch (Exception ex) {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }

    protected void exit() {
        sessionFactory.close();
    }

    protected void create() {
        Book book = new Book();
        book.setTitle("Effective Java");
        book.setAuthor("Joshua Bloch");
        book.setPrice(32.59f);

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(book);

        session.getTransaction().commit();
        session.close();
    }

    protected void read() {
        Session session = sessionFactory.openSession();

       long bookId = 1;
        Book book = session.get(Book.class,bookId);

        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: " + book.getPrice());

        session.close();
    }

    protected void update() {
        // code to modify a book
    }

    protected void delete() {
        // code to remove a book
    }

    public static void main(String[] args) {
        // code to run the program
    }
}
