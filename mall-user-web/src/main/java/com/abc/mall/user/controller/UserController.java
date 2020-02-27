package com.abc.mall.user.controller;

import com.abc.mall.bean.UmsMember;
import com.abc.mall.bean.UmsMemberReceiveAddress;
import com.abc.mall.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UserController {
    //这里Autowired用dubbo的Reference替换
    @Reference
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public  String index(){
        return  "hello";
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public  List<UmsMember>  getAllUser(){
      List<UmsMember>  umsMembers= userService.getAllUser();
        return  umsMembers;
    }

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public  List<UmsMemberReceiveAddress>  getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress>  umsMemberReceiveAddresses= userService.getReceiveAddressByMemberId(memberId);
        return  umsMemberReceiveAddresses;
    }
}
