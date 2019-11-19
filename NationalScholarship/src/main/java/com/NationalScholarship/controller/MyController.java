package com.NationalScholarship.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.NationalScholarship.model.Institute;
import com.NationalScholarship.model.StudentLoginDetails;
import com.NationalScholarship.model.basicScholarshipRegistration;
import com.NationalScholarship.model.stateNodal;
import com.NationalScholarship.model.student10thDetails;
import com.NationalScholarship.model.student12thDetails;
import com.NationalScholarship.service.ScholarshipRegServiceIntf;




@Controller("myController")
public class MyController {
	
	@Autowired
	ScholarshipRegServiceIntf scholRegServ;

	@RequestMapping(value = "/scholarshipApp", method = RequestMethod.GET)
	  public ModelAndView showRegister2(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("scholarshipForm");
	    mav.addObject("bsr", new basicScholarshipRegistration());
	    return mav;
	  }
	
	@RequestMapping(value = "/scholarshipRegister", method = RequestMethod.POST)
	  public ModelAndView addUser2(HttpServletRequest request, HttpServletResponse response,HttpSession session, @ModelAttribute("basicScholarshipRegistration") basicScholarshipRegistration bsr,@ModelAttribute("StudentLoginDetails") StudentLoginDetails sld) {
		  String student_id=sld.getStudent_id();
		 String scholarship_applied_for=bsr.getScholarship_applied_for() ;
			  String student_aadhar_number=bsr.getStudent_aadhar_number() ;
			  String student_religion=bsr.getStudent_religion() ;
			  String student_caste=bsr.getStudent_caste() ;
			  String student_father_name=bsr.getStudent_father_name() ;
			  String student_family_income=bsr.getStudent_family_income();
			  String student_is_disabled=bsr.getStudent_is_disabled() ;
			  String student_type_disability=bsr.getStudent_type_disability() ;
			  String student_percentage_disability=bsr.getStudent_percentage_disability() ;
			  String student_martial_status=bsr.getStudent_martial_status() ;
			  String student_parents_profession=bsr.getStudent_parents_profession();
			  
			
		boolean flag=scholRegServ.register(bsr);
	    if(flag) {
	    ModelAndView mav = new ModelAndView("StudAcad10thDetails");
	    session.setAttribute("student_id",bsr.getStudent_id());
	  //  mav.addObject("login", new basicScholarshipRegistration());
	    return mav;
	    }
	    else {
	    	ModelAndView mav = new ModelAndView("register");
	        mav.addObject("user", new basicScholarshipRegistration());
	        mav.addObject("status","Sorry! Registration in incomplete");
	        return mav;	
	    }
	  }
	
	
	@RequestMapping(value ="/Register10th", method = RequestMethod.POST)
	  public ModelAndView addUser10th(HttpServletRequest request, HttpServletResponse response,HttpSession session, @ModelAttribute("student10thDetails") student10thDetails s10d) {
		 String student_10_roll_number=s10d.getStudent_10_roll_number();
		String student_board_name=s10d.getStudent_board_name();
		 String student_passing_year=s10d.getStudent_passing_year();
		 String student_percentage=s10d.getStudent_percentage();
			
		boolean flag=scholRegServ.register10(s10d);
	    if(flag) {
	    ModelAndView mav = new ModelAndView("student12thDetails");
	   // session.setAttribute("student_id",s10d.getStudent_id());
	  //  mav.addObject("login", new basicScholarshipRegistration());
	    return mav;
	    }
	    else {
	    	ModelAndView mav = new ModelAndView("register");
	        mav.addObject("user", new basicScholarshipRegistration());
	        mav.addObject("status","Sorry! Registration in incomplete");
	        return mav;	
	    }
	  }
	
