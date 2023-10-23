package com.microservices.client.persistance.dao;

import com.microservices.client.persistance.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientCrudRepository extends JpaRepository<ClientEntity, Long> {
}
