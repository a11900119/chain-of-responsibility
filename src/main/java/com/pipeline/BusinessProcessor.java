package com.pipeline;


import com.pipeline.entity.FlowResult;
import com.pipeline.entity.PipeLineContext;

public interface BusinessProcessor<T> extends NormalValve<T> {

    FlowResult valve(PipeLineContext context, T data);

}
