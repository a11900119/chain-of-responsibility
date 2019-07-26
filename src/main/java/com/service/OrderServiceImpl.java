package com.service;

import com.pipeline.core.impl.BusinessProcessorSet;
import com.pipeline.core.impl.ValidatorSet;
import com.pipeline.entity.FlowResult;
import com.pipeline.entity.PipeLineContext;

import java.util.Map;

public class OrderServiceImpl {

    StockValidator stockValidator;

    AddOrderProcessor addOrderProcessor;

    UpdateStockProcessor updateStockProcessor;

    public Object addOrder(Map responseMap, String orderVo){
        //context作为下单管道中的上下文参数传递
        PipeLineContext context = new PipeLineContext();
        context.put("responseMap", responseMap);
        //初始化验证集合
        ValidatorSet validatorSet = new ValidatorSet();
        //添加验证器
        validatorSet.addValidator(stockValidator);

        BusinessProcessorSet businessProcessorSet = new BusinessProcessorSet();
        businessProcessorSet.addBusinessProcessor(updateStockProcessor);
        businessProcessorSet.addBusinessProcessor(addOrderProcessor);
        //执行下单的验证逻辑，按照添加验证器的顺序进行验证
        FlowResult flowResult = validatorSet.validate(context, orderVo);
        //判断验证结果，isStatus为false，验证失败，返回失败信息，isStatus为true，验证成功，接着往下走
        if (!flowResult.isStatus()) {
            throw new RuntimeException(flowResult.getMessage().toString());
        }
        return null;
    }
}
