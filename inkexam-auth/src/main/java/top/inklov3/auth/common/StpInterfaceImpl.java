package top.inklov3.auth.common;

import cn.dev33.satoken.stp.StpInterface;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StpInterfaceImpl implements StpInterface {
    @Override
    public List<String> getPermissionList(Object o, String s) {
        return null;
    }

    /**
     * 简单处理角色, 这两个参数啥意思我也不知道, 反正第一个是个唯一id对象
     * @param identifierObj     用户唯一标识符
     * @param unknown           不知道什么参数，参考sa-token
     * @return                  角色列表，可以多加点
     */
    @Override
    public List<String> getRoleList(Object identifierObj, String unknown) {
        String identifier = (String) identifierObj;
        List<String> roleList = new ArrayList<>();
        if (identifier.startsWith("2")) {
            roleList.add("teacher");
        }
        if (identifier.startsWith("7")){
            roleList.add("student");
        }
        return roleList;
    }
}
