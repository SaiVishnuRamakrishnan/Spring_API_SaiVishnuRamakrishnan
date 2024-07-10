package org.rest.template.spring_api_server_saivishnuramakrishnan.Service.Client;

import org.rest.template.spring_api_server_saivishnuramakrishnan.Model.Hospital;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "hospitalClient", url = "http://localhost:8080/hospital")
public interface HospitalClient {

    @GetMapping("/getById/{id}")
    Optional<Hospital> getStudentsFromProgramId(@PathVariable("id") Long id);//Abstract method

    @PostMapping("/addNurse")
    Hospital addHospital(@RequestBody Hospital hospital);

    @GetMapping(path ="/getByFirstName/{firstName}")
    List<Hospital> findNurseByFirstName(@PathVariable String firstName);

    @GetMapping(path = "/allNurse")
    List<Hospital> getAllNurse();

    @GetMapping(path ="/getByFirstNameUsingJPQL/{firstName}")
    Hospital findNurseByFirstNameUsingJPQL(@PathVariable String firstName);

    @PutMapping("/updateNurse")
    Hospital addNurse(@RequestBody Hospital hospital);

}
