package cn.peng.microboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.peng.microboot.service.impl.MessageServiceImpl;

@Configuration
public class ServiceConfig {
	@Bean //表示在spring 中进行注册处理
	public MessageServiceImpl getMessageServiceInstance() {
		return new MessageServiceImpl();
	}
}
