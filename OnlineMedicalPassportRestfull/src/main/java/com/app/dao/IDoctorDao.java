package com.app.dao;

import com.app.pojos.Doctors;

public interface IDoctorDao {

	public Doctors validateDoctors(String email, String pass);
}
