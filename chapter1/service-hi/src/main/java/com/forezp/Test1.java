
package com.forezp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Test1")
public class Test1 {

    @RequestMapping("/soEasy")
    public String soEasy(String word){
        System.out.println("=========" + word);
        return "so easy " + word;
    }
}
