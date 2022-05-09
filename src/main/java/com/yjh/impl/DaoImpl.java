package com.yjh.impl;

import com.yjh.dao.Dao;
import com.yjh.vo.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import java.util.List;

@Repository("dao")
public class DaoImpl extends SqlSessionDaoSupport implements Dao{
    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public List<User> list() {
        return getSqlSession().selectList("mapper.list");
    }
}
