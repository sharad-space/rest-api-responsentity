package com.api.book.bootrestbook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.book.bootrestbook.dao.BookRepository;
import com.api.book.bootrestbook.entities.Book;

@Service
public class BookService {
    // private static List<Book> list=new ArrayList<>();
    // static{
    //     list.add(new Book(123,"this is first one","abc"));
    //     list.add(new Book(1234,"this is the second","abcd"));
    //     list.add(new Book(123456,"this is the third ","abdsc"));
    // }
    @Autowired
   private BookRepository bookRepository;

    public List<Book> getAllBooks(){
        List<Book> list=(List<Book>)this.bookRepository.findAll();

        return list;
    }

    public Book getById(int id){

       Book book=null;
       try{
    //    book= list.stream().filter(e->e.getId()==id).findFirst().get();
       book =this.bookRepository.findById(id);
       }
       catch(Exception e){
        e.printStackTrace();

       }
       return book;

    }

    public Book addBook(Book b){
        Book result=this.bookRepository.save(b);
         return result;
    }

    public void deleteBook(int id){
        // list=list.stream().filter(book->book.getId()!=id).collect(Collectors.toList());

        this.bookRepository.deleteById(id);
    }

    public void updateBook(Book book,int bookId){
        // list=list.stream().map(b->{
        //     if(b.getId()==bookId){
        //         b.setTitle(book.getTitle());
        //         b.setAuthor(book.getAuthor());
        //     }
        //     return b;
        // }).collect(Collectors.toList());

        book.setId(bookId);
        bookRepository.save(book);

        

    }
}
