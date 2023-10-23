package com.microservices.wallet.domain.dto;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record WalletResponseDto(
        Long walletId,
        BigDecimal balance,
        String currency
) {
}
