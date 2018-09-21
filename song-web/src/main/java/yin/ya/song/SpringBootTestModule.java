package yin.ya.song;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication()
@MapperScan("yin.ya.song.mapper.*")
public class SpringBootTestModule {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(SpringBootTestModule.class, args);
       // context.getBean("userService");
        System.out.println("------------- " + context.getBean("userService"));
        System.out.println("============================");
    }
}
