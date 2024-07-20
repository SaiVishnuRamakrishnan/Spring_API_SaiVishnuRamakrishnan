package org.api.microservice.hospital_microservice_saivishnuramakrishnan.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor()
@Builder
public class Hospital {
    private Long nurseID;
    private String nurseFirstName;
    private String nurseLastName;
    private String nursePassword;
    private String nursePhoneNo;
    private Long  nurseSalary;
}