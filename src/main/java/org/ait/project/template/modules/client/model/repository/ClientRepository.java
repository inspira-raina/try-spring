package org.ait.project.template.modules.client.model.repository;

import org.ait.project.template.modules.client.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
