package com.pipeline.core.impl;


import com.pipeline.BusinessProcessor;
import com.pipeline.entity.FlowResult;
import com.pipeline.entity.PipeLineContext;

public class BusinessProcessorSet<T> extends NormalPipeLine<T> {


    public void addBusinessProcessor(BusinessProcessor businessProcessor) {
        super.append(businessProcessor);
    }

    public FlowResult process(PipeLineContext pipeLineContext, T data) {
        return super.startFlow(pipeLineContext, data);
    }
}
