package com.test;




import com.app.entities.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/app-tests-ctx.xml"})
@WebAppConfiguration
@FixMethodOrder
public class ControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wac;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test(expected = NoSuchBeanDefinitionException.class)
    public void testContext() {
        Assert.assertNull((wac.getBean("NoSuchBean")));
    }

    @Test
    public void testController() throws Exception {
        mockMvc.perform(get("/users/add")).andDo(print()).andExpect(view().name("addUser.jsp"));
    }

    @Test
    public void testController2() throws Exception {
        mockMvc.perform(get("/users/findUserByEmail")).andExpect(status().isOk())
                .andExpect(view().name("findUserById.jsp"));
    }


    @Test
    public void testController5() throws Exception {
        mockMvc.perform(post("/users/findUserByLogin").param("login", "admin"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(view().name("IdUserResult.jsp"))
                .andDo(print());
    }


    @Test
    public void testController7() throws Exception {
        mockMvc.perform(get("/users/add")).andExpect(status().is2xxSuccessful());
    }

    @Test
    public void testController8() throws Exception {
        mockMvc.perform(get("/users/all")).andExpect(status().is2xxSuccessful());
    }

    /*Integration*/
    @Test
    public void testController6() throws Exception {
        mockMvc.perform(post("/users/add").flashAttr("user", new User("df@mail.com", "758", "admin")))
                .andExpect(status().is3xxRedirection()).andExpect(redirectedUrl("/users/all"))
                .andExpect(view().name("redirect:/users/all"))
                .andDo(print());

    }

    @Test
    public void testController10() throws Exception {
        System.out.println(mockMvc.perform(post("/users/findUserByLogin").param("login", "admin"))
                .andExpect(status().is2xxSuccessful()).andReturn().getModelAndView().getModel().get("list"));
    }
}
