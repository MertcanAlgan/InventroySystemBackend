package com.example.stoktakip.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class AdminController {
    private final AdminService adminService;
    @Autowired
    public AdminController(AdminService adminService){this.adminService = adminService;}
    @GetMapping("admin")
    public List<Admin> getAdmin(){return adminService.getAdmin();}
    @PostMapping("admin")
    public void addAdmin(@RequestBody Admin admin){adminService.addNewAdmin(admin);}
    @DeleteMapping("admin/{adminId}")
    public void deleteAdmin(@PathVariable("adminId") Long adminId){
        adminService.deleteAdmin(adminId);
    }
    @PutMapping("admin")
    public void updateAdmin(@RequestBody Admin admin){adminService.updateAdmin(admin);}
}
