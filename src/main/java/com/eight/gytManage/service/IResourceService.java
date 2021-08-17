package com.eight.gytManage.service;

import com.eight.gytManage.page.Page;
import com.eight.gytManage.pojo.Tb_natmeha_signal_source;

import java.util.HashMap;
import java.util.List;

/**
 * @Author Kele-Bing
 * @Create 2021/8/16 11:15
 * @Version 1.0
 */
public interface IResourceService {
    List<Tb_natmeha_signal_source> querySignalSourceList();

    Page<Tb_natmeha_signal_source> querySignalSourcePage(int currentNum, int singlePageSize, String param);

    int deleteSignalSourcePage(Tb_natmeha_signal_source source);

    int updateSignalSourcePage(Tb_natmeha_signal_source source);
}
