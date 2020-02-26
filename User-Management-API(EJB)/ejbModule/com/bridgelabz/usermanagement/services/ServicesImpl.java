package com.bridgelabz.usermanagement.services;

import javax.ejb.Stateless;
import org.json.simple.JSONObject;
import com.bridgelabz.usermanagement.model.Registration;
import com.bridgelabz.usermanagement.repository.AdminDAO;

@Stateless
public class ServicesImpl implements IServices{
	JSONObject jsonObject = new JSONObject();
	AdminDAO dao = new AdminDAO();
	

	@Override
	public String addUser(Registration registration) {
		jsonObject.put("firstname",registration.getFirstName());
		jsonObject.put("middlename",registration.getMiddleName());
		jsonObject.put("lastname",registration.getLastName());
		jsonObject.put("email",registration.getEmail());
		jsonObject.put("password",registration.getPassword());
		jsonObject.put("contact",registration.getContact());
		jsonObject.put("gender",registration.getGender());
		jsonObject.put("dateOfBirth",registration.getDateOfBirth());
		jsonObject.put("age",registration.getAge());
		jsonObject.put("state", registration.getState());
		jsonObject.put("country",registration.getCountry());
		jsonObject.put("zip",registration.getZip());
		return dao.addUser(jsonObject);
	}

}
