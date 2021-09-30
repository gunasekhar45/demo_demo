package com.model;
import javax.persistence.Entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Entities.Users;

@Component
public class UsersService {
	@Autowired
	UsersDAO usersDAOImpl;
	
	public void save(Users user)
	{
		usersDAOImpl.saveUser(user);
	}
	
	public Users find(int id) 
	{
		return usersDAOImpl.findUser(id);
	}
	
	public List<Users> getAll()
	{
		return usersDAOImpl.findAll();
	}
	
	public boolean delete(int id)
	{
		Users user=find(id);
		return usersDAOImpl.deleteUser(user);
	}
	
	public boolean update(Users user) 
	{
		return usersDAOImpl.updateUser(user);
	}
	public String validateUser(Users user) {
		return usersDAOImpl.validateUser(user);
	}
}