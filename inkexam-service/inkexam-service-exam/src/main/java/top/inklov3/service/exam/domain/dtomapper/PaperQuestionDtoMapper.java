package top.inklov3.service.exam.domain.dtomapper;

import top.inklov3.service.exam.domain.dto.PaperQuestionDto;
import top.inklov3.service.exam.domain.po.PaperQuestion;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PaperQuestionDtoMapper {
    PaperQuestionDtoMapper INSTANT = Mappers.getMapper(PaperQuestionDtoMapper.class);

    PaperQuestion toPaperQuestion(PaperQuestionDto paperQuestionDto);

    List<PaperQuestion> toPaperQuestion(List<PaperQuestionDto> paperQuestionDtos);
}
