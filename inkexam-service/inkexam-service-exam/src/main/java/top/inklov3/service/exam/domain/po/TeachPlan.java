package top.inklov3.service.exam.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName teach_plan
 */
@TableName(value ="teach_plan")
@Data
public class TeachPlan implements Serializable {
    private String teacherId;

    private String clazzId;

    private String courseId;

    private String term;

    private static final long serialVersionUID = 1L;
}