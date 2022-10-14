package org.ait.project.template.modules.client.controller;

import lombok.AllArgsConstructor;

import org.ait.project.template.modules.client.dto.request.ClientRequest;
import org.ait.project.template.modules.client.dto.response.ClientResponse;
import org.ait.project.template.modules.client.service.internal.ClientService;
import org.ait.project.template.shared.template.ResponseDetail;
import org.ait.project.template.shared.template.ResponseList;
import org.ait.project.template.shared.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping("/clients")
    public ResponseEntity<ResponseTemplate<ResponseList<ClientResponse>>> getAll() {
        return clientService.getAll();
    }

    @GetMapping("/client/{id}")
    public  ResponseEntity<ResponseTemplate<ResponseDetail<ClientResponse>>> getById(@PathVariable Integer id) {
        return clientService.getById(id);
    }

    @PostMapping("/client")
    public ResponseEntity<ResponseTemplate<ResponseDetail<ClientResponse>>> create(@RequestBody ClientRequest clientRequest) {
        System.out.println(clientRequest);
        return clientService.create(clientRequest);
    }
}
