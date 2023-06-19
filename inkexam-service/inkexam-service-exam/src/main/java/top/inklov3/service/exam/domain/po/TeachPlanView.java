package top.inklov3.service.exam.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName teach_plan_view
 */
@TableName(value ="teach_plan_view")
@Data
public class TeachPlanView implements Serializable {
    private String teacherName;

    private String courseName;

    private String clazzName;

    private String term;

    private static final long serialVersionUID = 1L;
}