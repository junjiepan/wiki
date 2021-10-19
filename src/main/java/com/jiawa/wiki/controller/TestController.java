package com.jiawa.wiki.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    /**
     * Get Post Put Delete
     *
     * /user?id=1
     * /user/1
     * @return
     */
    // @PostMapping
    // @PutMapping
    // @DeLeteMapping
    // @RequestMapping(value = "/user/1" , method = RequestMethod.GET)
    // @RequestMapping(value = "/user/1" , method = RequestMethod.DELETE)

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
