/* ques 2. changes made locally */

/* ques 3. changes made from remote repository */

package com.demo.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping
	public String met()
	{
		return "this is a test";
	}
}
