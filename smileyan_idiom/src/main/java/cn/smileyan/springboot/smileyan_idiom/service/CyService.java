package cn.smileyan.springboot.smileyan_idiom.service;

import cn.smileyan.springboot.smileyan_idiom.entity.Cy;
import java.util.List;

public interface CyService {
    /**
     * @description 根据id查询
     * @param cyId
     * @return cy
     */
    Cy getCyById(Integer cyId);

    /**
     * @description 根据名字查询
     * @param name
     * @return cy
     */
    Cy getCyByName(String name);

    /**
     * @description 模糊查询
     * @param headname
     * @param start
     * @param length
     * @return list
     */
    List<Cy> getCyByHeadNameStrictly(String headname, int start, int length);

    /**
     *
     * @param headname
     * @param start
     * @param length
     * @return
     */
    List<Cy> getCyByHeadName(String headname, int start, int length);
}
