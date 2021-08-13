package com.eight.gytManage.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author Kele-Bing
 * @Create 2021-08-12 17:08:12
 * @Version 1.0
 * 
 * cookie和session工具类
*/
@Component
public class CookieUtils {

    @Autowired
    private static HttpServletRequest request;

    /**
     * 创建一个cookie，如果maxAge为-2 则关闭当前会话结束改cookie
     */
    public static Cookie createSingleCookie(String name, String value, int maxAge, String path) {
        Cookie cookie = new Cookie(name, value);
        if (maxAge != -2) {
            cookie.setMaxAge(maxAge);
        }
        if (path == null) {
            cookie.setPath("/");
        } else {
            cookie.setPath(path);
        }
        return cookie;
    }


    public static Cookie getCookie(String cookieKey) {
        Cookie[] cookies = request.getCookies();
        if (cookieKey == null || cookies == null || cookies.length == 0) {
            return null;
        }
        for (Cookie cookie : cookies) {
            if (cookieKey.equals(cookie.getName())) {
                return cookie;
            }
        }
        return null;
    }

    public static void deleteCookie(HttpServletResponse response, Cookie cookie) {
        if(cookie != null){
            cookie.setMaxAge(0);//表示马上删除，不需要等待浏览器关闭
            cookie.setPath("/");
            response.addCookie(cookie);
        }
    }

    public static Object getSessionValue(String sessionKey){
        return request.getSession().getAttribute(sessionKey);
    }
}
