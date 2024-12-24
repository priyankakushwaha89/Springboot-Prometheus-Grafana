package com.example.Springboot_Grafana_Prometheus.Controller;

import com.example.Springboot_Grafana_Prometheus.Model.Teacher;
import com.example.Springboot_Grafana_Prometheus.Repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/teacher")
public class TeacherController
{
    @Autowired
    TeacherRepository repo;

    @RequestMapping("/test")
    public String test()
    {
        return "Hello! This is for Grafana";
    }

    @PostMapping("/save")
    public String saveData(@RequestBody Teacher teacher)
    {
        repo.save(teacher);
        return "Data Saved into the database";
    }
    @GetMapping("/all")
    public List<Teacher> allData()
    {
        List<Teacher> teacher=repo.findAll();
        return teacher;
    }
    @PutMapping("/upd/{id}")
    public String updateById(@PathVariable int id,@RequestBody Teacher teacher)
    {
        Teacher te=repo.findById(id).get();
        te.setName(teacher.getName());
        te.setAge(teacher.getAge());
        te.setAddress(teacher.getAddress());
        te.setGender(teacher.getGender());
        te.setPhone(teacher.getPhone());
        te.setPhone(teacher.getPhone());

        repo.save(te);
        return "Data Updated";

    }
    @DeleteMapping("/del/{id}")
    public String deleteById(@PathVariable int id)
    {
        repo.deleteById(id);
        return "Data deleted";
    }


}
