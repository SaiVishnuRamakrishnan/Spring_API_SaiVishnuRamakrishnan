package org.apiassignmentapplication.spring_api_saivishnuramakrishnan.Controller;

import org.apiassignmentapplication.spring_api_saivishnuramakrishnan.Model.Hospital;
import org.apiassignmentapplication.spring_api_saivishnuramakrishnan.Service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    HospitalService hospitalService;

    @GetMapping(path = "/allNurse")
    public List<Hospital> getAllNurse() {
        return hospitalService.getAllNurse();
    }

    @GetMapping(path ="/getById/{id}")
    public Optional<Hospital> getNurseById(@PathVariable long id) {
        return hospitalService.getNurseById(id);
    }

    @GetMapping(path ="/getByFirstName/{firstName}")
    public List<Hospital> getByFirstName(@PathVariable String firstName) {
        return hospitalService.findNurseByFirstName(firstName);
    }

    @GetMapping(path ="/getByFirstNameUsingJPQL/{firstName}")
    public Hospital getByFirstNameUsingJPQL(@PathVariable String firstName) {
        return hospitalService.findNurseByFirstNameUsingJPQL(firstName);
    }

    @DeleteMapping(path="/deleteById/{id}")
    public String deleteNurseById(@PathVariable long id) {
        hospitalService.deleteById(id);
        return "Student deleted";
    }

    @PostMapping("/addNurse")
    public Hospital addNurse(@RequestBody Hospital hospital) {
        return hospitalService.addNurse(hospital);
    }

    @PutMapping("/updateNurse")
    public Hospital updateNurse(@RequestBody Hospital hospital) {
        return hospitalService.addNurse(hospital);
    }

    @PostMapping("/addNurseByDefault")
    public List<Hospital> addNurseByDefault(@RequestBody List<Hospital> nurses) {
        return hospitalService.addAllNurse(nurses);
    }
    /*
    *
    * [
    {
        "nurseID": 1,
        "nurseFirstName": "Alice",
        "nurseLastName": "Smith",
        "nursePassword": "password123",
        "nursePhoneNo": "123-456-7890",
        "nurseSalary": 50000
    },
    {
        "nurseID": 2,
        "nurseFirstName": "Bob",
        "nurseLastName": "Johnson",
        "nursePassword": "password456",
        "nursePhoneNo": "234-567-8901",
        "nurseSalary": 55000
    },
    {
        "nurseID": 3,
        "nurseFirstName": "Cathy",
        "nurseLastName": "Williams",
        "nursePassword": "password789",
        "nursePhoneNo": "345-678-9012",
        "nurseSalary": 60000
    },
    {
        "nurseID": 4,
        "nurseFirstName": "David",
        "nurseLastName": "Brown",
        "nursePassword": "password101",
        "nursePhoneNo": "456-789-0123",
        "nurseSalary": 65000
    },
    {
        "nurseID": 5,
        "nurseFirstName": "Eve",
        "nurseLastName": "Jones",
        "nursePassword": "password202",
        "nursePhoneNo": "567-890-1234",
        "nurseSalary": 70000
    }
]

    *
    * */
}
