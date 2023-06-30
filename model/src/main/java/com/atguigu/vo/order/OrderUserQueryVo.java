package com.atguigu.vo.order;

import com.atguigu.enums.OrderStatus;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class OrderUserQueryVo {

	private Long userId;

	@ApiModelProperty(value = "订单状态")
	private OrderStatus orderStatus;

}

