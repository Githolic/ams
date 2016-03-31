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
import gapp.model.dao.DepartmentDao;
import gapp.model.dao.UserDao;

@Controller
@SessionAttributes("user")
public class UserController {

    @Autowired
    private UserDao userDao;
    
    @Autowired
    private DepartmentDao departmentDao;

    @RequestMapping("/users.html")
    public String users( ModelMap models )
    {
        models.put( "users", userDao.getUsers() );
        return "users";
    }
    
    @RequestMapping(value = "/login.html", method = RequestMethod.GET)
    public String login()
    {
    	return "login";
    }
    
    @RequestMapping(value = "/login.html", method = RequestMethod.POST)
    public String login(@RequestParam String email, @RequestParam String password, HttpSession session)
    {
    	User user = userDao.getUserByEmail(email);
    	if (user == null||!user.getPassword().equals(password))
    		return "redirect:/login.html";
		
    	session.setAttribute("authenticatedUser", user);
    	if (user.isAdmin())
    		return "redirect:/admin/home.html";
        else if (user.isStaff())
            return "redirect:/staff/home.html";
        else
            return "redirect:/student/home.html";
    }
    
    
    @RequestMapping( "/register.html" )
    public String register( ModelMap models )
    {
    	return "register";
    }
    
    @RequestMapping(value= "/staff/home.html")
    public String staff(){
    	return "staff/staff-view";
    }
    
    @RequestMapping(value= "/student/home.html")
    public String student(){
    	return "student/student-view";
    }
    @RequestMapping(value= "/admin/home.html")
    public String admin(HttpSession session,  ModelMap models){
    	
    	User authenticatedUser = (User) session.getAttribute("authenticatedUser");
    	
    	User user = userDao.getUser(authenticatedUser.getId());
    	
    	models.put("user", user);
    	models.put("departments", departmentDao.getDepartments());
    	return "admin/admin-view";
    }

}