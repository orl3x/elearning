package com.amdocs.project.interfaceService;

import java.util.List;
import java.util.Optional;

import com.amdocs.project.model.User;

public interface IUserService {

	public List<User> listUser();
	public Optional<User> listId(int id);
	public int save(User u);
	public void delete(int id);
}
