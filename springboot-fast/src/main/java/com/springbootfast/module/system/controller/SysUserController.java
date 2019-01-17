package com.springbootfast.module.system.controller;

import com.springbootfast.module.system.pojo.SysUser;
import com.springbootfast.module.system.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value="sysUser")
public class SysUserController{

    @Autowired private SysUserService sysUserService;

    @ResponseBody
    @RequestMapping("getAllSysUser")
    public Object getAllUser(HttpServletRequest request){
        List<SysUser> list = sysUserService.list();
        return list;
    }
}
