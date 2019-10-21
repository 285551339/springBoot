package cn.abel.service;

import cn.abel.BaseTest;
import cn.abel.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author yyb
 * @time 2019/3/27
 */
public class ServiceTest extends BaseTest {


    @Autowired
    private IUserService userService;

    @Test
    public void dynamicDataSourceTest() throws Exception {
        //User user = userService.selectById(1);
        System.out.println("--userList---" );
        User user = new User();
        user.setId(1);
        userService.addUser(user);
        userService.getUserById("1");

    }
}
