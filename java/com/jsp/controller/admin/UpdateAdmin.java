package com.jsp.controller.admin;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

public class UpdateAdmin {

	public static void main(String[] args) {

		Admin admin = new Admin();
		admin.setName("ahmed");
		admin.setEmail("ahmed@gmail.com");
		admin.setPassword("ahmed");

		AdminService adminService = new AdminService();
		adminService.updateAdmin(admin, 2);

	}

}
