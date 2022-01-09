package com.shorten.service.controller;

import java.nio.charset.StandardCharsets;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.hash.Hashing;
import com.shorten.service.request.ShortenRequest;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/")
@RequiredArgsConstructor
public class ShortenController {
	
	@SuppressWarnings("deprecation")
	@PostMapping(value="shorten")
	public ResponseEntity<?> getShortenUrl(@RequestBody ShortenRequest shortenRequest){
		
        final String shorten = Hashing.murmur3_32().hashString(shortenRequest.getFullUrl(), StandardCharsets.UTF_8).toString();
        
        //save data to redis in here
        
		return new ResponseEntity<String>(shorten, HttpStatus.OK);
	}
	

}
