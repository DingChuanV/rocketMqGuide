package com.uin.rocketmq.guide;

import lombok.Data;

@Data
public class Event {

  //消息id
  private Long messageId;
  //时间名称
  private String eventName;
  //消息来源
  private String serviceFrom;
  //消息载荷
  private Object payload;
}
