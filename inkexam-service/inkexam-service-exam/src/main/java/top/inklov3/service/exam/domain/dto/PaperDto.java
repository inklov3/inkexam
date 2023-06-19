package top.inklov3.service.exam.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class PaperDto {
    private String name;
    private String course;
    private String makeTeacherId;
    private Integer generalScore;
    private List<PaperQuestionDto> paperQuestionDtos;
}