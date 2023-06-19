package top.inklov3.service.exam.mapper;

import top.inklov3.service.exam.domain.po.Exam;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author inklov3
 * @description 针对表【exam(考试)】的数据库操作Mapper
 * @createDate 2023-06-06 01:03:33
 * @Entity net.laputa.service.onlineexam.domain.po.Exam
 */
@Mapper
public interface ExamMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Exam exam);

    List<Exam> selectAll();

    Integer insertWithPaperId(@Param("paper_id") Integer paperId, @Param("exam") Exam exam);

    int insertSelective(Exam record);

    Exam selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Exam record);

    int updateByPrimaryKey(Exam record);

}
