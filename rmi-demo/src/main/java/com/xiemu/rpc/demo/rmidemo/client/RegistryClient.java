package com.xiemu.rpc.demo.rmidemo.client;

import com.xiemu.rpc.demo.rmidemo.IRegister;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @ProjectName: ConcurrentJarDemo
 * @Package: com.xiemu.rpc.demo.rmidemo.client
 * @ClassName: RegistryClient
 * @Author: taozhaoyang
 * @Description:
 * @Date: 2019-10-29 10:22
 * @Version: 1.0
 */
public class RegistryClient {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(1099);
            IRegister hello = (IRegister) registry.lookup("HelloRegistry");
            String response = hello.helloworld("xiemu");
            System.out.println("=======> " + response + " <=======");
        } catch (NotBoundException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
