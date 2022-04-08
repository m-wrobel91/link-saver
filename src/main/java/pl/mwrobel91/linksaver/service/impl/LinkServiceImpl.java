package pl.mwrobel91.linksaver.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mwrobel91.linksaver.converter.PopulatingConverter;
import pl.mwrobel91.linksaver.converter.populator.LinkModelPopulator;
import pl.mwrobel91.linksaver.converter.populator.Populator;
import pl.mwrobel91.linksaver.dto.LinkDTO;
import pl.mwrobel91.linksaver.model.LinkModel;
import pl.mwrobel91.linksaver.repository.LinkRepository;
import pl.mwrobel91.linksaver.service.LinkService;

@Service
public class LinkServiceImpl implements LinkService {

    @Autowired
    private LinkRepository linkRepository;

    private static Populator<LinkDTO, LinkModel> linkModelPopulator = new LinkModelPopulator();
    //private static Populator<LinkModel, LinkDTO> linkDTOPopulator = new LinkDTOPopulator();
    private static PopulatingConverter<LinkDTO,LinkModel> converter = new PopulatingConverter<>(LinkModel.class)
            .withPopulator(linkModelPopulator);


    @Override
    public void saveLink(final LinkModel linkDTO) {
        final LinkModel linkModel = new LinkModel();
        // todo: convert
        linkRepository.saveLink(linkModel);
    }
}
