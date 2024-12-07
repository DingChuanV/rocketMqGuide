package com.uin.rocketmq.datamodel;

import java.io.Serializable;
import lombok.Data;

/**
 * 行情条目 generate with jinja2
 */
@Data
public class MdEntry implements Serializable {

  /**
   * 数量
   */
  private Long size;

  /**
   * 价格
   */
  private java.math.BigDecimal price;

  /**
   * 对手方编码
   */
  private String provider;


  private String settleDate;


  private String quoteId;

}
