package cantina.dao;

import java.sql.SQLException;

/**
 * @author Gelatti , M3D0NH0
 */

public interface ProductDAO {

	boolean insert(String name, String type) throws ClassNotFoundException, SQLException;
}
