package com.microservices.wallet.domain.repository;

import com.microservices.wallet.domain.dto.WalletRequestDto;
import com.microservices.wallet.domain.dto.WalletResponseDto;

public interface IWalletRepository {

    void createWallet(WalletRequestDto newWallet);
    WalletResponseDto getBalance(String documentNumber);
}
