package j16_인터페이스_활용.controller;

import j16_인터페이스_활용.service.AuthUserService;
import j16_인터페이스_활용.service.UserService;

public class ApiController {
	
	private final UserService userService;
	
	public ApiController(UserService userService) {
		this.userService = userService;
	}
	
	public void addUser() {
		System.out.println("사용자 추가");
		userService.create();
		((AuthUserService) userService).test();
	}
	
	public void getUser() {
		System.out.println("사용자 정보 가져오기");
		userService.read();
	}
	
	public void modifiUser() {
		System.out.println("사용자 정보 수정");
		userService.update();
	}
	
	public void removeUser() {
		System.out.println("사용자 삭제");
		userService.delete();
	}
}
