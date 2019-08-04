package com.home.controller;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.entities.Student;
import com.respo.StudentRepository;

//import com.respo.StudentRepository;
//import com.respo.StudentRepository;
@Controller
public class StudentController {
    
    //private final StudentRepository StudentRepository;

    @Autowired
    StudentRepository Studentrepo;
//    public StudentController(StudentRepository studentRepository) {
//        this.StudentRepository = studentRepository;
//    }
    
    @RequestMapping("/addstudent")
	  public ModelAndView addStudent(Student student) {
		
    	Studentrepo.save(student);
	     // model.addAttribute("student", StudentRepository.findAll());
	      //return "index";
	      
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", student);
  	mv.setViewName("register_form");
      return mv;
		//@Valid 
		 
//	      if (result.hasErrors()) {
//	          return "register_form";
//	      }
//	      

	  }
	
  @RequestMapping("/regisfrm")
  public ModelAndView frmregist() {
  		ModelAndView mv = new ModelAndView();
  		mv.setViewName("register_form");
  		return mv;
      //@PathVariable("id") Long Id, Model model
  }
  
//  @RequestMapping("/getstudent")
//	public String getstudent(@RequestParam String Id) {
//	  	//Student studentx=  Studentrepo.findById(Id);
//	   // model.addAttribute("student", StudentRepository.findAll());
//	    //return "register_form.jsp";
//	}
//    
//    @GetMapping("/register")
//    public String showSignUpForm(Student Student) {
//        return "add-student";
//    }
//    
//    @PostMapping("/addstudent")
//    public String addStudent(@Valid Student Student, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            return "add-student";
//        }
//        
//        StudentRepository.save(Student);
//        model.addAttribute("student", StudentRepository.findAll());
//        return "index";
//    }
//    
//    @GetMapping("/edit/{id}")
//    public String showUpdateForm(@PathVariable("Id") Long Id, Model model) {
//    	Student student = StudentRepository.findById(Id).orElseThrow(() -> new IllegalArgumentException("Invalid Student Id:" + Id));
//        model.addAttribute("Student", student);
//        return "update-Student";
//    }
//    
//    @PostMapping("/update/{id}")
//    public String updateUser(@PathVariable("Id") int Id, @Valid Student student, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//        	student.setST_ID(Id);
//            return "update-Student";
//        }
//        
//        StudentRepository.save(student);
//        model.addAttribute("Student", StudentRepository.findAll());
//        return "index";
//    }
//    
//    @GetMapping("/delete/{id}")
//    public String deleteUser(@PathVariable("id") Long Id, Model model) {
//    	Student student = StudentRepository.findById(Id).orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + Id));
//    	StudentRepository.delete(student);
//        model.addAttribute("student", StudentRepository.findAll());
//        return "index";
//    }
//    
	
	
	
}
