package met.controller;

import met.model.Method;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MethodController {

/*    @ModelAttribute("method")
    public Method method() {
        return new Method();
    }*/

    @GetMapping("/")
    public String openMethod(Model model) {
        Method method = new Method();

/*        method.setkTrudFun(12);
        method.setkTrudEnt(26);
        method.setkTrudClass(134);
        method.setkTrudConn(102);
        method.setkTrudNod(4);
        method.setWorkTime(165);
        method.setkUser(42);*/

        method.setkTrudFun(1);
        method.setkTrudEnt(1);
        method.setkTrudClass(1);
        method.setkTrudConn(1);
        method.setkTrudNod(1);
        method.setWorkTime(1);
        method.setkUser(1);

        model.addAttribute("method", method);
        return "method";
    }

    @PostMapping("/method")
    public String saveMethod(Method method) {
        System.out.println(method);
        return "method";
    }
}
