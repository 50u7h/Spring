package com.guney.springdemo.mvc;

import org.springframework.stereotype.Controller;

@Controller
public class SillyController {

	public String displayTheForm() {
		return "silly";
	}
}
