package top.inklov3.service.exam.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName student
 */
@TableName(value ="student")
@Data
public class Student implements Serializable {
    private String sid;

    private String name;

    private String password;

    private String salt;

    private String clazzId;

    private static final long serialVersionUID = 1L;
}