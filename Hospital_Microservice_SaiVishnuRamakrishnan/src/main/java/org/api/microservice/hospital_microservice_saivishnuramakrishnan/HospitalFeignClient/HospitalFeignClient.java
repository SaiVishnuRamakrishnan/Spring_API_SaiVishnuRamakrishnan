package org.api.microservice.hospital_microservice_saivishnuramakrishnan.HospitalFeignClient;

import org.api.microservice.hospital_microservice_saivishnuramakrishnan.Model.Hospital;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "hospitalClient", url = "http://localhost:8080/hospital")
public interface HospitalFeignClient {

    @PostMapping("/addNurse")
    Hospital addHospital(@RequestBody Hospital hospital);

    @GetMapping(path ="/getByFirstName/{firstName}")
    List<Hospital> findNurseByFirstName(@PathVariable String firstName);

    @GetMapping(path = "/allNurse")
    List<Hospital> getAllNurse();
}
