package main;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cghsir.dubbo.demo.AnnoationDemoService;

@Component
public class AnnoationAction {
	
	@Reference(version="1.0.0")
	private AnnoationDemoService annoationDemoService;
}
