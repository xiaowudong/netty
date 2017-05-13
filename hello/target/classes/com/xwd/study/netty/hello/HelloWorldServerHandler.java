package com.xwd.study.netty.hello;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * 
 *@describe
 *@author xiaowudong
 *@time 2017年5月8日 下午7:42:41
 */
public class HelloWorldServerHandler extends ChannelInboundHandlerAdapter {
	@Override  
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {  
        System.out.println("server channelRead..");  
        System.out.println(ctx.channel().remoteAddress()+"->Server :"+ msg.toString());  
        ctx.write("server write"+msg);  
        ctx.flush();  
    }  
      
    @Override  
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {  
        cause.printStackTrace();  
        ctx.close();  
    }  
}
