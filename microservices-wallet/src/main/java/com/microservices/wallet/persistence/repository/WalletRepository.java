package com.microservices.wallet.persistence.repository;

import com.microservices.wallet.domain.dto.WalletRequestDto;
import com.microservices.wallet.domain.dto.WalletResponseDto;
import com.microservices.wallet.domain.repository.IWalletRepository;
import com.microservices.wallet.persistence.dao.WalletCrudRepository;
import com.microservices.wallet.persistence.mapper.IWalletMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class WalletRepository implements IWalletRepository {

    private final WalletCrudRepository crudRepository;
    private final IWalletMapper walletMapper;
    @Override
    public void createWallet(WalletRequestDto newWallet) {
        crudRepository.save(walletMapper.toEntity(newWallet));
    }

    @Override
    public WalletResponseDto getBalance(String documentNumber) {
        return walletMapper.toDTO(crudRepository.findByClientDocumentNumber(documentNumber).orElseThrow(() -> new RuntimeException("La billetera solicitada no se encuentra en la base de datos.")));
    }
}
