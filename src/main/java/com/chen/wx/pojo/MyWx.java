package com.chen.wx.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 描述:
 *
 * @author chen
 * date 2022-08-23
 */
@Component
@ConfigurationProperties(prefix ="mywx")
@Data
public class MyWx {
    private String appID;
    private String appsecret;
    private String tempateid1;
    private String tempateid2;
    private String cityid;
    private String day2;
    private String day1;
    private List<String> users;
}
