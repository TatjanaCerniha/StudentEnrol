package com.enrol

class Student {

    	String studentID
	String name
	Date dob
	Boolean isFundingAvailable
	String email
	String username
	String password
	Course course
	

    static constraints = {
		name blank:false, nullable:false
		studentID blank:false, nullable:false
		dob blank:false, nullable:false
		email blank:false, nullable:false, email:true
		username blank:false, nullable:false, unique:true
		password blank:false, nullable:false
		isFundingAvailable blank:false, nullable:false
		course blank:false, nullable:false
		

    }
}
