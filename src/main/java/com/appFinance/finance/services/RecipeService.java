package com.appFinance.finance.services;

import com.appFinance.finance.mapper.RecipeMappers;
import com.appFinance.finance.model.dto.RecipeDto;
import com.appFinance.finance.repositories.RecipeRepository;
import com.appFinance.finance.services.interfaces.IRecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService implements IRecipeService {

    @Autowired
    private RecipeMappers recipeMappers;
    @Autowired
    private RecipeRepository recipeRepository;

    @Override
    public RecipeDto addRecipe(RecipeDto recipeDto) {
        return recipeMappers.toDto(
                recipeRepository.save(recipeMappers.toDomain(recipeDto))
        );
    }
}
