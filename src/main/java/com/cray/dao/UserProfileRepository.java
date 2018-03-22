package com.cray.dao;

import com.cray.model.UserProfile;
import org.springframework.data.repository.CrudRepository;


public interface UserProfileRepository extends CrudRepository<UserProfile, Long> {

    UserProfile findByType(String type);

}
