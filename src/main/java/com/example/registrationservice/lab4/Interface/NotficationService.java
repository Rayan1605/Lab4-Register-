package com.example.registrationservice.lab4.Interface;

import com.example.registrationservice.lab4.Entity.UserDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@FeignClient(name = "confirmation-service",url = "https://localhost:8082")
public interface NotficationService {

    @PostMapping("/Notfi")
    Map<String,String> Notfi (@RequestBody UserDetails userDetails);


}
