package com.homura.controller;

import com.homura.service.UserServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@Controller
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/user")
    public ModelAndView list(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("dateTime", LocalDateTime.now());
        modelAndView.addObject("userList", userService.findUserList());
        modelAndView.setViewName("userList");
        return modelAndView;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<String> hello(@RequestBody String requestBody, HttpServletRequest request, HttpServletResponse response) {
        LOGGER.info("receive requestBody:{} ", requestBody);
        String responseJson = "{\"userName\":\"张三\",\"age\":18}";
        return new ResponseEntity<>(responseJson, HttpStatus.OK);
    }


}
