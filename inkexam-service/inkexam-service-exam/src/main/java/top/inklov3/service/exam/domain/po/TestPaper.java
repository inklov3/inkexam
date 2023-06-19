package top.inklov3.service.exam.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName test_paper
 */
@TableName(value ="test_paper")
@Data
public class TestPaper implements Serializable {
    private Integer paperId;

    private Integer questionNo;

    private String questionType;

    private String questionDescribe;

    private String questionOption;

    private String answer;

    private Integer questionScore;

    private static final long serialVersionUID = 1L;
}