package com.microservices.client.persistance.mapper;

import com.microservices.client.domain.dto.ClientRequestDto;
import com.microservices.client.domain.dto.ClientResponseDto;
import com.microservices.client.persistance.entity.ClientEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ClientMapper implements IClientMapper{
    @Override
    public ClientEntity toEntity(ClientRequestDto clientDto) {
        return ClientEntity.builder()
                .documentNumber(clientDto.documentNumber())
                .email(clientDto.email())
                .phoneNumber(clientDto.phoneNumber())
                .build();
    }

    @Override
    public ClientResponseDto toDto(ClientEntity clientEntity) {
        return ClientResponseDto.builder()
                .id(clientEntity.getId())
                .documentNumber(clientEntity.getDocumentNumber())
                .email(clientEntity.getEmail())
                .phoneNumber(clientEntity.getPhoneNumber())
                .build();
    }

    @Override
    public List<ClientResponseDto> toListDto(List<ClientEntity> clientEntities) {
        return clientEntities.stream().map(this::toDto).collect(Collectors.toList());
    }
}
