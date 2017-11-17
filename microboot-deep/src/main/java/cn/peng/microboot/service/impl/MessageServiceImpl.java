package cn.peng.microboot.service.impl;

import cn.peng.microboot.service.IMessageService;

public class MessageServiceImpl implements IMessageService {
	@Override
	public String echo() {
		return "鹏大爷";
	}
}
