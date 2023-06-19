package top.inklov3.service.exam.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

/**
 * @TableName paper
 */
@TableName(value = "paper")
@Data
public class Paper implements Serializable {
    private String name;
    private Integer pid;
    private String course;
    private String makeTeacherId;
    private Integer generalScore;
    private static final long serialVersionUID = 1L;
}