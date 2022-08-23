package com.lyd.wx.pojo;

import lombok.Data;

/**
 * 描述:
 *
 * @author chen
 * date 2022-08-23
 */
@Data
public class AccessToken {
    private String access_token;
    private Integer expires_in;
}
