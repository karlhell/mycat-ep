/**
 * 
 */
package com.mycat.io.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author karlhell
 *
 */
@SpringBootApplication
@ComponentScan(basePackages="com.mycat.io")
@EnableAutoConfiguration
public class Launcher {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Launcher.class, args);
    }
}
