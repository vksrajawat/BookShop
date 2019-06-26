package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Book;
import com.app.service.IBookService;


@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	private IBookService service;
	
	public BookController() {
		System.out.println("in bookcontroller constructor");
	}



	@GetMapping("/list")
	public String showBookList(Model map) {
		System.out.println("in list book controller");
		
		map.addAttribute("book_list", service.listBooks());
		return "/book/list"; 
	}
	
	
	@GetMapping("/delete")
	public String deleteBookList(@RequestParam int bid,
			RedirectAttributes flashMap) {
		System.out.println("in delete vendor "+bid+" "+flashMap);
		flashMap.addFlashAttribute("status",service.deleteBookList(bid));
			return "redirect:/book/list"; 
	}
	
	@GetMapping("/update")
	public String showUpdateForm(@RequestParam int bid,Model map)
	{
		System.out.println("in show update form ");
		map.addAttribute("vendor",service.getBookDetails(bid));
		System.out.println(map);
		return "/book/update_form";
	}	
}
