package top.inklov3.service.exam.controller;

import top.inklov3.common.core.domain.Response;
import top.inklov3.service.exam.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @ResponseBody
    @GetMapping("/teacher/get_teach_courses")
    public Response<List<String>> getTeachCourses(@RequestParam("tid") String tid) {
        return Response.ok(teacherService.getTeachCoursesName(tid));
    }
}
