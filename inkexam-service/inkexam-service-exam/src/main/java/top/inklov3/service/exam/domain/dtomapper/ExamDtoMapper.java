package top.inklov3.service.exam.domain.dtomapper;

import top.inklov3.service.exam.domain.dto.ExamDto;
import top.inklov3.service.exam.domain.po.Exam;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ExamDtoMapper {
    ExamDtoMapper INSTANT = Mappers.getMapper(ExamDtoMapper.class);
    Exam toPaper(ExamDto examDto);

    List<Exam> toPaper(List<ExamDto> examDto);
}
