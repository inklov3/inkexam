package top.inklov3.service.exam.service.impl;

import top.inklov3.service.exam.domain.dto.ExamDto;
import top.inklov3.service.exam.domain.dtomapper.ExamDtoMapper;
import top.inklov3.service.exam.domain.po.Exam;
import top.inklov3.service.exam.domain.po.TestPaper;
import top.inklov3.service.exam.mapper.ExamMapper;
import top.inklov3.service.exam.mapper.TestPaperMapper;
import top.inklov3.service.exam.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamServiceImpl implements ExamService {

    @Autowired
    ExamMapper examMapper;

    @Autowired
    TestPaperMapper testPaperMapper;

    @Override
    public Integer executeExam(ExamDto examDto) {
        Exam exam = ExamDtoMapper.INSTANT.toPaper(examDto);
        Integer paperId = exam.getUsePaper();
        return examMapper.insertWithPaperId(paperId, exam);
    }

    @Override
    public List<Exam> getExamList() {
        return examMapper.selectAll();
    }

    @Override
    public List<TestPaper> getExamPaper(Integer paperId) {
        return testPaperMapper.selectByPaperId(paperId);
    }
}
