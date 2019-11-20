package com.NationalScholarship.service;

import com.NationalScholarship.model.Institute;
import com.NationalScholarship.model.ScholarshipRegistrationDocs;
import com.NationalScholarship.model.StudentLoginDetails;
import com.NationalScholarship.model.basicScholarshipRegistration;
import com.NationalScholarship.model.student10thDetails;
import com.NationalScholarship.model.student12thDetails;


public interface ScholarshipRegServiceIntf {
	
	 public boolean register(basicScholarshipRegistration bsr);
	 public boolean register10(student10thDetails student10thdetails) ;
	 public boolean register12(student12thDetails student12thdetails) ;
	 public boolean studentRegister(StudentLoginDetails sld);
	 public boolean instituteRegister(Institute inst);
	 public StudentLoginDetails validateUser(StudentLoginDetails sld);
	 public boolean uploadDocuments(ScholarshipRegistrationDocs srd );
		

}
