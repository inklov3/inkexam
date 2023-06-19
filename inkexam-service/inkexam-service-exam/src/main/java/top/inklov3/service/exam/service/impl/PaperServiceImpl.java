package top.inklov3.service.exam.service.impl;

import top.inklov3.service.exam.domain.dto.PaperDto;
import top.inklov3.service.exam.domain.dto.PaperQuestionDto;
import top.inklov3.service.exam.domain.dtomapper.PaperDtoMapper;
import top.inklov3.service.exam.domain.dtomapper.PaperQuestionDtoMapper;
import top.inklov3.service.exam.domain.po.Paper;
import top.inklov3.service.exam.domain.po.PaperInfo;
import top.inklov3.service.exam.domain.po.PaperQuestion;
import top.inklov3.service.exam.mapper.PaperInfoMapper;
import top.inklov3.service.exam.mapper.PaperMapper;
import top.inklov3.service.exam.mapper.PaperQuestionMapper;
import top.inklov3.service.exam.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PaperServiceImpl implements PaperService {

    @Autowired
    PaperMapper paperMapper;

    @Autowired
    PaperQuestionMapper paperQuestionMapper;

    @Autowired
    PaperInfoMapper paperInfoMapper;

    @Override
    @Transactional
    public Integer makerPaper(PaperDto paperDto) {
        Paper paper = PaperDtoMapper.INSTANT.toPaper(paperDto);
        paperMapper.insert(paper);
        Integer paperIndex = paperMapper.selectLastInsertId();
        List<PaperQuestionDto> paperQuestionDtos = paperDto.getPaperQuestionDtos();
        List<PaperQuestion> paperQuestions = PaperQuestionDtoMapper.INSTANT.toPaperQuestion(paperQuestionDtos);
        paperQuestionMapper.batchInsertWithPaperId(paperIndex, paperQuestions);
        return paperIndex;
    }

    @Override
    public PaperInfo getPaperInfo(Integer paperId) {
        return paperInfoMapper.selectByPrimaryKey(paperId);
    }
}
