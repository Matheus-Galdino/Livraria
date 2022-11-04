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
	
	public boolean addLivro(LivroDTO livro) throws SQLException {
		PreparedStatement sql = conn.prepareStatement("INSERT  INTO tblivros (`codlivro`,`titulo`,`autor`,`categoria`,`valor`) VALUES (?, ?, ?, ?, ?)");
		sql.setInt(1, livro.getCodlivro());
		sql.setString(2, livro.getTitulo());
		sql.setString(3, livro.getAutor());
		sql.setString(4, livro.getCategoria());
		sql.setDouble(5, livro.getValor());
		
		return sql.execute();
	}
	
	public boolean deleteLivro(int cod) throws SQLException {
		PreparedStatement sql = conn.prepareStatement("DELETE tblivros WHERE codLivro = ?");
		sql.setInt(1, cod);
		
		return sql.execute();
	}
}
