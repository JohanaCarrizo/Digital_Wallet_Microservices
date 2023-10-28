package com.microservices.wallet.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "wallets")
@Builder
@Entity
public class WalletEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "document_number")
    private String documentNumber;

    private BigDecimal balance;
    private String currency;
}
