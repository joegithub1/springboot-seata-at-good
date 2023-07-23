package com.joe.good.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import com.joe.seata.common.base.BaseEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Builder;


/**
 * <p>
 * 
 * </p>
 *
 * @author huang
 * @since 2023-07-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@TableName("t_good")
@Schema(description = "Good对象")
public class Good extends BaseEntity {

private static final long serialVersionUID = 1L;

    @Schema(description = "主键")
  /**
   * 主键
   */
        @TableId(value = "id", type = IdType.AUTO)
        private Long id;

    @Schema(description = "商品名称")
  /**
   * 商品名称
   */
    @TableField("name")
    private String name;

    @Schema(description = "价格")
  /**
   * 价格
   */
    @TableField("price")
    private Double price;

    @Schema(description = "库存")
  /**
   * 库存
   */
    @TableField("stock")
    private Long stock;


}
