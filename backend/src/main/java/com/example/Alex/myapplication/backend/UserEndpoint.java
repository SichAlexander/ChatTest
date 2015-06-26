package com.example.Alex.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiNamespace;

import java.util.logging.Logger;

/**
 * Created by Alex on 26.06.2015.
 */
@Api(name = "createUser", version = "v1", namespace = @ApiNamespace(ownerDomain = "backend.myapplication.Alex.example.com", ownerName = "backend.myapplication.Alex.example.com", packagePath = ""))

public class UserEndpoint {

    private static final Logger logger = Logger.getLogger(UserEndpoint.class.getName());


}
