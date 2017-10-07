package mysql;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private MyRepository myrepository;
	public List<User> getAllUsers()
	{
		List<User> users=new ArrayList();
		myrepository.findAll().forEach(users::add);
		return users;
	}
	public void postDetails(User user)
	{
		myrepository.save(user);
	}

}
