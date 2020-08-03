package asia.toam.backend.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestAuthController {
    @GetMapping("/all")
    public String allAccess() {
        return "Public Content.";
    }

    @GetMapping("/renter")
    @PreAuthorize("hasRole('RENTER') or hasRole('HOST') or hasRole('ADMIN')")
    public String userAccess() {
        return "Renter Content.";
    }

    @GetMapping("/host")
    @PreAuthorize("hasRole('HOST')")
    public String moderatorAccess() {
        return "Host Board.";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return "Admin Board.";
    }
}
