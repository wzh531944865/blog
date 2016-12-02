package com.blog.controller;
import com.blog.response.Response;
import com.blog.response.RspCodeMsg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zhonghao.wang on 2016/12/1.
 */
@RequestMapping(value = "test")
@Controller
public class testController {
    @ResponseBody
    @RequestMapping(value = "/test")
    public Response batchUpdate() {
        System.out.println(11111);
        return new Response(RspCodeMsg.SUCCESS);
    }
}
