package per.llt.spring_cloud_config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Linn Lat Htun
 * @created: 10/27/2022
 * @project: spring_cloud_config_client
 * @package: per.llt.spring_cloud_config_client.controller
 */

@RefreshScope /*@RefreshScope is need to refresh when you update the application.properties at remote git*/
@RestController
public class ConfigClientController {

    @Value("${message}")
    private String message;

    @GetMapping("/greeting")
    public ResponseEntity greeting()
    {
        System.out.println(message);
        return new ResponseEntity<String>(message, HttpStatus.OK);
    }
}
