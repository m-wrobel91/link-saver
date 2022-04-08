package pl.mwrobel91.linksaver.controller;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import pl.mwrobel91.linksaver.constant.MappingConstants;

public class LinkControllerTest {

    @Autowired
    private MockMvc mvc;

    public LinkControllerTest(MockMvc mvc) {
        this.mvc = mvc;
    }

    @Test
    public void getIndex() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get(MappingConstants.INDEX).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Greetings from Spring Boot!")));
    }
}
