package cn.abel.service;

import cn.abel.BaseTest;
import cn.abel.bean.ListNode;
import cn.abel.bean.User;
import cn.abel.util.ElasticsearchUtil;
import cn.abel.util.RedisUtil;
import cn.abel.vo.EsEntity;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;


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
       /* List<User> users  = new ArrayList<>();
        int i = 0;
        while (i<3){
            User user = new User();
            user.setId(i);
            user.setName("cesi"+i);
            users.add(user);
            i++;
        }
        for (User u:users){
            u.setAddress("测试地址");
        }*/
       /* int[] nums = new int[2];
        nums[0] = 3;
        nums[1] = 3;
        int target = 6 ;
        int[] integers = this.twoSum(nums,target);
        System.out.println(JSONObject.toJSONString(integers));*/

        System.out.println(getMaxStr(121));

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


    public int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<Integer>();
        Map<Integer,Integer> nummap = new HashMap<>();
        for (int i=0 ; i<nums.length;i++){
            nummap.put(i,nums[i]);
        }
        for (int i=0 ; i<nums.length;i++){
            if( nummap.containsKey(i)){
                for ( Map.Entry<Integer,Integer> e :nummap.entrySet()) {
                    if(e.getKey() != i){
                        int tar = e.getValue() + nums[i];
                        if(target == tar){
                            set.add(i);
                        }
                    }

                }
            }
        }
        int[] r  = new int[set.size()];
        int size = 0;
        for (Integer i :set){
            if(size <= set.size()){
                r[size] = i;
                size++;
            }
        }
        return r;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        return null ;
    }

    private int getNum(int x) {
        int temp = 0;
        int len = String.valueOf(Math.abs(x)).length();
        if(len>10){
            return 0;
        }
        while (x != 0) {
            int pop = x % 10;
            System.out.println(pop+"+-----+"+temp);
            if(x>0){
                if(Integer.MAX_VALUE-temp * 10>0){
                    temp = temp * 10 + pop;
                    x = x / 10;
                }else {
                    return 0;
                }
            }else if(x < 0){
                if(Integer.MIN_VALUE+temp * 10 < 0){
                    temp = temp * 10 + pop;
                    x = x / 10;
                }else {
                    return 0;
                }
            } else {
                return 0;
            }
        }
        return temp;
    }

    private  int getNumLenght(int x) throws Exception {
        try {
            int un = x;
            ArrayList<Integer> s = new ArrayList<>();
            //x = x>0?x:-x;
            int len = String.valueOf(x).length();
            Double a = Double.valueOf("" + x);
            for (int i =1;i<=len;i++ ){
                Double v = a % new Double("10");
                s.add(v.intValue());
                a = (a-v)/10;
            }
            String str = new String();
            for (int i = 0 ; i<s.size();i++){
                str=str+s.get(i);
            }
            if(un<0){
                return -Integer.valueOf(str);
            }else {
                return Integer.valueOf(str);
            }
        } catch (NumberFormatException e) {
            throw new Exception("超出整最大值");
        }

    }


    private Boolean getMaxStr (int x){
        List<Character> strList = new ArrayList<>();
        String s = String.valueOf(x);
        for (int i = 0 ;i<s.length();i++){
            strList.add(s.charAt(i));
        }
        String s1 = new String();
        for (int i = strList.size()-1 ;i>=0;i--){
            s1 =s1+strList.get(i);
        }
        if(s.equals(s1)){
            return true;
        }else {
            return false;
        }


    }
}
