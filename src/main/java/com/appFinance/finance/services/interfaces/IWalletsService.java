package com.appFinance.finance.services.interfaces;

import com.appFinance.finance.model.dto.WalletDto;

import java.util.List;

public interface IWalletsService {

    List<WalletDto> listAllWallets();

    WalletDto createWallet(WalletDto wallet);
}
