package com.project.demo.controller;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.project.demo.controller.base.BaseController;
import com.project.demo.entity.Interview;
import com.project.demo.entity.Slides;
import com.project.demo.service.SlidesService;
import com.project.demo.utils.RemoteExecute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 轮播图：(Slides)表控制层
 */
@RestController
@RequestMapping("/ES")
public class ESController extends BaseController<Slides, SlidesService> {
    /**
     * 服务对象
     */
    @Autowired
    public ESController(SlidesService service) {
        setService(service);
    }

    /**
     * 加入文件
     *
     * @return
     */
    @PostMapping("/insertFile")
    public Map<String, Object> signUp(HttpServletRequest request) throws IOException {
        // 查询用户
        Map<String, String> query = new HashMap<>();
        Map<String, Object> map = service.readBody(request.getReader());
        query.put("userId", String.valueOf(map.get("userId")));
        query.put("title", String.valueOf(map.get("title")));
        query.put("createBy", String.valueOf(map.get("createBy")));
        query.put("position", String.valueOf(map.get("position")));
        query.put("content", String.valueOf(map.get("content")));
        query.put("company", String.valueOf(map.get("company")));

        Interview interview = new Interview();
        interview.setUserId(Integer.parseInt(String.valueOf(map.get("userId"))));
        interview.setTitle(String.valueOf(map.get("title")));
        interview.setCreateBy(String.valueOf(map.get("createBy")));
        interview.setPosition(String.valueOf(map.get("position")));
        interview.setCompany(String.valueOf(map.get("company")));
        interview.setContent(String.valueOf(map.get("content")));

        RemoteExecute.insertFile(interview);

        return success(1);
    }

    @GetMapping("/getFile")
    public Map<String, Object> getFile(@RequestParam("content") String content){

        return RemoteExecute.getFile(content);
    }

    @GetMapping("/getFileAll")
    public Map<String, Object> getFileAll(){

        return RemoteExecute.getFileAll();
    }

}


