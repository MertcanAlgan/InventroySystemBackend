package com.example.stoktakip.admin;


import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    private final AdminRepository adminRepository;
    public AdminService(AdminRepository adminRepository){
        this.adminRepository = adminRepository;
    }
    public List<Admin> getAdmin(){return adminRepository.findAll();}
    public void addNewAdmin(Admin admin){adminRepository.save(admin);}
    public void deleteAdmin(Long adminId){
        boolean exists = adminRepository.existsById(adminId);
        if (!exists){
            throw new IllegalStateException(adminId + " Böyle bir admin yok");
        }
        adminRepository.deleteById(adminId);
    }

    @Transactional
    public void updateAdmin(Admin admin){adminRepository.save(admin);}
}
