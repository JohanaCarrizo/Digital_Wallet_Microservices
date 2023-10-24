package com.microservices.client.ApiClient;

import com.microservices.client.domain.dto.wallet.WalletRequestDto;
import com.microservices.client.domain.dto.wallet.WalletResponseDto;
import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "msvc-wallet", url = "localhost:9091/api/v1/wallet")
public interface WalletAPIClient {

    @PostMapping(path = "/create")
    void createWallet(@Valid @RequestBody WalletRequestDto requestDto);

    @GetMapping(path = "/{documentNumber}")
    ResponseEntity<WalletResponseDto> getBalanceByDocument(@PathVariable String documentNumber);
}
