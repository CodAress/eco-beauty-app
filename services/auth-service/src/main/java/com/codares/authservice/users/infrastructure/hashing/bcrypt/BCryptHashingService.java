package com.codares.authservice.users.infrastructure.hashing.bcrypt;


import com.codares.authservice.users.application.internal.outboundservices.hashing.HashingService;
import com.codares.authservice.users.infrastructure.hashing.bcrypt.services.HashingServiceImpl;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * This interface is a marker interface for the BCrypt hashing service.
 * It extends the {@link HashingService} and {@link PasswordEncoder} interfaces.
 * This interface is used to inject the BCrypt hashing service in the {@link HashingServiceImpl} class.
 */
public interface BCryptHashingService extends HashingService, PasswordEncoder {
}
