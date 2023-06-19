package top.inklov3.service.exam.domain.po;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.sql.Timestamp;

import lombok.Data;

/**
 * @TableName exam
 */
@TableName(value = "exam")
@Data
public class Exam implements Serializable {
    private Integer examId;
    private Integer usePaper;
    private Timestamp examTime;
    private String examCourse;
    private static final long serialVersionUID = 1L;
}