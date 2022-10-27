package tech.iooo.coco.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.iooo.coco.commons.Result;
import tech.iooo.coco.service.UserService;

/**
 * @author 龙也
 * @date 2022/10/27 2:43 PM
 */
@Slf4j
@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
public class ApiController {

    private final UserService userService;

    @GetMapping("/users")
    public Result<Object> users() {
        return Result.of(userService.users());
    }
}
