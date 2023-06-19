package top.inklov3.service.exam.domain.dtomapper;

import top.inklov3.service.exam.domain.dto.PaperDto;
import top.inklov3.service.exam.domain.po.Paper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PaperDtoMapper {
    PaperDtoMapper INSTANT = Mappers.getMapper(PaperDtoMapper.class);

    Paper toPaper(PaperDto paperDto);

    List<Paper> toPaper(List<PaperDto> paperDtos);
}
