package com.microservices.client.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "clients")
@Builder
@Entity
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "document_number")
    private String documentNumber;
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "is_validate")
    private boolean isValidate;
}
