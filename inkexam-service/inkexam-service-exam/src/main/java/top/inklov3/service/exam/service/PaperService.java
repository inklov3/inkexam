package top.inklov3.service.exam.service;

import top.inklov3.service.exam.domain.dto.PaperDto;
import top.inklov3.service.exam.domain.po.PaperInfo;

public interface PaperService {
    Integer makerPaper(PaperDto paperDto);

    PaperInfo getPaperInfo(Integer paperId);
}
