package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

import Config.DBConnection;
import Model.MonHoc;



public class MonHocDAO {
	private static Connection conn = DBConnection.getConnection();
	public ArrayList<MonHoc> getAll(){
		ArrayList<MonHoc> monHocs = new ArrayList<>();
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * from MONHOC");
			while (rs.next()) {
				MonHoc monHoc = new MonHoc();
				monHoc.setMaSoMonHoc(rs.getInt("maso_monhoc"));
				monHoc.setTenMonHoc(rs.getString("ten_monhoc"));
				monHoc.setSoTinChi(rs.getInt("sotinchi"));
				monHocs.add(monHoc);
			}
			return monHocs;
		} catch (Exception e) {
			System.out.println("Kietkkkkkkkkkkkkkkkkkkkkkkkk");
			e.getMessage();
			System.out.println("Kietkkkkkkkkkkkkkkkkkkkkkkkk");
			return null;
		}
	}
	public void delete(int maMonHoc){
		String query = "DELETE FROM MONHOC WHERE maso_monhoc = ? ;";
		try {
			PreparedStatement stmt=conn.prepareStatement(query);
			stmt.setInt(1, maMonHoc);
			int i = stmt.executeUpdate();  
			System.out.println(i+" records deleted");  
		} catch (Exception e) {
			e.getMessage();
			System.out.println(e.getMessage());
		}
	}
	public MonHoc findByID(int id) throws SQLException {
		String sql = "SELECT * FROM MonHoc WHERE maso_monhoc = ? ";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setInt(1, id);
		
		ResultSet rs =  pstm.executeQuery();
		MonHoc monHoc = new MonHoc();
		while(rs.next()) {
			monHoc.setMaSoMonHoc(id);
			monHoc.setTenMonHoc(rs.getString("ten_monhoc"));
			monHoc.setSoTinChi(rs.getInt("sotinchi"));
		}
		return monHoc;
	}
	public static void update(MonHoc monHoc) throws SQLException {
		String sql = "UPDATE MONHOC SET ten_monhoc = ? , sotinchi = ? WHERE maso_monhoc = ?";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, monHoc.getTenMonHoc());
		pstm.setInt(2, monHoc.getSoTinChi());
		pstm.setInt(3, monHoc.getMaSoMonHoc());
		pstm.executeUpdate();
		
	}
public static void add(MonHoc monHoc) throws SQLException {
		
		String sql = "INSERT INTO MONHOC(ten_monhoc,sotinchi) VALUES(?,?)";
		PreparedStatement pstm = conn.prepareStatement(sql);
		pstm.setString(1, monHoc.getTenMonHoc());
		pstm.setInt(2, monHoc.getSoTinChi());
		pstm.executeUpdate();
	
	}
}
