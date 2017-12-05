package com.temsoft.shop;

import com.temsoft.oms.order.exception.OrdersSaveUpdateException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
public abstract class TestBase {

    @Before
    public void testAdd(){
    }

    @Test
    public void testUpdate(){
    }

    @After
    public void testDelete() throws OrdersSaveUpdateException {
    }

}