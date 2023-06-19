package top.inklov3.service.exam.service;

import top.inklov3.service.exam.domain.dto.ExamDto;
import top.inklov3.service.exam.domain.po.Exam;
import top.inklov3.service.exam.domain.po.TestPaper;

import java.util.List;

public interface ExamService {

    Integer executeExam(ExamDto examDto);

    List<Exam> getExamList();

    List<TestPaper> getExamPaper(Integer paperId);
}
