package top.inklov3.service.exam.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.jsqlparser.statement.create.table.Index;

/**
 * @author inklov3
 * 前端 Question
 */
@Data
@NoArgsConstructor
public class QuestionDto {
    private Integer index;
    private String questionType;
    private String questionDescribe;
    private String questionOption;
    private String answer;
}
