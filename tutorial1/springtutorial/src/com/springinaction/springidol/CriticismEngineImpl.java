package com.springinaction.springidol;

/**
 * Created by huifeng.hxl on 2014/7/29.
 */
public class CriticismEngineImpl implements CriticismEngine {

    private String[] criticismPool;

    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;
    }

    public CriticismEngineImpl() {}


    @Override
    public String getCriticism() {
        int i = (int) (Math.random() * criticismPool.length);
        return criticismPool[i];
    }
}
