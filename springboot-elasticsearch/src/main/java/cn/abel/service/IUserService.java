package cn.abel.service;

import cn.abel.bean.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.io.IOException;
import java.util.List;

public interface IUserService extends IService<User> {

    public void addUser(User user) throws IOException;

    public User getUserById(String id);

    public void inserbacthUser(List<User> list);
}
