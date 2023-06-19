package top.inklov3.service.exam.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

/**
 * @TableName paper_question
 */
@TableName(value = "paper_question")
@Data
public class PaperQuestion implements Serializable {
    private Integer paperId;

    private Integer questionId;

    private Integer questionScore;

    private Integer questionNo;

    private static final long serialVersionUID = 1L;
}