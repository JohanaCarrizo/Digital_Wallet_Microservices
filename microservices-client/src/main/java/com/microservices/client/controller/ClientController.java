package com.microservices.client.controller;

import com.microservices.client.constants.ClientConstants;
import com.microservices.client.domain.dto.ClientRequestDto;
import com.microservices.client.domain.dto.ClientResponseDto;
import com.microservices.client.domain.useCase.IClientServices;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = ClientConstants.BASE_URI)
public class ClientController {

    private final IClientServices clientServices;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ClientResponseDto> getAll(){
        return clientServices.getAll();
    }
    @GetMapping(value = ClientConstants.GET_CLIENT_URI)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ClientResponseDto> getClient(@Valid @PathVariable Long id){
        return ResponseEntity.of(clientServices.getClient(id));
    }
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createClient(@Valid @RequestBody ClientRequestDto newClient){
        clientServices.createClient(newClient);
    }
}
