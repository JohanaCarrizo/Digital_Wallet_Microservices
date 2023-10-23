package com.microservices.wallet.persistence.mapper;

import com.microservices.wallet.domain.dto.WalletRequestDto;
import com.microservices.wallet.domain.dto.WalletResponseDto;
import com.microservices.wallet.persistence.entity.WalletEntity;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class WalletMapper implements IWalletMapper{
    @Override
    public WalletResponseDto toDTO(WalletEntity entity) {
        return WalletResponseDto.builder()
                .walletId(entity.getId())
                .balance(entity.getBalance())
                .currency(entity.getCurrency())
                .build();
    }

    @Override
    public WalletEntity toEntity(WalletRequestDto dto) {
        return WalletEntity.builder()
                .clientDocumentNumber(dto.clientDocumentNumber())
                .balance(BigDecimal.valueOf(0))
                .currency("USD")
                .build();
    }
}
