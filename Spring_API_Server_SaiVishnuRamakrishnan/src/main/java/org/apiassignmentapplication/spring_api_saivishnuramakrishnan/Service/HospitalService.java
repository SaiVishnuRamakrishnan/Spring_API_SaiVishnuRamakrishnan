package org.apiassignmentapplication.spring_api_saivishnuramakrishnan.Service;

import org.apiassignmentapplication.spring_api_saivishnuramakrishnan.Model.Hospital;
import org.apiassignmentapplication.spring_api_saivishnuramakrishnan.Repo.HospitalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalService {
    @Autowired
    HospitalRepo hospitalRepo;

    public Hospital addNurse(Hospital hospital) {
        //.addProgram(student.getProgram());
        return hospitalRepo.save(hospital);
    }

    public List<Hospital> addAllNurse(List<Hospital> hospitals) {
        return hospitalRepo.saveAll(hospitals);
    }
    public List<Hospital> getAllNurse() {
        return hospitalRepo.findAll();
    }

    public Optional<Hospital> getNurseById(Long id) {
        return hospitalRepo.findById(id);
    }

    public List<Hospital> findNurseByFirstName(String a) {
        return hospitalRepo.findByNurseFirstName(a);
    }

    public void deleteById(long id) {
        hospitalRepo.deleteById(id);
    }

    public Hospital findNurseByFirstNameUsingJPQL(String firstName) {
        return hospitalRepo.findByFirstNameUsingJPQL(firstName);
    }
}
