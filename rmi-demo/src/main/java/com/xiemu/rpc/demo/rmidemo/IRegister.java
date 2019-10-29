package com.xiemu.rpc.demo.rmidemo;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @ProjectName: ConcurrentJarDemo
 * @Package: com.xiemu.rpc.demo.rmidemo
 * @ClassName: IRegister
 * @Author: taozhaoyang
 * @Description:
 * @Date: 2019-10-29 10:15
 * @Version: 1.0
 */
public interface IRegister extends Remote {


    String helloworld(String name ) throws RemoteException;
}
