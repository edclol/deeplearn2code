package com.example.demo.controller;

import com.example.demo.dao.DLCanvasMapper;
import com.example.demo.service.DLCanvasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin
@RestController()
@RequestMapping("/dl")
public class DLCanvasController {

    @Autowired
    private DLCanvasMapper DLCanvasMapper;


    //存储画布json，方便前端恢复
    @ResponseBody
    @PostMapping("/module")
    public int module(@RequestBody String data) {
        System.out.println(data.toString());
        return DLCanvasMapper.insert(12, "daasd", data);

    }

    //返回请求的user_id的所有module_id以及module_name
    @ResponseBody
    @GetMapping("/module")
    public String module(@RequestParam(value = "user_id", defaultValue = "12") int user_id,
                         @RequestParam(value = "module_id", defaultValue = "1") int module_id) {

        return DLCanvasMapper.getModuleById(user_id, module_id);

    }

    //把module转换为格式化好的str返回
    @ResponseBody
    @PostMapping("/module2code")
    public String module2code(@RequestBody String data) {
        System.out.println(data);
        return DLCanvasService.json2StrModule(data);

    }

    //返回请求的user_id的所有module_id以及module_name
    @ResponseBody
    @GetMapping("/moduleList")
    public List<Map> moduleList(@RequestParam(value = "user_id", defaultValue = "12") int user_id) {
        System.out.println(user_id);
        return DLCanvasMapper.getModuleListByUserId(user_id);

    }


}
