package pl.mwrobel91.linksaver.converter.populator;

import pl.mwrobel91.linksaver.LinkState;
import pl.mwrobel91.linksaver.dto.LinkDTO;
import pl.mwrobel91.linksaver.model.LinkModel;

import java.util.Date;

public class LinkModelPopulator implements Populator<LinkDTO, LinkModel> {
    @Override
    public void populate(LinkDTO linkDTO, LinkModel linkModel) {
        linkModel.setTitle(linkDTO.getTitle());
        linkModel.setDate(new Date());
        linkModel.setLink(linkDTO.getLink());
        linkModel.setNote(linkDTO.getNote());
        linkModel.setState(LinkState.TO_READ); //assume link to be read
    }
}
