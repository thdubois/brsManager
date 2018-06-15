package com.brs.brsManager.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
class HomeController {
	@RequestMapping("/hello")
	fun hello():String{
		return "Hello body";
	}
}
