package com.pancm.netty.client;
 
import com.alibaba.fastjson.JSON;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.HttpContent;
import io.netty.handler.codec.http.HttpResponse;
 
public class HttpClientInboundHandler extends ChannelInboundHandlerAdapter {
 
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (msg instanceof HttpResponse) 
        {
            HttpResponse response = (HttpResponse) msg;
//           s System.out.println("CONTENT_TYPE:" + response.headers().get(HttpHeaders.Names.CONTENT_TYPE));
            System.out.println(JSON.toJSON(response));
            
        }
        if(msg instanceof HttpContent)
        {
//            HttpContent content = (HttpContent)msg;
//            ByteBuf buf = content.content();
//            System.out.println(buf.toString(Charset.forName("GBK")));
//            buf.release();
        }
    }
}