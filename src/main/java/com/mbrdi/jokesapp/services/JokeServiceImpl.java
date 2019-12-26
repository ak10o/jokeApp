package com.mbrdi.jokesapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService{

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	/**
	 * Spring will create it once and reuse for every request.
	 * If it was created inside a method then for every request we would create a object of
	 * ChuckNorris.
	 */
	public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}

	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

	
}
