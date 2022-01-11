package com.example.tata.controller;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tata.dto.StringSize;

@RestController
@RequestMapping("/master")
public class RestServiceController {

	@GetMapping("/hello/")
	public String getHello() {
		return "Hello";
	}
	
	@GetMapping("/findSize/{value}")
	public ResponseEntity<?> findMinMax(@PathVariable String value) {
		StringSize stringSize = new StringSize();
//		ResponseEntity entity = new ResponseEntity<>(null);
		String[] strArr = value.split(" ");
		Integer max=Integer.MIN_VALUE, min=Integer.MAX_VALUE, size;
		Map<String, Integer> map = new HashMap<>();
		for(String str : strArr) {
			map.put(str, str.length());
		}
		for(Map.Entry<String, Integer> mapEntry : map.entrySet()) {
			size = mapEntry.getValue();
			System.out.println(size);
			if(min>size) {
				min=size;
			}
			if(max<size) {
				max=size;
			}
		}
		stringSize.setMinWord(min);
		stringSize.setMaxWord(max);
		return new ResponseEntity<StringSize>(stringSize, HttpStatus.OK);
		
//		Hardships often prepare ordinary people for an extraordinary destiny
	}
}
