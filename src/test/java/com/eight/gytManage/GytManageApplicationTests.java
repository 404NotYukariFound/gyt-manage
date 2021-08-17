package com.eight.gytManage;

import com.eight.dbdtobean.core.DBDToBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

@SpringBootTest
class GytManageApplicationTests {
    @Autowired
  private DBDToBean dbdToBean;
    @Test
    void contextLoads() throws SQLException, IOException {
        dbdToBean.setPackageName("com.eight.gytManage.pojo");
        dbdToBean.setAuthorName("Kele-Bing");
        dbdToBean.setFieldNameIsLower(false);
        dbdToBean.setComment(true);
        HashMap<String, String> stringStringHashMap = dbdToBean.generateAttrFromDataBase();
        dbdToBean.exportToFile(stringStringHashMap);
        dbdToBean.closeConnection();
    }

    
}
