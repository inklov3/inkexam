package top.inklov3.service.exam.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName question
 */
@TableName(value ="question")
@Data
public class Question implements Serializable {
    private Integer index;
    private Integer bankId;
    private String questionType;
    private String questionDescribe;
    private String answer;
    private String questionOption;
    private static final long serialVersionUID = 1L;
}