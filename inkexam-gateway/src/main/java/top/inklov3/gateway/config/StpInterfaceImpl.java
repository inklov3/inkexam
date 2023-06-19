package top.inklov3.gateway.config;

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

    @Override
    public List<String> getRoleList(Object o, String s) {
        String identifier = (String) o;
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
