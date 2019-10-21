package cn.abel.service.impl;

import cn.abel.bean.User;
import cn.abel.mapper.UserMapper;
import cn.abel.service.IUserService;
import cn.abel.util.ElasticsearchUtil;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.index.query.MatchAllQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

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
        MatchAllQueryBuilder queryBuilder = QueryBuilders.matchAllQuery();
        searchSourceBuilder.query(queryBuilder);
        List<User> user = ElasticsearchUtil.search("user", searchSourceBuilder, User.class);
        System.out.println(JSONObject.toJSONString(user));
        return null;
    }
}
