package cn.abel.service;

import cn.abel.BaseTest;
import cn.abel.bean.User;
import cn.abel.util.ElasticsearchUtil;
import cn.abel.util.RedisUtil;
import cn.abel.vo.EsEntity;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Random;


/**
 * @author yyb
 * @time 2019/3/27
 */
public class ServiceTest extends BaseTest {


    @Autowired
    private IUserService userService;
    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void dynamicDataSourceTest() throws Exception {
        //User user = userService.selectById(1);
      /*  System.out.println("--userList---" );
        ArrayList<User> list = new ArrayList();
        for (int i = 2;i<1000; i++){
            User user = new User();
            user.setId(i);
            user.setName(getRandomString2(10));
            list.add(user);
        }
        userService.inserbacthUser(list);*/

        //userService.addUser(user);
        // userService.getUserById("1");
        redisUtil.set("cesi","1111111111111111");


    }

    public static String getRandomString2(int length){
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(3);
            long result=0;
            switch(number){
                case 0:
                    result=Math.round(Math.random()*25+65);
                    sb.append(String.valueOf((char)result));
                    break;
                case 1:
                    result=Math.round(Math.random()*25+97);
                    sb.append(String.valueOf((char)result));
                    break;
                case 2:
                    sb.append(String.valueOf(new Random().nextInt(10)));
                    break;
            }


        }
        return sb.toString();
    }
}
