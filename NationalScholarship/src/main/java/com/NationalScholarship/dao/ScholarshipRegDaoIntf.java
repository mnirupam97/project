package com.NationalScholarship.dao;

import com.NationalScholarship.model.Institute;
import com.NationalScholarship.model.StudentLoginDetails;
import com.NationalScholarship.model.basicScholarshipRegistration;
import com.NationalScholarship.model.student10thDetails;
import com.NationalScholarship.model.student12thDetails;


public interface ScholarshipRegDaoIntf {

	
	public boolean register(basicScholarshipRegistration bsr) ;
	
	public boolean register10(student10thDetails student10thdetails );
	
	public boolean register12(student12thDetails student12thdetails );
	
	public boolean studentRegister(StudentLoginDetails sld);
	
	public boolean addInstitute(Institute inst );

	public boolean instituteRegister(Institute inst);
	   
}
