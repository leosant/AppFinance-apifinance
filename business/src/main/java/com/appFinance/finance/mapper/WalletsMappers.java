package com.appFinance.finance.mapper;

import com.appFinance.finance.model.Wallet;
import com.appFinance.finance.model.dto.WalletDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class WalletsMappers {

    @Autowired
    private ModelMapper mapper;

    public WalletDto toDto(Wallet wallet) {
        return mapper.map(wallet, WalletDto.class);
    }

    public Wallet toDomain(WalletDto walletDto) {
        return mapper.map(walletDto, Wallet.class);
    }

    public List<WalletDto> toArrayDto(List<Wallet> wallets) {
        return wallets
                .stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }
}
