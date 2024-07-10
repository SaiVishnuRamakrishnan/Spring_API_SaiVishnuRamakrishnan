package org.apiassignmentapplication.spring_api_saivishnuramakrishnan.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor()
@Builder
public class Hospital {
    @Id
    private Long nurseID;
	private String nurseFirstName;
	private String nurseLastName;
	private String nursePassword;
	private String nursePhoneNo;
	private Long  nurseSalary;

}
