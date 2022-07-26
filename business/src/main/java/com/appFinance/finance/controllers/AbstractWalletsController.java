package com.appFinance.finance.controllers;

import com.appFinance.finance.model.dto.WalletDto;
import com.appFinance.finance.services.interfaces.IWalletsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public abstract class AbstractWalletsController {

    @Autowired
    private IWalletsService iWalletsService;

    @GetMapping("/find-wallets")
    public ResponseEntity<List<WalletDto>> listAllWallets() {
        return ResponseEntity.ok(iWalletsService.listAllWallets());
    }

    @PostMapping("/create-wallet")
    public ResponseEntity<WalletDto> createWallet(@RequestBody WalletDto wallet) {
        return ResponseEntity.status(HttpStatus.CREATED).body(iWalletsService.createWallet(wallet));
    }
}
