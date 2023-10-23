package com.microservices.client.domain.dto;

import lombok.Builder;

@Builder
public record ClientResponseDto(
        Long id,
        String documentNumber,
        String email,
        String phoneNumber
) {
}
