package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("hello") // /redirect 하는구만 return이 .html 파일 이름이고
    public String hello(Model model) {
        model.addAttribute("data", "hello!");
        return "test";
    }

    // app.get()같은거라는데요 gpt가
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-templete";
    };

    // Getter and Setter
    // private 멤버 사용할 때 사용?
    static class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}

/*
Template: http?
API response: 객체
@ResponseBody를 사용 -> 객체(json)으로 응답해줌
viewResolver 대신에 HoopMessangeConverter가 동작
기본 문자처리: StringHoopMessageConverter
기본 객체처리: MappingJackson2HttpMessageConverter (Jackson? json라이브러리임)
byte 처리 등등 여러 HttpMessageConverter가 기본으로 등록되어 있음
HTTP Accept 헤더는 포맷 요청 정보? 담고있음
 */