package demo.controller;

import com.sun.istack.internal.logging.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    private final Logger logger = Logger.getLogger(getClass());

    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String hello(){
        return "Hello XianYU";
    }
}
