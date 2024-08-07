package com.itheima;

import com.itheima.config.MsgConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.result.HeaderResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class WebTests {

    @Autowired
    private String msg;

    @Test
    void testConfiguration() {
        System.out.println(msg);
    }

    @Test
    void testWeb(@Autowired MockMvc mvc) throws Exception {
        //http://localhost:8080/books
        //RequestBuilder builder;
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/books");

        ResultActions actions = mvc.perform(mockHttpServletRequestBuilder);

    }

    @Test
    void testStatus(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/books");
        ResultActions actions = mvc.perform(mockHttpServletRequestBuilder);

        StatusResultMatchers status = MockMvcResultMatchers.status();
        ResultMatcher ok = status.isOk();
        ResultActions resultActions = actions.andExpect(ok);

    }

    @Test
    void testBody(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/books");
        ResultActions actions = mvc.perform(mockHttpServletRequestBuilder);

        ContentResultMatchers content = MockMvcResultMatchers.content();
        ResultMatcher resultMatcher = content.string("springboot");

        actions.andExpect(resultMatcher);
    }

    @Test
    void testBodyJson(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/books");
        ResultActions actions = mvc.perform(mockHttpServletRequestBuilder);

        ContentResultMatchers content = MockMvcResultMatchers.content();
        ResultMatcher resultMatcher = content.json("{\"id\":1,\"name\":\"springboot\",\"type\":\"springboot\",\"description\":\"springboot\"}");

        actions.andExpect(resultMatcher);
    }

    @Test
    void testContextType(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/books");
        ResultActions actions = mvc.perform(mockHttpServletRequestBuilder);

        HeaderResultMatchers headerResultMatchers = MockMvcResultMatchers.header();
        ResultMatcher resultMatcher = headerResultMatchers.string("Content-Type", "application/json");

        actions.andExpect(resultMatcher);
    }

    @Test
    void testGetById(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/books");
        ResultActions actions = mvc.perform(mockHttpServletRequestBuilder);

        StatusResultMatchers status = MockMvcResultMatchers.status();
        ResultMatcher ok = status.isOk();
        ResultActions resultActions = actions.andExpect(ok);

        HeaderResultMatchers headerResultMatchers = MockMvcResultMatchers.header();
        ResultMatcher resultMatcher = headerResultMatchers.string("Content-Type", "application/json");
        actions.andExpect(resultMatcher);

        ContentResultMatchers content = MockMvcResultMatchers.content();
        ResultMatcher result = content.json("{\"id\":1,\"name\":\"springboot\",\"type\":\"springboot\",\"description\":\"springboot\"}");
        actions.andExpect(result);

    }
}
