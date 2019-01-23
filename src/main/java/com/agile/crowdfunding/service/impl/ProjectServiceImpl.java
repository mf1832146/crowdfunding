package com.agile.crowdfunding.service.impl;

import com.agile.crowdfunding.dao.*;
import com.agile.crowdfunding.entity.*;
import com.agile.crowdfunding.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    RewardRepository rewardRepository;

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    ProjectDetailRepository projectDetailRepository;

    @Autowired
    ProAndUsersRepository proAndUsersRepository;

    @Autowired
    ImageRepository imageRepository;

    @Override
    public List<Project> findProjectsTop3() {
        List<Project> projects = projectRepository.findAll();

        List<Project> projectsTop3 = new ArrayList<Project>();
        projectsTop3.add(projects.get(0));
        projectsTop3.add(projects.get(1));
        projectsTop3.add(projects.get(2));

        return projectsTop3;
    }

    @Override
    public Project getProject(String projID) {
        return projectRepository.findByProjectId(projID);
    }

    @Override
    public ProjectDetail getProjectDetail(String projID) {
        return projectDetailRepository.findByProjectId(projID);
    }

    @Override
    public Reward getReward(String projID) {
        return rewardRepository.findByProjectId(projID);
    }

    @Override
    public List<Comment> getComment(String projID) {
        return commentRepository.findByProjectId(projID);
    }

    @Override
    public List<ProAndUsers> getProAndUsers(String projID) {
        return proAndUsersRepository.findByProjectId(projID);
    }

    @Override
    public List<Image> getImages(String projID) {
        return imageRepository.findByProjectId(projID);
    }
}