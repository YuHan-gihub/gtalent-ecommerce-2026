package gtalent.dev.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String HomePage() {
        return "home";
    }

    @GetMapping("/yuhan")
    public String EdPage() {
        return "yuhan";
    }

<<<<<<< HEAD
=======
    @GetMapping("/eager")
    public String EagerPage() {
        return "eager";
    
    @GetMapping("/charlie")
    public String ChPage() {
        return "charlie";
    }
    
    @GetMapping("/WWJ")
    public String WWJPage() {
        return "WWJ";
    }

>>>>>>> b55fed7ebba3ef61b815d78245c87212e3235f5a
}
