package top.inklov3.service.exam.domain.dtomapper;

import top.inklov3.service.exam.domain.dto.QuestionDto;
import top.inklov3.service.exam.domain.po.Question;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface QuestionDtoMapper {
    QuestionDtoMapper INSTANT = Mappers.getMapper(QuestionDtoMapper.class);

    QuestionDto toQuestionDto(Question question);

    List<QuestionDto> toQuestionDto(List<Question> questions);

    Question toQuestion(QuestionDto questionDto);

    List<Question> toQuestion(List<QuestionDto> questionDtos);
}
