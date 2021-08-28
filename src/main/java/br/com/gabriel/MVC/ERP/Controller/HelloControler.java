package br.com.gabriel.MVC.ERP.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloControler {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute ("nome","mundo");
        return "hello";

    }

}
