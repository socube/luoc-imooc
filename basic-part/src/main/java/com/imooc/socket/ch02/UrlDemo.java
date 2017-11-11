package com.imooc.socket.ch02;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author luoc
 * @version V0.0.1
 * @package com.imooc.socket.ch02
 * @description: Url常用方法
 * @date 2017/11/11 16:12
 */
public class UrlDemo {

    public static void main(String[] args) throws MalformedURLException {
        //创建一个URL实例
        URL imooc = new URL("http://www.imooc.com/");
        //?后面表示参数，#后面表示锚点
        URL url = new URL(imooc, "/index.html?username=tom#test");
        System.out.println("协议：" + url.getProtocol());
        System.out.println("主机：" + url.getHost());
        //如果未指定端口号，则使用默认的端口号，此时getPort()方法返回值为-1
        System.out.println("端口：" + url.getPort());
        System.out.println("文件路径：" + url.getPath());
        System.out.println("文件名：" + url.getFile());
        System.out.println("相对路径：" + url.getRef());
        System.out.println("查询字符串：" + url.getQuery());
    }
}
