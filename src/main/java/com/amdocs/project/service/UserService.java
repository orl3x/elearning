package com.amdocs.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.project.interfaceService.IUserService;
import com.amdocs.project.interfaces.IUser;
import com.amdocs.project.model.User;


@Service
public class UserService implements IUserService{

	@Autowired
	private IUser data;
	
	@Override
	public List<User> listUser() {
		// TODO Auto-generated method stub
		return (List<User>)data.findAll();
	}

	@Override
	public Optional<User> listId(int id) {
		return data.findById(id);
	}

	@Override
	public int saveUser(User u) {
		int res = 0;
		User user = data.save(u);
		if(!user.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
