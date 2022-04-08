package pl.mwrobel91.linksaver.repository.impl;

import org.springframework.stereotype.Repository;
import pl.mwrobel91.linksaver.LinkState;
import pl.mwrobel91.linksaver.model.LinkModel;
import pl.mwrobel91.linksaver.repository.LinkRepository;

import java.util.*;

@Repository
public class LinkRepositoryTemp implements LinkRepository {

    private final List<LinkModel> modelList = new ArrayList<>();
    {
        modelList.add(new LinkModel("BattleShip",
                new Date(),
                "https://www.nulliq.dev/posts/battleship/",
                "note..",
                LinkState.TO_READ));
        modelList.add(new LinkModel("Coolify",
                new Date(),
                "https://coolify.io/",
                "note..",
                LinkState.TO_READ));
    }

    @Override
    public void saveLink(LinkModel linkModel) {
        modelList.add(linkModel);
    }
}
