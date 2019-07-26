package com.pipeline.core;


import com.pipeline.NormalValve;
import com.pipeline.entity.FlowResult;
import com.pipeline.entity.PipeLineContext;

public interface PipeLine<T> {

    void append(NormalValve valve);

    FlowResult startFlow(PipeLineContext context, T data);
}
