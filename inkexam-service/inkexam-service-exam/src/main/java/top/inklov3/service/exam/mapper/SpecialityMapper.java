package top.inklov3.service.exam.mapper;

import top.inklov3.service.exam.domain.po.Speciality;

/**
* @author inklov3
* @description 针对表【speciality(专业)】的数据库操作Mapper
* @createDate 2023-06-05 10:32:48
* @Entity net.laputa.service.onlineexam.domain.po.Speciality
*/
public interface SpecialityMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Speciality record);

    int insertSelective(Speciality record);

    Speciality selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Speciality record);

    int updateByPrimaryKey(Speciality record);

}
