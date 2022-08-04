package com.example.demo.reposiitory;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.QuizCategory;
import com.example.demo.entity.User;

@RepositoryRestResource(path="quizcategory")
@CrossOrigin("http://localhost:4200")
public interface QuizCategoryRepository extends JpaRepository<QuizCategory, Integer>{

	public List<QuizCategory> findByQuizCategoryContainsIgnoreCase(Integer id);
	//Page<QuizCategory> findByQuizCategoryId(@RequestParam("id")Integer id,Pageable pageable);
}
