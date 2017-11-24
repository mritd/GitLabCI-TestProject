package me.mritd.TestProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*******************************************************************************
 * Copyright (c) 2005-2017 Gozap, Inc.
 * TestProject
 * me.mritd.TestProject
 * Created by mritd on 2017/11/24 下午12:23.
 * Description: 
 *******************************************************************************/
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }
}
