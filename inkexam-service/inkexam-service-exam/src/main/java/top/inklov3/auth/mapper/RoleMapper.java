package top.inklov3.auth.mapper;

import top.inklov3.auth.domain.po.Role;

/**
* @author inklov3
* @description 针对表【role(角色表)】的数据库操作Mapper
* @createDate 2023-06-19 13:25:24
* @Entity top.inklov3.auth.domain.po.Role
*/
public interface RoleMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

}
