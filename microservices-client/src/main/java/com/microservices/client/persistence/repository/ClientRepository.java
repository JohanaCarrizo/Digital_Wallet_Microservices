package com.microservices.client.persistence.repository;

import com.microservices.client.ApiClient.WalletAPIClient;
import com.microservices.client.domain.dto.ClientRequestDto;
import com.microservices.client.domain.dto.ClientResponseDto;
import com.microservices.client.domain.dto.wallet.WalletRequestDto;
import com.microservices.client.domain.dto.wallet.WalletResponseDto;
import com.microservices.client.domain.respository.IClientRepository;
import com.microservices.client.persistence.dao.ClientCrudRepository;
import com.microservices.client.persistence.entity.ClientEntity;
import com.microservices.client.persistence.mapper.IClientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class ClientRepository implements IClientRepository {

    private final ClientCrudRepository crudRepository;
    private final IClientMapper clientMapper;
    private final WalletAPIClient walletAPIClient;
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

        if (Objects.isNull(newClientDto))
            throw new RuntimeException("El Cliente no puede ser nulo.");

        ClientEntity client = clientMapper.toEntity(newClientDto);

        WalletRequestDto wallet = WalletRequestDto.builder()
                .clientDocumentNumber(client.getDocumentNumber())
                .build();

        walletAPIClient.createWallet(wallet);

        crudRepository.save(client);
    }
    @Override
    public WalletResponseDto getBalance(String documentNumber) {
        return walletAPIClient.getBalance(documentNumber).getBody();
    }
}
