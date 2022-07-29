package com.example.demo2;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeneratePassword {
	public static void main(String[] args) {
		// �n�b�V�����������p�X���[�h�����
		String rawPassword = "admin";

		// �p�X���[�h���n�b�V����
		String password = getEncodePassword(rawPassword);

		// �n�b�V�������ꂽ�l��\��
		System.out.println(password);
	}

	private static String getEncodePassword(String rawPassword) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		return passwordEncoder.encode(rawPassword);
	}

}
