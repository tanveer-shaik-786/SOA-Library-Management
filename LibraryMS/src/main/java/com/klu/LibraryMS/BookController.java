package com.klu.LibraryMS;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;


@RestController
public class BookController {
	@Autowired
	BookService bs;
	
	@PostMapping("/add")
	public String insert(@RequestBody Book b) {
		return bs.insert(b);
	}
	
	@GetMapping("/showCart")
	public List<Book> retrieve(){
		return bs.retrieve();
	}
	
	 @PutMapping("/updateBook/{id}")
	    public Book update(@PathVariable int bid, @RequestBody Book b) {
	        b.setBid(bid);
	        return bs.update(b);
	    }
	
	@DeleteMapping("/deleteBook/{id}")
	public void delete(@PathVariable int bid) {
		bs.delete(bid);
	}
	
}
