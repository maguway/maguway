package met.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DocumentsController {

/*    @ModelAttribute("method")
    public Method method() {
        return new Method();
    }*/

    @GetMapping("/documents")
    public String openMethod(Model model) {
        return "documents";
    }

}
