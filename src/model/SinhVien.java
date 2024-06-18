package model;

public class SinhVien {
	private String hoTen;
	private LopHoc lophoc;
	public SinhVien(String hoTen, LopHoc lophoc) {
		super();
		this.hoTen = hoTen;
		this.lophoc = lophoc;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public LopHoc getLophoc() {
		return lophoc;
	}
	public void setLophoc(LopHoc lophoc) {
		this.lophoc = lophoc;
	}
	@Override
	public String toString() {
		return "SinhVien [hoTen=" + hoTen + ", lophoc=" + lophoc + "]";
	}
	
}
