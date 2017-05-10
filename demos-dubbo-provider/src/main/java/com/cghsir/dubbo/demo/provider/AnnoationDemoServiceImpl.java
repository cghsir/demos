package com.cghsir.dubbo.demo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.cghsir.dubbo.demo.AnnoationDemoService;

@Service(version="1.0.0")
public class AnnoationDemoServiceImpl implements AnnoationDemoService {

	public void testAnnoation() {
		System.out.println("test annoation successful...");
	}

}
