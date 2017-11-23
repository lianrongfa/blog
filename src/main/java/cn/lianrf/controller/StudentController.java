package cn.lianrf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lianrongfa on 2017/11/16.
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/test")
    public List<String> test() {
        System.out.println("test~~");
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        return list;
    }
}
