package webzg.Gorgeous.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys")
public class LoginController {
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login() {
		return "login success";
	}

}
