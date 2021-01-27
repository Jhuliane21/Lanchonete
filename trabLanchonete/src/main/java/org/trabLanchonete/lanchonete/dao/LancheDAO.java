package org.trabLanchonete.lanchonete.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.trabLanchonete.lanchonete.model.Lanche;
import org.trabLanchonete.lanchonete.util.ConnectionLanchoneteFactory;

public class LancheDAO {
	
	public void gravar(Lanche lanche) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = ConnectionLanchoneteFactory.getConnection();
			String sql = "insert into lanche () values (?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setDouble(1, lanche.getNumero());

			ps.executeUpdate();
			conn.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	
	public List<Lanche> listar() {
		List<Lanche> lanches = new ArrayList<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = ConnectionLanchoneteFactory.getConnection();
			String sql = "select * from lanche";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Lanche lanche = new Lanche();
				
				lanche.setNumero(rs.getFloat(1));
				
				lanches.add(lanche);
			}
			
			conn.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}
		return lanches;
	}
	
	public void apagar(Lanche lanche) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = ConnectionLanchoneteFactory.getConnection();
			String sql = "delete from lanche where numero = (?)";
			ps = conn.prepareStatement(sql);
			ps.setDouble(1, lanche.getNumero());
			ps.executeUpdate();
			
			conn.close();
	      } catch (Exception e) {
	          e.printStackTrace(System.out);
	      }
	}
	
}
