package com.example.administration.service;

import com.example.administration.dto.request.AuthenticationRequest;
import com.example.administration.dto.request.IntrospectRequest;
import com.example.administration.dto.response.AuthenticationResponse;
import com.example.administration.dto.response.IntrospectResponse;
import com.nimbusds.jose.JOSEException;

import java.text.ParseException;

public interface AuthenticationService {
    AuthenticationResponse authenticate(AuthenticationRequest request);

    IntrospectResponse introspect(IntrospectRequest request) throws JOSEException, ParseException;
}
