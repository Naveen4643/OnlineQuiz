package com.example.demo.reposiitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entity.ScoreCard;
import com.example.demo.entity.User;

@RepositoryRestResource(path="scorecard")
@CrossOrigin("http://localhost:4200")
public interface ScoreCardRepository extends JpaRepository<ScoreCard,Integer>{
	
	public List<ScoreCard> findByUserId(Integer id);
	//Page<ScoreCard> findBycategoryId(@RequestParam("id")Integer id,Pageable pageable);
}
