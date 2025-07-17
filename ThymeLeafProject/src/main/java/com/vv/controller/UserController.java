package com.vv.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.vv.entity.User;
import com.vv.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService service;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("users", service.getAll());
		return "index";
	}
	
	
	@GetMapping("/addUserForm")
	public String adduser(Model model) {
		User u=new User();
		model.addAttribute("adduser", u);
		return "addform";	
		}
	
	@PostMapping("/saveuser")
	public String saveUser(@ModelAttribute("adduser") User u) {
		service.save(u);
		return "redirect:/";
	}
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormUpdate(@PathVariable Long id,Model model) {
		Optional<User> u= service.getByID(id);
		model.addAttribute("updateuser",u);
		return "updateuser";
		
	}
	
	@GetMapping("/deleteuser/{id}")
	public String deleteuser(@PathVariable long id) {
		service.delete(id);
		return "redirect:/";
	}
	
}
