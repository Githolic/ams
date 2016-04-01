package gapp.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import gapp.model.User;
import gapp.model.Department;
import gapp.model.Program;
import gapp.model.dao.DepartmentDao;
import gapp.model.dao.UserDao;
import gapp.model.dao.ProgramDao;

@Controller
@SessionAttributes({"program", "department"})
public class AdminController {
	
	@Autowired 
	private DepartmentDao departmentDao;
	
	@Autowired
	private ProgramDao programDao;
	
	

}
