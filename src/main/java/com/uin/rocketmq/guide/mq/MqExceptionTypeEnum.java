package com.uin.rocketmq.guide.mq;

import java.util.HashMap;
import java.util.Map;

/**
 * mq异常消息类型
 */
public enum MqExceptionTypeEnum {
  /**
   * 生产者
   */
  PRODUCER,
  /**
   * 消费者
   */
  CONSUMER,
  ;

  public static Map<MqExceptionTypeEnum, String> valueMap = new HashMap<>();

  static {
    valueMap.put(PRODUCER, "生产者");
    valueMap.put(CONSUMER, "消费者");
  }

  public static Map<MqExceptionTypeEnum, String> getValueMap() {
    return valueMap;
  }

  public static String getLabel(MqExceptionTypeEnum value) {
    return valueMap.get(value);
  }
}
