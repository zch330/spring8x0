package cap.service;

import cap.bean.Admin;

import java.util.List;

public interface AdminService {
    List<Admin> findAdmins();

    Admin findById(int id);

    int addAdmin(Admin admin);

     String deleteAdmin(int id);

     int updateAdmin(Admin admin);



}
