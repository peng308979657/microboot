package cn.peng.microboot.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.peng.microboot.service.IMessageService;

@Controller
public class ServiceController {
	@Resource
	private IMessageService ms;
	@RequestMapping("/msg")
	@ResponseBody
	public String ServiceMessages() {
		return this.ms.echo();
	}
	@RequestMapping("/show")
	@ResponseBody
	public String show(Model model) {
		model.addAttribute("msg", this.ms.echo());
		return "message/message_show" ;
	}
	
}
