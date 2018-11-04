package com.chenheping.controller;

import com.chenheping.domin.Exam;
import com.chenheping.domin.Learnrecord;
import com.chenheping.domin.Practice;
import com.chenheping.domin.Question;
import com.chenheping.service.ExamService;
import com.chenheping.service.LearnrecordService;
import com.chenheping.service.PracticeService;
import com.chenheping.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.*;

/**
 * Created by Administrator on 2018/5/4 0004.
 */
@RestController
@ResponseBody
@RequestMapping(value = "/que")
public class QuestionController {
    @Autowired
    private LearnrecordService learnrecordService;
    @Autowired
    private ExamService examService;
    @Autowired
    private QuestionService questionService;
    @Autowired
    private PracticeService practiceService;
    @RequestMapping(value = "/getques",method = RequestMethod.GET)
    public List<Question> getques(){
       List<Question> allques = questionService.selectAllQuestion();
        return allques;
    }
    @RequestMapping(value = "/tijiaojg",method = RequestMethod.POST)
    public String tijiao(@RequestBody Map<String ,Integer> jieguo, HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer student_id = (Integer) session.getAttribute("userid");
        Practice practice = new Practice(student_id,new Timestamp(new Date().getTime()),jieguo.get("score").toString()+"%",
                jieguo.get("trueques").toString(),jieguo.get("falseques").toString(),jieguo.get("number").toString());
        practiceService.insert(practice);
        return "success";
    }
    @RequestMapping(value = "/getjieguo",method = RequestMethod.GET)
    public List<Practice> getallpras(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer student_id = (Integer) session.getAttribute("userid");
        List pras = practiceService.selectAllPractice(student_id);
        return pras;
    }
    @RequestMapping(value = "/getceshiques",method = RequestMethod.GET)
    public List<Question> getceshiques(){
        List<Question> allques = questionService.selectAllQuestion();
        Random random = new Random();
        List<Question> ques = new ArrayList<Question>();
        Set<Integer> set = new TreeSet();
        int flag = 0;
        while (flag != 10){
            int index = random.nextInt(allques.size());
            if(set.add(index)){
                flag= flag+1;
                ques.add(allques.get(index));
            }
        }
        return ques;
    }
    @RequestMapping(value = "/tijiaoceshijg",method = RequestMethod.POST)
    public String ceshijg(@RequestBody Map<String,Integer> ceshijg,HttpServletRequest request){
        System.out.println(ceshijg
        );
        HttpSession session = request.getSession();
        Integer student_id = (Integer) session.getAttribute("userid");
       Exam exam = new Exam(student_id,ceshijg.get("score").toString()+"%",new Timestamp(new Date().getTime()),ceshijg.get("trueques").toString(),ceshijg.get("falseques").toString());
       examService.insert(exam);
        return "success";
    }
    @RequestMapping(value = "/getceshijieguo",method = RequestMethod.GET)
    public List<Exam> getceshi(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer student_id = (Integer) session.getAttribute("userid");
        List list = examService.selectByStuId(student_id);
        return list;
    }
    @RequestMapping(value = "/kemuer",method = RequestMethod.GET)
    public List getkeer(HttpServletRequest request){
        Integer student_id = (Integer) request.getSession().getAttribute("userid");
        List<Learnrecord> list = learnrecordService.selectAllLearnrecord();
        List ls = new ArrayList<Learnrecord>();
        for(Learnrecord l : list){
            if (l.getStudent_id() == student_id||student_id.equals(l.getStudent_id())){
                if (l.getSubject() == "科目二"||"科目二".equals(l.getSubject())){
                    ls.add(l);
                }
            }
        }
        return ls;
    }
    @RequestMapping(value = "/kemusan",method = RequestMethod.GET)
    public List getkesan(HttpServletRequest request){
        Integer student_id = (Integer) request.getSession().getAttribute("userid");
        List<Learnrecord> list = learnrecordService.selectAllLearnrecord();
        List ls = new ArrayList<Learnrecord>();
        for(Learnrecord l : list){
            if (l.getStudent_id() == student_id||student_id.equals(l.getStudent_id())){
                if (l.getSubject() == "科目三"||"科目三".equals(l.getSubject())){
                    ls.add(l);
                }
            }
        }
        return ls;
    }
}
