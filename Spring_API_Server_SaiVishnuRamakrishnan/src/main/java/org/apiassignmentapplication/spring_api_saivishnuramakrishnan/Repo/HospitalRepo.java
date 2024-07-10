package org.apiassignmentapplication.spring_api_saivishnuramakrishnan.Repo;

import org.apiassignmentapplication.spring_api_saivishnuramakrishnan.Model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HospitalRepo extends JpaRepository<Hospital, Long> {
    public List<Hospital> findByNurseFirstName(String firstName);
    public Optional<Hospital> findByNurseLastName(String lastName);

    //public Hospital findByNurseLastName(String lastName);

    @Query(value = "SELECT S FROM Hospital S WHERE S.nurseFirstName=?1")
    public Hospital findByFirstNameUsingJPQL(String nurseFirstName);
}
