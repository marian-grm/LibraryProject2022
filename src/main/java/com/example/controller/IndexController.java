package com.example.controller;

import com.example.model.Books;
import com.example.model.Libraries;
import com.example.service.BooksService;
import com.example.service.LibrariesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class IndexController {

    @Autowired
    BooksService service;
    @Autowired
    LibrariesService service2;

    @GetMapping(value="/index")
    public String getIndex(Model model){
        model.addAttribute("booksList", service.getBooksList());
        return "index";
    }

    @GetMapping(value="/createBooks")
    public String createBooks(Model model) {
        Books books = new Books();
        model.addAttribute("books", books);
        return "createBooks";
    }

    @PostMapping(value="/submitBooks")
    public String submitBooks(@ModelAttribute Books books) {
        System.out.println(books.getName());
        System.out.println(books.getYear());
        System.out.println(books.getWriter());
        System.out.println(books.getPrice());
        service.saveBooks(books);
        return "redirect:/index";
    }

    @GetMapping(value="/books")
    public String getBooks(Model model) {
        model.addAttribute("BooksList", service.getBooksList());
        return "books";
    }

    @GetMapping(value="/createLibraries")
    public String createLibraries(Model model) {
        Libraries libraries = new Libraries();
        model.addAttribute("libraries", libraries);
        return "createLibraries";
        //return "/createLibraries";
    }

    @PostMapping(value="/submitLibraries")
    public String submitLibraries(@ModelAttribute Libraries libraries) {
        System.out.println(libraries.getName());
        System.out.println(libraries.getLocation());
        service2.saveLibraries(libraries);
        return "redirect:/index";
    }

    @GetMapping(value="/libraries")
    public String getLibraries(Model model) {
        model.addAttribute("LibrariesList", service2.getLibrariesList());
        return "libraries";
    }

    //not working yet
    /*
    @PostMapping(value="/deleteLibraries")
    public String deleteLibraries(@RequestParam("") int id){
        System.out.println("testare");
        Libraries libraries = new Libraries(id);
        libraries.setId(2);
        service2.deleteLibraries(libraries);    //cel creat mai sus
        return "redirect:/libraries";
    }
    */
}

