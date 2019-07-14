package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.pojo.Student;

@Controller
@RequestMapping("/stu")
public class StudentController {
	@RequestMapping("/list")
	public String stuList(Model model) {
		model.addAttribute("username", "root");
		model.addAttribute("age", 32);
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1001, "甄", 23));
		list.add(new Student(1002, "李", 24));
		list.add(new Student(1003, "王", 25));
		model.addAttribute("stuList", list);
		return "stu/list"; // 找模板文件
	}
}
