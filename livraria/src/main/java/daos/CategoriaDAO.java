package daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dtos.CategoriaDTO;

public class CategoriaDAO extends BaseDAO {

	public CategoriaDAO() throws ClassNotFoundException, SQLException {
		super();
	}
	
	public ArrayList<CategoriaDTO> getCategorias() throws SQLException {
		ArrayList<CategoriaDTO> Categorias = new ArrayList<CategoriaDTO>();
		
		PreparedStatement pst = conn.prepareStatement("SELECT * FROM tbCategorias");
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()) {
			CategoriaDTO Categoria = new CategoriaDTO();
			Categoria.setCategoria(rs.getString(1));
			
			Categorias.add(Categoria);
		}
		
		return Categorias;
	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		ArrayList<CategoriaDTO> Categorias = new CategoriaDAO().getCategorias();
		System.out.println(Categorias);
	}
}
