import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class IngredienteDAO {
	public void gravar(Ingrediente ingrediente) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = ConnectionLanchoneteFactory.getConnection();
			String sql = "insert into ingrediente () values (?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setDouble(1, ingrediente.getCodigoIngrediente());

			ps.executeUpdate();
			conn.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
	public List<Ingrediente> listar() {
		List<Ingrediente> ingredientes = new ArrayList<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = ConnectionLanchoneteFactory.getConnection();
			String sql = "select * from ingrediente";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Ingrediente ingrediente = new Ingrediente();
				
				ingrediente.setCodigoIngrediente(rs.getFloat(1));
				
				ingredientes.add(ingrediente);
			}
			
			conn.close();
		} catch (Exception e) {
			throw new RuntimeException();
		}
		return ingredientes;
	}
	
	public void apagar(Ingrediente ingrediente) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = ConnectionLanchoneteFactory.getConnection();
			String sql = "delete from ingrediente where codigo = (?)";
			ps = conn.prepareStatement(sql);
			ps.setDouble(1, ingrediente.getCodigoIngrediente());
			ps.executeUpdate();
			
			conn.close();
	      } catch (Exception e) {
	          e.printStackTrace(System.out);
	      }
	}
}
