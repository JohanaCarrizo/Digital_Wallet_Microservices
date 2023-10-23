package com.microservices.client.persistance.mapper;

import com.microservices.client.domain.dto.ClientRequestDto;
import com.microservices.client.domain.dto.ClientResponseDto;
import com.microservices.client.persistance.entity.ClientEntity;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Validated
public interface IClientMapper {
    ClientEntity toEntity(ClientRequestDto clientDto);
    ClientResponseDto toDto(ClientEntity clientEntity);
    List<ClientResponseDto> toListDto(List<ClientEntity> clientEntities);
}
