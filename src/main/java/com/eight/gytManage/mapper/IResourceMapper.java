package com.eight.gytManage.mapper;

import com.eight.gytManage.page.Page;
import com.eight.gytManage.pojo.Resource;
import com.eight.gytManage.pojo.Tb_natmeha_signal_source;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Kele-Bing
 * @Create 2021/8/16 11:15
 * @Version 1.0
 */
@Mapper
@Repository
public interface IResourceMapper {

    List<Tb_natmeha_signal_source> querySignalSourceList();

    Tb_natmeha_signal_source querySignalSourceByID(Resource resource);

    List<Tb_natmeha_signal_source> querySignalSourcePage(@Param("signalSourcePage") Page<Tb_natmeha_signal_source> signalSourcePage,@Param("param") String param);

    int deleteSignalSourcePage(Tb_natmeha_signal_source source);

    int updateSignalSourcePage(Tb_natmeha_signal_source source);
}
