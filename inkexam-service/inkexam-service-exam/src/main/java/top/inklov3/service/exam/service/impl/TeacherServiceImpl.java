package top.inklov3.service.exam.service.impl;

import top.inklov3.service.exam.mapper.TeachPlanMapper;
import top.inklov3.service.exam.mapper.TeachPlanViewMapper;
import top.inklov3.service.exam.mapper.TeacherMapper;
import top.inklov3.service.exam.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherMapper teacherMapper;

    @Autowired
    TeachPlanMapper teachPlanMapper;

    @Autowired
    TeachPlanViewMapper teachPlanViewMapper;

    @Override
    public List<String> getTeachCoursesName(String tid) {
        String teacherName = teacherMapper.getTeacherName(tid);
        List<String> teacherCourses = teachPlanViewMapper.getTeachCoursesNameByTeacherName(teacherName);
        return teacherCourses;
    }
}
