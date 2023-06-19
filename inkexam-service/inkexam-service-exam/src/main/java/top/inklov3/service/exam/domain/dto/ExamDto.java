package top.inklov3.service.exam.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;
@Data
@NoArgsConstructor
public class ExamDto {
    private Integer examId;
    private Integer usePaper;
    private Timestamp examTime;
    private String examCourse;
}