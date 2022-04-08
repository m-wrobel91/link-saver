package pl.mwrobel91.linksaver.repository;

import pl.mwrobel91.linksaver.model.LinkModel;

public interface LinkRepository {

    public void saveLink(LinkModel linkModel);
}
