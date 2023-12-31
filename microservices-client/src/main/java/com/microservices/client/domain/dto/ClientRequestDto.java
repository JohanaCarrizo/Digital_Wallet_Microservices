package com.microservices.client.domain.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;

@Builder
public record ClientRequestDto(
        @Pattern(regexp = "[0-9]{8}") @NotEmpty @NotBlank String documentNumber,
        @NotBlank @NotEmpty String phoneNumber,
        @Email String email
) {
}
