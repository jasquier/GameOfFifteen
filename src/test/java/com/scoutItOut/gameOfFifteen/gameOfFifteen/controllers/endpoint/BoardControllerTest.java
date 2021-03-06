package com.scoutItOut.gameOfFifteen.gameOfFifteen.controllers.endpoint;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author jasquier
 * @since 0.1
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BoardControllerTest {

    @Autowired private MockMvc mockMvc;
    private final String uriTemplate = "/api/v0.1/%s";

    @Test
    public void noParamGetShouldReturnDummyData() throws Exception {
        this.mockMvc.perform(get(String.format(uriTemplate, "boards")))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.content").value("[]"));
    }
}
