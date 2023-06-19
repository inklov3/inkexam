package top.inklov3.service.exam.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName elective
 */
@TableName(value ="elective")
@Data
public class Elective implements Serializable {
    private String studentId;

    private String courseId;

    private Integer score;

    private static final long serialVersionUID = 1L;
}