package com.project.dao;

import com.project.model.UserDetail;

public interface UserDetailDAO 
{
 public boolean registerUser(UserDetail user);
 public boolean updateAddress(UserDetail user);
 public UserDetail getUser(String username);
}