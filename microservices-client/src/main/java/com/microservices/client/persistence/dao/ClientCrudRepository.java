package com.microservices.client.persistence.dao;

import com.microservices.client.persistence.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientCrudRepository extends JpaRepository<ClientEntity, Long> {
}
