package top.inklov3.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import top.inklov3.auth.domain.po.Role;
import top.inklov3.auth.service.RoleService;
import top.inklov3.auth.mapper.RoleMapper;
import org.springframework.stereotype.Service;

/**
* @author inklov3
* @description 针对表【role(角色表)】的数据库操作Service实现
* @createDate 2023-06-19 14:48:11
*/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role>
    implements RoleService{

}




