package com.cray.dao;

import com.cray.model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {

    User findByssoId(String sso);

    void deleteBySSO(String sso);


}