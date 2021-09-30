package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Truck;

public class TruckDao {

	private Connection connection;
	private final String GET_ALL_TRUCKS_QUERY = "SELECT * FROM trucks";
	private final String CREATE_NEW_TRUCK_QUERY = "INSERT INTO trucks(make, model, price) values (?, ?, ?)";
	private final String UPDATE_TRUCK_QUERY = "UPDATE trucks SET make = ?, model = ?, price = ? WHERE id = ?";
	private final String DELETE_TRUCK_BY_ID_QUERY = "DELETE FROM trucks WHERE id = ?";
	
	public TruckDao() {
		connection = DBConnection.getConnection();
	}
	
	public List<Truck> getTrucks() throws SQLException {
		ResultSet rs = connection.prepareStatement(GET_ALL_TRUCKS_QUERY).executeQuery();
		List<Truck> trucks = new ArrayList<Truck>();
		
		while (rs.next()) {
			trucks.add(generateTruck(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
		}
		
		return trucks;
	}
	
	public void createNewTruck(String make, String model, Double price) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(CREATE_NEW_TRUCK_QUERY);
		ps.setString(1, make);
		ps.setString(2, model);
		ps.setDouble(3, price);
		ps.executeUpdate();
	}
	
	public void updateTruck(String make, String model, Double price, int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(UPDATE_TRUCK_QUERY);
		ps.setString(1, make);
		ps.setString(2, model);
		ps.setDouble(3, price);
		ps.setInt(4, id);
		ps.executeUpdate();
	}
	
	public void deleteTruck(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(DELETE_TRUCK_BY_ID_QUERY);
		ps.setInt(1, id);
		ps.executeUpdate();
	}

	private Truck generateTruck(int id, String make, String model, Double price) throws SQLException {
		return new Truck(id, make, model, price);
	}
	
	
}

