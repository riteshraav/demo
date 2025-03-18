package com.demo.demo.controller;

import com.demo.demo.model.Admin;
import com.demo.demo.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "*")
public class AdminController {
    @Autowired
    AdminRepo adminRepo;
    @PostMapping("/add")
    public void addAdmin(@RequestBody Admin admin)
    {
        Admin temp = new Admin();
        Admin flag = new Admin();
        temp.set_id(admin.get_id());
        temp.setName(admin.getName());
        temp.setPhone(admin.getPhone());
        adminRepo.save(admin);
        System.out.println("saved");
    }
    @GetMapping("/get/{adminId}")
    public Admin getAdmin(@PathVariable String adminId)
    {

        return  adminRepo.findById(adminId).orElse(new Admin());
    }
    @GetMapping("/get/{adminId}")
    public Admin justchecking(@PathVariable String adminId)
    {

        return  adminRepo.findById(adminId).orElse(new Admin());
    }
}
