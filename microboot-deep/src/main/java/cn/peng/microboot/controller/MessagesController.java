package cn.peng.microboot.controller;

import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagesController {
	@Resource
	private MessageSource messageSource;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return this.messageSource.getMessage("welcome.msg", new Object[] {"大鹏"}, Locale.getDefault());
	}
}
