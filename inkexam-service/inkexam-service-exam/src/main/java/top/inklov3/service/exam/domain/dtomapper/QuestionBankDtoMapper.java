package top.inklov3.service.exam.domain.dtomapper;

import top.inklov3.service.exam.domain.dto.QuestionBankDto;
import top.inklov3.service.exam.domain.po.QuestionBank;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface QuestionBankDtoMapper {
    QuestionBankDtoMapper INSTANT = Mappers.getMapper(QuestionBankDtoMapper.class);

    QuestionBankDto toQuestionBankDto(QuestionBank questionBank);

    List<QuestionBankDto> toQuestionBankDto(List<QuestionBank> questionBanks);

    QuestionBank toQuestionBank(QuestionBankDto questionBankDto);

    List<QuestionBank> toQuestionBank(List<QuestionBankDto> questionBankDtos);
}
