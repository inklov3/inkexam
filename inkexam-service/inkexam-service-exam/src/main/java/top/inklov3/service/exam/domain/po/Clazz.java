package top.inklov3.service.exam.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

/**
 * @TableName clazz
 */
@TableName(value ="clazz")
@Data

@Builder
public class Clazz implements Serializable {
    private String cid;

    private String name;

    private String speciality;

    private String term;

    private static final long serialVersionUID = 1L;
}