	@RequestMapping(value = "/Register12th", method = RequestMethod.POST)
	  public ModelAndView addUser12th(HttpServletRequest request, HttpServletResponse response,HttpSession session, @ModelAttribute("student12thDetails") student12thDetails s12d) {
		 String student_12_roll_number=s12d.getStudent_12_roll_number();
		String student_board_name=s12d.getStudent_board_name();
		 String student_passing_year=s12d.getStudent_passing_year();
		 String student_percentage=s12d.getStudent_percentage();
			
		boolean flag=scholRegServ.register12(s12d);
	    if(flag) {
	    ModelAndView mav = new ModelAndView("success");
	   // session.setAttribute("student_id",s10d.getStudent_id());
	  //  mav.addObject("login", new basicScholarshipRegistration());
	    return mav;
	    }
	    else {
	    	ModelAndView mav = new ModelAndView("register");
	        mav.addObject("user", new basicScholarshipRegistration());
	        mav.addObject("status","Sorry! Registration in incomplete");
	        return mav;	
	    }
	  }
/*==========================================================	*/
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("StudentLoginDetails");
	    mav.addObject("sld", new StudentLoginDetails());
	    return mav;
	  } 
	
	
	@RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	  public ModelAndView studentRegister(HttpServletRequest request, HttpServletResponse response,  @ModelAttribute("StudentLoginDetails") StudentLoginDetails sld,@ModelAttribute("Institute") Institute inst) 
	 {
		 
		     
			 String student_name=sld.getStudent_name();
			 String student_gender=sld.getStudent_gender();
			 String student_state_domicile=sld.getStudent_state_domicile();
			 String student_district= sld.getStudent_district();
			 Date student_dob= sld.getStudent_dob();
			 String student_mobile_number= sld.getStudent_mobile_number();
			 String student_email= sld.getStudent_email();
			 String student_institute_code= inst.getInst_code();
			String student_aadhar_number=sld.getStudent_aadhar_number();
			 String student_password=sld.getStudent_password();
			 
			 
		 
		 
		
		 
		 boolean flag=scholRegServ.studentRegister(sld);
	    if(flag) {
	    ModelAndView mav = new ModelAndView("success");
	System.out.println("can register ");
	    return mav;
	   
	    
	    }
	    else {
	    	ModelAndView mav = new ModelAndView("error");
	        mav.addObject("user", new StudentLoginDetails());
	        mav.addObject("status","Sorry! Registration in incomplete");
	        return mav;	
	    }
	  }
	/*====================================*/
	@RequestMapping(value = "/institute", method = RequestMethod.GET)
	  public ModelAndView instituteRegister(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("institute");
	    mav.addObject("inst", new Institute());
	    return mav;
	  } 
	
	@RequestMapping(value = "/instituteProcess", method = RequestMethod.POST)
	  public ModelAndView instituteRegister(HttpServletRequest request, HttpServletResponse response,  @ModelAttribute("Institute") Institute inst) 
	 {
		 
		     
			  String inst_code= inst.getInst_code();
			//  stateNodal statename= inst.getStatename();
			//  String statename= inst.getStatename();
			   String inst_name=inst.getInst_name();
				 String inst_state=inst.getInst_state();
				 String inst_district=inst.getInst_district();
				 String inst_dice_code=inst.getInst_dice_code();
				 String inst_location=inst.getInst_location();
				 String inst_type=inst.getInst_type();
				 String inst_aff_uni_state=inst.getInst_aff_uni_state();
				 String inst_aff_uni_board=inst.getInst_aff_uni_board();
				 Date inst_year_adm_starT=inst.getInst_year_adm_starT();
				 String inst_password=inst.getInst_password();
				 String inst_estab_cert=inst.getInst_estab_cert();
				 String inst_uni_affil_cert=inst.getInst_uni_affil_cert();
				 String inst_address=inst.getInst_address();
				 String inst_principal_name=inst.getInst_principal_name();
				 String inst_contact_number=inst.getInst_contact_number();
				 String inst_college_phone=inst.getInst_college_phone();
		 
		 
		
		 
		 boolean flag=scholRegServ.instituteRegister(inst);
	    if(flag) {
	    ModelAndView mav = new ModelAndView("success");
	System.out.println("can register ");
	    return mav;
	   
	    
	    }
	    else {
	    	ModelAndView mav = new ModelAndView("error");
	        mav.addObject("user", new StudentLoginDetails());
	        mav.addObject("status","Sorry! Registration in incomplete");
	        return mav;	
	    }
	  }
	/*============================================*/
	
}
