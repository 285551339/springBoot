package cn.abel.bean;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User extends Model {
    private Integer id;
    private String name;
    private String address;
    private String mobile;
    private String email;
    private Date createTime;
    private Integer role;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}