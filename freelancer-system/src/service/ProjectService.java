package service;

import entity.Client;
import entity.Project;
import entity.ProjectStatus;
import entity.Skill;

import java.util.HashSet;
import java.util.Set;

public class ProjectService {

    private static final Set<Project> PROJECTS = new HashSet<>();

    public Project createProject(Client client, String title, String description, double price, Set<Skill> skills, long hours) {
        Project project = new Project(title, description, price, skills, hours);
        PROJECTS.add(project);
        client.getProjects().add(project);
        return project;
    }

    public Set<Project> getClientProjects(Client client) {
        return client.getProjects();
    }

    public Set<Project> getOpenProjects() {
        Set<Project> openProjects = new HashSet<>();
        for (Project find : PROJECTS) {
            if (find.getStatus().equals(ProjectStatus.OPEN))
                openProjects.add(find);
        }
        return openProjects;
    }

    public Project getProjectById(long projectId) {
        for (Project project : PROJECTS) {
            if (project.getId() == projectId)
                return project;
        }
        System.out.println("project not found!");
        return null;
    }
}
