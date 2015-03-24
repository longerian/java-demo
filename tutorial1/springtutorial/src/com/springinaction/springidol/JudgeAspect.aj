package com.springinaction.springidol;

/**
 * Created by huifeng.hxl on 2014/7/29.
 */
public aspect JudgeAspect {

        public JudgeAspect() {}

        pointcut performance(): execution(* perform(..));

        after() returning() : performance() {
            System.out.println(criticismEngine.getCriticism());
        }

        private CriticismEngine criticismEngine;
        public void setCriticismEngine(CriticismEngine criticismEngine) {
            this.criticismEngine = criticismEngine;
        }


}
