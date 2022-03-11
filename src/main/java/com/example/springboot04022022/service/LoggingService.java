package com.example.springboot04022022.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LoggingService {
    public void logRequest(HttpServletRequest httpServletRequest, Object o);

    public void logResponse(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o);
}
