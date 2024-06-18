package modelmain;

import java.util.ArrayList;
import java.util.List;

import model.BanhXe;
import model.DongCo;

public class QuanLySanPham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DongCo dongCo1 = new DongCo("DongCo1", 150.0);
        DongCo dongCo2 = new DongCo("DongCo2", 200.0);
        DongCo dongCo3 = new DongCo("DongCo3", 250.0);
        DongCo dongCo4 = new DongCo("DongCo4", 300.0);
        DongCo dongCo5 = new DongCo("DongCo5", 350.0);

        List<BanhXe> banhXeList1 = new ArrayList<>();
        banhXeList1.add(new BanhXe("BanhXe1", 18.0));
        banhXeList1.add(new BanhXe("BanhXe2", 18.0));
	}

}
