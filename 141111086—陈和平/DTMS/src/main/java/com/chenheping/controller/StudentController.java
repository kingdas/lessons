package com.chenheping.controller;
import com.chenheping.domin.Student;
import com.chenheping.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
/**
 * Created by Administrator on 2018/4/9 0009.
 */
@RestController
@ResponseBody
@RequestMapping(value = "/stu")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public String stu_login(@RequestBody Map<String,String> name, HttpServletRequest request){
        HttpSession session = request.getSession(true);
        String username = name.get("username");
        String password = name.get("password");
         List<Student> stus = studentService.selectByNameAndPass(username,password);
            if (stus.size()<1){
            return null;
        }
        session.setAttribute("user",stus.get(0));
        session.setAttribute("userid",stus.get(0).getStudent_id());
        return "success";
    }
    @ResponseBody
    @RequestMapping(value = "/xinxi",method = RequestMethod.GET)
    public Student xinxi(HttpServletRequest request){
        HttpSession session = request.getSession();
        int student_id = (int) session.getAttribute("userid");
        Student s = studentService.selectByStudentId(student_id);
        return s;
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(@RequestBody Map<String, String> stud ,HttpServletRequest request) throws ParseException {
        HttpSession session = request.getSession();
        Student student = (Student) session.getAttribute("user");
        int student_id = student.getStudent_id();
        String s_password = student.getS_password();
        String s_cardid = student.getS_cardid();
        String s_age = student.getS_age();
        String s_name = stud.get("s_name");
        String s_sex = stud.get("s_sex");
        String s_phone = stud.get("s_phone");
        String s_coach = stud.get("s_coach");
        String s_time = stud.get("s_time");
        String s_result = stud.get("s_result");
        String s_address = stud.get("s_address");
        String s_d_address = stud.get("s_d_address");
        String s_statue = stud.get("s_statue");
        String s_c_type = stud.get("s_c_type");
        String s_free_statue = stud.get("s_free_statue");
        String s_discount = stud.get("s_discount");
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        format.setLenient(false);
        Timestamp ts = new Timestamp(format.parse(s_time).getTime());
        Student s = new Student(student_id, "xue"+s_phone,s_password,s_phone,s_sex,ts,s_name,
                s_result,s_coach,s_discount,s_free_statue,s_c_type,s_statue,
               s_d_address,s_address,s_cardid,s_age);
        Integer num = studentService.updateByStudentId(s);
        if (num == 1) {
            session.removeAttribute("user");
            session.setAttribute("user",s);
            return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping(value = "/getuname",method = RequestMethod.GET)
    public String getUname(HttpServletRequest request){
        Student s = (Student) request.getSession().getAttribute("user");
        return s.getS_name();
    }
    @RequestMapping(value = "/exit",method = RequestMethod.GET)
    public String exit(HttpServletRequest request){
        request.getSession().removeAttribute("user");
        request.getSession().removeAttribute("userid");
        Student s = (Student) request.getSession().getAttribute("user");
        if(s == null||"".equals(s)){
            return "success";
        }
        return "default";
    }
}
