package cn.smileyan.springboot.smileyan_idiom.service.impl;

import cn.smileyan.springboot.smileyan_idiom.dao.CyDao;
import cn.smileyan.springboot.smileyan_idiom.entity.Cy;
import cn.smileyan.springboot.smileyan_idiom.service.CyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CyServiceImpl implements CyService {
    @Autowired
    private CyDao cyDao;
    @Override
    public Cy getCyById(Integer cyId) {
         return cyDao.queryCyById(cyId);
    }

    @Override
    public Cy getCyByName(String name) {
        return cyDao.queryCyByName(name);
    }


    /**
     * @Warnning 特别注意要加一个% 用于模糊查询
     * @param headname
     * @param start
     * @param length
     * @return
     */
    @Override
    public List<Cy> getCyByHeadNameStrictly(String headname, int start, int length) {
        return cyDao.queryCyByHeadNameStrictly(headname+"%",start,length);
    }

    @Override
    public List<Cy> getCyByHeadName(String headname, int start, int length) {
        return cyDao.queryCyByHeadName(headname+"%",start,length);
    }


}
