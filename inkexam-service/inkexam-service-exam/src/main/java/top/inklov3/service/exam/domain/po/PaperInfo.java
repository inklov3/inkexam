package top.inklov3.service.exam.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName paper_info
 */
@TableName(value ="paper_info")
@Data
public class PaperInfo implements Serializable {
    private String teacherName;

    private Long pid;

    private String course;

    private Long generalScore;

    private String name;

    private Long questionNumber;

    private static final long serialVersionUID = 1L;
}