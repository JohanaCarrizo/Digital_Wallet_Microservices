package com.microservices.client.persistence.repository;

import com.microservices.client.domain.dto.ClientRequestDto;
import com.microservices.client.domain.dto.ClientResponseDto;
import com.microservices.client.domain.respository.IClientRepository;
import com.microservices.client.persistence.dao.ClientCrudRepository;
import com.microservices.client.persistence.mapper.IClientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class ClientRepository implements IClientRepository {

    private final ClientCrudRepository crudRepository;
    private final IClientMapper clientMapper;
    @Override
    public List<ClientResponseDto> getAll() {
        return clientMapper.toListDto(crudRepository.findAll());
    }

    @Override
    public Optional<ClientResponseDto> getClient(Long idClient) {
        return crudRepository.findById(idClient).map(clientMapper::toDto);
    }

    @Override
    public void createClient(ClientRequestDto newClientDto) {
        crudRepository.save(clientMapper.toEntity(newClientDto));
    }
}
