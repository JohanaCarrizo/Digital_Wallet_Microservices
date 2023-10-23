package com.microservices.client.domain.services;

import com.microservices.client.domain.dto.ClientRequestDto;
import com.microservices.client.domain.dto.ClientResponseDto;
import com.microservices.client.domain.respository.IClientRepository;
import com.microservices.client.domain.useCase.IClientServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ClientServices implements IClientServices {

    private final IClientRepository clientRepository;
    @Override
    public List<ClientResponseDto> getAll() {
        return clientRepository.getAll();
    }

    @Override
    public Optional<ClientResponseDto> getClient(Long idClient) {
        return clientRepository.getClient(idClient);
    }

    @Override
    public void createClient(ClientRequestDto newClientDto) {
        clientRepository.createClient(newClientDto);
    }
}
