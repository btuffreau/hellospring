package org.hellospring.lab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VersionController {
	
	  @GetMapping("/version")
	  @ResponseBody
	  public Version showVersion(@RequestParam(name="version", required=false, defaultValue="v0.0") String v) {
	    return new Version(v);
	  }
	
}
