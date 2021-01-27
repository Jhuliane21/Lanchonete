package org.trabLanchonete.lanchonete.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.trabLanchonete.lanchonete.model.Pedido;
import org.trabLanchonete.lanchonete.util.ConnectionLanchoneteFactory;

public class PedidoDAO {

	public static void gravar(Pedido pedido) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = ConnectionLanchoneteFactory.getConnection();
			String sql = "insert into pedido () values (?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, pedido.getCliente().getTelefoneCliente());

			ps.executeUpdate();
			conn.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	
	public List<Pedido> listar() {
		List<Pedido> pedidos = new ArrayList<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = ConnectionLanchoneteFactory.getConnection();
			String sql = "select * from pedido";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Pedido pedido = new Pedido();
				
				pedido.getCliente().setTelefoneCliente(rs.getString(1));
				
				pedidos.add(pedido);
			}
			
			conn.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}
		return pedidos;
	}
}

