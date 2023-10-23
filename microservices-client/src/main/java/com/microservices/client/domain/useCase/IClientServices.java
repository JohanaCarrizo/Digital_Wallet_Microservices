package com.microservices.client.domain.useCase;

import com.microservices.client.domain.dto.ClientRequestDto;
import com.microservices.client.domain.dto.ClientResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface IClientServices {

    List<ClientResponseDto> getAll();
    Optional<ClientResponseDto> getClient(Long idClient);
    void createClient(ClientRequestDto newClientDto);
}
