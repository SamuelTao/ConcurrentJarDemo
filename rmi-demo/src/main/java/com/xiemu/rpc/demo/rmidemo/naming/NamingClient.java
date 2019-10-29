package com.xiemu.rpc.demo.rmidemo.naming;

import com.xiemu.rpc.demo.rmidemo.IRegister;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class NamingClient {
    public static void main(String[] args) {
        try {
            String remoteAddr="rmi://localhost:1100/HelloNaming";
            IRegister hello = (IRegister) Naming.lookup(remoteAddr);
            String response = hello.helloworld("xiemu");
            System.out.println("=======> " + response + " <=======");
        } catch (NotBoundException | RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
