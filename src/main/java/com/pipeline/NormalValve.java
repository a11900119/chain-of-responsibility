package com.pipeline;


import com.pipeline.entity.FlowResult;
import com.pipeline.entity.PipeLineContext;

public interface NormalValve<T> {

    FlowResult valve(PipeLineContext context, T data);
}
