package com.lakshya.algo.network.server;
import com.lakshya.algo.network.common.*;
public interface RequestHandlerInterface
{
public Response process(Request request) throws Exception;
}