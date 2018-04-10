package met.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DocsController {

/*    @ModelAttribute("method")
    public Method method() {
        return new Method();
    }*/

    @GetMapping("/docs")
    public String openMethod(Model model) {
        return "docs";
    }

}
