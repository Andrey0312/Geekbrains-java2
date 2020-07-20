package ru.geekbrains.net;

import java.net.Socket;

public interface MessageSocketThreadListener {

    void onClientTimeout(Throwable throwable);

    //  void onSocketStarted();
//  void onSocketClosed();
    void onMessageReceived(String msg);

    void onClientConnected();

    void onSocketAccepted(Socket socket);

    void onException(Throwable throwable);
}
