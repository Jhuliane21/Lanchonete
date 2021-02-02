import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
	public void gravar(Lanche lanche) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = ConnectionLanchoneteFactory.getConnection();
			String sql = "insert into cliente () values (?, ?, ?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setDouble(1, cliente.getID());

			ps.executeUpdate();
			conn.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	public List<Cliente> listar() {
		List<Cliente> clientes = new ArrayList<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = ConnectionLanchoneteFactory.getConnection();
			String sql = "select * from cliente";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Cliente cliente = new Cliente();
				
				cliente.setId(rs.getFloat(1));
				
				clientes.add(cliente);
			}
			
			conn.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}
		return clientes;
	}
	
	public void apagar(Cliente cliente) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = ConnectionLanchoneteFactory.getConnection();
			String sql = "delete from cliente where id = (?)";
			ps = conn.prepareStatement(sql);
			ps.setDouble(1, cliente.getID());
			ps.executeUpdate();
			
			conn.close();
	      } catch (Exception e) {
	          e.printStackTrace(System.out);
	      }
	}
	
}

