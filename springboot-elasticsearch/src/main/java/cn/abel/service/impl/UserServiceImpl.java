package cn.abel.service.impl;

import cn.abel.bean.User;
import cn.abel.mapper.UserMapper;
import cn.abel.service.IUserService;
import cn.abel.util.ElasticsearchUtil;
import cn.abel.vo.EsEntity;
import cn.abel.vo.EsPage;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.lucene.search.Query;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.common.io.stream.StreamOutput;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.index.query.*;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private RestClient client;

    @Override
    public void addUser(User user) throws IOException {
        //判断索引是否存在
        if(!ElasticsearchUtil.isIndexExist("user")){

            //创建索引
            ElasticsearchUtil.createIndex("user");
        }
        // 使用XContentBuilder创建一个doc source
        XContentBuilder builder =
                XContentFactory.jsonBuilder()
                        .startObject()
                        .field("id", "1")
                        .field("name", "zhangsan")
                        .field("age", "4")
                        .endObject();
        ElasticsearchUtil.addData(builder,"user",user.getId().toString());

    }

    @Override
    public User getUserById(String id) {
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        MatchAllQueryBuilder matchAllQueryBuilder = QueryBuilders.matchAllQuery();
        searchSourceBuilder.query(matchAllQueryBuilder);

       List<User> user = ElasticsearchUtil.search("user", searchSourceBuilder, User.class);
        //EsPage user = ElasticsearchUtil.searchDataPage("user", 1, 100, query, null, null, null);
        System.out.println(JSONObject.toJSONString(user));
        return null;
    }

    @Override
    public void inserbacthUser(List<User> list) {
        ArrayList<EsEntity> lists = new ArrayList();
        for (User u: list) {
            EsEntity<User> esEntity = new EsEntity<>();

            esEntity.setData(u);
            esEntity.setId(String.valueOf(u.getId()));
            lists.add(esEntity);
        }
        ElasticsearchUtil.insertBatch("user",lists);
    }

    public  String getRandomString2(int length){
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
