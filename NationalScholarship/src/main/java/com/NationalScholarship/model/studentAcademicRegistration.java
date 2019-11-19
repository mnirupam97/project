package com.NationalScholarship.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
@Table(name="student_academic_registration")
public class studentAcademicRegistration {
	
	 @Id
	  private String student_erp_id;
	  @OneToOne
	  @JoinColumn(name="inst_code")
	  private Institute inst_code;
	  private String student_present_course;
	  private String student_present_year;
	  private String student_mode_study;
	  private String student_class_start_date;
	  private String student_university;
	  private String student_previous_course;
	  private String student_previous_passing_year ;
	  private String student_pre_class_perc;
	  @OneToOne
	  @JoinColumn(name="student_id")
	  private StudentLoginDetails student_id;
	  private String student_admission_fee;
	  private String student_tution_fee;
	  private String student_other_fee;
	public String getStudent_erp_id() {
		return student_erp_id;
	}
	public void setStudent_erp_id(String student_erp_id) {
		this.student_erp_id = student_erp_id;
	}
	
	
	public Institute getInst_code() {
		return inst_code;
	}
	public void setInst_code(Institute inst_code) {
		this.inst_code = inst_code;
	}
	public String getStudent_present_course() {
		return student_present_course;
	}
	public void setStudent_present_course(String student_present_course) {
		this.student_present_course = student_present_course;
	}
	public String getStudent_present_year() {
		return student_present_year;
	}
	public void setStudent_present_year(String student_present_year) {
		this.student_present_year = student_present_year;
	}
	public String getStudent_mode_study() {
		return student_mode_study;
	}
	public void setStudent_mode_study(String student_mode_study) {
		this.student_mode_study = student_mode_study;
	}
	public String getStudent_class_start_date() {
		return student_class_start_date;
	}
	public void setStudent_class_start_date(String student_class_start_date) {
		this.student_class_start_date = student_class_start_date;
	}
	public String getStudent_university() {
		return student_university;
	}
	public void setStudent_university(String student_university) {
		this.student_university = student_university;
	}
	public String getStudent_previous_course() {
		return student_previous_course;
	}
	public void setStudent_previous_course(String student_previous_course) {
		this.student_previous_course = student_previous_course;
	}
	public String getStudent_previous_passing_year() {
		return student_previous_passing_year;
	}
	public void setStudent_previous_passing_year(String student_previous_passing_year) {
		this.student_previous_passing_year = student_previous_passing_year;
	}
	public String getStudent_pre_class_perc() {
		return student_pre_class_perc;
	}
	public void setStudent_pre_class_perc(String student_pre_class_perc) {
		this.student_pre_class_perc = student_pre_class_perc;
	}
	
	
	public StudentLoginDetails getStudent_id() {
		return student_id;
	}
	public void setStudent_id(StudentLoginDetails student_id) {
		this.student_id = student_id;
	}
	public String getStudent_admission_fee() {
		return student_admission_fee;
	}
	public void setStudent_admission_fee(String student_admission_fee) {
		this.student_admission_fee = student_admission_fee;
	}
	public String getStudent_tution_fee() {
		return student_tution_fee;
	}
	public void setStudent_tution_fee(String student_tution_fee) {
		this.student_tution_fee = student_tution_fee;
	}
	public String getStudent_other_fee() {
		return student_other_fee;
	}
	public void setStudent_other_fee(String student_other_fee) {
		this.student_other_fee = student_other_fee;
	}
	public studentAcademicRegistration() {
		super();
	}
	@Override
	public String toString() {
		return "studentAcademicRegistration [student_erp_id=" + student_erp_id + ", inst_code="
				+ inst_code + ", student_present_course=" + student_present_course
				+ ", student_present_year=" + student_present_year + ", student_mode_study=" + student_mode_study
				+ ", student_class_start_date=" + student_class_start_date + ", student_university="
				+ student_university + ", student_previous_course=" + student_previous_course
				+ ", student_previous_passing_year=" + student_previous_passing_year + ", student_pre_class_perc="
				+ student_pre_class_perc + ", student_id=" + student_id + ", student_admission_fee="
				+ student_admission_fee + ", student_tution_fee=" + student_tution_fee + ", student_other_fee="
				+ student_other_fee + "]";
	}
	  
	  
	  
	
	

}
