package cn.smileyan.springboot.smileyan_idiom.dao;

import cn.smileyan.springboot.smileyan_idiom.entity.Cy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CyDaoTest {
    @Autowired
    private CyDao cyDao;
    @Test
    public void queryCyById() {
        Cy cy = cyDao.queryCyById(3);
        System.out.println(cy.getContent());
    }

    @Test
    public void queryCyByName() {
    }

    @Test
    public void queryCyByHeadName() {
    }

    @Test
    public void queryCyByHeadNameStrictly() {
    }
}