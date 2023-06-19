package top.inklov3.service.exam.mapper;

import top.inklov3.service.exam.domain.po.TestPaper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author inklov3
 * @description 针对表【test_paper】的数据库操作Mapper
 * @createDate 2023-06-06 06:21:21
 * @Entity net.laputa.service.onlineexam.domain.po.TestPaper
 */
@Mapper
public interface TestPaperMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TestPaper record);

    int insertSelective(TestPaper record);

    TestPaper selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TestPaper record);

    int updateByPrimaryKey(TestPaper record);

    List<TestPaper> selectByPaperId(@Param("paper_id")Integer paperId);

}
