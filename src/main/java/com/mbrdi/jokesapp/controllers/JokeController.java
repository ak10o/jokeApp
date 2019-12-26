package com.mbrdi.jokesapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mbrdi.jokesapp.services.JokeService;

@Controller
public class JokeController {

	private JokeService jokeService;
	
	public JokeController(JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}

	@RequestMapping({"/",""})
	public String getJokes(Model model) {
		
		model.addAttribute("joke", jokeService.getJoke());
		
		return "chucknorris";
	}
	
}
