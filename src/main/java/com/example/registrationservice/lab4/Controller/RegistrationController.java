package com.example.registrationservice.lab4.Controller;

import com.example.registrationservice.lab4.Entity.UserDetails;
import com.example.registrationservice.lab4.Interface.NotficationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
public class RegistrationController {

     NotficationService notficationService;

@PostMapping("/confirm")
public Map<String,String> register(@RequestBody UserDetails userDetails){

     return notficationService.Notfi(userDetails);


}



}
