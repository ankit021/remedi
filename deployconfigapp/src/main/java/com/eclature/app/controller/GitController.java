package com.eclature.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.eclature.app.service.GitService;

@Controller
public class GitController {
@Autowired
private GitService gitService;
}
