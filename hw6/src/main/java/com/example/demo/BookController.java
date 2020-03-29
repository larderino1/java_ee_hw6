package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class BookController {
    @Autowired
    private BookService bookService;


    @RequestMapping(value = "/addBook", method = RequestMethod.GET)
    public String addBookGet() {
        return "form";
    }

    @RequestMapping(value = "/addBook", method = RequestMethod.POST)
    public String addBookPost(@ModelAttribute BookDTO book, Model model) {
        model.addAttribute("book", book);
        bookService.save(book);
        return "redirect:/books-list";
    }

    @RequestMapping(value = "/booksList", method = RequestMethod.GET)
    public String bookList(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "index";
    }

    @RequestMapping(value = "/booksList/book/{id}", method = RequestMethod.GET)
    public String getBookPathVariable(
            @PathVariable("id") int id, Model model) {
        model.addAttribute("book", bookService.getOne(id));
        return "bookView";
    }


    @RequestMapping(value = "/booksList/bookByTitle")
    public String getBookByTitle(
            @RequestParam("title") String title, Model model) {
        model.addAttribute("books", bookService.findAllByTitle(title));
        return "result";
    }



    @RequestMapping(value = "/bookslist/bookByIsbn")
    public String getBookByIsbn(
            @RequestParam("isbn") String isbn, Model model) {
        model.addAttribute("books", bookService.findAllByIsbn(isbn));
        return "result";
    }






}
