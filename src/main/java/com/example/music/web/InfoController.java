package com.example.music.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.servlet.http.HttpServletRequest;

import com.example.music.domain.ApplicationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    private Environment springEnvironment;
    private ListableBeanFactory beanFactory;

    @Autowired
    public InfoController(Environment springEnvironment, ListableBeanFactory beanFactory) {
        this.springEnvironment = springEnvironment;
        this.beanFactory = beanFactory;
    }

    @RequestMapping(value = "/request")
    public Map<String, String> requestInfo(HttpServletRequest req) {
        HashMap<String, String> result = new HashMap<>();
        result.put("session-id", req.getSession().getId());
        result.put("protocol", req.getProtocol());
        result.put("method", req.getMethod());
        result.put("scheme", req.getScheme());
        result.put("remote-addr", req.getRemoteAddr());
        return result;
    }

    @RequestMapping(value = "/appinfo")
    public ApplicationInfo info() {
        return new ApplicationInfo(springEnvironment.getActiveProfiles(), getServiceNames());
    }

    @RequestMapping(value = "/service")
    public List<String> showServiceInfo() {
        return Arrays.stream(getServiceNames()).toList();
    }

    private String[] getServiceNames() {
        List<String> names = Arrays.stream(beanFactory.getBeanDefinitionNames()).toList();
        List<String> svcNames = new ArrayList<>();
        if (names.contains("jdbcConnectionDetails")) {
            if (Arrays.asList(springEnvironment.getActiveProfiles()).contains("mysql")) {
                svcNames.add("music:mysql");
            }
            else if (Arrays.asList(springEnvironment.getActiveProfiles()).contains("postgres")) {
                svcNames.add("music:postgresql");
            }
            else {
                svcNames.add("music:h2");
            }
        }
        else if (names.contains("mongoConnectionDetails")) {
            svcNames.add("music:mongo");
        }
        else if (names.contains("redisConnectionDetails")) {
            svcNames.add("music:redis");
        }
        String[] ret = new String[svcNames.size()];
        return svcNames.toArray(ret);
    }
}
