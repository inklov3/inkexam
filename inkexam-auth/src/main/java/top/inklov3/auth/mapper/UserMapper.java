package top.inklov3.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import top.inklov3.auth.domain.po.User;

/**
* @author inklov3
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2023-06-19 13:26:09
* @Entity top.inklov3.auth.domain.po.User
*/
public interface UserMapper extends BaseMapper<User> {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
