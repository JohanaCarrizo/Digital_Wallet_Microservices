package com.microservices.wallet.domain.services;

import com.microservices.wallet.domain.dto.WalletRequestDto;
import com.microservices.wallet.domain.dto.WalletResponseDto;
import com.microservices.wallet.domain.repository.IWalletRepository;
import com.microservices.wallet.domain.useCase.IWalletServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class WalletServices implements IWalletServices {

    private final IWalletRepository walletRepository;
    @Override
    public void createWallet(WalletRequestDto newWallet) {
        if (newWallet.clientDocumentNumber().trim().isEmpty())
            throw new RuntimeException("El número de documento del cliente debe ser válido.");

        walletRepository.createWallet(newWallet);
    }

    @Override
    public WalletResponseDto getBalance(String documentNumber) {
        if (documentNumber.trim().isEmpty())
            throw new RuntimeException("Número de documento del cliente inválido.");

        return walletRepository.getBalance(documentNumber);
    }
}
