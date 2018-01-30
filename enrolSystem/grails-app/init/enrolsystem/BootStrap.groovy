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
    
    
    }
    def destroy = {
    }
}
