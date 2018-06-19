package com.luas.tms.action.teacher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.luas.tms.helper.DbHelper;

public class OperationDB {
       private Connection con = null;
    public void addRcorder(InfoBean infoBean) throws SQLException{
        if(con ==null){
             con = DbHelper.getConncetion();
        }
       
       String sql = "insert into luru values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
     
           PreparedStatement pstmt = con.prepareStatement(sql);
           pstmt.setInt(1, infoBean.getZkId());
           pstmt.setString(2, infoBean.getSyxx());
           pstmt.setString(3, infoBean.getMath());
           pstmt.setString(4, infoBean.getPoet());
           pstmt.setString(5, infoBean.getEnglish());
           pstmt.setString(6,infoBean.getPhy());
           pstmt.setString(7, infoBean.getKms());
           pstmt.setString(8, infoBean.getSpo());
           pstmt.setDouble(9, infoBean.getScore());
           pstmt.setString(10, infoBean.getPhys());
           pstmt.setString(11, infoBean.getHos());
           pstmt.setString(12, infoBean.getBoil());
           pstmt.setString(13, infoBean.getScocial());
           
           pstmt.executeUpdate();   
    }
}