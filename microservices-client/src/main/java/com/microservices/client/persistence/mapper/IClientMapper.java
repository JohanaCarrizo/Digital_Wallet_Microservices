package com.microservices.client.persistence.mapper;

import com.microservices.client.domain.dto.ClientRequestDto;
import com.microservices.client.domain.dto.ClientResponseDto;
import com.microservices.client.persistence.entity.ClientEntity;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Validated
public interface IClientMapper {
    ClientEntity toEntity(@NotNull ClientRequestDto clientDto);
    ClientResponseDto toDto(@NotNull ClientEntity clientEntity);
    List<ClientResponseDto> toListDto(List<ClientEntity> clientEntities);
}
