package model;

import java.util.ArrayList;
import java.util.List;

public class XeHoi extends SanPham  {
	private DongCo dongco;
	private List<BanhXe> dsbx ;
	public XeHoi(int maSanPham, String tenSanPham, int soLuong, double giaCa, DongCo dongco, ArrayList<BanhXe> dsbx) {
		super(maSanPham, tenSanPham, soLuong, giaCa);
		this.dongco = dongco;
		this.dsbx = dsbx;
	}
	
	
	public XeHoi(int maSanPham, String tenSanPham, int soLuong, double giaCa, DongCo dongco) throws CloneNotSupportedException {
		super(maSanPham, tenSanPham, soLuong, giaCa);
		this.dongco = (DongCo)dongco.clone();
		this.dsbx = new ArrayList<BanhXe>();
	}
	
	public void addBanhXe(BanhXe bx) throws CloneNotSupportedException {
		BanhXe tam = (BanhXe)bx.clone();
		this.dsbx.add(tam);
	}
	


	public DongCo getDongco() {
		return dongco;
	}
	public void setDongco(DongCo dongco) {
		this.dongco = dongco;
	}
	public ArrayList<BanhXe> getDsbx() {
		return (ArrayList<BanhXe>) dsbx;
	}
	public void setDsbx(ArrayList<BanhXe> dsbx) {
		this.dsbx = dsbx;
	}
	@Override
	public String toString() {
		return "XeHoi [dongco=" + dongco + ", dsbx=" + dsbx + "]";
	}
	
}
