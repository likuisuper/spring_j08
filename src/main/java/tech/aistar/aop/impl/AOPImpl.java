package tech.aistar.aop.impl;

import tech.aistar.aop.IAOP;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/28 9:57
 */
public class AOPImpl implements IAOP {
    @Override
    public void add(int i, int j) {
        System.out.println("add:"+(i+j));//核心的
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("sub:"+(i-j));//核心的
        return i-j;
    }
}
