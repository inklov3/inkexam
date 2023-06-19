package top.inklov3.auth.mapper;

import top.inklov3.auth.domain.po.User;

/**
* @author inklov3
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2023-06-19 13:25:24
* @Entity top.inklov3.auth.domain.po.User
*/
public interface UserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
