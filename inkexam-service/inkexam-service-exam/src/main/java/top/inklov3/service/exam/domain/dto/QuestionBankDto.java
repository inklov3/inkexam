package top.inklov3.service.exam.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author inklov3
 * 前端 QuestionBank
 */
@Data
@NoArgsConstructor
public class QuestionBankDto {
    private String title;
    private String relateCourse;
    private String uploadTeacherId;
    private QuestionDto[] questions;
}
