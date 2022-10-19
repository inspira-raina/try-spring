package org.ait.project.template.modules.client.controller;

import lombok.AllArgsConstructor;

import lombok.RequiredArgsConstructor;
import org.ait.project.template.modules.client.dto.request.ClientRequest;
import org.ait.project.template.modules.client.dto.response.ClientProjectResponse;
import org.ait.project.template.modules.client.dto.response.ClientResponse;
import org.ait.project.template.modules.client.service.internal.ClientService;
import org.ait.project.template.modules.project.dto.response.ProjectResponse;
import org.ait.project.template.shared.template.ResponseDetail;
import org.ait.project.template.shared.template.ResponseList;
import org.ait.project.template.shared.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ClientController implements ClientService{

    private final ClientService clientService;

    @Override
    @GetMapping("/clients")
    public ResponseEntity<ResponseTemplate<ResponseList<ClientResponse>>> getAll() {
        return clientService.getAll();
    }

    @Override
    @GetMapping("/client/{id}")
    public  ResponseEntity<ResponseTemplate<ResponseDetail<ClientResponse>>> getById(@PathVariable Integer id) {
        return clientService.getById(id);
    }

    @Override
    @GetMapping("/client/{id}/projects")
    public ResponseEntity<ResponseTemplate<ResponseList<ClientProjectResponse>>> getProjectsByClientId(@PathVariable Integer id) {
        return clientService.getProjectsByClientId(id);
    }

    @Override
    @PostMapping("/client")
    public ResponseEntity<ResponseTemplate<ResponseDetail<ClientResponse>>> create(@RequestBody ClientRequest clientRequest) {
        System.out.println(clientRequest);
        return clientService.create(clientRequest);
    }
}
