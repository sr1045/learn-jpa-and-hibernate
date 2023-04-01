package com.in28mins.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
	private JdbcTemplate springJdbcTemplate;

	private static String INSERT_QUERY =
			"""
			insert into course values (3, 'Learn Git', 'in28mins'); 
			""";
			//""" insert into course values (3, 'Learn Git', 'in28mins'); """;
	

	public void insert() {
		springJdbcTemplate.update(INSERT_QUERY );
	}
}
