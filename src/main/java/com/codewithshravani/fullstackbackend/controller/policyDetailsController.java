package com.codewithshravani.fullstackbackend.controller;

import com.codewithshravani.fullstackbackend.model.PolicyDetails;
import com.codewithshravani.fullstackbackend.repository.policyDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class policyDetailsController {

    @Autowired
    private policyDetailsRepository repository;

    @PostMapping("/policy")
    PolicyDetails addPolicy(@RequestBody PolicyDetails policy){
        return repository.save(policy);
    }

    @GetMapping("/policy")
    List<PolicyDetails> getAllPolicies(){
        return repository.findAll();
    }
}