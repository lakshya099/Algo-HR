package com.lakshya.algo.hr.server.main;
import com.lakshya.algo.hr.server.*;
import com.lakshya.algo.network.server.*;
import com.lakshya.algo.network.common.exceptions.*;
public class Main
{
public static void main(String gg[])
{
try 
{
RequestHandler requestHandler=new RequestHandler();
NetworkServer networkServer=new NetworkServer(requestHandler);
networkServer.start();
}catch(NetworkException networkException)
{
System.out.println(networkException);
}
}
}
