DROP DATABASE IF EXISTS `inkexam`;
CREATE DATABASE `inkexam` CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `inkexam`;

CREATE TABLE IF NOT EXISTS user
(
    id       char(12) PRIMARY KEY COMMENT "用户唯一标识",
    name     CHAR(20)    NOT NULL COMMENT "姓名",
    salt     char(7)     NOT NULL COMMENT "7位盐",
    password varchar(64) NOT NULL COMMENT "加密密码",
    email    varchar(255) COMMENT "邮箱"
) COMMENT "用户";

CREATE TABLE IF NOT EXISTS role
(
    id   CHAR(20) PRIMARY KEY COMMENT "唯一标识",
    role CHAR(10) NOT NULL COMMENT "角色"
) COMMENT "角色表";

INSERT INTO `user`(id, name, salt, password, email) VALUE ('admin', '测试', 'askcifj', MD5('admin'), '2714871989@qq.com');
INSERT INTO `role`(id, role) VALUE ('admin', 'admin');

CREATE TABLE IF NOT EXISTS teacher
(
    teacher_id   CHAR(20) PRIMARY KEY COMMENT "老师工号",
    teach_course CHAR(20) UNICODE NOT NULL COMMENT "教授科目"
) COMMENT "教师表";

CREATE TABLE IF NOT EXISTS student
(
    student_id CHAR(20) PRIMARY KEY COMMENT "学号",
    clazz_name varchar(20) NOT NULL COMMENT "所属班级",
    year       CHAR(4)     NOT NULL COMMENT "年届"
) COMMENT "学生表";

CREATE TABLE IF NOT EXISTS clazz
(
    name  varchar(20) PRIMARY KEY COMMENT "班级名称",
    grade varchar(4) COMMENT "年级"
) COMMENT "班级";

CREATE TABLE IF NOT EXISTS `question_bank`
(
    i                 INT AUTO_INCREMENT PRIMARY KEY COMMENT "递增索引",
    name              varchar(255) NOT NULL COMMENT "题库名称",
    relate_course     char(20) COMMENT "相关课程",
    upload_teacher_id char(20) COMMENT "上传的老师的工号",
    upload_date       timestamp COMMENT "上传日期"
) COMMENT "题库";

CREATE TABLE IF NOT EXISTS `question`
(
    i                   INT PRIMARY KEY AUTO_INCREMENT COMMENT "递增索引",
    `bank_id`           INT(255)     NOT NULL COMMENT "所属题库",
    `question_type`     varchar(20)  NOT NULL COMMENT "题目类型",
    `question_describe` varchar(255) NOT NULL COMMENT "题干",
    `answer`            varchar(255) NOT NULL COMMENT "答案",
    `question_option`   varchar(255) COMMENT "题目选项，用!@!分割"
) COMMENT "题目";

CREATE TABLE IF NOT EXISTS `paper`
(
    i                  INT AUTO_INCREMENT PRIMARY KEY COMMENT "试卷编号",
    name               VARCHAR(20)  NOT NULL COMMENT "试卷名称",
    paper_course_name  VARCHAR(255) NOT NULL COMMENT "试卷科目",
    compose_teacher_id VARCHAR(255) NOT NULL COMMENT "出题人"
) COMMENT "试卷";

CREATE TABLE IF NOT EXISTS `exam`
(
    i              INT PRIMARY KEY AUTO_INCREMENT COMMENT "考试标识",
    `exam_paper_i` INT          NOT NULL COMMENT "使用试卷",
    `exam_time`    TIMESTAMP    NOT NULL COMMENT "考试时间",
    `exam_course`  VARCHAR(255) NOT NULL COMMENT "考试课程"
) COMMENT "考试";

# 用户测试数据
INSERT INTO `user`(id, name, salt, password, email) VALUE ('721074358', '测试', 'askcifj', MD5('qweasd'), '2714871989@qq.com');
INSERT INTO role (id, role) VALUE ('7210764358', 'student');
INSERT INTO `user`(id, name, salt, password, email) VALUE ('721074338', '测试2', 'askcaxj', MD5('qweasd'), '2714871989@qq.com');
INSERT INTO role (id, role) VALUE ('7210764338', 'student');
INSERT INTO `user`(id, name, salt, password, email) VALUE ('1234567890', '老师1', 'askcaxj', MD5('qweasd'), '2714871989@qq.com');
INSERT INTO role (id, role) VALUE ('1234567890', 'teacher');
INSERT INTO student (student_id, clazz_name, year) VALUE ('7210764358', '软件3', '2021');
INSERT INTO student (student_id, clazz_name, year) VALUE ('7210764338', '软件3', '2021');
# 测试用老师
INSERT INTO teacher (teacher_id, teach_course) VALUE ('1234567890', '软件')
