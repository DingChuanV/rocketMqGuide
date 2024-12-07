package com.uin.rocketmq.datamodel;

import com.uin.rocketmq.guide.BaseMqMessage;
import java.io.Serializable;
import lombok.Data;

/**
 * Tick行情数据 generate with jinja2
 */
@Data
public class MarketData extends BaseMqMessage implements Serializable {

  /**
   * 合约代码
   */
  private String code;

  /**
   * 行情数据源
   */
  private String dataSource;

  /**
   * 交易类型
   */
  private String tradingType;

  /**
   * 交易买卖方向
   */
  private String tradeDirection;

  /**
   * 行情类型
   */
  private String fieldGroup;

  /**
   * ask行情条目列表
   */
  private java.util.List<MdEntry> askEntryList;

  /**
   * bid行情条目列表
   */
  private java.util.List<MdEntry> bidEntryList;

  /**
   * 最新成交价格
   */
  private java.math.BigDecimal lastPx;

  /**
   * 最新成交数量
   */
  private Integer lastSize;

  /**
   * 成交额
   */
  private java.math.BigDecimal amount;

  /**
   * 成交量
   */
  private java.math.BigDecimal volume;

  /**
   * 开盘价
   */
  private java.math.BigDecimal openPx;

  /**
   * 最高价
   */
  private java.math.BigDecimal highPx;

  /**
   * 最低价
   */
  private java.math.BigDecimal lowPx;

  /**
   * 收盘价
   */
  private java.math.BigDecimal closePx;

  /**
   * 结算价
   */
  private java.math.BigDecimal settlePx;

  /**
   * 昨收盘价
   */
  private java.math.BigDecimal preClosePx;

  /**
   * 昨结算价
   */
  private java.math.BigDecimal preSettlePx;

  /**
   * 涨停板
   */
  private java.math.BigDecimal highLimit;

  /**
   * 跌停板
   */
  private java.math.BigDecimal lowLimit;

  /**
   * 持仓量
   */
  private java.math.BigDecimal position;

  /**
   * 涨跌
   */
  private java.math.BigDecimal upDown;

  /**
   * 涨跌幅度
   */
  private java.math.BigDecimal upDownRate;

  /**
   * 成交重量
   */
  private java.math.BigDecimal weight;

  /**
   * 均价
   */
  private java.math.BigDecimal average;

  /**
   * 行情来源
   */
  private String sourceFrom;

  /**
   * 行情日期
   */
  private String quoteDate;

  /**
   * 行情时间
   */
  private String quoteTime;

  /**
   * 行情序号
   */
  private String sequenceNo;

  /**
   * 行情发送时间
   */
  private java.time.Instant sourceTime;

  /**
   * 行情接收时间
   */
  private java.time.Instant recvTime;

  /**
   * 是否来自模交所
   */
  private String fromMockex;

}
