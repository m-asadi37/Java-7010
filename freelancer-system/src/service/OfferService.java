package service;

import entity.Freelancer;
import entity.Offer;
import entity.Project;

import java.util.HashSet;
import java.util.Set;

public class OfferService {

    private static final Set<Offer> OFFERS = new HashSet<>();

    private static final ProjectService projectService = new ProjectService();

    public Offer submitOffer(Freelancer user, long projectId, long hours, double price) {
        Project project = projectService.getProjectById(projectId);

        Offer offer = new Offer(user, project, hours, price);

        project.addOffer(offer);
        OFFERS.add(offer);
        return offer;
    }
}
