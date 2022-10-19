package org.ait.project.template.modules.client.service.delegate.impl;

import lombok.AllArgsConstructor;
import org.ait.project.template.modules.client.model.entity.Client;
import org.ait.project.template.modules.client.model.repository.ClientRepository;
import org.ait.project.template.modules.client.service.delegate.ClientServiceDelegate;
import org.ait.project.template.modules.project.model.entity.Project;
import org.ait.project.template.modules.project.model.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientServiceDelegateImpl implements ClientServiceDelegate {
    private final ClientRepository clientRepository;

    private final ProjectRepository projectRepository;

    @Override
    public Client create(Client client) {
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

    @Override
    public List<Project> getProjectsByClientId(Integer id) {
        return projectRepository.findAllByClientId(id);
    }
}
