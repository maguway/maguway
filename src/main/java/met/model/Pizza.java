package met.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import met.model.Cuisine;
import met.model.Ingredient;

import java.util.ArrayList;
import java.util.List;

/**
 * @author i.sukach
 */
@Data
@NoArgsConstructor
public class Pizza {

    private String name;
    private boolean thickDough;
    private List<Ingredient> ingredients = new ArrayList<>();
    private Cuisine cuisine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isThickDough() {
        return thickDough;
    }

    public void setThickDough(boolean thickDough) {
        this.thickDough = thickDough;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Cuisine getCuisine() {
        return cuisine;
    }

    public void setCuisine(Cuisine cuisine) {
        this.cuisine = cuisine;
    }
}
