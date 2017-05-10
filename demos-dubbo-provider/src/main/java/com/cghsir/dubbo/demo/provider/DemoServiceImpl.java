package com.cghsir.dubbo.demo.provider;

import com.cghsir.dubbo.demo.DemoService;

public class DemoServiceImpl implements DemoService {

	public String sayHello(String name) {
		return "Hello " + name;
	}

}
