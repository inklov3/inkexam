package top.inklov3.service.exam.mapper;

import top.inklov3.service.exam.domain.po.Department;

/**
* @author inklov3
* @description 针对表【department(院系)】的数据库操作Mapper
* @createDate 2023-06-05 10:32:48
* @Entity net.laputa.service.onlineexam.domain.po.Department
*/
public interface DepartmentMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

}
