package com.demo.pb.protobuf.client;

/**
 * @author qlx
 * @date 2020/6/7 21:30
 */
public interface Functional<Arg, Result> {
    Result run(Arg arg);
}
