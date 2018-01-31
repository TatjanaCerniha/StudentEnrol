package com.enrol

class BootStrap {

    def init = { servletContext ->
def lynnd=new Leader (
		fullName: 'Dr Lynne Dawson',
		department:'Computing',
		subject:'System Architectures',
		leaderEmail:'lynndawson@email.com',
		office:'B-9432',
		username: 'ldawson',
		password: 'password',
		bio:'lorem ipsum dolor sit amel').save()
	def leader2=new Leader (
		fullName: 'Matthew Love',
		department:'Computing',
		subject:'Service Support',
		leaderEmail:'mlove@email.com',
		office:'B-9430',
		username: 'mlove',
		password: 'password1',
		bio:'lorem ipsum dolor sit amel').save()
	def leader3=new Leader (
		fullName: 'Lynne Cinderey',
		department:'Computing',
		subject:'Web Application Design and Implementation',
		leaderEmail:'lcinderey@shu.ac.uk',
		office:'B-9420',
		username: 'lcinderey',
		password: 'password',
		bio:'lorem ipsum dolor sit amel').save()


	def course1=new Course( 
		    title: 'BSc Hon Computing',
		    department: 'Computing',
		    code: 'CS123',
		    
		    leader:leader2,
		    startDate: new Date('09/09/2017'),
		    endDate: new Date ('07/07/2021'),
		    numberOfStudents:55,
		    studyMode: 'Fulltime',
		    tuitionFees: 9000.00,
		    description: 'Lorem ipsum').save()

	def course2=new Course( 
		    title: 'BSc Security',
		    department: 'Computing',
		    code: 'CS1234',
		    
		    leader:lynnd,
		    startDate: new Date('09/09/2018'),
		    endDate: new Date ('07/07/2022'),
		    numberOfStudents:48,
		    studyMode: 'Fulltime',
		    tuitionFees: 9000.00,
		    description: 'Lorem ipsum, lorem, lorem').save()

	def course3=new Course( 
		    title: 'BSc Hon Software Engineering',
		    department: 'Computing',
		    code: 'CS123',
		    
		    leader:leader3,
		    startDate: new Date('09/09/2018'),
		    endDate: new Date ('07/07/2022'),
		    numberOfStudents:60,
		    studyMode: 'Fulltime',
		    tuitionFees: 9000.00,
		    description: 'Lorem ipsum').save()
    
    def student1=new Student (
			name:'Tatjana Cerniha',
			studentID: 'b2041324',
			dob: new Date('06/05/1982'),
			isFundingAvailable:true,
			email: 'tatjana@email.com',
			username: 'tat',
			password: 'password',
			course: course3).save()
     
    def student2=new Student (
			name:'Nikita Daffern',
			studentID: 'b2323565',
			dob: new Date('06/05/1990'),
			isFundingAvailable: true,
			email: 'nikita@ddj.com',
			username: 'niki',
			password: '1234',
			course: course2).save()
    def student3=new Student (
			name:'Bafrin Fattahi',
			studentID: 'b2553565',
			dob: new Date('06/05/1987'),
			isFundingAvailable: true,
			email: 'bafrin@ddj.com',
			username: 'baf',
			password: 'baf',
			course: course3).save()

	def lect1=new Lecturer(
		fullName: 'Dr Steve Crossbar',
		post: 'Lecturer',
		subject: 'Web Application Design and Implementation',
		lecturerEmail: 's.crossbar@shu.ac.uk',
		office: 'Office-9425',
		bio: 'lorem epson dolor sit amet').save()
	
	def lect2=new Lecturer(
		fullName: 'Dr Nikki Brown',
		post: 'Lecturer',
		subject: 'System Architectures',
		lecturerEmail: 'n.brown@shu.ac.uk',
		office: 'Office-9455',
		bio: 'lorem epson dolor sit amet').save()
	def lect3=new Lecturer(
		fullName: 'Dr Peter ONeil',
		post: 'Lecturer',
		subject: 'Service Support',
		lecturerEmail: 'p.oneil@shu.ac.uk',
		office: 'Office-9426',
		bio: 'lorem epson dolor sit amet').save()
	

    def module1=new Module (
			title:'System Architectures',
			code: 'SY123',
			credits: 20,
			lecturer: lect2,	
			course: course1,
			description:'Lorem ipsum ipsum'	).save()
     def module2=new Module (
			title:'Web Application Design and Implementation ',
			code: 'WA145',
			credits: 20,
			lecturer: lect1,	
			course: course2,
			description:'Lorem ipsum ipsum'	).save()
	def module3=new Module (
			title:'Service Support',
			code: 'SS145',
			credits: 20,
			lecturer: lect3,	
			course: course3,
			description:'Lorem ipsum ipsum'	).save()


	

    }
    def destroy = {
    }
}
