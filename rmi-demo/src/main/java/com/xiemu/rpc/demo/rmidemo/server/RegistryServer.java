package com.xiemu.rpc.demo.rmidemo.server;

import com.xiemu.rpc.demo.rmidemo.IRegister;
import com.xiemu.rpc.demo.rmidemo.RegisterImpl;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @ProjectName: ConcurrentJarDemo
 * @Package: com.xiemu.rpc.demo.rmidemo
 * @ClassName: RegistryServer
 * @Author: taozhaoyang
 * @Description: 注册服务
 * @Date: 2019-10-29 10:14
 * @Version: 1.0
 */
public class RegistryServer {

    public static void main(String[] args) {
        try {
            // 本地主机上的远程对象注册表Registry的实例,默认端口1099
            Registry registry = LocateRegistry.createRegistry(1099);
            // 创建一个远程对象
            IRegister hello = new RegisterImpl();
            // 把远程对象注册到RMI注册服务器上，并命名为HelloRegistry
            registry.rebind("HelloRegistry", hello);
            System.out.println("======= 启动RMI服务成功! =======");
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
