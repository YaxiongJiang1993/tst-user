package com.tst.user.client.api;

import com.tst.user.client.model.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Yaxio
 */
public interface UserApi {

    @GetMapping("/tst/user/get-by-id")
    UserDTO getUserById(@RequestParam("id") Long id);
}
