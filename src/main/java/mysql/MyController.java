package mysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
	
	@Autowired
	private UserService userservice;
	
	@RequestMapping("/getall")
	public List<User> getAllUsers()
	{
		return userservice.getAllUsers();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/getall")
	public void postDetails(@RequestBody User user)
	{
		userservice.postDetails(user);
	}

}
