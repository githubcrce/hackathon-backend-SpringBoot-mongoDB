package com.spring.usersms.service.impl;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.spring.usersms.model.UserModel;
import com.spring.usersms.service.UserService;
import com.spring.usersms.MongoConfig;


public class UserServiceImpl implements UserService {

	@Override
	public UserModel findUserByPhone(String phone) {
		Query query = new Query();
		query.addCriteria(Criteria.where("phoneNumber").is(phone));
		
		MongoConfig mongoConfig = new MongoConfig();
		MongoTemplate mongoTemplate = new MongoTemplate(mongoConfig.mongoClient(),"springUsers");
		UserModel user = mongoTemplate.findOne(query, UserModel.class);

		if(user != null) {
		    return user;
		}
		else {
			return null;
		}
	}
}
