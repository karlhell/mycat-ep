/**
 * 
 */
package com.mycat.io.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycat.io.pojo.Item;
import com.mycat.io.service.SampleService;

/**
 * @author karlhell
 *
 */
@RestController
public class SampleController {
    
    @Autowired
    private SampleService sampleService;

    @RequestMapping("/mycat")
    public ResponseEntity<List<Item>> mycat() {
        return ResponseEntity.ok(sampleService.getHelloMessage());
    }
}
