package com.microservices.wallet.persistence.dao;

import com.microservices.wallet.persistence.entity.WalletEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WalletCrudRepository extends JpaRepository<WalletEntity, Long> {

    Optional<WalletEntity> findByDocumentNumber(String clientDocumentNumber);
}
