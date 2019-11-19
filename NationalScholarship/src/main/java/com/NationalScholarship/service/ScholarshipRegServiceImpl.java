package com.NationalScholarship.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NationalScholarship.dao.ScholarshipRegDaoIntf;
import com.NationalScholarship.model.Institute;
import com.NationalScholarship.model.StudentLoginDetails;
import com.NationalScholarship.model.basicScholarshipRegistration;
import com.NationalScholarship.model.stateNodal;
import com.NationalScholarship.model.student10thDetails;
import com.NationalScholarship.model.student12thDetails;


@Service("scholRegServ")
public class ScholarshipRegServiceImpl implements ScholarshipRegServiceIntf {

	
		@Autowired
		  public ScholarshipRegDaoIntf scholRegDao;

		  public boolean register(basicScholarshipRegistration bsr) {
		    return scholRegDao.register(bsr);
		  }

		public boolean register10(student10thDetails student10thdetails) {
			return scholRegDao.register10(student10thdetails);
		}
		public boolean register12(student12thDetails student12thdetails) {
			return scholRegDao.register12(student12thdetails);
		}

		public boolean studentRegister(StudentLoginDetails sld) {
			
			return scholRegDao.studentRegister(sld);
		}

		public boolean instituteRegister(Institute inst) {
			/*boolean flag1=false;
			boolean flag=false;
			boolean flag2=scholRegDao.instituteRegister(inst);
			stateNodal stn=new stateNodal();
			if(stn.getInstlist().add(inst))
			{
				flag1=true;
			}
			if(flag1&&flag2)
			{
				 flag=true;
			}
			
			return flag;*/
			return scholRegDao.instituteRegister(inst);
		}

		/*public boolean addInstitute(Institute inst) {
			boolean flag=false;
			stateNodal stn=new stateNodal();
			if(stn.getInstlist().add(inst))
			{
				flag=true;
			}
			
			return flag;
		}*/

	}


