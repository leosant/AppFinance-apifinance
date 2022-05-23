package com.appFinance.finance.services;

import com.appFinance.finance.mapper.WalletsMappers;
import com.appFinance.finance.model.dto.RecipeDto;
import com.appFinance.finance.model.dto.WalletDto;
import com.appFinance.finance.repositories.WalletsRepository;
import com.appFinance.finance.services.interfaces.IRecipeService;
import com.appFinance.finance.services.interfaces.IWalletsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Collections;
import java.util.List;

@Service
public class WalletsService implements IWalletsService {

    @Autowired
    private WalletsMappers walletsMappers;
    @Autowired
    private WalletsRepository walletsRepository;
    @Autowired
    private IRecipeService recipeService;

    @Override
    public List<WalletDto> listAllWallets() {
        return walletsMappers.toArrayDto(walletsRepository.findAll());
    }

    @Override
    public WalletDto createWallet(WalletDto wallet) {
        WalletDto walletDto = null;
        if (wallet != null) {
            wallet.setAccountBalance(wallet.getRecipe().get(0).getValue());
            wallet.setRecipe(Collections.singletonList(recipeService.addRecipe(wallet.getRecipe().get(0))));
            walletDto = walletsMappers.toDto(walletsRepository.save(walletsMappers.toDomain(wallet)));
        }
        return walletDto;
    }
}
