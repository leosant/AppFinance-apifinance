package com.appFinance.finance.mapper;

import com.appFinance.finance.model.Recipe;
import com.appFinance.finance.model.dto.RecipeDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecipeMappers {

    @Autowired
    private ModelMapper mapper;

    public RecipeDto toDto(Recipe recipe) {
        return mapper.map(recipe, RecipeDto.class);
    }

    public Recipe toDomain(RecipeDto recipeDto) {
        return mapper.map(recipeDto, Recipe.class);
    }
}
