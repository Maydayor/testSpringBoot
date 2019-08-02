package test.reinhardt.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class HelloController {

    @RequestMapping(value = { "/", "/home" })

    public String homePage() {
        return "index.html";
    }
    @RequestMapping(value = "/test")
    public String testReturnPage(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("into testReturnPage function");
        return "test.html";
    }
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello.html";
    }

}