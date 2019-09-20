package ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ribbon.service.HelloService;

/**
 * @author Mcl
 * @version 1, 2019/8/13.
 */
@RestController
public class HelloControler {
    @Autowired
    private HelloService helloService;

    @GetMapping(value= "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
