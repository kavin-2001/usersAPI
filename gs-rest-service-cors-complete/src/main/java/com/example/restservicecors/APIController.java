package com.example.restservicecors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
	static User user1;
	static User user2;
	static List<User> usersList = new ArrayList<>();
	static Map<String, User> usersMap = new HashMap<String, User>();
	static {
		More moreForKavin = new More("3", "Thathipalayam", "Konur Post", "5645432187");
		user1 = new User("Kavin", 20, "12-07-2001", "Kavin", "Periyasamy", moreForKavin);

		More moreForKumar = new More("3", "Keerambur", "Namakkal Post", "5645333187");
		user2 = new User("Kumar", 21, "1-05-2000", "Kumar", "Maran", moreForKumar);

		
		usersList.add(user1);
		usersList.add(user2);
		
		usersMap.put("Kavin", user1);
		usersMap.put("Kumar", user2);
	}

	
	@CrossOrigin(origins = "*")
	@GetMapping("/getuserslist")
	public List<User> greeting() {
		System.out.println("==== inside getuserslist ====");

		return usersList;
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/getMoreDetails")
	public More getMoreDetailsForAUser(@RequestParam(required = true) String userName) {
		System.out.println("==== inside getuserslist ====");

		return usersMap.get(userName).getMore();
	}

}
