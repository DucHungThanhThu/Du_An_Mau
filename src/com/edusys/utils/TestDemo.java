/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.utils;

import com.edusys.dao.NhanVienDAO;
import com.edusys.dao.ThongKeDAO;
import com.edusys.entity.NhanVien;
import java.util.List;

/**
 *
 * @author admin
 */
public class TestDemo {

    public static void main(String[] args) {
        ThongKeDAO tkDAO = new ThongKeDAO();
        List<Object[]> list = tkDAO.getDiemChuyenDe();
        for (Object[] obj : list) {
            System.out.println("=>"+obj[0]+"-"+obj[1]+"-"+obj[2]);
        }
//        NhanVienDAO dao = new NhanVienDAO();
//        
//        List<NhanVien> ls = dao.selectAll();
//        for (NhanVien nv : ls) {
//            System.out.println("=>"+nv.toString());
//        }
    }
}
