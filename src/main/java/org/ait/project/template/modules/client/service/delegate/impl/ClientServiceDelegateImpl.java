package org.ait.project.template.modules.client.service.delegate.impl;

import lombok.AllArgsConstructor;
import org.ait.project.template.modules.client.model.entity.Client;
import org.ait.project.template.modules.client.model.repository.ClientRepository;
import org.ait.project.template.modules.client.service.delegate.ClientServiceDelegate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientServiceDelegateImpl implements ClientServiceDelegate {
    private final ClientRepository clientRepository;

    @Override
    public Client create(Client client) {
        System.out.println(client);
        return clientRepository.save(client);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client getById(Integer id) {
        return clientRepository.findById(id).get();
    }
}
