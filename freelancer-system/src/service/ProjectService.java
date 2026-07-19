package service;

import entity.Client;
import entity.Project;
import entity.Skill;

import java.util.HashSet;
import java.util.Set;

public class ProjectService {

    private final Set<Project> PROJECTS = new HashSet<>();

    public Project createProject(Client client, String title, String description, double price, Set<Skill> skills, long hours) {
        Project project = new Project(title, description, price, skills, hours);
        PROJECTS.add(project);
        client.getProjects().add(project);
        return project;
    }

    public Set<Project> getClientProjects(Client client) {
        return client.getProjects();
    }
}
