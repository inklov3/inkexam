package top.inklov3.service.exam.mapper;

import top.inklov3.service.exam.domain.po.Student;
import org.apache.ibatis.annotations.Mapper;

/**
* @author inklov3
* @description 针对表【student(学生表)】的数据库操作Mapper
* @createDate 2023-06-05 10:32:48
* @Entity net.laputa.service.onlineexam.domain.po.Student
*/
@Mapper
public interface StudentMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

}
