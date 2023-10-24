package com.microservices.client.domain.dto.wallet;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record WalletResponseDto(
        Long walletId,
        BigDecimal balance,
        String currency
) {
}
