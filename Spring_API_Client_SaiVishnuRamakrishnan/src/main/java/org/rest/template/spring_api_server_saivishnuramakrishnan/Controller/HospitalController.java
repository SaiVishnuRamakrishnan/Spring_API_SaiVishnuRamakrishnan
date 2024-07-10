package org.rest.template.spring_api_server_saivishnuramakrishnan.Controller;

import org.rest.template.spring_api_server_saivishnuramakrishnan.Model.Hospital;
import org.rest.template.spring_api_server_saivishnuramakrishnan.Service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    HospitalService hospitalService;

    @GetMapping("/getById/{id}")
    public Optional<Hospital> getHospitals(@PathVariable("id") Long id) {
        return hospitalService.getHospitalByProgramId(id);
    }

    @PostMapping("/addHospital")
    public Hospital addHospital(@RequestBody Hospital hospital) {
        return hospitalService.insertHospital(hospital);
    }

    @GetMapping(path ="/getByFirstName/{firstName}")
    public List<Hospital> getByFirstName(@PathVariable String firstName) {
        return hospitalService.getByFirstName(firstName);
    }

    @GetMapping(path = "/allNurse")
    public List<Hospital> getAllNurse() {
        return hospitalService.getAllNurse();
    }

    @GetMapping(path ="/getByFirstNameUsingJPQL/{firstName}")
    public Hospital getByFirstNameUsingJPQL(@PathVariable String firstName) {
        return hospitalService.findNurseByFirstNameUsingJPQL(firstName);
    }

    @PutMapping("/updateNurse")
    public Hospital updateNurse(@RequestBody Hospital hospital) {
        return hospitalService.addNurse(hospital);
    }

}
