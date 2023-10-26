package com.microservices.client.domain.respository;

import com.microservices.client.domain.dto.ClientRequestDto;
import com.microservices.client.domain.dto.ClientResponseDto;
import com.microservices.client.domain.dto.wallet.WalletResponseDto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface IClientRepository {

    List<ClientResponseDto> getAll();
    Optional<ClientResponseDto> getClient(Long idClient);
    void createClient(ClientRequestDto newClientDto);
    WalletResponseDto getBalance(String documentNumber);
}
