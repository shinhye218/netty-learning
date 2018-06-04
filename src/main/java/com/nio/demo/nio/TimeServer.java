package com.nio.demo.nio;

import java.io.IOException;

/**
 * Created by BoA on 2018/5/30.
 */
public class TimeServer {

    public static void main(String[] args) throws IOException {
        int port = 8080;
        if (args != null && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {

            }
        }

        MultiplexerTimeServer multiplexerTimeServer =  new MultiplexerTimeServer(port);
        new Thread(multiplexerTimeServer, "NIO-MultiplexerTimeServer-001").start();
    }

}
