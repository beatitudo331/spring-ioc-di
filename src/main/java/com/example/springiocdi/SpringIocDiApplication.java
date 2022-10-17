package com.example.springiocdi;

import com.example.springiocdi.singletonetest.TestService;
import com.example.springiocdi.wiredTest.WireController;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

@SpringBootApplication
public class SpringIocDiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringIocDiApplication.class, args);
    }


    @Resource
    ApplicationContext applicationContext;

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> {

            // bean 확인

            String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
            for (String beanDefinitionName : beanDefinitionNames) {
                System.out.println("beanDefinitionName = " + beanDefinitionName);
            }

            // stateless Test
            TestService service1 = applicationContext.getBean(TestService.class);
            TestService service2 = applicationContext.getBean(TestService.class);

            System.out.println("service1.count() = " + service1.count());
            System.out.println("service2.count() = " + service2.count());


            // Autowired Test
            WireController wireController = applicationContext.getBean(WireController.class);
            wireController.test();

        };
    }

}
