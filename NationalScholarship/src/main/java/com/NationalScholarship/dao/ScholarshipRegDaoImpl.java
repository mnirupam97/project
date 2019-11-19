package com.NationalScholarship.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.NationalScholarship.model.Institute;
import com.NationalScholarship.model.StudentLoginDetails;
import com.NationalScholarship.model.basicScholarshipRegistration;
import com.NationalScholarship.model.student10thDetails;
import com.NationalScholarship.model.student12thDetails;

@Repository("scholRegDao")
public class ScholarshipRegDaoImpl implements ScholarshipRegDaoIntf {

	public boolean register(basicScholarshipRegistration bsr) {
		
		
		    boolean flag=false;
		    try {
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin( ); 
			em.persist(bsr);
			em.getTransaction().commit();
			em.close();
			System.out.println("end");
			flag=true;
		    }
		    catch(Exception e) { System.out.println("Error:"+e);  }
		    return flag;
		  }

	public boolean register10(student10thDetails student10thdetails) {
		 boolean flag=false;
		    try {
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin( ); 
			em.persist(student10thdetails);
			em.getTransaction().commit();
			em.close();
			System.out.println("end");
			flag=true;
		    }
		    catch(Exception e) { System.out.println("Error:"+e);  }
		    return flag;
		  }

	public boolean register12(student12thDetails student12thdetails) {
		boolean flag=false;
	    try {
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin( ); 
		em.persist(student12thdetails);
		em.getTransaction().commit();
		em.close();
		System.out.println("end");
		flag=true;
	    }
	    catch(Exception e) { System.out.println("Error:"+e);  }
	    return flag;
	}
	
	 public boolean studentRegister(StudentLoginDetails sld) {
		    boolean flag=false;
		    try {
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin( ); 
			em.persist(sld);
			em.getTransaction().commit();
			em.close();
			System.out.println("end");
			flag=true;
		    }
		    catch(Exception e) { System.out.println("Error:"+e);  }
		    return flag;
		  }

	public boolean instituteRegister(Institute inst) {
		 boolean flag=false;
		    try {
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin( ); 
			em.persist(inst);
			em.getTransaction().commit();
			em.close();
			System.out.println("end");
			flag=true;
		    }
		    catch(Exception e) { System.out.println("Error:"+e);  }
		    return flag;
	}

	public boolean addInstitute(Institute inst) {
		
			boolean result=false;
			try{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(inst);
			em.getTransaction().commit();
			result=true;
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
			return result;
			
		}
	}
	
		
	

