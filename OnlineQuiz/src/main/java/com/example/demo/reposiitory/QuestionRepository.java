package com.example.demo.reposiitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entity.Question;
import com.example.demo.entity.User;

@RepositoryRestResource(path="question")
@CrossOrigin("http://localhost:4200")
public interface QuestionRepository extends JpaRepository<Question,Integer>{

	//public List<Question> findByUserNameContainsIgnoreCase(String name);
	//Page<Question> findBycategoryId(@RequestParam("id")Integer id,Pageable pageable);
	
}
