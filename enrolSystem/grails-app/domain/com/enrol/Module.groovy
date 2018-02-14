package com.enrol

class Module {
	String title
	String code
	int    credits
	Lecturer lecturer
	//Course course 
	String description
	
	String toString(){
		return title
	}

	static hasMany=[courses:Course, students:Student]

	static belongsTo = [Course]

    static constraints = {
		title blank:false, nullable:false
		code blank:false, nullable:false
		credits blank:false, nullable:false, min:20, max:120
		lecturer blank:false, nullable:false
		description blank:false, nullable:false, maxSize:5000, widget:'textarea'

    }
}
