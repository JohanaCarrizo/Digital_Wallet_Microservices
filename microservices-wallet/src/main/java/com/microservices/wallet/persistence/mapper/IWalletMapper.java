package com.microservices.wallet.persistence.mapper;

import com.microservices.wallet.domain.dto.WalletRequestDto;
import com.microservices.wallet.domain.dto.WalletResponseDto;
import com.microservices.wallet.persistence.entity.WalletEntity;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

@Validated
public interface IWalletMapper {
    WalletResponseDto toDTO(@NotNull WalletEntity entity);

    WalletEntity toEntity(@NotNull WalletRequestDto dto);
}
