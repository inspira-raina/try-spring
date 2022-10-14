package org.ait.project.template.modules.client.transform;


import org.ait.project.template.modules.client.dto.request.ClientRequest;
import org.ait.project.template.modules.client.dto.response.ClientResponse;
import org.ait.project.template.modules.client.model.entity.Client;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    ClientResponse toClientResponse(Client client);
    List<ClientResponse> toClientsResponse(List<Client> clients);
    Client toClientRequest(ClientRequest clientRequest);
}