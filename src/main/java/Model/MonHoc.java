package Model;

public class MonHoc {
	private int maSoMonHoc;
	private String tenMonHoc;
	private int soTinChi;
	
	@Override
	public String toString() {
		return "MonHoc [maSoMonHoc=" + maSoMonHoc + ", tenMonHoc=" + tenMonHoc + ", soTinChi=" + soTinChi + "]";
	}
	public int getMaSoMonHoc() {
		return maSoMonHoc;
	}
	public void setMaSoMonHoc(int maSoMonHoc) {
		this.maSoMonHoc = maSoMonHoc;
	}
	public String getTenMonHoc() {
		return tenMonHoc;
	}
	public void setTenMonHoc(String tenMonHoc) {
		this.tenMonHoc = tenMonHoc;
	}
	public int getSoTinChi() {
		return soTinChi;
	}
	public void setSoTinChi(int soTinChi) {
		this.soTinChi = soTinChi;
	}
	public MonHoc(int maSoMonHoc, String tenMonHoc, int soTinChi) {
		this.maSoMonHoc = maSoMonHoc;
		this.tenMonHoc = tenMonHoc;
		this.soTinChi = soTinChi;
	}
	public MonHoc() {
		
	}
}
