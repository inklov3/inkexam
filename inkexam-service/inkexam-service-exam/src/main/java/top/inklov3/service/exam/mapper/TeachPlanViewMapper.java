package top.inklov3.service.exam.mapper;

import top.inklov3.service.exam.domain.po.TeachPlanView;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author inklov3
* @description 针对表【teach_plan_view】的数据库操作Mapper
* @createDate 2023-06-05 11:06:25
* @Entity net.laputa.service.onlineexam.domain.po.TeachPlanView
*/
@Mapper
public interface TeachPlanViewMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TeachPlanView record);

    int insertSelective(TeachPlanView record);

    TeachPlanView selectByPrimaryKey(Long id);
    int updateByPrimaryKeySelective(TeachPlanView record);
    int updateByPrimaryKey(TeachPlanView record);
    List<String> getTeachCoursesNameByTeacherName(@Param("teacher_name") String teacherName);
}
