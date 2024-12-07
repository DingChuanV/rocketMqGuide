package com.uin.rocketmq.guide.exception;


import com.uin.rocketmq.guide.mq.MqExceptionTypeEnum;

public class MqException extends RuntimeException {

  private MqExceptionTypeEnum type;

  public MqException(String message, MqExceptionTypeEnum type) {
    super(message);
    this.type = type;
  }

  public MqException(String message, MqExceptionTypeEnum type, Throwable cause) {
    super(message, cause);
    this.type = type;
  }
}
