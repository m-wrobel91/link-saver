package pl.mwrobel91.linksaver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mwrobel91.linksaver.constant.MappingConstants;

@RestController
public class LinkController {

    @GetMapping(MappingConstants.INDEX)
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @PostMapping("link")
    public String addLink() {

        return "xx";
    }
}
