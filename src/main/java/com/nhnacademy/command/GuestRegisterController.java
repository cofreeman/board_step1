package com.nhnacademy.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GuestRegisterController implements Command{
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "/user/register.jsp";
    }
}
