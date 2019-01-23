package com.agile.crowdfunding.dao;


import com.agile.crowdfunding.entity.Project;
import com.agile.crowdfunding.entity.Trade;
import com.agile.crowdfunding.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectRepositoryTest {

    @Autowired
    ProjectRepository projectRepository;

    @Test
    public void insert(){

        List<Project> projects = projectRepository.findAll();

        System.out.println(projects.size());
    }

}