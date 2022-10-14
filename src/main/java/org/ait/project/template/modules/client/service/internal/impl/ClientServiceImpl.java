package org.ait.project.template.modules.client.service.internal.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.template.modules.client.dto.request.ClientRequest;
import org.ait.project.template.modules.client.dto.response.ClientResponse;
import org.ait.project.template.modules.client.model.entity.Client;
import org.ait.project.template.modules.client.service.delegate.ClientServiceDelegate;
import org.ait.project.template.modules.client.service.internal.ClientService;
import org.ait.project.template.modules.client.transform.ClientMapper;
import org.ait.project.template.shared.enums.ResponseEnum;
import org.ait.project.template.shared.template.ResponseDetail;
import org.ait.project.template.shared.template.ResponseList;
import org.ait.project.template.shared.template.ResponseTemplate;
import org.ait.project.template.shared.utils.ResponseHelper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ResponseHelper responseHelper;

    private final ClientServiceDelegate clientDelegate;

    private final ClientMapper clientMapper;

    @Override
    public ResponseEntity<ResponseTemplate<ResponseDetail<ClientResponse>>> create(ClientRequest clientRequest) {
        Client client = clientDelegate.create(clientMapper.toClientRequest(clientRequest));
        return responseHelper.createResponseDetail(ResponseEnum.SUCCESS, clientMapper.toClientResponse(client));
    }

    @Override
    public ResponseEntity<ResponseTemplate<ResponseList<ClientResponse>>> getAll() {
        List<Client> clientList = clientDelegate.getAll();
        return  responseHelper.createResponseCollection(ResponseEnum.SUCCESS, null, clientMapper.toClientsResponse(clientList));
    }

    @Override
    public ResponseEntity<ResponseTemplate<ResponseDetail<ClientResponse>>> getById(Integer id) {
        return responseHelper.createResponseDetail(ResponseEnum.SUCCESS, clientMapper.toClientResponse(clientDelegate.getById(id)));
    }
}
