package com.yjh.impl;

import com.yjh.dao.Dao;
import com.yjh.service.UserService;
import com.yjh.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.logging.Logger;

@Service("userService")
public class ServiceImpl implements UserService {
    private Dao dao;
    @Autowired
    public void setDao(Dao dao) {
        this.dao = dao;
    }

    @Override
    public List<User> list() {
        List<User> l = dao.list();

        Logger log = Logger.getLogger("com.yjh.controller.MyController");
        log.warning("dao.list:" + l);

        return l;
    }
}
