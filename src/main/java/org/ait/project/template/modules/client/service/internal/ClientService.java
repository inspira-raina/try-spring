package org.ait.project.template.modules.client.service.internal;

import org.ait.project.template.modules.client.dto.request.ClientRequest;
import org.ait.project.template.modules.client.dto.response.ClientProjectResponse;
import org.ait.project.template.modules.client.dto.response.ClientResponse;
import org.ait.project.template.modules.project.dto.response.ProjectResponse;
import org.ait.project.template.shared.template.ResponseDetail;
import org.ait.project.template.shared.template.ResponseList;
import org.ait.project.template.shared.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;

public interface ClientService {
    ResponseEntity<ResponseTemplate<ResponseDetail<ClientResponse>>> create(ClientRequest clientRequest);
    ResponseEntity<ResponseTemplate<ResponseList<ClientResponse>>> getAll();
    ResponseEntity<ResponseTemplate<ResponseDetail<ClientResponse>>> getById(Integer id);

    ResponseEntity<ResponseTemplate<ResponseList<ClientProjectResponse>>> getProjectsByClientId(Integer id);
}
