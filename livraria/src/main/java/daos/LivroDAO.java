package daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dtos.LivroDTO;

public class LivroDAO extends BaseDAO {
	
	public LivroDAO() throws ClassNotFoundException, SQLException {
		super();
	}
	
	public LivroDTO getLivroPorCodigo(int cod) throws SQLException {
		
		PreparedStatement sql = conn.prepareStatement("SELECT * FROM tblivros WHERE codLivro = ?");
		sql.setInt(1, cod);
		
		ResultSet rs = sql.executeQuery();
        rs.next();
        
        LivroDTO livro = new LivroDTO();
        livro.setCodlivro(rs.getInt(1));
        livro.setTitulo(rs.getString(2));
        livro.setAutor(rs.getString(3));
        livro.setCategoria(rs.getString(4));
        livro.setValor(rs.getDouble(5));
        
        return livro;
	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		LivroDTO livro = new LivroDAO().getLivroPorCodigo(1);
		System.out.println(livro.getTitulo());
	}
}
