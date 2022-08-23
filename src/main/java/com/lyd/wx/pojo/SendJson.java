package com.lyd.wx.pojo;

import lombok.Data;

/**
 * 描述:
 *
 * @author chen
 * date 2022-08-23
 */
@Data
public class SendJson {
    private String touser;
    private String template_id;
    private String topcolor;
    private SendData data;
}
