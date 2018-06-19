package com.luas.tms.action.teacher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.regex.Pattern;


public class ReadFile {
    public static void readTxtFile(String filePath) {
       InfoBean infoBean=new InfoBean();
       try {
           String encoding = "GBK";
           File file = new File(filePath);
           if (file.isFile() && file.exists()){ //判断文件是否存在
               InputStreamReader read = new InputStreamReader(
                       new FileInputStream(file), encoding);//考虑到编码格式
               BufferedReader bufferedReader = new BufferedReader(read);
               String lineTxt = null;
                OperationDB operationDB=new OperationDB();
               while ((lineTxt = bufferedReader.readLine()) != null) {
                   String[] s=lineTxt.split(",");
                   Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$"); 
                   if(pattern.matcher(s[0]).matches()){
                	   infoBean.setZkId(Integer.parseInt(s[0]));
                	   infoBean.setSyxx(s[1].toString());
                       infoBean.setMath(s[2].toString());
                       infoBean.setPoet(s[3].toString());
                       infoBean.setEnglish(s[4].toString());;
                       infoBean.setPhy(s[5].toString());
                       infoBean.setKms(s[6].toString());
                       infoBean.setSpo(s[7].toString());
                       infoBean.setScore(Double.valueOf(s[8]));
                       infoBean.setPhys(s[9].toString());
                       infoBean.setHos(s[10].toString());
                       infoBean.setBoil(s[11].toString());
                       infoBean.setScocial(s[12].toString());
                       
                      
                       operationDB.addRcorder(infoBean);
                   }      
                   System.out.println(lineTxt);
                   
               }
               read.close();
           } else {
               System.out.println("找不到指定的文件");
           }
       } catch (Exception e) {
           System.out.println("读取文件内容出错");
           e.printStackTrace();
       }
    }
}