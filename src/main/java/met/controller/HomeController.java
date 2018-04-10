package met.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

/*    @ModelAttribute("method")
    public Method method() {
        return new Method();
    }*/

    @GetMapping("/")
    public String openMethod(Model model) {
        return "index";
    }

}
