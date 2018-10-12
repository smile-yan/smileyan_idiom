package cn.smileyan.springboot.smileyan_idiom.dao;
import cn.smileyan.springboot.smileyan_idiom.entity.Cy;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface CyDao {
    /**
     * @description  根据id查询
     * @param cyId
     * @return cy
     */
    Cy queryCyById(int cyId);

    /**
     * @description 根据name查询
     * @param name
     * @return
     */
    Cy queryCyByName(String name);

    /**
     * @description 根据成语开头部分选择
     * 即  不严格查询
     * @param namehead  名字
     * @param start
     * @param length
     * @return
     */
    List<Cy> queryCyByHeadName(@Param("name1") String namehead,
                               @Param("name2") int start,
                               @Param("name3") int length);

    /**
     * @description 根据成语开头查出length个数据，一定所有数据都是以这个开否
     * 即 严格查询
     * @param namehead
     * @param start
     * @param length
     * @return
     */
    List<Cy> queryCyByHeadNameStrictly(@Param("name1") String namehead,
                                       @Param("name2") int start,
                                       @Param("name3") int length);
}
