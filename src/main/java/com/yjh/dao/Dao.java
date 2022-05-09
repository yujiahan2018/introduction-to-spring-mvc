package com.yjh.dao;

import com.yjh.vo.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface Dao {
    List<User> list();
}
