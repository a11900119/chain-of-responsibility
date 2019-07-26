package com.pipeline.core.impl;


import com.pipeline.Validator;
import com.pipeline.entity.FlowResult;
import com.pipeline.entity.PipeLineContext;

public class ValidatorSet<T> extends NormalPipeLine<T> {

    public void addValidator(Validator validator) {
        super.append(validator);
    }

    public FlowResult validate(PipeLineContext pipeLineContext, T data) {
        return super.startFlow(pipeLineContext, data);
    }
}
