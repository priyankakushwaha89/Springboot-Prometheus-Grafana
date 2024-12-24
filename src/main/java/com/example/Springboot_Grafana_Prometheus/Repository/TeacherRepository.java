package com.example.Springboot_Grafana_Prometheus.Repository;

import com.example.Springboot_Grafana_Prometheus.Model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
}
