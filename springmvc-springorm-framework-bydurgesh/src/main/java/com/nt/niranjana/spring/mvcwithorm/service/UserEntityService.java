package com.nt.niranjana.spring.mvcwithorm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.niranjana.spring.mvcwithorm.dao.UserEntityDao;
import com.nt.niranjana.spring.mvcwithorm.entity.UserEntity;
@Service
public class UserEntityService {

	@Autowired
	private UserEntityDao userEntityDao;
	
	
	
  // No need to specify readOnly attribute; by default it is false i.e @Transactional(readOnly=false)
	public int createUser(UserEntity userEntity)
	{		int result =  userEntityDao.saveUser(userEntity);
		return result;
	}
}
