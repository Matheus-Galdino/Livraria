package daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dtos.UsuarioDTO;

public class UsuarioDAO extends BaseDAO {

	public UsuarioDAO() throws ClassNotFoundException, SQLException {
		super();
	}

	public ArrayList<UsuarioDTO> getUsuarios() throws SQLException {
		ArrayList<UsuarioDTO> usuarios = new ArrayList<UsuarioDTO>();
		
		PreparedStatement pst = conn.prepareStatement("SELECT login, nome FROM tbusuarios");
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()) {
			UsuarioDTO usuario = new UsuarioDTO();
			usuario.setLogin(rs.getInt(1));
			usuario.setNome(rs.getString(2));
			
			usuarios.add(usuario);
		}
		
		return usuarios;
	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		ArrayList<UsuarioDTO> usuarios = new UsuarioDAO().getUsuarios();
		System.out.println(usuarios);
	}
}
