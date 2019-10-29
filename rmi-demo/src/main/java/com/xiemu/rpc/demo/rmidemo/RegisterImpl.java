package com.xiemu.rpc.demo.rmidemo;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

/**
 * @ProjectName: ConcurrentJarDemo
 * @Package: com.xiemu.rpc.demo.rmidemo
 * @ClassName: RegisterImpl
 * @Author: taozhaoyang
 * @Description:
 * @Date: 2019-10-29 10:18
 * @Version: 1.0
 */
public class RegisterImpl extends UnicastRemoteObject implements IRegister {
    public RegisterImpl() throws RemoteException {
    }

    public RegisterImpl(int port) throws RemoteException {
        super(port);
    }

    public RegisterImpl(int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
        super(port, csf, ssf);
    }

    @Override
    public String helloworld(String name) throws RemoteException {
        return "hello,"+name;
    }
}
