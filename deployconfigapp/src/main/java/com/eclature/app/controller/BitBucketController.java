package com.eclature.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.eclature.app.service.BitBucketService;

@Controller
public class BitBucketController {
@Autowired
private BitBucketService bitBucketService;
}
