package com.pocs.client;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class EmployeeServiceClient {
    private final RestClient restClient;

    public EmployeeServiceClient(){
        restClient = RestClient.builder()
                .baseUrl("http://localhost:8080/api/employees")
                .build();
    }

    public ResponseEntity<List<Employee>> getAllEmployee(){
       return restClient
                .get()
                .uri("/get-all")
                .retrieve()
                .body(new ParameterizedTypeReference<ResponseEntity<List<Employee>>>() {});
    }


}
