package com.springbootfast.module.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springbootfast.module.system.dao.SysUserMapper;
import com.springbootfast.module.system.pojo.SysUser;
import com.springbootfast.module.system.service.SysUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper,SysUser> implements SysUserService{

}
