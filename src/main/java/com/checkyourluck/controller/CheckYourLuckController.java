package com.checkyourluck.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.checkyourluck.model.CheckYourLuck;
import com.checkyourluck.repository.CheckYourLuckRepository;

@RestController
public class CheckYourLuckController {
	
	@Autowired
	 final CheckYourLuckRepository repo=null;

	@GetMapping("/{givenNumber}")
	public String validateNumber(@PathVariable int givenNumber) {
		int randomNumber=new Random().nextInt(100);
		CheckYourLuck ch=new CheckYourLuck();
		ch.setGivenNumber(givenNumber);
		ch.setRandomNumber(randomNumber);
		repo.save(ch);
		System.out.println("Given Number "+givenNumber+ "\nRandom Number "+randomNumber);
		if(givenNumber==randomNumber) {
		return "Success";
		}
		else {
			return "false";
		}
	}
}
