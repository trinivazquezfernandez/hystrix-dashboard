package pluralsight.demo.hystryxdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class HystryxDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystryxDashboardApplication.class, args);
	}

}
