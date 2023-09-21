package com.homura.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zouhl
 */

@Component
public class Beta {

    public Beta(Sigma sigma) {
        this.sigma = sigma;
    }

    // @Autowired
    private Sigma sigma;

    public void invokeSigmaMethod() {
        sigma.doSomething();
    }

    @Autowired
    public void setSigma(Sigma sigma) {
        this.sigma = sigma;
    }
}
