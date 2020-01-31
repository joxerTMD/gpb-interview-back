package com.ormco.interview;

import java.sql.SQLException;
import javax.sql.DataSource;
import org.h2.tools.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InterviewApplication {

	@Autowired
	private DataSource ds;

	public static void main(String[] args) {
		SpringApplication.run(InterviewApplication.class, args);
	}

	@Bean(initMethod = "start", destroyMethod = "stop")
	public Server inMemoryH2DatabaseServer() throws SQLException {
		// jdbc:h2:tcp://localhost:9090/mem:interviewdb
		// логин: sa
		// пароль пустой
		return Server.createTcpServer(
			"-tcp", "-tcpAllowOthers", "-tcpPort", "9090");
	}

}
