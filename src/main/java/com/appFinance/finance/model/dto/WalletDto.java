package com.appFinance.finance.model.dto;

import com.appFinance.finance.model.Cost;
import com.appFinance.finance.model.Recipe;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;

public class WalletDto {

    private String id;
    private String date;
    private String nameBank;
    private double accountBalance;
    private List<RecipeDto> recipe;
    private List<CostDto> cost;
    private String colorCard;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<RecipeDto> getRecipe() {
        return recipe;
    }

    public void setRecipe(List<RecipeDto> recipe) {
        this.recipe = recipe;
    }

    public List<CostDto> getCost() {
        return cost;
    }

    public void setCost(List<CostDto> cost) {
        this.cost = cost;
    }

    public String getColorCard() {
        return colorCard;
    }

    public void setColorCard(String colorCard) {
        this.colorCard = colorCard;
    }
}
