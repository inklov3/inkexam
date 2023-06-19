package top.inklov3.service.exam.mapper;

import top.inklov3.service.exam.domain.po.Elective;
import org.apache.ibatis.annotations.Mapper;

/**
* @author inklov3
* @description 针对表【elective(选课单)】的数据库操作Mapper
* @createDate 2023-06-05 10:32:48
* @Entity net.laputa.service.onlineexam.domain.po.Elective
*/
@Mapper
public interface ElectiveMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Elective record);

    int insertSelective(Elective record);

    Elective selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Elective record);

    int updateByPrimaryKey(Elective record);

}
