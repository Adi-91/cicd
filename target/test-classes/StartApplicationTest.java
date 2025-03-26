package com.abhishek;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

@SpringBootTest
class StartApplicationTest {

    @Autowired
    private StartApplication startApplication;

    private MockMvc mockMvc;

    @Mock
    private Model model;

    @BeforeEach
    void setup() {
        // Initialize MockMvc
        mockMvc = MockMvcBuilders.standaloneSetup(startApplication).build();
    }

    @Test
    void testIndexEndpoint() throws Exception {
        // Perform a GET request to the '/' endpoint
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())  // Check if the status code is 200 OK
                .andExpect(view().name("index"))  // Check if the returned view is 'index'
                .andExpect(model().attribute("title", "I have successfuly built a sprint boot application using Maven"))  // Check if 'title' attribute is added
                .andExpect(model().attribute("msg", "This application is deployed on to Kubernetes using Argo CD"));  // Check if 'msg' attribute is added
    }

    @Test
    void testMainMethod() {
        // This is a simple test to ensure that the main method runs without exceptions.
        // This test doesn't really need assertions as we just want to ensure no exceptions are thrown when starting the application.
        StartApplication.main(new String[] {});
    }
}

