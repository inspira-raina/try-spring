package org.ait.project.template.modules.client.transform;


import org.ait.project.template.modules.client.dto.request.ClientRequest;
import org.ait.project.template.modules.client.dto.response.ClientResponse;
import org.ait.project.template.modules.client.model.entity.Client;
import org.ait.project.template.modules.project.dto.request.ProjectRequest;
import org.ait.project.template.modules.project.dto.response.ProjectResponse;
import org.ait.project.template.modules.project.model.entity.Project;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    @Named("mapToClient")
    ClientResponse mapToClient(Client entity);

    @IterableMapping(qualifiedByName = "mapToClient")
    List<ClientResponse> mapToClientList(List<Client> clientList);

    Client toClientRequest(ClientRequest clientRequest);
}