package pl.mwrobel91.linksaver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mwrobel91.linksaver.constant.MappingConstants;
import pl.mwrobel91.linksaver.model.LinkModel;
import pl.mwrobel91.linksaver.service.LinkService;

@RestController
public class LinkController {

    @Autowired
    private LinkService linkService;

    @GetMapping(MappingConstants.INDEX)
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @PostMapping("/links")
    public String addLink(LinkModel linkDTO) {
        linkService.saveLink(linkDTO);
        return "xx";
    }
}
