package met.controller;

import met.model.Cuisine;
import met.model.Ingredient;
import met.model.Pizza;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PizzaController {

    @ModelAttribute("pizza")
    public Pizza pizza() {
        return new Pizza();
    }

    @ModelAttribute("allIngredients")
    public Ingredient[] allIngredients() {
        return Ingredient.values();
    }

    @ModelAttribute("allCuisines")
    public Cuisine[] allCuisines() {
        return Cuisine.values();
    }

    @GetMapping("/pizza")
    public String openPizzaFormPage() {
        return "pizza";
    }

    @PostMapping("/pizza")
    public String savePizza(Pizza pizza) {
        System.out.println(pizza);
        return "redirect:/pizza";
    }
}
