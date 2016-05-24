//package com.duoduo.dao;
//
//import com.duoduo.repositories.Entity;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import java.util.List;
//
///**
// * Created by AngelQian on 5/23/16.
// */
//public class JdbcEntityDaoImp implements EntityDao {
//    private final JdbcTemplate jdbcTemplate;
//    public JdbcEntityDaoImp (JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    public void insert(final Entity entity) {
//        String sql = "INSERT INTO TESTDUODUO (id, msg, others) VALUES (?, ?, ?)";
//        jdbcTemplate.update(sql, new Object[] { entity.getId(),
//        entity.getMsg(), entity.getOther()});
//    }
//
//    @Override
//    public void update(Entity entity) {
//
//    }
//
//    @Override
//    public void delete(Entity entity) {
//
//    }
//
//    @Override
//    public Entity findByEntityNo(String entityId) {
//        String sql = "SELECT * FROM TESTDUODUO WHERE id =  ?";
////        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//        final Entity vehicle = new Entity();
//        return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Entity.class), entityId);
////        String sql = "SELECT * FROM TESTDUODUO WHERE id = ?";
////        Connection conn = null;
////        try {
////            conn = dataSource.getConnection();
////            PreparedStatement ps = conn.prepareStatement(sql);
////            ps.setString(1, entityId);
////            Entity entity = null;
////            ResultSet rs = ps.executeQuery();
////            if (rs.next()) {
////                entity = new Entity(rs.getString("msg"),rs.getString("others"));
////            }
////            rs.close();
////            ps.close();
////            return entity;
////        } catch (SQLException e) {
////            throw new RuntimeException(e);
////        } finally {
////            if (conn != null) {
////                try {
////                    conn.close();
////                } catch (SQLException e) {}
////            }
////        }
//    }
//
//    @Override
//    public List<Entity> findAll() {
//        String sql = "SELECT * FROM TESTDUODUO";
////        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//        return jdbcTemplate.query (sql, BeanPropertyRowMapper.newInstance(Entity.class));
//    }
//}
