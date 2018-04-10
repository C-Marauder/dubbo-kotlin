package com.xqy.www.customer

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan
import com.xqy.www.api.GirlService
import com.xqy.www.customer.config.ConsumerConfiguration
import com.xqy.www.customer.service.GirlServiceCustomer
import com.xqy.www.domain.Girl
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.AnnotationConfigApplicationContext

@SpringBootApplication
@DubboComponentScan("com.xqy.www.customer")
class CustomerApplication

fun main(args: Array<String>) {
    System.setProperty("java.net.preferIPv4Stack", "true");
    AnnotationConfigApplicationContext().apply {
        register(ConsumerConfiguration::class.java)
        refresh()
    }

    //SpringApplication.run(CustomerApplication::class.java,*args)
}
///**       * 启动服务提供方上下文       */
//private static void startProviderContext() {
//// 创建 Annotation 配置上下文
//// AnnotationConfigApplicationContext providerContext = new AnnotationConfigApplicationContext();
//// 注册配置 Bean
//// providerContext.register(ProviderConfiguration.class);
//// 启动服务提供方上下文
//// providerContext.refresh();      }
//
//    /**       * 启动并且返回服务消费方上下文       *       * @return AnnotationConfigApplicationContext       */
//    private static ApplicationContext startConsumerContext()
//    {          // 创建服务消费方 Annotation 配置上下文
//// AnnotationConfigApplicationContext consumerContext = new AnnotationConfigApplicationContext();
//// 注册服务消费方配置 Bean          consumerContext.register(ConsumerConfiguration.class);
//// 启动服务消费方上下文          consumerContext.refresh();
//// 返回服务消费方 Annotation 配置上下文          return consumerContext;      }
//
//        package com.alibaba.dubbo.demo.bootstrap;
//        import com.alibaba.dubbo.demo.config.ConsumerConfiguration;
//        mport com.alibaba.dubbo.demo.config.ProviderConfiguration;
//        import com.alibaba.dubbo.demo.consumer.AnnotationDemoServiceConsumer;
//        import org.springframework.context.ApplicationContext;
//        import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//        /**   * 服务消费端引导类   *   * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>   */
//        public class ConsumerBootstrap {        public static void main(String[] args) {
//// 启动服务提供方上下文          startProviderContext();
//// 启动并且返回服务消费方上下文
//// ApplicationContext consumerContext = startConsumerContext();
//// 获取 AnnotationDemoServiceConsumer Bean
//
//// AnnotationDemoServiceConsumer consumer = consumerContext.getBean(AnnotationDemoServiceConsumer.class);
//// 执行 doSayHello 方法          String message = consumer.doSayHello("World");
//// 输出执行结果          System.out.println(message);      }
//// /**       * 启动并且返回服务消费方上下文       *       * @return AnnotationConfigApplicationContext       */
//// private static ApplicationContext startConsumerContext() {          // 创建服务消费方 Annotation 配置上下文
//// AnnotationConfigApplicationContext consumerContext = new AnnotationConfigApplicationContext();
//// 注册服务消费方配置 Bean          consumerContext.register(ConsumerConfiguration.class);
//// 启动服务消费方上下文          consumerContext.refresh();
//// 返回服务消费方 Annotation 配置上下文          return consumerContext;      }
//// /**       * 启动服务提供方上下文       */      private static void startProviderContext() {
//// 创建 Annotation 配置上下文
//// AnnotationConfigApplicationContext providerContext = new AnnotationConfigApplicationContext();
//// 注册配置 Bean          providerContext.register(ProviderConfiguration.class);
//// 启动服务提供方上下文          providerContext.refresh();      }    }
//

