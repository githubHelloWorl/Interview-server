package com.project.demo.utils;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.project.demo.entity.Interview;

import java.util.Map;

public class RemoteExecute {
    public static String insertFile(Interview interview){
        System.out.println("远程代码沙箱 - 写文件");
        String url = "http://localhost:8083/ES/insertFile";
        String json = JSONUtil.toJsonStr(interview);
        String responseStr = HttpUtil.createPost(url)
                .body(json)
                .execute()
                .body();
//        if (StringUtils.isBlank(responseStr)) {
//            throw new BusinessException(ErrorCode.API_REQUEST_ERROR, "executeCode remoteSandbox error, message = " + responseStr);
//        }
        System.out.println(responseStr);

        return responseStr;
    }

    public static Map<String, Object> getFile(String content){
        System.out.println("远程代码沙箱 - 检索数据");
        String url = "http://localhost:8083/ES/getFile?content=" + content;
        String responseStr = HttpUtil.createGet(url)
                .execute()
                .body();

        System.out.println(responseStr);

        Map<String, Object> ans = JSONUtil.parseObj(responseStr);
//        System.out.println("检索到的结果:");
//        System.out.println(ans);

        return ans;
    }

    public static Map<String, Object> getFileAll(){
        System.out.println("远程代码沙箱 - 检索数据");
        String url = "http://localhost:8083/ES/getFileAll";
        String responseStr = HttpUtil.createGet(url)
                .execute()
                .body();
        System.out.println(responseStr);

        Map<String, Object> ans = JSONUtil.parseObj(responseStr);
//        System.out.println("检索到的结果:");
//        System.out.println(ans);

        return ans;
    }
}
