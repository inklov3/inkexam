package top.inklov3.service.exam.mapper;

import top.inklov3.service.exam.domain.po.TeachPlan;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeachPlanMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TeachPlan record);

    int insertSelective(TeachPlan record);

    TeachPlan selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TeachPlan record);

    int updateByPrimaryKey(TeachPlan record);
}