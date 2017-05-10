# demos

demos-dubbo-common(继承自demos-parent项目):dubbo项目公共模块 ，其中声明使用spring 和dubbo jar dubbo服务的接口放在此项目内。服务接口有服务提供方和服务消费方共同引用
demos-dubbo-consumer(依赖demos-dubbo-common，将服务接口依赖过来)：dubbo项目的服务消费方。consumer.xml像本地注册bean一样 注册远程bean实例（具体实现在远程的服务提供方）。/demos-dubbo-consumer/src/main/java/main/Consumer.java调用服务
demos-dubbo-provider(依赖demos-dubbo-common，将服务接口依赖过来):dubbo项目的服务具体实现方。provider.xml注册服务。/demos-dubbo-provider/src/main/java/main/Provider.java 发布服务