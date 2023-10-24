package com.microservices.wallet.controller;

import com.microservices.wallet.constants.WalletConstants;
import com.microservices.wallet.domain.dto.WalletRequestDto;
import com.microservices.wallet.domain.dto.WalletResponseDto;
import com.microservices.wallet.domain.useCase.IWalletServices;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = WalletConstants.BASE_URI)
@RequiredArgsConstructor
public class WalletController {

    private final IWalletServices walletServices;
    @PostMapping(WalletConstants.CREATE)
    @ResponseStatus(HttpStatus.CREATED)
    public void createWallet(@Valid @RequestBody WalletRequestDto requestDto){
        walletServices.createWallet(requestDto);
    }
    @GetMapping(path = WalletConstants.GET_BALANCE_URI)
    public ResponseEntity<WalletResponseDto> getBalance(@PathVariable String documentNumber){
        return ResponseEntity.ok(walletServices.getBalance(documentNumber));
    }
}
