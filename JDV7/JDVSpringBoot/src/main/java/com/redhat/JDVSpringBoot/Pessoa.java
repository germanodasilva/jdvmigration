package com.redhat.JDVSpringBoot;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;

public class Pessoa implements RowCallbackHandler {

	@Override
	public void processRow(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub

	}

}
