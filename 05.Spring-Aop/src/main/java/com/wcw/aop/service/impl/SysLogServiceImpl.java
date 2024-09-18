package com.wcw.aop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wcw.aop.domain.SysLog;
import com.wcw.aop.mapper.SysLogMapper;
import com.wcw.aop.service.SysLogService;
import org.springframework.stereotype.Service;

/**
 * @author wu
 * @create 2024/9/13 18:23
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements SysLogService {
}
