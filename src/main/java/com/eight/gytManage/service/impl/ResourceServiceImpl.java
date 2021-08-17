package com.eight.gytManage.service.impl;

import com.eight.gytManage.mapper.IResourceMapper;
import com.eight.gytManage.page.Page;
import com.eight.gytManage.pojo.Resource;
import com.eight.gytManage.pojo.Tb_natmeha_signal_source;
import com.eight.gytManage.service.IResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Kele-Bing
 * @Create 2021/8/16 11:15
 * @Version 1.0
 */
@Service
public class ResourceServiceImpl implements IResourceService {
    @Autowired
    private IResourceMapper resourceMapper;
    @Override
    public List<Tb_natmeha_signal_source> querySignalSourceList() {
        return resourceMapper.querySignalSourceList();
    }

    @Override
    public Page<Tb_natmeha_signal_source> querySignalSourcePage(int currentNum,int singlePageSize,String param) {
        Page<Tb_natmeha_signal_source> signalSourcePage = new Page<>(currentNum,singlePageSize);
        List<Tb_natmeha_signal_source> signalSources = resourceMapper.querySignalSourcePage(signalSourcePage, param);
        signalSourcePage.setItem(signalSources);
        signalSourcePage.setTotalPageCount(1);
        return signalSourcePage;
    }

    @Override
    public int deleteSignalSourcePage(Tb_natmeha_signal_source source) {
        return resourceMapper.deleteSignalSourcePage(source);
    }

    @Override
    public int updateSignalSourcePage(Tb_natmeha_signal_source source) {
        return resourceMapper.updateSignalSourcePage(source);
    }
}
