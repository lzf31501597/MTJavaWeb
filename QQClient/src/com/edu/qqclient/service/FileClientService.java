package com.edu.qqclient.service;

import com.edu.qqcommon.Message;
import com.edu.qqcommon.MessageType;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * @author
 * @version 1.0
 * @date 2023/11/09 11:42
 * @Description 该类/对象完成 文件传输服务
 */
public class FileClientService {

    //离线发文件

    //单独发文件
    public void sendFileToOne(String src, String dest, String senderId, String getterId){
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_FILE_MES);//设置传输文件的状态
        message.setSender(senderId);
        message.setGetter(getterId);
        message.setDest(dest);
        message.setSrc(src);
        message.setSentTime(new Date().toString());//设置发送时间到message对象


        FileInputStream fileInputStream = null;
        byte[] fileBytes = new byte[src.length()];
        //读取文件流

        try {
            fileInputStream = new FileInputStream(src);
            fileInputStream.read(fileBytes);//将src文件读入到文件输入流的字节数组中
            //将文件对应的字节数组设置到  message对象中
            message.setFileBytes(fileBytes);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        //发送
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(senderId).getSocket().getOutputStream());
            objectOutputStream.writeObject(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(message.getSentTime()+": "+senderId + " 给：" +getterId+ "传文件"+src+",到对方的目标目录下："+dest);

    }
}
