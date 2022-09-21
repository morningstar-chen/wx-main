package com.chen.wx.task;

import com.alibaba.fastjson.JSON;
import com.chen.wx.pojo.AccessToken;
import com.chen.wx.pojo.Content;
import com.chen.wx.pojo.MyWx;
import com.chen.wx.pojo.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * 描述:
 *
 * @author chen
 * date 2022-08-23
 */
@Component
public class GetData {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    MyWx wx;
    /**
     * 得到令牌
     * @return
     */
    public String getToken(){
        String url="https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+wx.getAppID()+"&secret="+wx.getAppsecret();
        AccessToken accessToken = restTemplate.getForObject(url, AccessToken.class);
        System.out.println(accessToken);
        return accessToken.getAccess_token();
    }
    /**
     * 每日一句
     */
    public Content everydaySentence(){
        String url = "http://open.iciba.com/dsapi/";
        String forObject = restTemplate.getForObject(url, String.class);
        Content content = JSON.parseObject(forObject, Content.class);
        System.out.println(content);
        return content;
    }

    /**
     * 天气详情
     */
    public Weather weather(){
        String url="https://v0.yiketianqi.com/api?unescape=1&version=v61&appid=96411894&appsecret=sZ5760Iy&cityid="+wx.getCityid();
        String forObject = restTemplate.getForObject(url, String.class);
        Weather weather = JSON.parseObject(forObject, Weather.class);
        System.out.println(weather);
        return weather;
    }
}
