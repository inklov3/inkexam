package top.inklov3.service.exam.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PaperQuestionDto {
    private Integer paperId;
    private Integer questionId;
    private Integer questionScore;
    private Integer questionNo;
}