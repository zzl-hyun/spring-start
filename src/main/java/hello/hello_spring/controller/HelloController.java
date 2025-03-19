package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello") // /redirect 하는구만 return이 .html 파일 이름이고
    public String hello(Model model) {
        model.addAttribute("data", "hello!");
        return "test";
    }
}
