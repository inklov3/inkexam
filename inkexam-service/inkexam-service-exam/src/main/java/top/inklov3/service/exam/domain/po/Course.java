package top.inklov3.service.exam.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName course
 */
@TableName(value ="course")
@Data
public class Course implements Serializable {
    private String cid;

    private String name;

    private static final long serialVersionUID = 1L;
}