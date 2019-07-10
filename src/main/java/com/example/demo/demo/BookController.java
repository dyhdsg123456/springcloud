package com.example.demo.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: dyh
 * Date:   2019/7/10
 * Description:
 */
@RestController
public class BookController {
    @RequestMapping("/getbook6")
    public List<Book> book6(String ids) {
        System.out.println("ids>>>>>>>>>>>>>>>>>>>>>" + ids);
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("《李自成》", 55, "姚雪垠", "人民文学出版社"));
        books.add(new Book("中国文学简史", 33, "林庚", "清华大学出版社"));
        books.add(new Book("文学改良刍议", 33, "胡适", "无"));
        books.add(new Book("ids", 22, "helloworld", "haha"));
        return books;
    }

    @RequestMapping("/getbook6/{id}")
    public Book book61(@PathVariable Integer id) {
        Book book = new Book("《李自成》2", 55, "姚雪垠2", "人民文学出版社2");
        return book;
    }
}
