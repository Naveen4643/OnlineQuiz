package com.example.demo.reposiitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entity.Roles;

@RepositoryRestResource(path="role")
@CrossOrigin("http://localhost:4200")
public interface RolesRepository extends JpaRepository<Roles,Integer>{

}
