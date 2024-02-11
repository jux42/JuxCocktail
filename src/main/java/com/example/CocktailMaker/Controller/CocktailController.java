package com.example.CocktailMaker.Controller;

import com.example.CocktailMaker.Model.Cocktail;
import com.example.CocktailMaker.Model.CocktailResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class CocktailController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/cocktails")
    public String listCocktails(Model model) {
        ResponseEntity<CocktailResponse> response =
                restTemplate.getForEntity(
                        "https://www.thecocktaildb.com/api/json/v2/9973533/filter.php?a=Alcoholic",
                        CocktailResponse.class);
        CocktailResponse cocktailResponse = response.getBody();
        List<Cocktail> cocktails = null;
        if (cocktailResponse != null) {
            cocktails = cocktailResponse.getDrinks();
        }
        model.addAttribute("cocktails", cocktails);
        return "cocktails"; // Nom du template Thymeleaf
    }


    @GetMapping("cocktails/{id}")
    public String cocktailDetails(@PathVariable int id, Model model){
        ResponseEntity<CocktailResponse> response =
                restTemplate.getForEntity(
                        "https://www.thecocktaildb.com/api/json/v1/1/lookup.php?i="+id,
                        CocktailResponse.class);
                CocktailResponse cocktailResponse = response.getBody();
                List<Cocktail> cocktail = null;
        if (cocktailResponse != null) {
            cocktail = cocktailResponse.getDrinks();
        }
        model.addAttribute("cocktail", cocktail);

        return "details";

    }
}
