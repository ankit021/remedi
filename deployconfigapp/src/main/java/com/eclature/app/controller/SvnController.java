package com.eclature.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.eclature.app.service.SvnService;

@Controller
public class SvnController {
@Autowired
private SvnService svnService;
}
