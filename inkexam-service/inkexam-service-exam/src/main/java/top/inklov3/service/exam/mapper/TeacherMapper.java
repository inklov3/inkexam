package top.inklov3.service.exam.mapper;

import top.inklov3.service.exam.domain.po.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author inklov3
 * @description 针对表【teacher(教师表)】的数据库操作Mapper
 * @createDate 2023-06-05 10:32:48
 * @Entity net.laputa.service.onlineexam.domain.po.Teacher
 */
@Mapper
public interface TeacherMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
    String getTeacherName(@Param("tid") String tid);

}
