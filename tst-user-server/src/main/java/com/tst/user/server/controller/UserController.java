package com.tst.user.server.controller;


import com.tst.user.client.api.UserApi;
import com.tst.user.client.model.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yaxio
 */
@Slf4j
@RestController
public class UserController implements UserApi {

    @Value("${server.port}")
    private String port;

    @Override
    public UserDTO getUserById(Long id) {
        log.info("getUserById id: {}", id);
        return UserDTO.builder()
                .id(id)
                .username("name" + id)
                .desc("from " + port)
                .build();
    }
}
