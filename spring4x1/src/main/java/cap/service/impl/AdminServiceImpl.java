package cap.service.impl;


import cap.dao.AdminDAO;
import cap.service.AdminService;

import javax.annotation.Resource;

public class AdminServiceImpl implements AdminService{

    @Resource
    private AdminDAO adminDAO;

    @Override
    public String sayHello() {
        return adminDAO.sayHello();
    }
}
