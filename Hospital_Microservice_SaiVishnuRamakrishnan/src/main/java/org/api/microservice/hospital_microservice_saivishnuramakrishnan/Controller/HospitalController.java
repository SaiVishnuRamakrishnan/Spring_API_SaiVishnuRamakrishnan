package org.api.microservice.hospital_microservice_saivishnuramakrishnan.Controller;

import org.api.microservice.hospital_microservice_saivishnuramakrishnan.Model.Hospital;
import org.api.microservice.hospital_microservice_saivishnuramakrishnan.HospitalFeignClient.HospitalFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospitalFeign")
public class HospitalController {

    @Autowired
    private HospitalFeignClient hospitalFeignClient;

    @GetMapping(path = "/allNurse")
    public List<Hospital> getAllNurse() {
        return hospitalFeignClient.getAllNurse();
    }

    @GetMapping(path ="/getByFirstName/{firstName}")
    public List<Hospital> getByFirstName(@PathVariable String firstName) {
        return hospitalFeignClient.findNurseByFirstName(firstName);
    }

    @PostMapping("/addHospital")
    public Hospital addHospital(@RequestBody Hospital hospital) {
        return hospitalFeignClient.addHospital(hospital);
    }
}
