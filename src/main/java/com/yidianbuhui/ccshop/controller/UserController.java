package com.yidianbuhui.ccshop.controller;

import com.yidianbuhui.ccshop.common.RespBean;
import com.yidianbuhui.ccshop.entity.User;
import com.yidianbuhui.ccshop.service.UserService;
import com.yidianbuhui.ccshop.utils.JWTUtil;
import com.yidianbuhui.ccshop.utils.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * RestController:返回的数据都是json格式
 */
@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public ResponseData login(@RequestBody User user, HttpServletRequest request){//请求中传递json格式的对象，转为java中的对象
        User loginUser = userService.login(user);
        ResponseData responseData = ResponseData.ok();
        if(loginUser!=null) {
            //生成token
            String token = JWTUtil.generToken("1", "Jersey-Security-Basic", loginUser.getId().toString());
            //向浏览器返回token，客户端受到此token后存入cookie中，或者h5的本地存储中
            responseData.putDataValue("token", token);
            //以及用户
            responseData.putDataValue("user", loginUser);
            HttpSession session = request.getSession();
            session.setAttribute("loginUser",loginUser);
//			session.setAttribute("cart",cartService.getCartListByUserId(loginUser.getId()));
        }else {
            //用户或者密码错误
            responseData=ResponseData.customerError();
        }
        return responseData;
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public User getUser(@RequestParam Integer id){
        return userService.getUser(id);
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public RespBean saveUser(@RequestBody User user){
        int result =0;
        if (user.getId()==null){
            result = userService.addUser(user);
        }else {
            result = userService.updateUser(user);
        }
        if (result > 0){
            return new RespBean("success","操作成功");
        }
        return new RespBean("error","操作失败");
    }

}

