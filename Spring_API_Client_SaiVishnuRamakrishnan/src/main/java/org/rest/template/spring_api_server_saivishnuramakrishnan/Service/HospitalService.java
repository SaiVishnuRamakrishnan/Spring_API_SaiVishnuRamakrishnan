package org.rest.template.spring_api_server_saivishnuramakrishnan.Service;

import org.rest.template.spring_api_server_saivishnuramakrishnan.Model.Hospital;
import org.rest.template.spring_api_server_saivishnuramakrishnan.Service.Client.HospitalClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalService {

    @Autowired
    HospitalClient hospitalClient;

    public Optional<Hospital> getHospitalByProgramId(Long id) {
        return hospitalClient.getStudentsFromProgramId(id);
    }

    public Hospital insertHospital(Hospital hospital) {
        return hospitalClient.addHospital(hospital);
    }

    public List<Hospital> getByFirstName(String firstName) {
        return hospitalClient.findNurseByFirstName(firstName);
    }

    public List<Hospital> getAllNurse() {
        return hospitalClient.getAllNurse();
    }

    public Hospital findNurseByFirstNameUsingJPQL(String firstName) {
        return hospitalClient.findNurseByFirstNameUsingJPQL(firstName);
    }

    public Hospital addNurse(Hospital hospital) {
        return hospitalClient.addNurse(hospital);
    }
}
