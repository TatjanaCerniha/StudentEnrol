package com.enrol

class BootStrap {

    def init = { servletContext ->

	def computing=new Course( 
		    department: 'Computing',
		    code: 'CS123',
		    title: 'BSc Hon Computing',
		    leader:'Dr Michelle Murphy',
		    startDate: new Date('09/09/2018'),
		    endDate: new Date ('07/07/2022'),
		    numberOfStudents:'55',
		    studyMode: 'Fulltime',
		    tuitionFees: '9000.00',
		    description: 'Lorem ipsum').save()

	def Network=new Course( 
		    department: 'Computing',
		    code: 'CS1234',
		    title: 'BSc Security',
		    leader:'Lynne Dawson',
		    startDate: new Date('09/09/2018'),
		    endDate: new Date ('07/07/2022'),
		    numberOfStudents:'48',
		    studyMode: 'Fulltime',
		    tuitionFees: '9000.00',
		    description: 'Lorem ipsum, lorem, lorem').save()

	def Software=new Course( 
		    department: 'Computing',
		    code: 'CS123',
		    title: 'BSc Hon Software Engineering',
		    leader:'Dr Lynn Cynderey',
		    startDate: new Date('09/09/2018'),
		    endDate: new Date ('07/07/2022'),
		    numberOfStudents:'60',
		    studyMode: 'Fulltime',
		    tuitionFees: '9000.00',
		    description: 'Lorem ipsum').save()
    
    def student1=new Student (
			name:'Tatjana Cerniha',
			studentID: '111',
			dob: new Date('06/05/1982'),
			isFundingAvailable: 'true',
			email: 'djjj@ddj.com',
			username: 'b2041324',
			password: 'password',
			course: 'Computing'
			).save()
     
    def student2=new Student (
			name:'Nikita Daffern',
			studentID: '114',
			dob: new Date('06/05/1990'),
			isFundingAvailable: 'true',
			email: 'nikita@ddj.com',
			username: 'b2041345',
			password: '1234',
			course: 'Software'
			).save()
    def SYSAR=new Module (
			title:'System Architecture',
			code: 'SY123',
			credits: '20',
			lecturer: 'Tonderai',	
			course: 'Computing',
			description:'Lorem ipsum ipsum'	
			).save()
     def WADI=new Module (
			title:'Web Application Design and Implementation ',
			code: 'WA145',
			credits: '20',
			lecturer: 'Dharam',	
			course: 'Software',
			description:'Lorem ipsum ipsum'	
			).save()

    }
    def destroy = {
    }
}
