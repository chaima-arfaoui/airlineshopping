package com.worldsoft.multicitycontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.worldsoft.multicityRequest.BookRequest;
import com.worldsoft.multicityResponse.BookResponse;
import com.worldsoft.multicityServices.BookService;

@CrossOrigin("*")
@RequestMapping("/api/multicity")
@RestController
public class BookController {
	@Autowired
	private BookService bookService;

	@PostMapping("/booking")
	public BookResponse revaflight(@RequestBody BookRequest bookRequest) {
		return bookService.bookaflight(bookRequest);
	}


}
