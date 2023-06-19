package top.inklov3.service.exam.mapper;

import top.inklov3.service.exam.domain.po.Course;
import org.apache.ibatis.annotations.Param;

/**
* @author inklov3
* @description 针对表【course(课程列表)】的数据库操作Mapper
* @createDate 2023-06-05 10:32:48
* @Entity net.laputa.service.onlineexam.domain.po.Course
*/
public interface CourseMapper {
    String selectCidByName(@Param("course_name")String courseName);

    int deleteByPrimaryKey(Long id);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);

}
