/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import Model.User;
import java.sql.*;
import java.util.*;

public class UserDAO {

    public void inserir(User u) {
        String sql = "INSERT INTO users (firstname, lastname, dob, email) VALUES (?, ?, ?, ?)";
        try (Connection con = Conexao.conectar(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, u.getFirstname());
            stmt.setString(2, u.getLastname());
            stmt.setDate(3, u.getDob());
            stmt.setString(4, u.getEmail());
            stmt.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public List<User> listar() {
        List<User> lista = new ArrayList<>();
        String sql = "SELECT * FROM users";
        try (Connection con = Conexao.conectar(); PreparedStatement stmt = con.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                User u = new User();
                u.setUserid(rs.getInt("userid"));
                u.setFirstname(rs.getString("firstname"));
                u.setLastname(rs.getString("lastname"));
                u.setDob(rs.getDate("dob"));
                u.setEmail(rs.getString("email"));
                lista.add(u);
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return lista;
    }

    public void atualizar(User u) {
        String sql = "UPDATE users SET firstname=?, lastname=?, dob=?, email=? WHERE userid=?";
        try (Connection con = Conexao.conectar(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, u.getFirstname());
            stmt.setString(2, u.getLastname());
            stmt.setDate(3, u.getDob());
            stmt.setString(4, u.getEmail());
            stmt.setInt(5, u.getUserid());
            stmt.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void excluir(int id) {
        String sql = "DELETE FROM users WHERE userid=?";
        try (Connection con = Conexao.conectar(); PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }
}
