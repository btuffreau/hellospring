package org.hellospring.lab;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemsController {

	  private static final String template = "That is %s!";
	  private final AtomicLong counter = new AtomicLong();

	  @GetMapping("/items")
	  @ResponseBody
	  public Items showInventory(@RequestParam(name="name", required=false, defaultValue="empty") String name) {
	    return new Items(counter.incrementAndGet(), String.format(template, name));
	  }

}
