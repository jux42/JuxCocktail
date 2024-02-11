package com.example.CocktailMaker.Model;
import lombok.Data;

import java.io.Serializable;
@Data
public class Cocktail implements Serializable {
    private int idDrink;
    private String strDrink;
    private String lastname;
    private String strDrinkThumb;
    private String strInstructions;
    private String strIngredient1;
    private String strIngredient2;
    private String strIngredient3;
    private String strIngredient4;
    private String strIngredient5;
    private String strIngredient6;
    private String strIngredient7;

    public Cocktail(){}

}
