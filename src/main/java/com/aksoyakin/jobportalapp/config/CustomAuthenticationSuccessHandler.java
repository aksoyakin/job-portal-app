package com.aksoyakin.jobportalapp.config;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Once logged in successfully:
 * Retrieve the user object.
 * Check the roles for the user.
 * If job-seeker or recruiter role then send them to dashboard page.
 */
@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        UserDetails user = (UserDetails) authentication.getPrincipal();
        String username = user.getUsername();
        System.out.println("The username " + username + " is logged in");

        boolean hasJobSeekerRole = authentication.getAuthorities()
                .stream()
                .anyMatch(r -> r.getAuthority().equals("Job Seeker"));
        boolean hasRecruiterRole = authentication.getAuthorities()
                .stream()
                .anyMatch(r -> r.getAuthority().equals("Recruiter"));

        if(hasJobSeekerRole || hasRecruiterRole) {
            response.sendRedirect("/dashboard/");
        }
    }
}
