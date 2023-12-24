package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.entities.User;

@Service
public class UserService {
	@Autowired
	UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public List<User> findAll() {
		return userDao.findAll();
	}

	public User save(User user) {
		return userDao.save(user);
	}

	public Optional<User> findById(Integer aLong) {
		return userDao.findById(aLong);
	}

	public void deleteById(Integer aLong) {
		userDao.deleteById(aLong);
	}
}
