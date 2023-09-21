package com.homura.bean;

/**
 * @author zouhl
 */
public class DepTest {
    public static void main(String[] args) {
        Sigma sigma = new Sigma();
        Beta beta = new Beta(sigma);
        // beta.setSigma(sigma);
        beta.invokeSigmaMethod();
    }
}
