package com.example.CocktailMaker.Model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Ingredient implements Serializable {

    private int idIngredient;
    private String strIngredient;
    private String strDescription;


    public Ingredient(){}
}
