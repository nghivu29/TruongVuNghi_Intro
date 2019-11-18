package Lab8;

import java.util.ArrayList;
import java.util.List;

public class QuanLiHocVien {
    String tenHocVien;
    static List<hocVien> listHocVien = new ArrayList<>();

    void addStudent(hocVien hocVien){
        listHocVien.add(hocVien);
    }

    static Object checkStudent(String name){
        hocVien toReturn = null;

        for (hocVien i: listHocVien){
            if (i.getName() == name)
                toReturn = i;
        }
        return toReturn;
    }

    void showListStudent(){// viết như vậy để đễ dàng chỉnh sử khi cần in thêm thuộc tính khác
        int count = 1;
        for (hocVien i: listHocVien){
            System.out.println(count +". "+ i.getName());
            count++;
        }
    }
}
