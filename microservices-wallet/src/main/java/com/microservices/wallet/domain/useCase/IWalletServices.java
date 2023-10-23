package com.microservices.wallet.domain.useCase;

import com.microservices.wallet.domain.dto.WalletRequestDto;
import com.microservices.wallet.domain.dto.WalletResponseDto;

public interface IWalletServices {

    void createWallet(WalletRequestDto newWallet);
    WalletResponseDto getBalance(String documentNumber);
}
