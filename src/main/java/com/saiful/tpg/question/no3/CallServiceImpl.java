package com.saiful.tpg.question.no3;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

@Service
public class CallServiceImpl implements CustomerService {

	@Override
	public void execute() {
		System.out.println("customer service execute");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
