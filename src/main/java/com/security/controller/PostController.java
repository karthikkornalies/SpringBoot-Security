package com.security.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {
	
	//@Secured("ROLE_GUEST")
	@RequestMapping("/")
	public String list(){
		return "view lists post..";
	}
	
	//@Secured("ROLE_USER")
	@RequestMapping("/drafts")
	public String viewDrafts(){
		return "draft post..";
	}
	
	//@Secured("ROLE_ADMIN")
	@RequestMapping("/admin/create")
	public String add(){
		return "add post..";
	}
	
	@RequestMapping("/admin/control")
	public String myAdmin(){
		return "only admin access..";
	}
}
