package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Vector;

@RestController
@RequestMapping("/api")
public class ExampleController {

    @GetMapping("/test")
    public static String test(){
        return "test";
    }

    @GetMapping("/consume")
    public static long consume(@RequestParam(name = "i") Integer iterations) {
        Vector v = new Vector();

        for (int i = 0; i < iterations ; i++) {
            byte b[] = new byte[1048576];
            v.add(b);
        }
        Runtime rt = Runtime.getRuntime();
        return rt.freeMemory();
    }

}
